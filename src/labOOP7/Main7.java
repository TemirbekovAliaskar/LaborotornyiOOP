package labOOP7;

public class Main7 {

    public static void main(String[] args) {

        String[] strings = {"Al","Sen","Alar"};
        Integer[] integers = {23,43,22,67};

        Math<Integer> integerMath = new Math<>();
        System.out.println(integerMath.printArr(integers));
        Math<String> stringMath = new Math<>();
        System.out.println(stringMath.printArr(strings));

    }
}
