/*
	A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
	Your goal is to find that missing element.
	Write a function:
	class Solution { public int solution(int[] A); }
	that, given a zero-indexed array A, returns the value of the missing element.
	For example, given array A such that:
	  A[0] = 2
	  A[1] = 3
	  A[2] = 1
	  A[3] = 5
	the function should return 4, as it is the missing element.
	Assume that:
	N is an integer within the range [0..100,000];
	the elements of A are all distinct;
	each element of array A is an integer within the range [1..(N + 1)].
	Complexity:
	expected worst-case time complexity is O(N);
	expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
	Elements of input arrays can be modified.
 */


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PermMissingElement {


    @Test
    public void test() {
        Assert.assertEquals(2, solution(new int[]{1, 3, 5}));
        Assert.assertEquals(16, solution(new int[]{1,2,21,22,8,3,4,5,6,7,9,10,11,12,13,14,15,17,18,19,20}));
    }


//    public int solution2(int[] A) {
//
//        for (int i : A) {
//            int target = i;
//            if(target < A.length && target != A[target]) {
//                int new_target = A[target];
//                A[target] = target;
//                target = new_target;
//            }
//        }
//
//        for
//
//        return 0;
//    }

    public int solution(int[] A) {

        Arrays.sort(A);

        int minimal = 1;
        for (int i : A) {
            if(i == minimal) {
                minimal++;
            } else {
                return minimal;
            }
        }

        return 0;
    }

}
