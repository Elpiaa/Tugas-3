import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
    
        double jari;
        double tinggi;
        double volume;
        double ls;
        double lp;
        double la;
        double ln;
        double a;
        char ans = 'n';
    
        Scanner t = new Scanner(System.in);

        do{
            System.out.println("------------- Menghitung Bangun Ruang Tabung -------------");
            System.out.println("               Input dalam satuan centimeter           ");
            
            System.out.println("----------------------------------------------------------");

            System.out.print("Masukkan jari-jari : ");
            jari = t.nextFloat();
            
            System.out.print("Masukkan tinggi : ");
            tinggi = t.nextFloat();

            System.out.print("Alas : ");
            a = t.nextFloat(); 
    
            System.out.println("Menu Pilih : ");
            System.out.println("1. Segitiga");
            System.out.println("2. Tabung"); 
            System.out.println(" ");
            System.out.print("Pilih ? ");
            int pilih = t.nextInt();

            switch(pilih){
                case 1:
                    System.out.println("-----Segitiga-----");
                    la = 0.5 * a * tinggi ; 
                    System.out.println("Luas Segitiga = 0.5 * alas * tinggi  = " + (int)Math.ceil(la) + " cm");
                    System.out.println(" ");
                    double x , y , z , Keliling;

                    System.out.println("Keliling Segitiga ");
                    System.out.print("Masukkan x : ");
                    x = t.nextFloat();
                    System.out.print("Masukkan y : ");
                    y = t.nextFloat();
                    System.out.print("Masukkan z : ");
                    z = t.nextFloat();
                    Keliling = x + y + z ;
                    System.out.println("Keliling Segitiga = x + y + z =  " + (int)Keliling + " cm" );
                    break;

                case 2 :
                    lp = 2 * Math.PI * jari * (jari + tinggi);
            
                    System.out.println("Luas Permukaan Tabung = 2 * PI * r * ( r + t ) = " + (int)Math.ceil(lp) + " cm");
            
                    System.out.println(" ");

                    ls = 2 * Math.PI * jari * tinggi ;
        
                    System.out.println("Luas Selimut Tabung = 2 * PI * r * t = " + (int)Math.ceil(ls) + " cm");
            
                    System.out.println(" ");
                    la = Math.PI * jari * jari;
        
                    System.out.println("Luas Alas Tabung = PI * r * r = " + (int)Math.ceil(la) + " cm");
            
                    System.out.println(" ");
                    ln = la + ls ;
        
                    System.out.println("Luas Tanpa Tutup Tabung = Luas Selimut + Luas Alas = " + (int)Math.ceil(ln) + " cm");
            
                    System.out.println(" ");
                    volume = Math.PI * jari * jari * tinggi ;
        
                    System.out.println("Volume Tabung = PI * r * r * t = " + (int)Math.ceil(volume) + " cm");
            
                    System.out.println(" ");

                    break ;
            
            }
    
            System.out.println("Thank You....");
            System.out.println(" ");

            System.out.print("Apakah anda ingin mengulang[y/n]?  ");
            t.nextLine();
            String yn = t.nextLine();
            ans = yn.charAt(0);

        }while(ans=='y' || ans == 'Y');


        t.close();
    }

}
