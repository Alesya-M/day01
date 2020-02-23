package day39;

public class SpaceShip {
    String name;
    String currentDirection;
    int x;
    int y;

    public void setInitialPosition(int newX, int newY){

        y= newY;
        x= newX;
    }

    public void  setDirection(String newDirection){

        if(newDirection.equalsIgnoreCase("up")||
                newDirection.equalsIgnoreCase("down")||
                newDirection.equalsIgnoreCase("right")||
                newDirection.equalsIgnoreCase("left")) {
            currentDirection = newDirection;
        }else {
            System.out.println("Invalid Direction");
            currentDirection="";
        }
    }

    public void move1Block(){

        switch (currentDirection){
            case  "right" : x +=1;
                break;
            case  "left" : x -=1;
                break;
            case  "up" : y +=1;
                break;
            case  "down" : y -=1;
                break;
            default:
                break; }

    }
    public void move1Block(String newDirection){
        setDirection(newDirection);
        move1Block();

    }


    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
