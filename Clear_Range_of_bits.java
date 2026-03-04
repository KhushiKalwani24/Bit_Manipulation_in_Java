package Bitwise_Operators;

public class Clear_Range_of_bits {
    
    public static int clearRangebits (int n, int i, int j){
        int a = (~0) << j+1;
        int b = (1 << i)-1;
        int bitmask = a|b;

        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangebits(10, 2, 4));
    }
}
