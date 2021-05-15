package Clase4;

import org.testng.annotations.*;

public class NotationsTest {
    @BeforeTest
    public void beforeTestNotation(){
        System.out.println("Se invoca al @Beforetest");
    }

    @BeforeClass
    public void beforeClassNotation(){
        System.out.println("Se invoca @BeforeClass");
    };

    @BeforeMethod
    public void beforeMethodNotation(){
        System.out.println("Se invoca @BeforeMethod");
    };

    @Test
    public void test1(){
        System.out.println("Se ejecuta el Test 1 !!!");
    }
    @Test
    public void test2(){
        System.out.println("Se ejecuta el Test 2 !!!");
    }
    @Test
    public void test3(){
        System.out.println("Se ejecuta el Test 3 !!!");
    }

    @AfterTest
    public void afterTestTestNotation(){
        System.out.println("Se invoca al @AfterTest");
    }

    @AfterClass
    public void afterClassNotation(){
        System.out.println("Se invoca @AfterClass");
    };

    @AfterMethod
    public void afterMethodNotation(){
        System.out.println("Se invoca @AfterMethod");
    };


}
