package com.example;

import java.util.Arrays;

import com.example.logic.BubbleSort;

public class Main {
	public static void main(String[] args) {
		BubbleSort<String> sort = new BubbleSort<>();

		System.out.println("result: " + sort.sort(Arrays.asList(args)));
	}
}