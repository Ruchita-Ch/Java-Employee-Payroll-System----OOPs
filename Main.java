abstract class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }


    public String getName(){
        return name;
    }
}


public class Main{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}