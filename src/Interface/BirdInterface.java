package Interface;

public interface BirdInterface {
    double getWingLength();
    int getAge();
    double setWingLength(double l);
    int setAge(int a);
    String toString();

    default int writeAge(int a){
        System.out.println(a);
        return 0;
    };
}
