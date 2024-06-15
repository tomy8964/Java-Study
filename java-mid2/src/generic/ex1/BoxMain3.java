package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("문자열");
        Integer integer = integerBox.get(); // Integer 타입 변환(캐스팅 X)

        GenericBox<String> stringBox = new GenericBox<String>(); // 생성 시점에 T의 타입 결정
//        stringBox.set(10);
        stringBox.set("문자열");
        String str = stringBox.get(); // Integer 타입 변환(캐스팅 X)
    }
}
