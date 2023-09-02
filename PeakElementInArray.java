public class PeakElementInArray {

        public static int find(int[] a){
            int[] left=new int[a.length];
            left[0]=a[0];
            for (int i=1;i<a.length;i++ )
                left[i]=Math.max(a[i],left[i-1]);

            int[] right=new int[a.length];
            right[a.length-1]=a[a.length-1];
            for (int i=a.length-2;i>=0;i--)
                right[i]=Math.min(right[i+1],a[i]);

            for (int i=1;i<a.length-1;i++){
                if(a[i]>=left[i-1] && a[i]<=right[i+1])
                    return a[i];
            }
            return -1;
        }
        public static void main(String[] args) {

            int[] a={4,2,5,7};
            System.out.println(find(a));


    }

}
