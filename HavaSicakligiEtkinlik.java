import java.util.Scanner;
public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik;
        System.out.print("Hava Sıcaklığını Giriniz:");
        sicaklik = input.nextDouble();
        if(sicaklik < 5){
            System.out.println("Kayak Yapabilirsiniz.");
        } else if(sicaklik >= 5 && sicaklik <= 25){
            if(sicaklik <= 15){
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            if(sicaklik >= 10){
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        } else{
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
    
}
