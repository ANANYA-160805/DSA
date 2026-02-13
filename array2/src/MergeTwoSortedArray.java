public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arra = {2, 4, 6, 7, 9};
        int[] arrb = {1, 3, 5, 6, 8, 10, 12};

        int[] arrc = new int[arra.length + arrb.length];

        merge(arrc, arra, arrb);

        for (int x : arrc) {
            System.out.print(x + " ");
        }
    }

    public static void merge(int[] arrc, int[] arra, int[] arrb) {
        int i = 0, j = 0, k = 0;

        while (i < arra.length && j < arrb.length) {
            if (arra[i] > arrb[j]) {
                arrc[k++] = arrb[j++];
            } else {
                arrc[k++] = arra[i++];
            }
        }

        while (i < arra.length) {
            arrc[k++] = arra[i++];
        }

        while (j < arrb.length) {
            arrc[k++] = arrb[j++];
        }
    }
}
