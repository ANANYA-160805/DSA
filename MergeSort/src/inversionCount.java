public class inversionCount {
    static int count;
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = inversionCount(arr);
        System.out.println(result);
    }
    public static int inversionCount(int arr[]) {
        count = 0;
        mergesort(arr);
        return count;
    }

    private static void mergesort(int[] arr) {
        int n = arr.length;
        if(n==1)return;

        int[] a = new int[n/2];
        int[] b = new int[n-(n/2)];

        int idx=0;

        for( int i=0; i<a.length; i++){
            a[i]=arr[idx++];
        }
        for(int j=0; j<b.length; j++){
            b[j]=arr[idx++];
        }

        mergesort(a);
        mergesort(b);

        merge(a,b,arr);
    }

    private static void merge(int[] a, int[] b, int[] arr) {
        int i=0, j=0, k=0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++];
            } else {
                count += (a.length - i);
                arr[k++] = b[j++];
            }
        }

        while (i < a.length) {
            arr[k++] = a[i++];
        }

        while (j < b.length) {
            arr[k++] = b[j++];
        }
    }
}

