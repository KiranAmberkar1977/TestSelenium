
package MyExample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "emp_id", "emp_salary", "emp_age", "emp_groups" })

public class MyPojoSchema {

	@JsonProperty("emp_id")
	private Integer empId;
	@JsonProperty("emp_salary")
	private Integer empSalary;
	@JsonProperty("emp_age")
	private Integer empAge;
	@JsonProperty("emp_groups")
	private List<String> empGroups = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("emp_id")
	public Integer getEmpId() {
		return empId;
	}

	@JsonProperty("emp_id")
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@JsonProperty("emp_salary")
	public Integer getEmpSalary() {
		return empSalary;
	}

	@JsonProperty("emp_salary")
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	@JsonProperty("emp_age")
	public Integer getEmpAge() {
		return empAge;
	}

	@JsonProperty("emp_age")
	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	@JsonProperty("emp_groups")
	public List<String> getEmpGroups() {
		return empGroups;
	}

	@JsonProperty("emp_groups")
	public void setEmpGroups(List<String> empGroups) {
		this.empGroups = empGroups;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}