public class Currencyconverter {
    
    
    public static void main(String args[]) {
     system.out.println("Choose the currency type :");
     system.out.println("1. Yen To Dollars");
     system.out.println("2. Dollar To Yen");
     
     Scanner sc = new Scanner(System.in);
     system.out.println (" Enter the Yen amount");
     double yen = sc.nextDouble ();
     system.out.println(" Enter the dollar amount");
     double dollars = sc.nextDouble();
     
     
     int choice = sc.nextInt();
     
     switch (choice){
         case 1:
            yenToDollar(yen,dollars);
            break;
            
         case 2:
             dollarToYen(yen,dollars);
             break;
         default:
            system.out.println("invalid choice,please give either 1 or 2");
            break;
        }
      
    }
    public static double  yenToDollar(double y,double d)
    {
        system.out.println ("1 yen  =  " + (1/130.90) + " dollars");
        double d1= (y*(1/130.90)) + d ;
        return d1 ; 
        system.out.println (" Total currency = " + d1 +" dollars");
    } 
    public static double dollarToYen(double y,double d)
    {
        system.out.println(" 1 dollar = "+ 130.90 + "yen");
        double y1 = y+ d*(130.90);
        return y1; 
        system.out.println("Total Currency = " +y1 + " yen");
    }
    
}
