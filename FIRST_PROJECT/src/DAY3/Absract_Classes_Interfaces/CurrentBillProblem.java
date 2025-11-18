package DAY3.Absract_Classes_Interfaces;

import java.util.Scanner;

class CurrentBill{
    public double amount(){
        return 0.0;
    }
}
class Fan extends CurrentBill{
    public double watts;
    public double hours;
    Fan(double watts,double hours){
        this.watts=watts;
        this.hours=hours;
    }

    @Override
    public double amount(){
        double units=(watts*hours)/1000;//Kwh
        return units*1.5;
    }
}
class Lights extends CurrentBill{
    public double watts;
    public double hours;
    Lights(double watts,double hours){
        this.watts=watts;
        this.hours=hours;
    }

    @Override
    public double amount(){
        double units=(watts*hours)/1000;//Kwh
        return units*1.5;
    }
}

class TV extends CurrentBill{
    public double watts;
    public double hours;
    TV(double watts,double hours){
        this.watts=watts;
        this.hours=hours;
    }

    @Override
    public double amount(){
        double units=(watts*hours)/1000;//Kwh
        return units*1.5;
    }
}



public class CurrentBillProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter watts and hours for fan\n");
        double fwatts=sc.nextDouble();
        double fhours=sc.nextDouble();
        System.out.println("Enter for lights");
        double lwatts=sc.nextDouble();
        double lhours=sc.nextDouble();

        System.out.println("Enter for TV\n");
        double twatts=sc.nextDouble();
        double thours=sc.nextDouble();

        Fan f=new Fan(fwatts,fhours);

        Lights l=new Lights(lwatts,lhours);

        TV t=new TV(twatts,thours);

        double total=f.amount()+l.amount()+t.amount();
        
        System.out.println(total);
        sc.close();
    }
}
