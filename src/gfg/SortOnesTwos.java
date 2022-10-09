package gfg;

public class SortOnesTwos {
    public static void main(String[] args) {
        int arr[]= {0, 2, 1, 2, 0};
        int n = 5;
        sort012(arr,n);
    }
    public static void sort012(int arr[], int n) {
        var i = 0;
        var c0 = 0;
        var c1 = 0;
        var c2 = 0;

        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) {
                c0++;
            } else if (arr[j] == 1) {
                c1++;
            } else if (arr[j] == 2) {
                c2++;
            }
        }

        i = 0;
        while (c0-->0) {
            arr[i++] = 0;
        }

        while (c1-->0) {
            arr[i++] = 1;
        }
        while (c2-->0) {
            arr[i++] = 2;
        }
//        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

}
