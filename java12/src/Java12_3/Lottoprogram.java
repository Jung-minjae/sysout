package Java12_3;

import java.util.Scanner;

public class Lottoprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double d = Math.random();
		double e = Math.random();
		double f = Math.random();

		int a_1 = (int) (a * 45) + 1;
		int b_1 = (int) (b * 45) + 1;
		int c_1 = (int) (c * 45) + 1;
		int d_1 = (int) (d * 45) + 1;
		int e_1 = (int) (e * 45) + 1;
		int f_1 = (int) (f * 45) + 1;

		System.out.println(a_1);
		System.out.println(b_1);
		if (a_1 == b_1) {
			double b1 = Math.random();
			double c1 = Math.random();
			double d1 = Math.random();
			double e1 = Math.random();
			double f1 = Math.random();

			int b_11 = (int) (b * 45) + 1;
			int c_11 = (int) (c * 45) + 1;
			int d_11 = (int) (d * 45) + 1;
			int e_11 = (int) (e * 45) + 1;
			int f_11 = (int) (f * 45) + 1;

			System.out.println(b_11);
			System.out.println(c_11);
			if (a_1 == c_11 || b_11 == c_11) {

				double c11 = Math.random();
				double d11 = Math.random();
				double e11 = Math.random();
				double f11 = Math.random();

				int c_111 = (int) (c * 45) + 1;
				int d_111 = (int) (d * 45) + 1;
				int e_111 = (int) (e * 45) + 1;
				int f_111 = (int) (f * 45) + 1;

				System.out.println(c_111);
				System.out.println(d_111);
				if (a_1 == d_111 || b_11 == d_111 || c_111 == d_111) {
					double d1111 = Math.random();
					double e1111 = Math.random();
					double f1111 = Math.random();

					int d_1111 = (int) (d * 45) + 1;
					int e_1111 = (int) (e * 45) + 1;
					int f_1111 = (int) (f * 45) + 1;

					System.out.println(d_1111);
					System.out.println(e_1111);
					if (a_1 == e_1111 || b_11 == e_1111 || c_111 == e_1111 || d_1111 == e_1111) {
						double e11111 = Math.random();
						double f11111 = Math.random();

						int e_11111 = (int) (e * 45) + 1;
						int f_11111 = (int) (f * 45) + 1;

						System.out.println(e_11111);
						System.out.println(f_11111);
						if (a_1 == f_11111 || b_11 == f_11111 || c_111 == f_11111 || d_1111 == f_11111
								|| e_11111 == f_11111) {

							double f111111 = Math.random();
							int f_111111 = (int) (f * 45) + 1;

							System.out.println(f_111111);
						}

						System.out.println(f_1111);
					}
				}

				System.out.println(e_111);
				System.out.println(f_111);

			}

			System.out.println(d_11);
			System.out.println(e_11);
			System.out.println(f_11);

		}

		System.out.println(c_1);
		System.out.println(d_1);
		System.out.println(e_1);
		System.out.println(f_1);

	}

}
