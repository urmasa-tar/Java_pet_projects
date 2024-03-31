package operations_analyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class My_Own_Analyser {

    private static final String Resource = "./data/";
    // arrs example in Function main -> (String[] args)
    public static void main(final String[] args) throws IOException {

        // Main idea - get information about operations with name of file

        final Path to_file = Paths.get(Resource + args[0]);
        /*

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
        */

    }

    /*
    public static void vargs(final String... strings) {
        System.out.println(strings);
    }

    public static void arrs(final String[] strings) {
        System.out.println(strings);
    }
    */

    public static void Reader_For_CSV(Path path) throws IOException {

        String file = path.toString;
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));

        while ((line = reader.readLine()) != null){

            }

        }catch (Exception e){

        }finally {

        }

    }

    public static int vargs_example(int ... n){
        int sum = 0;

        for(int i : n){
            sum += i;
        }

        return  sum;
    }

}