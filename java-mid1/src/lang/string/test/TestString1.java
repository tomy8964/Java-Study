package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        System.out.println(url.startsWith("https://"));

        int sum = 0;
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        for (String str : arr) {
            System.out.println(str + " : " + str.length());
            sum += str.length();
        }
        System.out.println("sum = " + sum);

        String str = "hello.txt";
        System.out.println("index = " + str.indexOf(".txt"));
        System.out.println("filename = " + str.substring(0, 5));
        System.out.println("extName = " + str.substring(5));

        String ext = ".txt";
        System.out.println("filename = " + str.substring(0, str.indexOf(ext)));
        System.out.println("extName = " + str.substring(str.indexOf(ext)));

        str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + key.length());
            count++;
        }
        System.out.println("count = " + count);

        String original = "    Hello Java   ";
        System.out.println(original.trim());

        String input = "hello java spring jpa java";
        System.out.println(input.replace("java", "jvm"));

        String email = "hello@example.com";
        System.out.println(email.split("@")[0]);
        System.out.println(email.split("@")[1]);

        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        String join = String.join("->", split);
        System.out.println(join);

        str = "Hello Java";
        System.out.println(new StringBuilder(str).reverse());
    }
}
