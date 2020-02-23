package day55;

public class Practice {

    public Practice(){
        this(100);
        System.out.println("no arg constructor");
    }

    public Practice(int x){
        this(10,"Alesya");
        System.out.println("1 arg constructor");
    }

    public Practice(String a){
        System.out.println("String constructor");
    }

    public Practice(int x, int s){
        System.out.println("2 ints");
    }

    public Practice(int x, String g){
        System.out.println("String and int");
    }

    public static void main(String[] args) {

        Practice t = new Practice();
    }
}

class Practice2 extends Practice{


    public Practice2(){

    }

    public Practice2(int x){

        super();

    }
}
