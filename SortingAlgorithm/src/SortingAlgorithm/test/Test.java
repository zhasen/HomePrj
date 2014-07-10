package SortingAlgorithm.test;

import java.util.EnumSet;

public class Test {
	// 个数
	private static int count = 100;

	private int[] array = new int[count];

	// 循环次数
	private long con = 0;

	public static void main(String[] args) {
		// 算法test
//		Test test = new Test();
//		test.show();
		// effective java test
		
	}

	/**
	 * 初始化数组。打乱顺序。
	 */
	private void initIntList() {
		// 造数据
		this.con = 0;
		for (int i = 0; i < count; i++) {
			array[i] = (int) (Math.random() * 10000);
		}
	}

	/**
	 * 打印数组里的值。
	 * 
	 * @param array
	 */
	public void showListContent(int[] array) {
		int s = 0;
		for (int temp : array) {
			System.out.println("第" + s + "数字:    " + temp);
			s++;
		}
		System.out.println("总循环次数：" + this.con);
	}

	public void show() {
		initIntList();
		int[] temp = this.array.clone();
		// 插入排序
		con = 0;
		array = temp.clone();
		insertSort(array);
		System.out.println("插入排序循环:" + this.con);

		// 选择排序
		con = 0;
		array = temp.clone();
		selectionSort(array);
		System.out.println("选择排序循环:" + this.con);

		// 冒泡排序
		con = 0;
		array = temp.clone();
		bubbleSort(array);
		System.out.println("冒泡排序循环:" + this.con);

		// 快速排序
		con = 0;
		array = temp.clone();
		array = new int[]{12,4,2,6,35,8,654,321,43,2,34,5};
		quickSort(array,0,array.length-1);
		//showListContent(array);
		System.out.println("快速排序循环:" + this.con);
	}

	private void quickSort(int a[], int start, int end) {
		int i, j;
		i = start;
		j = end;
		if ((a == null) || (a.length == 0))
			return;
		while (i < j) {
			while (i < j && a[i] <= a[j])/* 以数组start下标的数据为key，右侧扫描 */
			{
				j--;
			}
			if (i < j)/* 右侧扫描，找出第一个比key小的，交换位置 */
			{
				a[i] = a[i] + a[j];
				a[j] = a[i] - a[j];
				a[i] = a[i] - a[j];
			}
			while (i < j && a[i] < a[j])/* 左侧扫描（此时a[j]中存储着key值） */
			{
				i++;
			}
			if (i < j)/* 找出第一个比key大的，交换位置 */
			{
				a[i] = a[i] + a[j];
				a[j] = a[i] - a[j];
				a[i] = a[i] - a[j];
			}
		}
		if (i - start > 1) {
			/* 递归调用，把key前面的完成排序 */
			quickSort(a, start, i - 1);
		}
		if (end - i > 1) { 
			quickSort(a, i + 1, end);/* 递归调用，把key后面的完成排序 */
		}
	}

	// 冒泡排序
	private void bubbleSort(int[] array) {
		int swap = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				con++;
				if (array[j] > array[j + 1]) {
					/*
					 * //第一种变量交换的方法。多用一个变量。 swap = array[j]; array[j] =
					 * array[j+1]; array[j+1] = swap;
					 */

					// 第二种变量交换的方法，少用到一个变量。
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];
				}
			}
		}
	}

	// 选择排序
	private void selectionSort(int[] array) {
		int flag = 0;
		int swap = 0;
		for (int i = 0; i < array.length; i++) {
			flag = i;
			for (int j = i; j < array.length; j++) {
				con++;
				if (array[flag] > array[j]) {
					flag = j;
				}
			}
			// 发现最小的情况。
			if (flag != i) {
				swap = array[flag];
				array[flag] = array[i];
				array[i] = swap;
			}
		}
	}

	// 插入排序
	private void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			for (int j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
				array[j] = temp;
				con++;
			}
		}
	}

}
