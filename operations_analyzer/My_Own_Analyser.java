import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class My_Own_Analyser {

    // arrs example in Function main -> (String[] args)
    public static void main(final String[] args){

        try{
            System.out.println(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){

        } finally { // Example for tey/catch/finnaly and
            int ln = args.length;
            if( ln > 0){
                int[] arr = new int[ln];
                for(int i = 0; i < ln; i++){
                    arr[i] = i;
                }

                System.out.println(vargs_example(arr));
            }


        }


    }

    /*
    public static void vargs(final String... strings) {
        System.out.println(strings);
    }

    public static void arrs(final String[] strings) {
        System.out.println(strings);
    }
    */

    public static int vargs_example(int ... n){
        int sum = 0;

        for(int i : n){
            sum += i;
        }

        return  sum;
    }

}