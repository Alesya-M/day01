package repl;

public class repl191 {
    public static String reverse(String input)
    {
        String reverStr="";
        for (int i = input.length()-1; i >= 0; i--) {
            reverStr+=input.charAt(i);
        }
        return reverStr;
    }

    public static void main(String[] args) {
        String name = "Nikolay";
        System.out.println(reverse(name));
    }
}
