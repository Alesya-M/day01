package repl;

public class epl178 {
    public static void main(String[] args) {

        System.out.println(mergeStrings("12345","abcdefdssdf"));

    }

    public static String mergeStrings(String one, String two) {
       String result = "";

      if(one.length()==two.length()){
          for (int i = 0; i < one.length(); i++) {
              result+=one.charAt(i);
              result+=two.charAt(i);
          }
      }

      if(one.length()>two.length()){
          for (int i = 0; i < one.length(); i++) {
              result+=one.charAt(i);
              if(i<two.length()){
                  result+=two.charAt(i);
              }

          }
      }

        if(two.length()>one.length()){
            for (int i = 0; i < two.length(); i++) {
                result+=two.charAt(i);
                if(i<one.length()){
                    result+=one.charAt(i);
                }

            }
        }
        return result;

    }
}
