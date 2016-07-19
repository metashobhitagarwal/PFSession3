package Assign2A;

public class LinearSearch {

	public int linearSearch(int[] array, int currentPosition, int arrLength, int key){
		if(array[currentPosition] == key){
			return currentPosition;
		}else if(currentPosition < arrLength-1){
			return linearSearch(array, currentPosition+1, arrLength, key);
		}else{
			System.out.println("Could not find the key element : " + key);
			return -1;
		}
	}
}
