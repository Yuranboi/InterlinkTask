import Mersedes.*;
import Cars.Car;

import Pikap.Gaz;

public class Main {

    public static void main(String[] args) {

        Car mersedes = new Mersedes("Mers200", 5, 12, 10);
        Car mersedesTruck = new MersedesTruck("Mers300", 5, 12, 10);

        mersedes.calcMoneyCustom();
        mersedesTruck.calcMoneyCustom();

        boolean n = mersedes instanceof Car;
        boolean n1 = mersedesTruck instanceof Car;


        Gaz gaz = new Gaz("Gaz", 10, 19, 13);
        gaz.seatsAvaliable(true);
        gaz.numberPassengers();
        gaz.trailerAvaliable(true);
        gaz.capacity();
        gaz.calcMoneyCustom();
        System.out.println(n);
        System.out.println(n1);

        boolean n2 = gaz instanceof Car;
        System.out.println(n2);



    }
}
