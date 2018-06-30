package Java.Concepts;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Java.Concepts.App;

public class AppTest {
	@Test
	public void ReadTest() throws IOException {
		App obj = new App();
		obj.SetInputFile();
		obj.SetOutputFile();

		/* Testing HashMaps */

		HashMap<String, String> M1 = new HashMap<String, String>();
		M1.put("1", "World");
		M1.put("2", "World");
		M1.put("3", "World");

		System.out.println(M1.size());
		for (Map.Entry m : M1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}