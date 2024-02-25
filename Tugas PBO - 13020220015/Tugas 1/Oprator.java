// NIM :13020220015
public class Oprator {
    public static void main(String[] args) {
        
        boolean Bool1, Bool2, TF ; 
        int i = 10, j = 5, hsl ; 
        float x, y, res ;
        
        System.out.println("Silahkan baca teksnya " + "dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        
        Bool1 = true; Bool2 = false;
        TF = Bool1 && Bool2 ; 
        System.out.println(TF); 
        
        TF = Bool1 || Bool2 ;  
        System.out.println(TF); 
        
        TF = ! Bool1 ; 
        System.out.println(TF); 
        
        TF = Bool1 ^ Bool2; 
        System.out.println(TF); 

        hsl = i % j ; 
        System.out.println(hsl); 
        
        x = 5 ; y = 5 ;
        res = x + y; 
        System.out.println(res); 
        
        res = x - y; 
        System.out.println(res); 
        
        res = x / y; 
        System.out.println(res); 
        
        res = x * y;
        System.out.println(res); 
        
        TF = (i == j); 
        System.out.println(TF); 
        
        TF = (i != j);
        System.out.println(TF); 
        
        TF = (i < j); 
        System.out.println(TF); 
        
        TF = (i > j); 
        System.out.println(TF); 
        
        TF = (i <= j); 
        System.out.println(TF); 
        
        TF = (i >= j); 
        System.out.println(TF); 
        
        TF = (x != y);
        System.out.println(TF); 
        
        TF = (x < y); 
        System.out.println(TF); 
        
        TF = (x > y); 
        System.out.println(TF); 
        
        TF = (x <= y); 
        System.out.println(TF); 
        
        TF = (x >= y);
        System.out.println(TF); 
    }
}