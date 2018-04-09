package Classes;

import Interface.BirdInterface;

public class Bird implements BirdInterface {
    private double wingLength;
    private int age;
    {
        wingLength = 0;
        age = 0;
    }

    Bird(double l, int a) {
        this.wingLength = l;
        this.age = a;
    }
    @Override
    public String toString(){
        return "Птица: ширина крыльев = " + getWingLength() +", возраст = " + getAge();
    }
    @Override
    public double getWingLength(){
        return this.wingLength;
    }
    @Override
    public int getAge(){
        return this.age;
    }
    @Override
    public int setAge(int a){
        this.age = a;
        return 0;
    }
    @Override
    public double setWingLength(double l){
        this.wingLength = l;
        return 0;
    }

}