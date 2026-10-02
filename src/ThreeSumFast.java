import edu.princeton.cs.algs4.In;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ThreeSumFast {

    public static int count(int[] a) {
        int count = 0;
        Arrays.sort(a);

        int layngthe = a.length;
        for (int i = 0; i < layngthe; i++) {
            for (int j = i+1; j < layngthe; j++){
                int isitreal = BinarySearch.indexOf(a,-a[i]-a[j]);
                if (isitreal == -1){
                    continue;
                } else {
                    if (isitreal <= i && isitreal <= j){

                        count++;
                    }
                }
            }

        }



        return count;

    }

    public static void main(String[] args) throws IOException {
        In in = new In(args[0]);
        int[] a = in.readAllInts();


        // Time only the count() call
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        double time = timer.elapsedTime();

        System.out.printf("Count = %d  time = %.3f seconds%n", count, time);
    }
}
