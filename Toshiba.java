/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Toshiba  implements Laptop {
     private int volume = 50;

    @Override
    public void turnOn() {
        System.out.println("Toshiba Laptop is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Toshiba Laptop is OFF");
    }

    @Override
    public void increaseVolume() {
        volume++;
        System.out.println("Volume increased to: " + volume);
    }

    @Override
    public void decreaseVolume() {
        volume--;
        System.out.println("Volume decreased to: " + volume);
    }
}
