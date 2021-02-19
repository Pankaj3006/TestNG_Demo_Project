package DataProviderConcept;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Multiple_DataProviders {

	@DataProvider(name = "dp1")
	public Object[][] provideData(Method m) {
		Object[][] data = null;
		if (m.getName().equalsIgnoreCase("getData")) {
			data = new Object[3][2];

			data[0][0] = "First UserName";
			data[0][1] = "First Password";

			data[1][0] = "Second UserName";
			data[1][1] = "Second Password";

			data[2][0] = "Third UserName";
			data[2][1] = "Third Password";
		} else {
			data = new Object[3][3];

			data[0][0] = "First UserName";
			data[0][1] = "First Password";
			data[0][2] = "First Age";

			data[1][0] = "Second UserName";
			data[1][1] = "Second Password";
			data[1][2] = "Second Age";

			data[2][0] = "Third UserName";
			data[2][1] = "Third Password";
			data[2][2] = "Third Age";
		}
		return data;
	}
}
