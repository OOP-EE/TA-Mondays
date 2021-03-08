
public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("I am a doctor");

        // insert a word to stringBuilder
        int pointerIndex = stringBuilder.indexOf("a doctor");
        stringBuilder.insert(pointerIndex, "not ");
        System.out.println(stringBuilder);

        // reversing stringBuilder
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        // append string to stringBuilder
        stringBuilder.append(".").append("test").append("test2");
        System.out.println(stringBuilder);

        // convert stringBuilder to string
        String output = stringBuilder.toString();
        System.out.println(output);

        // convert string to stringBuilder
        StringBuilder stringBuilder2 = new StringBuilder(output);
        System.out.println(stringBuilder2);
    }
}
