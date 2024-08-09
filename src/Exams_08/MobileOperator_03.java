package Exams_08;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Срок на договор – текст – "one", или "two"
        //2.	Тип на договор – текст – "Small",  "Middle", "Large"или "ExtraLarge"
        //3.	Добавен мобилен интернет – текст – "yes" или "no"
        //4.	Брой месеци за плащане - цяло число в интервала [1 … 24]

        String termOfAgreement = scanner.nextLine();
        String typeOfAgreement = scanner.nextLine();
        String addedMobileInternet = scanner.nextLine();
        int totalMonthsForPayment = Integer.parseInt(scanner.nextLine());

        double tax = 0;

        if (termOfAgreement.equals("one") && typeOfAgreement.equals("Small")) {
            tax = 9.98;
        } else if (termOfAgreement.equals("one") && typeOfAgreement.equals("Middle")) {
            tax = 18.99;
        } else if (termOfAgreement.equals("one") && typeOfAgreement.equals("Large")) {
            tax = 25.98;
        } else if (termOfAgreement.equals("one") && typeOfAgreement.equals("ExtraLarge")) {
            tax = 35.99;
        } else if (termOfAgreement.equals("two") && typeOfAgreement.equals("Small")) {
            tax = 8.58;
        } else if (termOfAgreement.equals("two") && typeOfAgreement.equals("Middle")) {
            tax = 17.09;
        } else if (termOfAgreement.equals("two") && typeOfAgreement.equals("Large")) {
            tax = 23.59;
        } else if (termOfAgreement.equals("two") && typeOfAgreement.equals("ExtraLarge")) {
            tax = 31.79;
        }

        //•	при добавен мобилен интернет, към таксата за един месец се добавя:
        //o	при такса по-малка или равна на 10.00 лв.  5.50 лв.
        //o	при такса по-малка или равна на 30.00 лв.  4.35 лв.
        //o	при такса по-голяма от 30.00 лв.  3.85 лв.
        //•	ако договорът e за две години, общата сума се намалява с 3.75%

        double taxWithInternet = tax;
        if (addedMobileInternet.equals("yes")) {
            if (tax <= 10){
                taxWithInternet += 5.50;
            } else if (tax <= 30) {
                taxWithInternet += 4.35;
            } else if (tax > 30) {
                taxWithInternet += 3.85;
            }
        }

        if (termOfAgreement.equals("two")){
            taxWithInternet = taxWithInternet - (taxWithInternet * 0.0375);
        }

        double totalSum = totalMonthsForPayment * taxWithInternet;
        System.out.printf("%.2f lv.", totalSum);
    }
}
