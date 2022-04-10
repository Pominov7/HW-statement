package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StatImproved {
    public static void main(String[] args) {
        //.Ввод данных с клавиатуры и объявление переменных
        System.out.print("Ведомость оценок ученика\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество предметов: ");
        int subjCount = in.nextInt();
        in.nextLine();
        String arrSubj[] = new String[subjCount];//массив предметов
        int arrMark[][] = new int[subjCount][];//массив оценок

        //2.Циклом for проходим по массиву предметов
        for (int i = 0; i < arrSubj.length; i++) {
            System.out.print("Введите название предмета " + (i + 1) + ": ");
            arrSubj[i] = in.nextLine();//считываем название предметов

            for (int j = i; j < i + 1; j++) {
                System.out.print("Введите количество оценок по предмету " + arrSubj[i] + ": ");
                int markCount = in.nextInt();
                in.nextLine();
                System.out.println("Введите оценки по предмету " + arrSubj[i] + ": ");
                arrMark[i] = new int[markCount];
                for (int k = 0; k < markCount; k++) {
                    for (; ; ) {
                        arrMark[j][k] = in.nextInt();
                        in.nextLine();
                        if (arrMark[j][k] > 1 && arrMark[j][k] < 6) {
                            break;
                        } else {
                            System.out.println("Введите оценку от 2 до 5: ");
                        }
                    }
                }
            }
        }
        System.out.println("Вывести средний балл по всем предметам?" +
                "\nВведите цифру 1 для подтверждения" +
                "\nВведите цифру 2 для перехода к следующему пункту");
        //3.Выводим средний балл
        double sum = 0;//переменная для накопления оценок
        double gpa = 0;//вспомогательная переменная
        int choice = in.nextInt();//считали ответ на вопрос
        int res = 0;
        in.nextLine();
        if (choice == 1) { // если введена цифра 1, то считаем средний балл
            for (int[] mark : arrMark) {
                for (int i : mark) {
                    sum += i;
                    res++;
                    gpa = sum / res;
                }
            }
            System.out.printf("Ваш средний балл по всем предметам : %.2f", gpa);
        }
        System.out.print("\n");//пробел между строками
        System.out.println("\nВывести все оценки?" +
                "\nВведите цифру 1 для подтверждения" +
                "\nВведите цифру 2 для перехода к следующему пункту");
        //4.Выводим все оценки
        int choiceMark = in.nextInt();
        in.nextLine();
        if (choiceMark == 1) { // если введена цифра 1, то Выводим все оценки
            for (int i = 0; i < arrSubj.length; i++) {
                for (int k = i; k == i; k++) {
                    System.out.print("\nОценка по предмету " + "\"" + arrSubj[i] + "\"" + ": ");
                    for (int j = 0; j < arrMark[k].length; j++) {
                        System.out.print(arrMark[k][j] + " ");
                    }
                }
            }
        }
        System.out.print("\n");
        System.out.println("\nВывести максимальную оценку?" +
                "\nВведите цифру 1 для вывода максимальной оценки" +
                "\nВведите цифру 2 для перехода к следующему пункту");
        //5.Выводим максимальную оценку
        int choiceMax = in.nextInt();
        in.nextLine();
        if (choiceMax == 1) {
            for (int i = 0; i < arrMark.length; i++) {
                Arrays.sort(arrMark[i]);
            }
            for (int i = 0; i < arrSubj.length; i++) {
                System.out.printf("Максимальная оценка по предмету %s : %d \n", arrSubj[i], arrMark[i][arrMark[i].length - 1]);
            }
        }
        System.out.print("\n");//для разделения пунктов программы
        System.out.println("Вывести минимальную оценку?" +
                "\nВведите цифру 1 для вывода минимальной оценки:" +
                "\nВведите цифру 2 для выхода:");
        //6.Выводим минимальную оценку
        int choiceMin = in.nextInt();
        in.nextLine();
        if (choiceMin == 1) {
            for (int i = 0; i < arrMark.length; i++) {
                Arrays.sort(arrMark[i]);
            }
            for (int i = 0; i < arrSubj.length; i++)
                System.out.printf("Минимальная оценка по предмету %s : %d \n", arrSubj[i], arrMark[i][0]);
        }
        System.out.println("\nВсего доброго!");
    }
}






