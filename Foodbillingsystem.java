import java.util.Scanner;
public class Foodbillingsystem {
    public static void billing(){
    System.out.println("********************************GREAT INDIAN RESTAURANT****************************************");
    System.out.println("********************************WELCOME TO BILLING SECTOR**************************************");
    System.out.print("ITEM NAME"+"\t\t\tQUANTITY"+"\t\t\tTOTAL");
    System.out.println();
    System.out.println("-------------------------------------------------------------------");
    }
    public static void bill(String ItemName,int Quantity,int Total){
    System.out.print(ItemName+"\t\t\t\t"+Quantity+"\t\t\t\t"+Total*Quantity);
    System.out.println();
    }
    public static void calculate(int Total,int Quantity){
        }
    public static void main(String arg[]){
        int a=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO GREAT INDIAN RESTAURANT");
        System.out.println("enter number of orders to be placed:");
        int n=sc.nextInt();
        String[] ItemName=new String[n];
        int[] Quantity=new int[n];
        int[] Total=new int[n]; 
        for(int i=0;i<n;i++){
            System.out.println("enter the item number"+" "+a);
            System.out.println("enter the item name");
            sc.nextLine();
            ItemName[i]=sc.nextLine();
           
            System.out.println("enter the quantity");
            Quantity[i]=sc.nextInt();

            System.out.println("enter the price per each unit");
            Total[i]=sc.nextInt();
               a++;   
    }
    billing();
    for(int i=0;i<n;i++){
        bill(ItemName[i],Quantity[i],Total[i]);
    }
    int price=0;
    System.out.println("--------------------------------------------------------------------");
    for(int i=0;i<n;i++){
        calculate(Total[i],Quantity[i]);
  price+=Total[i]*Quantity[i];
    }
    System.out.println("The total price is:                                             "+price);
    System.out.println("--------------------------------------------------------------------");
    System.out.println("                              "+"Thank you ");
    System.out.println("                              "+"visit again");
    
}}
