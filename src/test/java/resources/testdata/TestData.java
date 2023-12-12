package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "employee details")
    public Object[][] getData() {
        Object[][] data = new Object[][]{ // in between these two lines, data is provided
                {"2.2 GHz Intel Pentium Dual-Core E220", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00] "},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00", "400 GB [+$100.00", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00", "8GB [+$60.00", "320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00"},


        };
        return data;
    }

    @DataProvider(name = "invalid credentials")
    public Object[][] getData1() {
        Object[][] data1 = new Object[][]{ // in between these two lines, data is provided
                {"2.2 GHz Intel Pentium Dual-Core E220", "2 GB", "320 GB", "Vista Home [+$50.00]", "Microsoft Office [+$50.00] "},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]", "4GB [+$20.00", "400 GB [+$100.00", "Vista Premium [+$60.00]", "Acrobat Reader [+$10.00"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00", "8GB [+$60.00", "320 GB", "Vista Home [+$50.00]", "Total Commander [+$5.00"},


        };
        return data1;
    }
}