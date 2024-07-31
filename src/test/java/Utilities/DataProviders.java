package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LogicData")
	public String[][] DataTesting() throws IOException
	{
		String path="C:\\Users\\prade\\eclipse-workspace\\JavaTrainingSession1\\OpenCartProject\\testData\\LoginTestData.xlsx";
		ExcelUtility ExcUtil=new ExcelUtility(path);
		int rowcount=ExcUtil.getRowCount("Sheet1");
		int colcount=ExcUtil.getCellCount("Sheet1", rowcount);
		String[][] LoginData=new String[rowcount][colcount];
		for (int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				LoginData[i-1][j]=ExcUtil.getCellData("Sheet1", i, j);
			}
		}
		return LoginData;
	}

}
