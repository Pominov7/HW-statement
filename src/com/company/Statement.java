package com.company;

import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        //.Ввод данных с клавиатуры и объявление переменных
        System.out.print("Ведомость оценок ученика\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество предметов: ");
        int markCount = in.nextInt();
        in.nextLine();
        String arrSubj[] = new String[markCount];//массив предметов
        int arrMark[] = new int[markCount];//массив оценок

        //2.Циклом for проходим по массиву предметов
        for (int i = 0; i < arrSubj.length; i++) {
            System.out.print("Введите название предмета " + (i + 1) + ": ");
            arrSubj[i] = in.nextLine();//считываем название предметов
            for (; ; ) {
                System.out.print("Введите оценку по предмету " + arrSubj[i] + ": ");
                arrMark[i] = in.nextInt();//считываем оценку по введенному предмету
                in.nextLine();
                if (arrMark[i] > 1 && arrMark[i] < 6) {
                    break;
                } else {
                    System.out.println("Введите оценку от 2 до 5");
                }
            }
        }
        System.out.print("\n");// для разделения пунктов программы
        System.out.print("Вывести средний балл? \n");//Предлагаем вывести средний балл
        System.out.print("Введите цифру 1 для подтверждения: \n");
        System.out.print("Введите цифру 2 для перехода к следующему пункту: \n");
        //3.Выводим средний балл
        double sum = 0;//переменная для накопления оценок
        double gpa = 0;//вспомогательная переменная
        double choice = in.nextDouble();//считали ответ на вопрос
        in.nextLine();
        if (choice == 1) { // если введена цифра 1, то считаем средний балл
            for (int i = 0; i < arrMark.length; i++) {
                sum += arrMark[i];
                gpa = sum / markCount;
            }
            System.out.print("Ваш средний балл: " + gpa + "\n");
        } else {
            System.out.print("\n");//пробел между строками
        }
        System.out.print("\n");// для разделения пунктов программы
        System.out.print("Вывести все оценки? \n");
        System.out.print("Введите цифру 1 для подтверждения: \n");
        System.out.print("Введите цифру 2 для перехода к следующему пункту: \n");
        //4.Выводим все оценки
        int choiceMark = in.nextInt();
        in.nextLine();
        if (choiceMark == 1) { // если введена цифра 1, то Выводим все оценки
            for (int i = 0; i < arrSubj.length; i++) {
                System.out.println("Оценка по предмету " + "\"" + arrSubj[i] + "\"" + ": " + arrMark[i]);
            }
        } else {
            System.out.print("\n");
        }
        System.out.print("\n");//для разделения пунктов программы
        System.out.print("Вывести максимальную оценку? \n");
        System.out.print("Введите цифру 1 для вывода максимальной оценки: \n");
        System.out.print("Введите цифру 2 для перехода к следующему пункту: \n");
        //5.Выводим максимальную оценку
        int choiceMax = in.nextInt();
        in.nextLine();
        int max = Math.max(2, 5);
        for (int i = 0; i < arrMark.length; i++) {
            if (arrMark[i] == max && choiceMax == 1) {
                max = arrMark[i];
                System.out.println("Максимальная оценка по предмету " + arrSubj[i] + ": " + max);
            } else {
                System.out.print("");
            }
        }
        System.out.print("\n");//для разделения пунктов программы
        System.out.print("Вывести минимальную оценку? \n");
        System.out.print("Введите цифру 1 для вывода минимальной оценки: \n");
        System.out.print("Введите цифру 2 для выхода: \n");
        //6.Выводим минимальную оценку
        int choiceMin = in.nextInt();
        in.nextLine();
        int min = Math.min(2, 5);
        for (int i = 0; i < arrMark.length; i++) {
            if (arrMark[i] == min && choiceMin == 1) {
                min = arrMark[i];
                System.out.println("Минимальная оценка по предмету " + arrSubj[i] + ": " + min);
            } else {
                System.out.print("");
            }
        }
        System.out.print("Досвидания!");
    }
}
