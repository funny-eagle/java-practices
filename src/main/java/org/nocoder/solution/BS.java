package org.nocoder.solution;

/**
 * @author jason
 * @date 18/4/19.
 */
public class BS {
    public static int binarySearch(int [] list, int key){
        int low = 0;
        int high = list.length - 1;

        while(high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -low-1;
    }

    public static void main(String[] args) {
        System.out.print(binarySearch(new int []{1,2,3,4,5}, 5));
    }
}
