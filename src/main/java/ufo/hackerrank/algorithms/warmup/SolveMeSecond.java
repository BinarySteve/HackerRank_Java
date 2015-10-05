/*******************************************************************************
 * Copyright 2015 Francesco Cina'
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package ufo.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class SolveMeSecond {

	static int solveMeSecond(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		int sum;
		int a, b;
		t = in.nextInt();
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			sum = solveMeSecond(a, b);
			System.out.println(sum);
		}
		in.close();
	}

}
