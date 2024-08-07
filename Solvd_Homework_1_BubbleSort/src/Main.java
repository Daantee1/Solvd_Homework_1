public class Main {
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 15, 2, 5, 7, 3, 4, 20, 19 };

        bubbleSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int array[]){

        for(int i = 0; i <array.length - 1; i++){
            for(int j = 0; j <array.length - 1 - i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}