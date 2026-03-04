package Bitwise_Operators;

public class Clear_last_i_bits {
    public static int clearlastbit(int n, int i){
        int Bitmask = (-1)<<i;
        return n & Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearlastbit(15, 2));
    }
    
}
