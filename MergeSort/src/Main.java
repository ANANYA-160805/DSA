//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int[] arr= {5,3,2,7,6,4,6,9};
        mergeSort(arr);
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
        }

    private static void mergeSort(int[] arr) {
        int n=arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx=0;
        for(int i=0; i<a.length; i++){
            a[i]=arr[idx++];
        }
        for(int j=0; j<b.length; j++){
            b[j]=arr[idx++];
        }
        mergeSort(a);
        mergeSort(b);

        merge(a,b,arr);
    }
    private static void merge(int[] a, int[] b, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
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
