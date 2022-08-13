package rikkei.academy.view;

import rikkei.academy.controller.SingerController;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    SingerController singerController = new SingerController();

    public Main() {

        System.out.println("MENU");
        System.out.println("1. Show singer list");
        System.out.println("2. Add new singer");
        System.out.println("3. Edit singer");
        System.out.println("4. Detail singer");
        System.out.println("5. Delete singer");
        System.out.println("6. Sort singers");
        System.out.println("7. Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                new SingerView().viewSinger();
                break;
            case 2:
                new SingerView().viewCreateSinger();
                break;
            case 3:
                new SingerView().viewEditSinger();
                break;
            case 4:
                new SingerView().viewDetailSinger();
                break;
            case 5:
                new SingerView().viewRemoveSinger();
                break;
//                case 6:
//                    System.out.println("Enter singer name");
//                    String nameSinger = scanner.nextLine();
//                    System.out.println(singerController.searchSinger(nameSinger));
//                    break;
            case 6 :
                singerController.sortSingerByName();
                System.out.println("Sorted");
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
        new Main();

    }


    public static void main(String[] args) {
        new Main();
    }
}
