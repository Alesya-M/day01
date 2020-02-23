package day50;

public class Addition extends Question {

    public Addition(int num1, int num2){
        super("addition question", "+");
        this.num1=num1;
        this.num2=num2;
    }

    @Override
    public void calculate(){
        answer = num1+num2;
        this.calculated = true; //you called the calculate method to
                               // calculate the result
    }

    @Override
    public String toString(){
    if(calculated == true){
        return super.toString()+ num1+operator+num2+ "="+answer;
    }else {
        return super.toString()+ num1 + operator+ num2+"=";
    }
    }
}
