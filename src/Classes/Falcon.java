package Classes;

public class Falcon extends Bird {
    private int maxSpeed;
    {
        maxSpeed = 0;
    }
    @Override
    public String toString(){
        return "Ястреб: ширина крыльев = " + getWingLength() +", возраст = " + getAge() +", максимальная скорость = " + maxSpeed;
    }

    public Falcon (int l, int a, int m) {
        super(l, a);
        maxSpeed = m;
    }
    public  int getMaxSpeed(){
        return  maxSpeed;
    }

    public  void setMaxSpeed(int m){
        maxSpeed = m;
    }
}
