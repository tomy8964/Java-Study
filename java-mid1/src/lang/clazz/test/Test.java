package lang.clazz.test;

public class Test {
    public static void main(String[] args) {
        String str = "100";
        Integer i = Integer.parseInt(str);
        int i1 = i.intValue();
        int i2 = Integer.valueOf(i1);
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
    }
}
