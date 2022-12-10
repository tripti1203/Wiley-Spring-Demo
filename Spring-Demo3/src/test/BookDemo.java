package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.LibraryList;
import com.beans.LibraryMap;
import com.beans.LibraryMapList;
import com.beans.LibrarySet;

public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("books.xml");
		
		/*LibraryList list = (LibraryList) context.getBean("bookLibraryList") ;
		list.displayBooks();*/
		
		/*LibrarySet set = (LibrarySet) context.getBean("bookLibrarySet") ;
		set.displayBooks();*/
		
		/*LibraryMap map = (LibraryMap) context.getBean("bookLibraryMap");
		map.displayBooks();*/
		
		/*LibraryMapList mapList = (LibraryMapList) context.getBean("bookLibraryMapList");
		mapList.displayBooks();*/
		
		
	}

}
