package matrix;

import java.util.Arrays;

public class Matrix_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���όv�Z
		/*
		double a[] = { 1, 2 };
		double b[] = { 3, 4 };
		
		Matrix_lib mlib = new Matrix_lib();
		System.out.println("Innter Product = "+ mlib.getInnerProduct(a, b));
		*/
		
		//�s��v�Z
		/*
		double a[][] = { { 1, 2 }, { -1 ,1} };
		double b[][] = { { 3, -1 }, { 2 ,1} };
		Matrix_lib mlib = new Matrix_lib(a, b);
		System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct()));
		//���������z��̕\��
		*/
		
		//�ۑ�
		/*
		double a[][] = { { 0, 1 }, { 2, 0 }, { 0, 3 } };
		double b[][] = { { 1, -1, 2 }, { 3, 0, 4 } };
		Matrix_lib mlib = new Matrix_lib(a, b);
		System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct()));
		System.out.println("B Transpose = "+ Arrays.deepToString(mlib.getTranspose(b)));
		*/
		//---------------�R���X�g���N�^�Ȃ�ver----------------------
		
		double a[][] = { { 0, 1 }, { 2, 0 }, { 0, 3 } };
		double b[][] = { { 1, -1, 2 }, { 3, 0, 4 } };
		Matrix_lib mlib = new Matrix_lib();
		System.out.println("Product = "+ Arrays.deepToString(mlib.getProduct(a,b)));
		System.out.println("B Transpose = "+ Arrays.deepToString(mlib.getTranspose(b)));
		
		double c[][] = { { 3, 1, 1, 2 },{ 5, 1, 3, 4 },{ 2, 0, 1, 0 },{ 1, 3, 2, 1 }};
		//�]���q�W�J�����߂�
		System.out.println("Cofactor = "+ (mlib.getCofactor(c)));
		//�t�s������߂�
		System.out.println("Inverse = "+ Arrays.deepToString(mlib.getInverse(c)));
		
		//1106�ۑ�F�A��������������
		double e[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, -1 }, { 1, 1, -1, 1 }, { 1, -1, 1, 1 } };
		double d[] = { 0, 4, -4, 2 };
		System.out.println("Solution = "+ Arrays.toString(mlib.getSolution(e, d)));
		
		
		
	}

}
