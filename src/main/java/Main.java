import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Gonka gonka = new Gonka();
        gonka.nameAuto();
        gonka.spidAuto();
        gonka.calculationLeader();
    }
}

class Gonka {
    Scanner scanner = new Scanner(System.in);
    Auto cars1 = new Auto();
    Auto cars2 = new Auto();
    Auto cars3 = new Auto();

    public void nameAuto() {
        System.out.println("Выбери 3 болида, узнаем кто самый быстрый!");
        System.out.println("Первый претендент:");
        cars1.name = scanner.next();
        System.out.println("Второй претендент:");
        cars2.name = scanner.next();
        System.out.println("Третий претендент:");
        cars3.name = scanner.next();
    }

    public void spidAuto() {
        System.out.println("Какая скорость у болида: " + cars1.name);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Введи число, а не вот это все...: ");
                scanner.next();
            }
            cars1.spid = scanner.nextInt();
            if (cars1.spid > 251) {
                System.out.println("Это автомобиль, а не самолет, введи число поменьше: ");
            } else {
                break;
            }
        }
        System.out.println("Какая скорость у болида: " + cars2.name);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Скорость - число");
                scanner.next();
            }
            cars2.spid = scanner.nextInt();
            if (cars2.spid > 251) {
                System.out.println("Скорость болида до 250 км.ч");
            } else {
                break;
            }
        }
        System.out.println("Какая скорость у болида: " + cars3.name);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Неврно, напиши число: ");
                scanner.next();
            }
            cars3.spid = scanner.nextInt();
            if (cars3.spid > 251) {
                System.out.println("Пошел на взлет...\nВведи число поменьше: ");
            } else {
                break;
            }
        }
    }

    public void calculationLeader() {
        ArrayList<Integer> autoList = new ArrayList<>();
        int сmileageСars1 = cars1.spid * 24;
        int сmileageСars2 = cars2.spid * 24;
        int сmileageСars3 = cars3.spid * 24;
        autoList.add(сmileageСars1);
        autoList.add(сmileageСars2);
        autoList.add(сmileageСars3);
        int maxCmileage = autoList.get(0);
        int n = autoList.size();
        for (int i = 1; i < n; i++)
            if (autoList.get(i) > maxCmileage) {
                maxCmileage = autoList.get(i);
            }
        if (сmileageСars1 == maxCmileage) {
            System.out.println("Победил " + cars1.name + " ,проехав " + maxCmileage + " киллометров!");
        }
        if (сmileageСars2 == maxCmileage) {
            System.out.println("Победил " + cars2.name + " ,проехав " + maxCmileage + " киллометров!");
        }
        if (сmileageСars3 == maxCmileage) {
            System.out.println("Победил " + cars3.name + " ,проехав " + maxCmileage + " киллометров!");
        }
    }
}

class Auto {
    String name;
    int spid;
}
