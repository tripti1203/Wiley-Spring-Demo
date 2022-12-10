import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Employee;

public class TestAddEmployee {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		//Insert 
		Employee e1 = new Employee(105,"Joey","Tribbiani",50000);
		session.save(e1);
		System.out.println("Employee added in database");
		
		//update
		/*Employee e1 = new Employee();
		e1.setId(103);
		e1.setFirstName("Sarah");
		e1.setLastName("Bowling");
		e1.setSalary(43000);
		session.update(e1);
		System.out.println("One row updated!!);"*/
		
		//Delete
		/*Employee e1 = new Employee();
		e1.setId(102);
		session.remove(e1);
		System.out.println("One row Deleted!!");*/
		
		//Load
		/*Employee e1 = session.load(Employee.class,new Integer(103));
		System.out.println("Employee is loaded!!");
		System.out.println("Employee Id : "+e1.getId());
		System.out.println("Loaded Details : "+e1+"\n");*/
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
