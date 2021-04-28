package ch07.ex02.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3]; //사용법1 new생성자로 가장많이 사용함
		System.out.println(strs);

		Integer[] nums = new Integer[3];
		System.out.println(nums);

		int[] arr = new int[3];
		System.out.println(arr);

		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		System.out.printf("%d %d %d\n", arr[0], arr[1], arr[2]);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println();
		for (int i : arr) //foreach 문법
			System.out.print(i + "");
		
		int[] array = {3,4,5}; //사용법2
		System.out.println(array);
		array = new int[] { 6, 7, 8}; //사용법3
		System.out.println(array);
	}
}
