public class ForEver {
    public static void main(String[] args) {
        System.out.println("Program akan looping, akhiri dengan ^c");
        try {
            while (true) {
                System.out.print("Print satu baris ..... \n");
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Program dihentikan.");
        }
    }
}