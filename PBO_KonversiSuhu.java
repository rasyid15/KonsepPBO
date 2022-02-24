
package pbo_muhammad_rasyid_ridho;

public class PBO_KonversiSuhu {
    public static void main(String[] args) {
        double Celcius, Fahrenheit, Kelvin, Reamur;
        Celcius = 78;
        System.out.println("Suhu: ");
        System.out.println("Celcius    : "+Celcius+"°C");
        Reamur = Celcius*4/5;
        System.out.println("Reamur     : " +Reamur+"°R");
        Fahrenheit = Celcius*9/5 + 32;
        System.out.println("Fahrenheit : "+Fahrenheit+"°F");
        Kelvin = Celcius+273;
        System.out.println("Kelvin     : "+Kelvin+"°K");
        
    }
    
}
