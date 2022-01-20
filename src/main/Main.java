package main;

import kendaraan.mobil;
import kendaraan.motor;
import kendaraan.utilities;
import kendaraan.vehicle;

public class Main {
    public static void main(String[] args) {
        /*
        vehicle mobil_supra = new vehicle(4, 100, "supra", "andi");
        vehicle mobil_toyota = new vehicle(4, 100, "toyota", "anda");
        vehicle mobil_kijang = new vehicle(4, 100, "kijang", "andi");

        vehicle[] mobils = {mobil_supra, mobil_toyota, mobil_kijang};
        utilities util = new utilities();
        util.tampil_status(mobils);*/

        mobil avanza = new mobil(4, 100, "avansa", "andi", "mobil");
        motor ducati = new motor(2, 100, "ducati", "Rossi", "motor");

        avanza.status();
        ducati.status();
    }
}
