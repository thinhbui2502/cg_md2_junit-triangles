public class TriangleClassifier {

    public static final String TAM_GIAC_DEU = "tam giac deu";
    public static final String TAM_GIAC_CAN = "tam giac can";
    public static final String TAM_GIAC_THUONG = "tam giac thuong";
    public static final String KHONG_PHAI_TAM_GIAC = "khong phai tam giac";

    public static String checkTriangle(int side1, int side2, int side3) {
        boolean isTriangle1 = (side1 + side2) > side3;
        boolean isTriangle2 = (side1 + side3) > side2;
        boolean isTriangle3 = (side3 + side2) > side1;
        if  (!isTriangle1 || !isTriangle2 || !isTriangle3){
            return KHONG_PHAI_TAM_GIAC;
        } else if (isEquilateralTriangle(side1, side2, side3)) {
            return TAM_GIAC_DEU;
        } else if (isIsoscelesTriangle(side1, side2, side3))
            return TAM_GIAC_CAN;
        return TAM_GIAC_THUONG;
    }

    public static boolean isIsoscelesTriangle(int side1, int side2, int side3) {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public static boolean isEquilateralTriangle(int side1, int side2, int side3) {
        return side1 == side2 && side1 == side3;
    }

}

