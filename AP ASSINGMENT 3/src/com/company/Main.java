package com.company;

import java.util.LinkedList;
import java.util.Scanner;

class colmatrix {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public colmatrix(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class squm {
    int row, col;
    float[][] arr;
    int uniqueid;

    public squm(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;
    }
}

class rowmatrix {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public rowmatrix(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;
    }
}


class rectangularmatrix {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public rectangularmatrix(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;
    }

}

class symmetric {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public symmetric(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class skewsymmetric {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public skewsymmetric(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class uppertriangular {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public uppertriangular(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class lowertriangular {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public lowertriangular(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class singularmatrix {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public singularmatrix(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class diagonalmatrix {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public diagonalmatrix(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class scalarmatrix {
    int row;
    int col;
    float[][] arr;
    int uniqueid;

    public scalarmatrix(int row, int col, float[][] arr, int uniqueid) {
        this.row = row;
        this.col = col;
        this.arr = arr;
        this.uniqueid = uniqueid;

    }
}

class identitymatrix  {
    int row, col;
    float[][] mat;
    int uniqueid;

    public identitymatrix(int row, int col, float[][] mat, int uniqueid) {
        this.row = row;
        this.col = col;
        this.mat = mat;
        this.uniqueid = uniqueid;
    }


}

class singletonmatrix {

    int row, col;
    float[][] mat;
    int uniqueid;

    public singletonmatrix(int row, int col, float[][] mat, int uniqueid) {
        this.row = row;
        this.col = col;
        this.mat = mat;
        this.uniqueid = uniqueid;
    }
}

class nullmatrix {

    private int row, col;
    private float[][] mat;
    private int uniqueid;

    public nullmatrix(int row, int col, float[][] mat, int uniqueid) {
        this.row = row;
        this.col = col;
        this.mat = mat;
        this.uniqueid = uniqueid;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public float[][] getMat() {
        return mat;
    }

    public int getUniqueid() {
        return uniqueid;
    }


}
interface onesmat{
    int getUniqueid();
    int getRow();
    int getCol();
    float[][] getMat();
}
class onesmatrix implements onesmat  {

    private int row, col;
    private float[][] mat;
    private int uniqueid;

    public onesmatrix(int row, int col, float[][] mat, int uniqueid) {
        this.row = row;
        this.col = col;
        this.mat = mat;
        this.uniqueid = uniqueid;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public float[][] getMat() {
        return mat;
    }

    public int getUniqueid() {
        return uniqueid;
    }


}


class uniqueid {
    int uniqueid;
    int row, col;
    float[][] mat;

    public uniqueid(int row, int col, float[][] mat, int uid) {
        this.uniqueid = uid;
        this.row = row;
        this.col = col;
        this.mat = mat;
    }
}


public class Main {
    static LinkedList<colmatrix> columnmatrix = new LinkedList<colmatrix>();
    static LinkedList<squm> sqr = new LinkedList<squm>();
    static LinkedList<rowmatrix> rmatrix = new LinkedList<rowmatrix>();
    static LinkedList<rectangularmatrix> rectmatrix = new LinkedList<rectangularmatrix>();
    static LinkedList<symmetric> symmatrix = new LinkedList<symmetric>();
    static LinkedList<skewsymmetric> skymatrix = new LinkedList<skewsymmetric>();
    static LinkedList<uppertriangular> upmatrix = new LinkedList<uppertriangular>();
    static LinkedList<lowertriangular> lowmatrix = new LinkedList<lowertriangular>();
    static LinkedList<singularmatrix> singular = new LinkedList<singularmatrix>();
    static LinkedList<diagonalmatrix> diagonal = new LinkedList<diagonalmatrix>();
    static LinkedList<scalarmatrix> scalar = new LinkedList<scalarmatrix>();
    static LinkedList<identitymatrix> identity = new LinkedList<identitymatrix>();
    static LinkedList<singletonmatrix> single = new LinkedList<singletonmatrix>();
    static LinkedList<nullmatrix> null1 = new LinkedList<nullmatrix>();
    static LinkedList<uniqueid> uids = new LinkedList<uniqueid>();
    static LinkedList<onesmatrix> ones = new LinkedList<onesmatrix>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int uniqueid;

        while (true) {
            System.out.println("1. Enter or Create a matrix\n2. Display all the matrix-type labels of a matrix\n3. Perform addition, subtraction, multiplication & division.\n4. Perform element-wise operations.\n5. Transpose matrices.\n6. Inverse matrices.\n7. Compute means\n8. Compute determinants.\n9. Use singleton matrices as scalars\n" +

                    "10. Compute A+A^T for a matrix A\n11. Compute Eigen vectors and values.\n12. Solve sets of linear equations using matrices.\n13. Retrieve all the existing matrices of requested matrix-type lables\n14. Exit");
            System.out.print("Enter option: ");
            int option = scn.nextInt();

            if (option == 1) {
                //input####

                System.out.print("Enter no. of rows:");
                int row = scn.nextInt();
                System.out.print("Enter no. of columns:");
                int col = scn.nextInt();
                if (row < 1 || col < 1 || row > 3 || col > 3) {
                    System.out.println("Invalid matrix");
                } else {
                    float[][] mat = new float[row][col];
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            mat[i][j] = scn.nextFloat();
                        }
                    }
                    uniqueid = assignid();
                    uniqueid u1 = new uniqueid(row, col, mat, uniqueid);
                    uids.add(u1);

                    System.out.println("ID of the matrix is:" + uniqueid);

                    display(row, col, mat);
                    checktype(row, col, mat, uniqueid);


                }
            }
            if (option == 2) {
                System.out.print("Enter id of a matrix to see it's types: ");
                int id = scn.nextInt();
                int bool = 1;

                for (int i = 0; i < null1.size(); i++) {
                    if (id == null1.get(i).getUniqueid()) {
                        System.out.println("-->Null matrix");
                        bool = 0;
                    }
                }
                for (int i = 0; i < rectmatrix.size(); i++) {
                    if (id == rectmatrix.get(i).uniqueid) {
                        System.out.println("-->Rectangular matrix");
                    }
//
                }
                for (int i = 0; i < rmatrix.size(); i++) {
                    if (id == rmatrix.get(i).uniqueid) {
                        System.out.println("-->Row matrix");
                    }
                }
                for (int i = 0; i < columnmatrix.size(); i++) {
                    if (id == columnmatrix.get(i).uniqueid) {
                        System.out.println("-->Column matrix");
                    }
                }
                for (int i = 0; i < sqr.size(); i++) {
                    if (id == sqr.get(i).uniqueid) {
                        System.out.println("-->Square matrix");
                    }
                }
                if (bool == 1) {
                    for (int i = 0; i < symmatrix.size(); i++) {
                        if (id == symmatrix.get(i).uniqueid) {
                            System.out.println("-->Symmetric matrix");
                        }
                    }
                    for (int i = 0; i < skymatrix.size(); i++) {
                        if (id == skymatrix.get(i).uniqueid) {
                            System.out.println("-->Skew Symmetric matrix");
                        }
                    }
                    for (int i = 0; i < upmatrix.size(); i++) {
                        if (id == upmatrix.get(i).uniqueid) {
                            System.out.println("-->Upper triangular matrix");
                        }
                    }
                    for (int i = 0; i < lowmatrix.size(); i++) {
                        if (id == lowmatrix.get(i).uniqueid) {
                            System.out.println("-->Lower triangular matrix");
                        }
                    }
                    for (int i = 0; i < singular.size(); i++) {
                        if (id == singular.get(i).uniqueid) {
                            System.out.println("-->Singular matrix");
                        }
                    }
                    for (int i = 0; i < diagonal.size(); i++) {
                        if (id == diagonal.get(i).uniqueid) {
                            System.out.println("-->Diagonal matrix");
                        }
                    }
                    for (int i = 0; i < scalar.size(); i++) {
                        if (id == scalar.get(i).uniqueid) {
                            System.out.println("-->Scalar matrix");
                        }
                    }
                    for (int i = 0; i < identity.size(); i++) {
                        if (id == identity.get(i).uniqueid) {
                            System.out.println("-->Identity matrix");
                        }
                    }
                    for (int i = 0; i < single.size(); i++) {
                        if (id == single.get(i).uniqueid) {
                            System.out.println("-->Singleton matrix");
                        }
                    }
//                for(int i=0;i<null1.size();i++){
//                    if(id==null1.get(i).getUniqueid()){
//                        System.out.println("-->Null matrix");
//                    }
//                }
                    for (int i = 0; i < ones.size(); i++) {
                        if (id == ones.get(i).getUniqueid()) {
                            System.out.println("-->Ones matrix");
                        }
                    }
                }


            }

            if (option == 3) {
                //add subtract...####
                System.out.println("1. for addition\n" +
                        "2.for subtraction\n" +
                        "3. for multiplication\n" +
                        "4. for division");
                int choice = scn.nextInt();
                if (choice == 1) {
                    System.out.print("Enter id of the matrices that you want to add: ");
                    System.out.print("Id of matrix1:  ");
                    int idom1 = scn.nextInt();
                    System.out.print("Id of matrix2: ");
                    int idom2 = scn.nextInt();
                    int r1 = 0, r2 = 0, c1 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r2][c2];
                    for (int i = 0; i < uids.size(); i++) {
                        if (idom1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                        if (idom2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
//                if (r1 == r2 && c1 == c2) {
                    add(r1, c1, r2, c2, m1, m2);
//                }
                }
                if (choice == 2) {
                    System.out.print("Enter id of the matrices that you want to subtract: ");
                    System.out.print("Id of matrix1:  ");
                    int idom1 = scn.nextInt();
                    System.out.print("Id of matrix2: ");
                    int idom2 = scn.nextInt();
                    int r1 = 0, r2 = 0, c1 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r2][c2];
                    for (int i = 0; i < uids.size(); i++) {
                        if (idom1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                        if (idom2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
                    if (r1 == r2 && c1 == c2) {
                        subtract(r1, c1, m1, m2);
                    }
                }
                if (choice == 3) {
                    System.out.print("Enter id of the matrices that you want to multiply: ");
                    System.out.print("Id of matrix1:  ");
                    int idom1 = scn.nextInt();
                    System.out.print("Id of matrix2: ");
                    int idom2 = scn.nextInt();
                    int r1 = 0, r2 = 0, c1 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r2][c2];
                    for (int i = 0; i < uids.size(); i++) {
                        if (idom1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                        if (idom2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
                    multiply(r1, c1, r2, c2, m1, m2);
                }
                if (choice == 4) {
                    System.out.print("Enter id of the matrices that you want to divide");
                    System.out.print("Id of matrix1:  ");
                    int idom1 = scn.nextInt();
                    System.out.print("Id of matrix2: ");
                    int idom2 = scn.nextInt();
                    int r1 = 0, r2 = 0, c1 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r2][c2];
                    for (int i = 0; i < uids.size(); i++) {
                        if (idom1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                        if (idom2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
                    divide(r1, c1, r2, c2, m1, m2);
                }

            }
            if (option == 5) {
                //transpose#####
                System.out.print("Enter the id of the matrix to be transposed: ");
                int idom = scn.nextInt();
                int r = 0, c = 0;
                float[][] m = new float[r][c];

                for (int i = 0; i < uids.size(); i++) {
                    if (idom == uids.get(i).uniqueid) {
                        r = uids.get(i).row;
                        c = uids.get(i).col;
                        m = uids.get(i).mat;
                    }
                }
                transpose(r, c, m);
            }
            if (option == 10) {
                //A+A^T####
                System.out.print("Enter the id of the matrix to calculate (A+A^T): ");
                int idom = scn.nextInt();
                int r = 0, c = 0;
                float[][] m = new float[r][c];
                for (int i = 0; i < uids.size(); i++) {
                    if (idom == uids.get(i).uniqueid) {
                        r = uids.get(i).row;
                        c = uids.get(i).col;
                        m = uids.get(i).mat;
                    }
                }
                float[][] mt = transpose(r, c, m);
                System.out.println("A+A^T IS: ");
                add(r, c, c, r, m, mt);
            }
            if (option == 8) {
                //Determinant####
                System.out.print("Enter the id of the matrix for which determinant has to be calculated: ");
                int idom = scn.nextInt();
                int r = 0, c = 0;
                float[][] m = new float[r][c];
                for (int i = 0; i < uids.size(); i++) {
                    if (idom == uids.get(i).uniqueid) {
                        r = uids.get(i).row;
                        c = uids.get(i).col;
                        m = uids.get(i).mat;
                    }
                }
                if (r != c) {
                    System.out.println("Failed to find Determinant ");
                } else {
                    System.out.println("Determinant is: " + determinant(r, c, m));
                }
            }
            if (option == 6) {

                System.out.print("Enter the id of the matrix for which inverse has to be calculated: ");
                int idom = scn.nextInt();
                int r = 0, c = 0;
                float[][] m = new float[r][c];
                for (int i = 0; i < uids.size(); i++) {
                    if (idom == uids.get(i).uniqueid) {
                        r = uids.get(i).row;
                        c = uids.get(i).col;
                        m = uids.get(i).mat;
                    }
                }
                if (r == c && determinant(r, c, m) != 0) {
                    System.out.println("Inverse is: ");
                    inverse(r, c, m);
                } else {
                    System.out.println("Failed to find Inverse");
                }
            }
            if (option == 7) {
                System.out.println("1. ROW WISE MEAN\n" + "2. COLUMN WISE MEAN\n" + "3. MEAN OF ALL ELEMENTS");
                int choice = scn.nextInt();
                if (choice == 1) {
                    System.out.print("Enter the id of the matrix for which Row wise mean has to be calculated: ");
                    int idom = scn.nextInt();
                    int r = 0, c = 0;
                    float[][] m = new float[r][c];
                    for (int i = 0; i < uids.size(); i++) {
                        if (idom == uids.get(i).uniqueid) {
                            r = uids.get(i).row;
                            c = uids.get(i).col;
                            m = uids.get(i).mat;
                        }
                    }
                    rowwisemean(r, c, m);
                }
                if (choice == 2) {
                    System.out.print("Enter the id of the matrix for which Column wise mean has to be calculated: ");
                    int idom = scn.nextInt();
                    int r = 0, c = 0;
                    float[][] m = new float[r][c];
                    for (int i = 0; i < uids.size(); i++) {
                        if (idom == uids.get(i).uniqueid) {
                            r = uids.get(i).row;
                            c = uids.get(i).col;
                            m = uids.get(i).mat;
                        }
                    }
                    colwisemean(r, c, m);
                }
                if (choice == 3) {
                    System.out.print("Enter the id of the matrix for which Mean of all elements has to be calculated: ");
                    int idom = scn.nextInt();
                    int r = 0, c = 0;
                    float[][] m = new float[r][c];
                    for (int i = 0; i < uids.size(); i++) {
                        if (idom == uids.get(i).uniqueid) {
                            r = uids.get(i).row;
                            c = uids.get(i).col;
                            m = uids.get(i).mat;
                        }
                    }
                    totalmean(r, c, m);
                }
            }
            if (option == 9) {
                //use singleton
                System.out.println("1. Multiplication\n2. Division");
                int choice = scn.nextInt();
                if (choice == 1) {
                    System.out.print("Enter the id of the matrix that you want to multiply with a singleton matrix: ");
                    int id = scn.nextInt();
                    System.out.print("Enter the id of a Singleton matrix: ");
                    int singletonid = scn.nextInt();
                    int r = 0, c = 0, rs = 0, cs = 0;
                    float[][] m = new float[r][c];
                    float[][] ms = new float[rs][cs];
                    for (int i = 0; i < uids.size(); i++) {
                        if (id == uids.get(i).uniqueid) {
                            r = uids.get(i).row;
                            c = uids.get(i).col;
                            m = uids.get(i).mat;
                        }
                    }
                    for (int i = 0; i < single.size(); i++) {
                        if (singletonid == single.get(i).uniqueid) {
                            rs = single.get(i).row;
                            cs = single.get(i).col;
                            ms = single.get(i).mat;
                        }

                    }
                    use_singleton_as_multiply(r, c, rs, cs, m, ms);
                }
                if (choice == 2) {
                    System.out.print("Enter the id of the matrix that you want to divide with a singleton matrix: ");
                    int id = scn.nextInt();
                    System.out.print("Enter the id of a Singleton matrix: ");
                    int singletonid = scn.nextInt();
                    int r = 0, c = 0, rs = 0, cs = 0;
                    float[][] m = new float[r][c];
                    float[][] ms = new float[rs][cs];
                    for (int i = 0; i < uids.size(); i++) {
                        if (id == uids.get(i).uniqueid) {
                            r = uids.get(i).row;
                            c = uids.get(i).col;
                            m = uids.get(i).mat;
                        }
                    }
                    for (int i = 0; i < single.size(); i++) {
                        if (singletonid == single.get(i).uniqueid) {
                            rs = single.get(i).row;
                            cs = single.get(i).col;
                            ms = single.get(i).mat;
                        }

                    }
                    use_singleton_as_divide(r, c, rs, cs, m, ms);
                }
            }
            if (option == 4) {
                System.out.println("1. Element wise Addition\n2. Element wise subtraction\n3. Element wise multiplication\n4. Element wise divison");
                int choice = scn.nextInt();
                if (choice == 3) {
                    System.out.println("Enter ids of two matrices with same orders to do element wise multiplication");
                    System.out.print("Enter Id of first matrix: ");
                    int id1 = scn.nextInt();
                    System.out.print("Enter Id of second matrix: ");
                    int id2 = scn.nextInt();
                    int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r1][c1];
                    for (int i = 0; i < uids.size(); i++) {
                        if (id1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                    }
                    for (int i = 0; i < uids.size(); i++) {
                        if (id2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
                    if (r1 == r2 && c1 == c2) {
                        elementwisemultiply(r1, c1, m1, m2);
                    } else {
                        System.out.println("Operation failed (the matrices of be same order)");
                    }

                }
                if (choice == 4) {
                    System.out.println("Enter ids of two matrices with same orders to do element wise division");
                    System.out.print("Enter Id of first matrix: ");
                    int id1 = scn.nextInt();
                    System.out.print("Enter Id of second matrix: ");
                    int id2 = scn.nextInt();
                    int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r1][c1];
                    for (int i = 0; i < uids.size(); i++) {
                        if (id1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                    }
                    for (int i = 0; i < uids.size(); i++) {
                        if (id2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
                    if (r1 == r2 && c1 == c2) {
                        elementwisedivide(r1, c1, m1, m2);
                    } else {
                        System.out.println("Operation failed (the matrices of be same order)");
                    }

                }
                if (choice == 2) {
                    System.out.println("Enter ids of two matrices with same orders to do element wise subtraction");
                    System.out.print("Enter Id of first matrix: ");
                    int id1 = scn.nextInt();
                    System.out.print("Enter Id of second matrix: ");
                    int id2 = scn.nextInt();
                    int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r1][c1];
                    for (int i = 0; i < uids.size(); i++) {
                        if (id1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                    }
                    for (int i = 0; i < uids.size(); i++) {
                        if (id2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
                    if (r1 == r2 && c1 == c2) {
                        subtract(r1, c1, m1, m2);
                    } else {
                        System.out.println("Operation failed (the matrices of be same order)");
                    }

                }
                if (choice == 1) {
                    System.out.println("Enter ids of two matrices with same orders to do element wise addition");
                    System.out.print("Enter Id of first matrix: ");
                    int id1 = scn.nextInt();
                    System.out.print("Enter Id of second matrix: ");
                    int id2 = scn.nextInt();
                    int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
                    float[][] m1 = new float[r1][c1];
                    float[][] m2 = new float[r1][c1];
                    for (int i = 0; i < uids.size(); i++) {
                        if (id1 == uids.get(i).uniqueid) {
                            r1 = uids.get(i).row;
                            c1 = uids.get(i).col;
                            m1 = uids.get(i).mat;
                        }
                    }
                    for (int i = 0; i < uids.size(); i++) {
                        if (id2 == uids.get(i).uniqueid) {
                            r2 = uids.get(i).row;
                            c2 = uids.get(i).col;
                            m2 = uids.get(i).mat;
                        }
                    }
                    add(r1, c1, r2, c2, m1, m2);

                }
            }
            if (option == 12) {
                System.out.print("Enter the number of variables in the equations: ");
                int nov = scn.nextInt();
                System.out.print("Enter the coefficients of each variable(x,y,z) for each equations: ");
                float[][] matrix = new float[nov][nov];
                float[][] constant = new float[nov][1];
                char[] variable = {'x', 'y', 'z'};
                for (int i = 0; i < nov; i++) {
                    for (int j = 0; j < nov; j++) {
                        matrix[i][j] = scn.nextFloat();
                    }
                }
                System.out.print("Enter the coefficients of right side of equation for each equations: ");
                for (int i = 0; i < nov; i++) {
                    constant[i][0] = scn.nextFloat();
                }
                System.out.println("Matrix Representation: ");
                for (int i = 0; i < nov; i++) {
                    for (int j = 0; j < nov; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.print("  " + variable[i]);
                    System.out.print("  =  " + constant[i][0]);
                    System.out.println();
                }
                if (determinant(nov, nov, matrix) != 0) {
                    float[][] invmatrix;
                    System.out.println("Inverse of matrix of coefficients: ");
                    invmatrix = inverse(nov, nov, matrix);
                    System.out.println("\nValues of variables, respectively are: ");
                    multiply(nov, nov, nov, 1, invmatrix, constant);
                }


            }
            if(option==13){

                System.out.println("1. Rectangular Matrix\n" +
                        "2. Row Matrix\n" +
                        "3. Column Matrix\n" +
                        "4. Square Matrix\n" +
                        "5. Symmetric Matrix\n" +
                        "6. Skew-symmetric Matrix\n" +
                        "7. Upper-triangular Matrix\n" +
                        "8. Lower-triangular Matrix\n" +
                        "9. Singular Matrix\n" +
                        "10. Diagonal Matrix\n" +
                        "11. Scalar Matrix\n" +
                        "12. Identity Matrix\n" +
                        "13. Singleton Matrix\n" +
                        "14. Ones Matrix\n" +
                        "15. Null Matrix");
                System.out.print("Choose matrix type: ");
                int choice=scn.nextInt();
                if(choice==1){
                    System.out.println("Rectangular matrices: ");
                    for(int i=0;i<rectmatrix.size();i++){


                      display(rectmatrix.get(i).row,rectmatrix.get(i).col,rectmatrix.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==3){
                    System.out.println("Column matrices: ");
                    for(int i=0;i<columnmatrix.size();i++){

                        display(columnmatrix.get(i).row,columnmatrix.get(i).col,columnmatrix.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==2){
                    System.out.println("Row matrices: ");
                    for(int i=0;i<rmatrix.size();i++){

                        display(rmatrix.get(i).row,rmatrix.get(i).col,rmatrix.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==4){
                    System.out.println("Square matrices: ");
                    for(int i=0;i<sqr.size();i++){

                        display(sqr.get(i).row,sqr.get(i).col,sqr.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==5){
                    System.out.println("Symmetric matrices: ");
                    for(int i=0;i<symmatrix.size();i++){

                        display(symmatrix.get(i).row,symmatrix.get(i).col,symmatrix.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==6){
                    System.out.println("Skew symmetric matrices: ");
                    for(int i=0;i<skymatrix.size();i++){

                        display(skymatrix.get(i).row,skymatrix.get(i).col,skymatrix.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==7){
                    System.out.println("Upper triangular matrices: ");
                    for(int i=0;i<upmatrix.size();i++){

                        display(upmatrix.get(i).row,upmatrix.get(i).col,upmatrix.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==8){
                    System.out.println("Lower triangular matrices: ");
                    for(int i=0;i<lowmatrix.size();i++){

                        display(lowmatrix.get(i).row,lowmatrix.get(i).col,lowmatrix.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==9){
                    System.out.println("Singular matrices: ");
                    for(int i=0;i<singular.size();i++){

                        display(singular.get(i).row,singular.get(i).col,singular.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==10){
                    System.out.println("Diagonal matrices: ");
                    for(int i=0;i<diagonal.size();i++){

                        display(diagonal.get(i).row,diagonal.get(i).col,diagonal.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==11){
                    System.out.println("Scalar matrices: ");
                    for(int i=0;i<scalar.size();i++){

                        display(scalar.get(i).row,scalar.get(i).col,scalar.get(i).arr);
                        System.out.println();

                    }
                }
                if(choice==12){
                    System.out.println("Identity matrices: ");
                    for(int i=0;i<identity.size();i++){

                        display(identity.get(i).row,identity.get(i).col,identity.get(i).mat);
                        System.out.println();

                    }
                }
                if(choice==13){
                    System.out.println("Singleton matrices: ");
                    for(int i=0;i<single.size();i++){

                        display(single.get(i).row,single.get(i).col,single.get(i).mat);
                        System.out.println();

                    }
                }
                if(choice==14){
                    System.out.println("Ones matrices: ");
                    for(int i=0;i<ones.size();i++){

                        display(ones.get(i).getRow(),ones.get(i).getCol(),ones.get(i).getMat());
                        System.out.println();

                    }
                }
                if(choice==15){
                    System.out.println("Null matrices: ");
                    for(int i=0;i<null1.size();i++){

                        display(null1.get(i).getRow(),null1.get(i).getCol(),null1.get(i).getMat());
                        System.out.println();

                    }
                }
            }
            if (option == 14) {
                System.out.println("-------------------------------------------------------------------------------------------------\n" +
                        "{End of Test Case}");
                break;
            }

        }

    }

    public static void checktype(int row, int col, float[][] mat, int uniqueid) {

        if (col == 1) {
            colmatrix c1 = new colmatrix(row, col, mat, uniqueid);
            columnmatrix.add(c1);
        }
        if (row == 1) {
            rowmatrix r1 = new rowmatrix(row, col, mat, uniqueid);
            rmatrix.add(r1);
        }

        if (row == col) {
            squm sqm1 = new squm(row, col, mat, uniqueid);
            sqr.add(sqm1);

            float transpose[][] = new float[col][row];
            int bool = 1;
            int flag = 1;
            int bool1 = 1;
            int flag1 = 1;
            int bool2 = 1;
            int flag2 = 0, flag3 = 0;
            float first = mat[0][0];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    transpose[j][i] = mat[i][j];
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (mat[i][j] != transpose[i][j]) {
                        bool = 0;
                        break;
                    }
                }
                if (bool == 0) {
                    break;
                }
            }
            if (bool == 1) {
                symmetric sy1 = new symmetric(row, col, mat, uniqueid);
                symmatrix.add(sy1);
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (mat[i][j] != -(transpose[i][j])) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 0) {
                    break;
                }
            }
            if (flag == 1) {
//                System.out.println("Skew Symmetric matrix");
                skewsymmetric sky1 = new skewsymmetric(row, col, mat, uniqueid);
                skymatrix.add(sky1);


            }
            for (int i = 1; i < row; i++) {
                for (int j = 0; j < i; j++) {
                    if (mat[i][j] != 0) {
                        bool1 = 0;
                        break;
                    }
                }
                if (bool1 == 0) {
                    break;
                }
            }
            if (bool1 == 1 && row > 1) {
                uppertriangular u1 = new uppertriangular(row, col, mat, uniqueid);
                upmatrix.add(u1);
            }
            for (int i = 0; i < row; i++) {
                for (int j = i + 1; j < row; j++) {
                    if (mat[i][j] != 0) {
                        flag1 = 0;
                        break;
                    }
                }
                if (flag1 == 0) {
                    break;
                }
            }
            if (flag1 == 1 && row > 1) {
                lowertriangular l1 = new lowertriangular(row, col, mat, uniqueid);
                lowmatrix.add(l1);


            }
            if (determinant(row, col, mat) == 0) {
                singularmatrix sng1 = new singularmatrix(row, col, mat, uniqueid);
                singular.add(sng1);
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    if ((i != j) && (mat[i][j] != 0)) {
                        bool2 = 0;
                        break;
                    }
                }
                if (bool2 == 0) {
                    break;
                }
            }
            if (bool2 == 1) {
                diagonalmatrix d1 = new diagonalmatrix(row, col, mat, uniqueid);
                diagonal.add(d1);
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    if (i != j && mat[i][j] != 0) {
                        flag2 = 0;
                        break;

                    }
                    if (i == j && (mat[i][j] == 0 || mat[i][j] != first)) {
                        flag3 = 0;
                        break;
                    }
                }
            }
            if (flag2 == 0 && flag3 == 0) {
                scalarmatrix scm1 = new scalarmatrix(row, col, mat, uniqueid);
                scalar.add(scm1);
            }
            int count = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if ((i == j && mat[i][j] == 1) || (i != j && mat[i][j] == 0)) {
                        count++;
                    }
                }

            }
            if (count == row * col) {
                identitymatrix i1 = new identitymatrix(row, col, mat, uniqueid);
                identity.add(i1);
            }


        }
        if (row != col) {
            rectangularmatrix r1 = new rectangularmatrix(row, col, mat, uniqueid);
            rectmatrix.add(r1);

        }
        if (row == 1 && col == 1) {
            singletonmatrix single1 = new singletonmatrix(row, col, mat, uniqueid);
            single.add(single1);
        }
        int bool4 = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] != 0) {
                    bool4 = 0;
                    break;
                }
            }
            if (bool4 == 0) {
                break;
            }


        }
        if (bool4 == 1) {
            nullmatrix nm1 = new nullmatrix(row, col, mat, uniqueid);
            null1.add(nm1);
        }
        int bool5 = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] != 1) {
                    bool5 = 0;
                    break;
                }
            }
            if(bool5==0){
                break;
            }
        }
        if (bool5 == 1) {
            onesmatrix ones1 = new onesmatrix(row, col, mat, uniqueid);
            ones.add(ones1);
        }


    }

    public static void display(int row, int col, float[][] matrix) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static float determinant(int row, int col, float[][] matrix) {
        float det = 0, x, x1, x2;
        if (row == 1 && col == 1) {
            det = matrix[0][0];
        }
        if (row == 2 && col == 2) {
            det = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
        if (row == 3 && col == 3) {
            x = (matrix[0][0] * (matrix[1][1] * matrix[2][2]
                    - matrix[1][2] * matrix[2][1]));
            x1 = (matrix[0][1] * (matrix[1][0] * matrix[2][2]
                    - matrix[1][2] * matrix[2][0]));
            x2 = (matrix[0][2] * (matrix[1][0] * matrix[2][1]
                    - matrix[1][1] * matrix[2][0]));
            det = x - x1 + x2;
        }
        return det;
    }

    public static void add(int row1, int col1, int row2, int col2, float[][] matrix1, float[][] matrix2) {
        if (row1 == row2 && col1 == col2) {
            float[][] matrix3 = new float[row1][col1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            display(row1, col1, matrix3);
        } else {
            System.out.println("addition not possible");
            return;
        }


    }

    public static void subtract(int row, int col, float[][] matrix1, float[][] matrix2) {

        float[][] matrix3 = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        display(row, col, matrix3);

    }

    public static float[][] multiply(int row1, int col1, int row2, int col2, float[][] matrix1, float[][] matrix2) {
        if (col1 != row2) {
            System.out.println("can't multiply matrices");
            return matrix1;
        }
        float[][] matrix3 = new float[row1][col2];
        float product = 0;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                product = 0;
                for (int k = 0; k < row2; k++) {
                    product = product + (matrix1[i][k] * matrix2[k][j]);
                }
                matrix3[i][j] = product;
            }
        }
        display(row1, col2, matrix3);
        return matrix1;
    }

    public static void divide(int row1, int col1, int row2, int col2, float[][] matrix1, float[][] matrix2) {
        if (row2 != 1 || col2 != 1) {
            System.out.println("division operation failed");
            return;
        }
        float[][] matrix3 = new float[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix3[i][j] = matrix1[i][j] / matrix2[0][0];
            }
        }
        display(row1, col1, matrix3);
    }

    public static float[][] transpose(int row, int col, float[][] matrix) {
        float[][] transpose = new float[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("transposed matrix is:");
        display(col, row, transpose);
        return transpose;
    }

    public static int assignid() {
        int unique_id;
        int min = 100;
        int max = 999;
        unique_id = (int) (Math.random() * (max - min + 1) + min);
        return unique_id;
    }

    public static float[][] inverse(int row, int col, float[][] matrix) {
        float matrix1;
        float[][] inverse = new float[row][col];
        if (row == 1 && col == 1) {
            inverse[0][0] = 1 / matrix[0][0];
        }
        if (row == 2 && col == 2) {
            matrix1 = matrix[0][0];
            matrix[0][0] = matrix[1][1];
            matrix[1][1] = matrix1;
            matrix[0][1] = -matrix[0][1];
            matrix[1][0] = -matrix[1][0];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    inverse[i][j] = matrix[i][j] / determinant(row, col, matrix);
                }
            }

        }
        if (row == 3 && col == 3) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    inverse[i][j] = (((matrix[(j + 1) % 3][(i + 1) % 3] * matrix[(j + 2) % 3][(i + 2) % 3]) - (matrix[(j + 1) % 3][(i + 2) % 3] * matrix[(j + 2) % 3][(i + 1) % 3])) / determinant(row, col, matrix));
                }
            }

        }
        display(row, col, inverse);

        return inverse;
    }

    public static void rowwisemean(int row, int col, float[][] matrix) {
        float sum;

        for (int i = 0; i < row; i++) {
            sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + matrix[i][j];
            }
            System.out.println("Row" + (i + 1) + ": " + (sum / col));
        }

    }

    public static void colwisemean(int row, int col, float[][] matrix) {
        float sum;

        for (int i = 0; i < col; i++) {
            sum = 0;
            for (int j = 0; j < row; j++) {
                sum = sum + matrix[j][i];
            }
            System.out.println("Column" + (i + 1) + ": " + (sum / row));
        }

    }

    public static void totalmean(int row, int col, float[][] matrix) {
        float sum;
        sum = 0;
        int totalelements = row * col;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                sum = sum + matrix[i][j];
            }

        }
        System.out.println("Total mean: " + sum / totalelements);
    }

    public static void use_singleton_as_multiply(int row1, int col1, int row2, int col2, float[][] matrix1, float[][] matrix2) {
        if (row2 == 1 && col2 == 1) {
            float[][] matrix3 = new float[row1][col1];
            float x = matrix2[0][0];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix3[i][j] = (matrix1[i][j] * x);
                }
            }
            display(row1, col1, matrix3);
        } else {
            System.out.println("matrix2 should be singleton");
        }
    }

    public static void use_singleton_as_divide(int row1, int col1, int row2, int col2, float[][] matrix1, float[][] matrix2) {
        if (row2 == 1 && col2 == 1) {
            float[][] matrix3 = new float[row1][col1];
            float x = matrix2[0][0];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix3[i][j] = (matrix1[i][j] / x);
                }
            }
            display(row1, col1, matrix3);
        } else {
            System.out.println("matrix2 should be singleton");
        }
    }

    public static void elementwisemultiply(int row, int col, float[][] matrix1, float[][] matrix2) {
        float[][] matrix3 = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        display(row, col, matrix3);

    }

    public static void elementwisedivide(int row, int col, float[][] matrix1, float[][] matrix2) {
        float[][] matrix3 = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix3[i][j] = matrix1[i][j] / matrix2[i][j];
            }
        }
        display(row, col, matrix3);

    }
}





