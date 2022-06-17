package util;

public class InputTest {
    public static void main(String[] args) {
       Input data = new Input();
        System.out.println(data.getString());
        System.out.println(data.yesNo());
        System.out.println(data.getInt());
        System.out.println(data.getInt(1,10));
        System.out.println(data.getDouble(1,10));
        System.out.println(data.getDouble());

    }
}
