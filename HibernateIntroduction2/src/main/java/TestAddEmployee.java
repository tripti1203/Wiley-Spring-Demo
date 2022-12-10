import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Department;
import com.pojo.Employee;

public class TestAddEmployee {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		//Insert 
		/*Employee e1 = new Employee(3,"Ken","Adams",55000,new Department(102,"SDE"));
		session.save(e1);
		System.out.println("Employee added in database");
		*/
		
		//update
		/*Department d1 = new Department();
		Employee e1 = new Employee();
		d1.setDeptId(103);
		d1.setDeptName("Testing");
		e1.setId(7);
		e1.setFirstName("John");
		e1.setLastName("Doe");
		e1.setSalary(43000);
		e1.setDept(d1);
		session.update(e1);
		System.out.println("One row updated!!");
		*/
		
		//Delete
		/*Employee e1 = new Employee();
		e1.setId(8);
		session.remove(e1);
		System.out.println("One row Deleted!!");
		*/
		
		//Load
		/*Employee e1 = session.load(Employee.class,new Integer(5));
		System.out.println("Employee is loaded!!");
		System.out.println("Employee Id : "+e1.getId());
		System.out.println("Loaded Details : "+e1+"\n");
		*/
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
