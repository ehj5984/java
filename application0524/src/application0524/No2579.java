package application0524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No2579 {
	static int[] dp;
	static int[] stair;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		dp = new int[n + 1]; // 각 계단의 최대값을 저장하는 배열 
		
		stair = new int[n + 1]; // 계단 값을 저장하는 배열 
		for (int i = 1; i <= n; i++) {
			stair[i] = Integer.parseInt(bf.readLine());
		}
		
		dp[0] = 0; // stair [0]  dp 0의 최대값은 arr 0 
		dp[1] = stair[1]; //max(stair[0]+stair[1], stair[1])
		dp[2] = stair[1] + stair[2]; //max(stair[0]+stair[2], stair[1]+ stair[2])
		
		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i - 2] + stair[i], dp[i - 3] + stair[i - 1] + stair[i]);
		}
		
		System.out.println(Arrays.toString(stair));
		System.out.println(Arrays.toString(dp));
		System.out.println(dp[n]);
	}
}
