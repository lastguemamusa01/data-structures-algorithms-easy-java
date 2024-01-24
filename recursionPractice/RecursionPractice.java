package recursionPractice;

public class RecursionPractice {

    static int factorial(int n) {
        // base case when n == 0, return 1
        if(n == 0) return 1;
        else return n*factorial(n-1);
    }

    static void towerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {

        // if only 1 disk,make the move and return
        if(n == 1) {
            System.out.println("move the disk 1 from peg "+ fromPeg + " to peg " + toPeg);
            return;
        }

        // move n-1 disks fromPego to auxPeg
        towerOfHanoi(n-1, fromPeg, auxPeg, toPeg);

        // mothe the last disk from t he fromPego to toPego
        System.out.println("move disk from Peg "+ fromPeg + " to peg " + toPeg);

        // move n-1 disks from auxPego to toPeg
        towerOfHanoi(n-1, auxPeg, toPeg, fromPeg);
    }

    static boolean isArrayInSortedOrder(int[] A, int index) {
        // array size is 1, is sorted
        if(index == 1) return true;
        return (A[index-1] < A[index-2]) ? false : isArrayInSortedOrder(A, index-1); 
    }

    //strings of n bits - backtracking 

    public static void main(String[] args) {
        int fr = factorial(3);
        System.out.println(fr);

        System.out.println();

        int[] intArr = {1,2,3,6,5,4};
        boolean isArrSorted = isArrayInSortedOrder(intArr, intArr.length-1);
        System.out.println(isArrSorted);

        System.out.println();

        towerOfHanoi(3, 'f', 't', 'a');
    }
    
}

