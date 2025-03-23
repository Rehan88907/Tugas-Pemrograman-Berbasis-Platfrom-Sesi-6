/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class LaptopUser {
    private Laptop laptop;

    public LaptopUser (Laptop laptop) {
        this.laptop = laptop;
    }

    public void useLaptop() {
        laptop.turnOn();
        laptop.increaseVolume();
        laptop.decreaseVolume();
        laptop.turnOff();
    }
}
