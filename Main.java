package bt04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Nhập giá trị cho tốc độ tăng tốc (speed) (mặc định tăng tốc trong 1 giây: ");
        int speed = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giá trị cho thời gian tăng tốc (s): ");
        int seconds = Integer.parseInt(sc.nextLine());
        car.accelerate();
        car.printStatus();
        car.accelerate(speed);
        car.printStatus();
        car.accelerate(speed, seconds);
        car.printStatus();
    }
}
