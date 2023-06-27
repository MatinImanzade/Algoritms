package coders.iyun22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentences");
        String sentences = scanner.nextLine();

        System.out.println("--------------");

        System.out.println("Enter word");
        String word = scanner.next();

        System.out.println(word);
        System.out.println(sentences);
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Kaçıncı ayı arıyorsunuz?");
//        int monthNumber = scanner.nextInt();
//        System.out.println("Lütfen dil kodunu girin");
//        String languageCode = scanner.next();
//        LanguageEnum languageEnum = LanguageEnum.getByCode(languageCode);
//        Month month = Month.getMonthByNumber(monthNumber);
//
//        if (month == null) {
//            System.out.println("Geçersiz ay numarası.");
//            return;
//        }
//
//        if (languageEnum == null) {
//            System.out.println("Geçersiz dil kodu.");
//            return;
//        }
//
//        String monthName = month.getNameByLanguage(languageEnum);
//        System.out.println(monthName);
//    }
}
