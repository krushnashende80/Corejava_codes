//public class Arrays {
//    public static void main(String[] args) {
//        int[][] arr = new int[3][];
//        arr[0]=new int[]{11,12,13,14};
//        arr[1]=new int[]{15,16,17,18};
//        arr[2]=new int[]{19,20,21,22};
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//
//            }
//            System.out.println();
//        }
//
//    }
//}
//we can write (row) fix but (colum) not fix its possible in java:
//public class Arrays{
//    public static void main(String[] args){
//
//        int[][] arr = new int[4][];
//
//        arr[0] = new int[]{11,12,13,14};
//        arr[1] = new int[]{15,16      };
//        arr[2] = new int[]{17,18,19   };
//        arr[3] = new int[]{20,21,22,32};
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}