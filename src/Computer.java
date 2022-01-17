import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private int operativ;
    private String zhdisk;
    private int cicl = 4;
    private int countCicl = 0;

    public Computer(String processor, int operativ, String zhdisk) {
        this.processor = processor;
        this.operativ = operativ;
        this.zhdisk = zhdisk;
    }

    public String getProcessor() {
        return processor;
    }

    public int getOperativ() {
        return operativ;
    }

    public String getZhdisk() {
        return zhdisk;
    }


    public void descript(String processor, int operativ, String zhdisk) {
        System.out.println("Процессор - " + processor);
        System.out.println("Опертивная память - " + operativ + "Гб");
        System.out.println("Жесткий диск - " + zhdisk);
    }

    public void vkl() {
        Random random = new Random();
        int c = random.nextInt(2);
        System.out.println(c);
        int d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        for (int i = 0; ; i++) {
            if (sc.hasNextInt()) {
                d = sc.nextInt();
            } else {
                System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
            }
            if (c == d) {
                System.out.println("Компьютер включен");
            } else System.out.println("Компьютер сгорел");
            countCicl++;
        }

    }
}
