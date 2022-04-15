// public class Main {
//     public static void main(String[] args){
//         int [][] arr = {
//             {1,2,8,4,1},
//             {4,5,17,3,0},
//             {1,3,8,3,6},
//         };

//         String newValue = "64802";

//         for (int i=0; i<5; i++){
//             char temp = newValue.charAt(i);
//                 arr[0][i] = arr[0][i] + Character.getNumericValue(temp);
//         }
//         System.out.println(arr[0][1]);
//     }
// }

// public class Main {
//     public static void main(String[] args){
//         String [][] data = {
//             {"Budi", "7"},
//             {"Ahmad", "9"},
//             {"Ujang", "5"},
//             {"Tatang", "8"},
//             {"Asep", "6"},
            
//         };

//         System.out.println(Integer.valueOf(data[3][1]) + data[4][1]);
//     }
// }

public class Main {
    public static void main(String[] args){
        String [][] data = {
            {"Budi", "7"},
            {"Ahmad", "9"},
            {"Ujang", "5"},
            {"Tatang", "8"},
            {"Asep", "6"},
            
        };

        for (int i=0; i<5; i++) {
            int temp = Integer.valueOf(data[i][1]) *2;
            data[i][1] = String.valueOf(temp);
        }
        int result = Integer.valueOf(data[2][1]) + Integer.valueOf(data[4][1]);
        System.out.println(result - Integer.valueOf(data[1][1]));
    }
}