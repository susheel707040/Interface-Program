import java.util.*;
public interface Client {
    void input();
    void output();
}
class Raju implements Client{
    String Name; int Age;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name here :");
        Name=sc.nextLine();

        System.out.println("Enter Age here :");
        Age=sc.nextInt();
    }
    public void output(){
        System.out.println(Name+" "+Age);
    }
    public static void main(String args[]){
    Client r=new Raju();
    r.input();
    r.output();
    }
    }

