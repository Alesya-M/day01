package day34;

public class MoreMethodPractice {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false));

    }

    /**
     *
     * @param aSmile
     * @param bSmile
     * @return-true only if both monkeys are smiling or not smiling
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){

        return (aSmile&&bSmile)||(!aSmile&&!bSmile);
    }

    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile){

        if((aSmile&&bSmile)||(!aSmile&&!bSmile)){
            return true;
        }else {
            return false;
        }
    }

    public static String monkeyTrouble3(boolean aSmile, boolean bSmile){

        if((aSmile&&bSmile)||(!aSmile&&!bSmile)){
            return "Yes";
        }else {
            return "No";
        }
    }
}
