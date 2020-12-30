package lambda_demo;

public class LambdaStyleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloFunctional h1 =()->System.out.println("Hello Lambda 1"); 
		h1.hello();
		
		HelloFunctional h2 =()->System.out.println("Hello Lambda 2"); 
		
		h2.hello();
		
		HelloInterfaceFunctionalByName hello = (n)->{
			System.out.println("Hellooooo "+n);
		
		};
		
		hello.sayHello("Melody");
		
		AddFunctional add =(x,y,z)->{
			return x+y+z;
		};
		System.out.println("sum is "+add.sum(10, 20, 30));
	}

}
