package matrix;

import java.util.Arrays;

public class Matrix_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//内積計算
		/*
		double a[] = { 1, 2 };
		double b[] = { 3, 4 };
		
		Matrix_lib mlib = new Matrix_lib();
		System.out.println("Innter Product = "+ mlib.getInnerProduct(a, b));
		*/
		
		//行列計算
		/*
		double a[][] = { { 1, 2 }, { -1 ,1} };
		double b[][] = { { 3, -1 }, { 2 ,1} };
		Matrix_lib mlib = new Matrix_lib(a, b);
		System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct()));
		//↑多次元配列の表示
		*/
		
		//課題
		/*
		double a[][] = { { 0, 1 }, { 2, 0 }, { 0, 3 } };
		double b[][] = { { 1, -1, 2 }, { 3, 0, 4 } };
		Matrix_lib mlib = new Matrix_lib(a, b);
		System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct()));
		System.out.println("B Transpose = "+ Arrays.deepToString(mlib.getTranspose(b)));
		*/
		//---------------コンストラクタなしver----------------------
		
		double a[][] = { { 0, 1 }, { 2, 0 }, { 0, 3 } };
		double b[][] = { { 1, -1, 2 }, { 3, 0, 4 } };
		Matrix_lib mlib = new Matrix_lib();
		System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct(a,b)));
		System.out.println("B Transpose = "+ Arrays.deepToString(mlib.getTranspose(b)));
		
		double c[][] = { { 3, 1, 1, 2 },{ 5, 1, 3, 4 },{ 2, 0, 1, 0 },{ 1, 3, 2, 1 }};
		//余因子展開を求める
		System.out.println("Cofactor = "+ (mlib.getCofactor(c)));
		//逆行列を求める
		System.out.println("Inverse = "+ Arrays.deepToString(mlib.getInverse(c)));
		
		//1106課題：連立方程式を解く
		double e[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, -1 }, { 1, 1, -1, 1 }, { 1, -1, 1, 1 } };
		double d[] = { 0, 4, -4, 2 };
		System.out.println("Solution = "+ Arrays.toString(mlib.getSolution(e, d)));
		
		
		
	}

}
