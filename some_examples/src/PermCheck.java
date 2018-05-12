/*
	A non-empty zero-indexed array A consisting of N integers is given.
	A permutation is a sequence containing each element from 1 to N once, and only once.
	For example, array A such that:
	    A[0] = 4
	    A[1] = 1
	    A[2] = 3
	    A[3] = 2
	is a permutation, but array A such that:
	    A[0] = 4
	    A[1] = 1
	    A[2] = 3
	is not a permutation, because value 2 is missing.
	The goal is to check whether array A is a permutation.
	Write a function:
	class Solution { public int solution(int[] A); }
	that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
	For example, given array A such that:
	    A[0] = 4
	    A[1] = 1
	    A[2] = 3
	    A[3] = 2
	the function should return 1.
	Given array A such that:
	    A[0] = 4
	    A[1] = 1
	    A[2] = 3
	the function should return 0.
	Assume that:
	N is an integer within the range [1..100,000];
	each element of array A is an integer within the range [1..1,000,000,000].
	Complexity:
	expected worst-case time complexity is O(N);
	expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
	Elements of input arrays can be modified.
 */

import org.junit.Test;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//SCORE: 100/100
public class PermCheck {

    public int solution(int[] A) {
        ArrayList<Integer> B   = IntStream.of(A).boxed().filter(x->x>0).sorted().distinct().collect(Collectors.toCollection(ArrayList<Integer>::new));

        return 0;
    }

    @Test
    public void tes() throws InterruptedException {

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.freeMemory());
        List<PermCheck> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(new PermCheck());
        }
        System.out.println(runtime.freeMemory());

        Thread.sleep(10000);

    }

    @Test
    public void printErr() {
        System.out.println("simple message");
        System.err.println("error message");

    }

    @Test
    public void consoleTest() {
        Console c = System.console();
        System.out.println("Eneter your name: ");
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }

}