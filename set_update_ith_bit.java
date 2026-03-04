package Bitwise_Operators;

public class set_update_ith_bit {
    public static int setIthbit(int n, int i){
        int bitmask = 1<< i;
        return n | bitmask;
    }

    public static int ClearIthbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthbit(int n, int i, int newbit ){
        //if (newbit ==0){
          //  return (ClearIthbit(n, i));
        //}

        //else{
          //  return setIthbit(n, i);
        //}

        n = ClearIthbit(n, i);
        int Bitmask = newbit << i;
        return n | Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setIthbit(10, 2));
        System.out.println(ClearIthbit(10, 2));
        System.out.println(updateIthbit(10, 2, 1));
    }
}
