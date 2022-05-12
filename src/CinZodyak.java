import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args){
        int yas;
        String[] burclar = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        try{
            yas = sc.nextInt();
            for(int i = 0;i<12;i++){
                if(yas%12==i){
                    System.out.println("Çin Zodyağı burcunuz : " + burclar[i]);
                }
            }
        }catch (Exception e){
            System.out.println("Error: "+ e);
        }

    }
}
