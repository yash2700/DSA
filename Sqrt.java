public class Sqrt {
    public static int findSqrt(int a){
       int start=0;
       int end=a;
       while (start<=end){
           long mid=start+(end-start)/2;
           if(mid*mid==a) return (int)mid;
           else if(mid*mid<a) start=(int)mid+1;
           else end=(int)mid-1;
       }
       return start-1;
    }
    public static void main(String[] args) {
        int a=11;
        System.out.println(findSqrt(2147483647));
    }
}
