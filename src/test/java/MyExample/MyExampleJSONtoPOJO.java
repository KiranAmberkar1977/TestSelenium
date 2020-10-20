package MyExample;

import java.io.IOException;

import org.openqa.selenium.json.JsonException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyExampleJSONtoPOJO {

	public static void main(String[] args) throws JsonException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		MyPojo mypojo = create_dummy();
		
		// Convert Java Class to JSON string.
		String jsonString = mapper.writeValueAsString(mypojo);
		System.out.println("jsonstring is: " + jsonString);
		
		// Convert JSON string to Java class (POJO).
		MyPojoSchema myrequest_json = new MyPojoSchema();
		myrequest_json = mapper.readValue(jsonString, MyPojoSchema.class);
		
		// Print the POJO attributes.
		System.out.println("POJO values are is :" + myrequest_json.getEmpId() + ", " + myrequest_json.getEmpSalary() + ", " + myrequest_json.getEmpGroups());
		
	}

	private static MyPojo create_dummy () {
		String [] mygroups = {"ng-random", "ng-qtest-users", "ng-nb-engineering"};
		MyPojo mypojovar = new MyPojo();
		mypojovar.setEmp_id(8500);
		mypojovar.setEmp_age((short) 32);
		mypojovar.setEmp_salary((long) 55000.00);
		mypojovar.setEmp_groups(mygroups);
		return mypojovar;
	}
}
