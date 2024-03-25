package lombok;

public class Test {

	public static void main(String[] args) {
//		Employee emp=new Employee(101, "pavan", 116.45);
//		System.out.println(emp);
//		
//		Employee emp1=new Employee();
//		emp1.setEmpid(102);
//		emp1.setEmpname("Kalyan");
//		emp1.setEmpsalary(1116.67);
//		System.out.println(emp1.getEmpid()+" "+emp1.getEmpname()+" "+emp1.getEmpsalary());

		Employee emp=Employee.builder()
							.empid(101)
							.empname("Pavan")
							.empsalary(116.98)
							.build();
		System.out.println(emp);
	}

}
