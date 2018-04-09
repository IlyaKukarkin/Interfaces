package Classes;

public class Ostrich extends Bird {
    private int height;
    static double heightNeck;
    {
        height = 1;
        heightNeck = 1;
    }

    Ostrich (int l, int a, int w) {
        super(l, a);
        height = w;
        calculateNeck(height);
    }

    @Override
    public String toString(){
        return "Страус: ширина крыльев = " + getWingLength() + ", возраст = " + getAge() + ", рост = " + getHeight() + ", шея этого страуса примерно = " + heightNeck;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int w){
        if (w>0)
        this.height = w;
    }

    public static void calculateNeck(int heght) {
        double neck = heght * 0.5;
        heightNeck = neck;
    }
}