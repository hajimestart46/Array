import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int[] arr = new int [10];
		
		for(int i = 0; i < arr.length; i++) {
		    arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
		}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
		    if(max < arr[i]) {
		        max = arr[i];
		    }
		}
		System.out.println("最大值为:" + max);
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
		    if(min > arr[i]) {
		        min = arr[i];
		    }
		}
		System.out.println("最小值为:" + min);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
		    sum += arr[i];
		}
		System.out.println("总和为:" + sum);
		
		int avg = sum / arr.length;
		System.out.println("平均值为:" + avg);
	}
	
}
