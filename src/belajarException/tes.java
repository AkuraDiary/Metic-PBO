package belajarException;
import java.util.Scanner;
public class tes {
    static public void coba(){
        try{
            int[] arr = {1, 2, 4, 5, 2};
            for(int i =0; i<5; i++){
                System.out.println(arr[i]);
            }
        }catch (Exception e){
            //System.out.println("something is wrong i can feel it");
            throw e;//. "something is wrong i can feel it";
            //throw e;
        }
    }
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 4, 5, 2};
        for(int i =0; i<5; i++){
            System.out.println(arr[i]);
        }*/

        Scanner input = new Scanner(System.in);
        try{
            //int val = input.nextInt();
            //System.out.println(val);
            coba();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }finally {
            System.out.println("finnally");
        }
        String lanjut = "";
        do{
            System.out.print("input : ");
            try{
                int val = input.nextInt();
                System.out.println(val);

            }catch (Exception e){
                System.out.println("Input Tidak Valid");
            }

        }while(true);
    }
}
