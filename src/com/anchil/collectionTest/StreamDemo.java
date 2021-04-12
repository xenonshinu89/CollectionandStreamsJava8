package com.anchil.collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.HashMap;

public class StreamDemo {
	
	
	public static void main(String args[]){
		
		List<String> list=new ArrayList();
		list.add("Hi");
		list.add("There");
		list.add("This");
		list.add("is");
		list.add("shinu");
		
		System.out.println("Normal For each");
		long start=Calendar.getInstance().getTimeInMillis();
		for(String s:list) {
			System.out.println(s);
			
		}
		long end=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for Normal For each"+(end-start));
		System.out.println("Lambda For each");
		
		start=Calendar.getInstance().getTimeInMillis();
		list.stream().forEach(s->System.out.println(s));
		end=Calendar.getInstance().getTimeInMillis();
		
		System.out.println("Time for Lambda For each"+(end-start));
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"a");
		map.put(2,"b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");
		
		System.out.println("Normal Map For each");
		start=Calendar.getInstance().getTimeInMillis();
		for(Map.Entry<Integer,String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		end=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for Normal Map For each"+(end-start));
		
		System.out.println("Lambda Map For each");
		start=Calendar.getInstance().getTimeInMillis();
		map.forEach((K,V)->System.out.println(K+" "+V));
		end=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for Lambda Map For each"+(end-start));
		
		System.out.println("Lambda stream Map For each");
		start=Calendar.getInstance().getTimeInMillis();
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		end=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for Lambda stream Map For each"+(end-start));
		
		System.out.println("Normal filter For each");
		start=Calendar.getInstance().getTimeInMillis();
		for(String s:list) {
			if(s.startsWith("T"))
				System.out.println(s);
			
		}
		end=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for Normal filter For each"+(end-start));
		
		System.out.println("Lambda filter For each");
		start=Calendar.getInstance().getTimeInMillis();
		list.stream().filter(s->s.startsWith("T")).forEach(s->System.out.println(s));
		end=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for lambda filter For each"+(end-start));
		
		System.out.println("Lambda filter Map For each");
		start=Calendar.getInstance().getTimeInMillis();
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		end=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for lambda filter Map For each"+(end-start));
		
		
		int numbers[]= {4,1,13,90,16,2,0};
		IntStream.of(numbers).min().ifPresent(System.out::println);
		IntStream.of(numbers).max().ifPresent(System.out::println);
		IntStream.of(numbers).average().ifPresent(System.out::println);
		System.out.println(IntStream.of(numbers).count());
		System.out.println(IntStream.of(numbers).sum());
		
		IntStream.of(numbers)
				.distinct()
				.sorted()
				.limit(3)
				.forEach(System.out::println);
		
		System.out.println(IntStream.of(numbers)
		.distinct()
		.sorted()
		.limit(3)
		.sum());
		
		IntStream.of(numbers).distinct().forEach(System.out::println);
		IntStream.of(numbers).sorted().forEach(System.out::println);
		IntStream.of(numbers).limit(3).forEach(System.out::println);
		IntStream.of(numbers).skip(3).forEach(System.out::println);
		IntStream.of(numbers).filter(num->num%2==0).forEach(System.out::println);
		IntStream.of(numbers).map(num->num*2).forEach(System.out::println);
		IntStream.of(numbers).boxed().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println(IntStream.of(numbers).anyMatch(num->num%2==1));
		System.out.println(IntStream.of(numbers).allMatch(num->num%2==1));
		
		Employee e1=new Employee(101,"Shinu",1000.00);
		Employee e2=new Employee(102,"Betsy",100000.00);
		Employee e3=new Employee(103,"Noah",1000000.00);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.limit(2)
				.map(Employee::getEmployeeName)
				.forEach(System.out::println);
		
		employees.stream()
				.parallel().collect(Collectors.toList()).forEach(System.out::println);
		
		Runnable r=()-> {
				for(int i=0;i<3;i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
			
			
			
		Thread t=new Thread(r);
		t.start();
		Thread t1=new Thread(()-> {
			for(int i=3;i<6;i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		
		Consumer con=new Consumer() {

			@Override
			public void accept(Object  t) {
				
				System.out.println(t);
				
			}
			
		};
		
		Consumer<Integer> con1=(t2)-> {
				
				System.out.println(t2);
				
			};
			
		
		
		con1.accept(21);
		
		Predicate p=new Predicate() {

			@Override
			public boolean test(Object t) {
				// TODO Auto-generated method stub
				return (boolean)t;
			}
			
		};
		
		System.out.println(p.test(true));
		
		Function f=new Function() {

			@Override
			public Object apply(Object t) {
				// TODO Auto-generated method stub
				if(t.equals("Hi")) {
					return "Hi there";
				}
				else {
					return "Take care";
				}
			}
			
		};
		
		System.out.println(f.apply("Bye"));
		
		Supplier s=new Supplier() {

			@Override
			public Object get() {
				// TODO Auto-generated method stub
				return "Poda Pati";
			}
			
		};
		
		System.out.println(s.get());
		
		Supplier<String> s3=()->"Array Empty";
		
		List<String> list3=Arrays.asList();
		System.out.println(list3.stream().findAny().orElseGet(s3));
		
	}

}

class Employee{
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
	
	
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
