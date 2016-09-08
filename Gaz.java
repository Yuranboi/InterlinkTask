package Pikap;

import Mersedes.MersedesTruck;

public class Gaz extends MersedesTruck implements PassengerCar, Truck {

    boolean seatYesOrNot;   // переменная есть или нету пассажирские места
    boolean trailerYesOrNot;    // переменная есть или нету прицепа

    public Gaz(String nameCar, int ageCar, int volumeEngime, int consumFuel) {
        super(nameCar, ageCar, volumeEngime, consumFuel);
    }


    @Override
    public void trailerAvaliable(boolean q) {
        this.trailerYesOrNot = q;
    }   // вводим переменную есть или нету прицепа

    @Override
    public void capacity() {                // если нету прицепа выводим "нету", иначе считаем по формуле
                                            // возвраст машины / 2 + расход бензына * 6 + обьем двигателя *3
       if (this.trailerYesOrNot == false) {
           System.out.println("Нету прицепа");
       } else {
           int b = super.getAgeCar()/2 + super.getConsumFuel()*6 + super.getVolumeEngine()*3;
           System.out.println("Марка машины - " + super.getNameCar() + " грузоподъемность : " + b + " кг");
       }

    }

    @Override
    public void seatsAvaliable(boolean s) {           // вводим перемнную есть или нету пассажирских мест
        this.seatYesOrNot = s;

    }


    @Override
    public void numberPassengers() {    // если нету пассажирских мест выводим "нету", иначе считаем по формуле
                                        // возвраст машины / 2 + расход бензына * 2 + обьем двигателя *3
        if (this.seatYesOrNot == false) {
            System.out.println("Нету посадочных мест");
        } else  {
            int a = super.getAgeCar()/2 + super.getConsumFuel()*2 + super.getVolumeEngine()*3;
            System.out.println("Марка машины - " + super.getNameCar() + " количество посадочных мест : " + a);
        }

    }


}
