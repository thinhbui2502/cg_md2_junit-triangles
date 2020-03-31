import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("test tam giac deu")
    void TestCheckTriangle1() {
        String expected = "tam giac deu";
        String result = TriangleClassifier.checkTriangle(2,2,2);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test tam giac can")
    void TestCheckTriangle2() {
        String expected = "tam giac can";
        String result = TriangleClassifier.checkTriangle(2,2,3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test tam giac thuong")
    void TestCheckTriangle3() {
        String expected = "tam giac thuong";
        String result = TriangleClassifier.checkTriangle(3,4,5);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test khong phai tam giac lan 1")
    void TestCheckTriangle4() {
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(8,2,3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test khong phai tam giac lan 2")
    void TestCheckTriangle5() {
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(-1,2,1);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("test khong phai tam giac lan 3")
    void TestCheckTriangle6() {
        String expected = "khong phai tam giac";
        String result = TriangleClassifier.checkTriangle(0,1,1);
        assertEquals(expected, result);
    }

}