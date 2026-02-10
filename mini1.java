import java.util.*;
class bike {
    String name;
    String model;
    String year;
    String price;
    void modeldetails(){
        System.out.println("Name : "+name);
        System.out.println("Model : "+model);
    }
    void pricedetails(){
        System.out.println("Year : "+year);
        System.out.println("Price : "+price);
        System.out.println("                  ");
    }
}
public class mini1 {
    public static void main (String [] args){
        // bike sales report system 
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         sc.nextLine();
        bike buyer = new bike();
        for(int i=0 ;i<n;i++)
        {
             String bu = sc.nextLine();
         String[] buy = bu.split(",");
        System.out.println("Enter the customer id: 10"+(i+1));
        buyer.name= buy[0];
        buyer.model=buy[1];
        buyer.year=buy[2];
        buyer.price=buy[3];
        buyer.modeldetails();
        buyer.pricedetails();
        }
        sc.close();
          }
}