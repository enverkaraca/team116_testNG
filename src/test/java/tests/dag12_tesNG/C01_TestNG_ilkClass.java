package tests.dag12_tesNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_TestNG_ilkClass {
    @Test
    public void test01(){
        //Driver.getDriver().get("https://qa.hauseheaven.com");

        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
    @Test
    public void test02(){

        //Driver.getDriver().get("https://youtube.com");
        ReusableMethods.bekle(5);
        //System.out.println(Driver.getDriver().getCurrentUrl());
        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

}
