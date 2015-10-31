package bjs.task05;

public class Main {

    public static void main(String[] args) {
		// write your code here
        Computer desktopComputer = new Computer("PC", "Intel Core i5-2400 CPU");
        desktopComputer.powerOn();
        System.out.print(desktopComputer.toString());
        desktopComputer.powerOff();
    }
}
