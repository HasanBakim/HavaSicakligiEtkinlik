import java.util.Scanner;
public class HavaSicakligiEtkinlik2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik;
        System.out.print("Hava Sıcaklığını Giriniz:");
        sicaklik = input.nextDouble();
        if(sicaklik < 5){
            System.out.print("Kayak Yapmaya Gidebilirsiniz");
        }
        if(sicaklik >= 5 && sicaklik <= 25){
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        if(sicaklik >= 15 && sicaklik <= 25){
            System.out.println("Pinkik Yapmaya Gidebilirsiniz");
        }
        if(sicaklik >= 25){
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
    
}
