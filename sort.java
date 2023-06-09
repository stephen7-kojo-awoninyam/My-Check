import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
 class Checker implements Comparator<Student>{
    
    public int compare(Student a, Student b){
          
          if(Double.compare(b.getCgpa(),a.getCgpa())==0){
              
             if(b.getFname().compareTo(a.getFname())==0){
                 
                 return Integer.compare(b.getId(), a.getId());
                 
             }
             
             return a.getFname().compareTo(b.getFname());
          }else {
              
              return Double.compare(b.getCgpa(), a.getCgpa());
          } 
        
    }
    
    
}
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
        Checker checker = new Checker();
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
            
			Collections.sort(studentList,checker);
			testCases--;
		}
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
        in.close();
	}
}



