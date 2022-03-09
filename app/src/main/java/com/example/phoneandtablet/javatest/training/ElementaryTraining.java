package com.example.phoneandtablet.javatest.training;

import java.util.ArrayList;

/**
 * Набор тренингов по работе с примитивными типами java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ElementaryTrainingTest.
 */
public class ElementaryTraining {

    /**
     * Метод должен возвращать среднее значение
     * для введенных параметров
     *
     * @param firstValue  первый элемент
     * @param secondValue второй элемент
     * @return среднее значение для введенных чисел
     */
    public double averageValue(int firstValue, int secondValue) {
        return (double) (firstValue + secondValue) / 2;
    }

    /**
     * Пользователь вводит три числа.
     * Произвести манипуляции и вернуть сумму новых чисел
     *
     * @param firstValue  увеличить в два раза
     * @param secondValue уменьшить на три
     * @param thirdValue  возвести в квадрат
     * @return сумма новых трех чисел
     */

    public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {
        return (firstValue * 2) + (secondValue - 3) + (thirdValue * thirdValue);
    }

    /**
     * Метод должен поменять значение в соответствии с условием.
     * Если значение больше 3, то увеличить
     * на 10, иначе уменьшить на 10.
     *
     * @param value число для изменения
     * @return новое значение
     */

    public int changeValue(int value) {
        if (value > 3) {
            value += 10;
        } else value -= 10;
        return value;
    }

    /**
     * Метод должен менять местами первую
     * и последнюю цифру числа.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10, вернуть
     * то же число
     *
     * @param value число для перестановки
     * @return новое число
     */

    public int swapNumbers(int value) {
        if (value < 10 && value > -10 || value > 99999)
            return value;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (value != 0) {
            numbers.add(value % 10);
            value /= 10;
        }
        int x = numbers.get(0);
        numbers.set(0, numbers.get(numbers.size() - 1));
        numbers.set(numbers.size() - 1, x);

        x = 1;
        for (int i = 0; i < numbers.size(); i++) {
            value += numbers.get(i) * x;
            x *= 10;
        }
        return value;
    }

    /**
     * Изменить значение четных цифр числа на ноль.
     * Счет начинать с единицы.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10 вернуть
     * то же число.
     *
     * @param value число для изменения
     * @return новое число
     */

    public int zeroEvenNumber(int value) {
        if (value < 10 && value > -10 || value > 99999)
            return value;

        ArrayList<Integer> numbers = new ArrayList<>();
        while (value != 0) {
            numbers.add(value % 10);
            value /= 10;
        }

        int x = 1;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0 & i != numbers.size() - 1)
                numbers.set(i, 0);
            value += numbers.get(i) * x;
            x *= 10;
        }
        return value;
    }
}
