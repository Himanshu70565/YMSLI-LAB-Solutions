package work.solution.v1;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
	String name() default "unknown";
}

@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@interface Version {
	double number();
}

@Author(name = "Johny")
@Version(number = 1.0)
class AnnotatedClass {

	@Author(name = "Himanshu")
	@Version(number = 1.0D)
	public AnnotatedClass() {
		System.out.println("India");
	}

	@Author(name = "Rahul")
	@Version(number = 1.2D)
	public AnnotatedClass(String str) {
		System.out.println("India" + str);
	}

	@Author(name = "Author1")
	@Version(number = 2.0f)
	public void annotatedMethod() {
	}

	@Author(name = "Author2")
	@Version(number = 4.0)
	public void annotatedMethod2() {
	}
}

@Author(name = "Vivek")
class Testing {

}

@Author(name = "Ravikant")
class ExtendedTesting extends Testing {

}

public class CustomAnnotation {

	// Overloaded readAnnotation for Method class
	public static void readAnnotation(Method methods[]) {
		int index = 0;
		for (Method method : methods) {

			System.out.println("[" + index + "] " + method);

			if (method.isAnnotationPresent(Author.class)) {
				Author annotation = method.getAnnotation(Author.class);
				System.out.println("author : " + annotation.name());
			}

			if (method.isAnnotationPresent(Version.class)) {
				Version annotation = method.getAnnotation(Version.class);
				System.out.println("version : " + annotation.number());
			}
			index++;
		}
	}

	// Overloaded readAnnotation method for Constructors
	private static void readAnnotation(Constructor<?>[] constructors) {
		int index = 0;
		for (Constructor<?> constructor : constructors) {

			System.out.println("[" + index + "]" + constructor);

			if (constructor.isAnnotationPresent(Author.class)) {
				Author annotation = constructor.getAnnotation(Author.class);
				System.out.println("author : " + annotation.name());
			}

			if (constructor.isAnnotationPresent(Version.class)) {
				Version annotation = constructor.getAnnotation(Version.class);
				System.out.println("version : " + annotation.number());
			}
			index++;
		}
	}

	// Overloaded readAnnotation method for Class
	private static void readAnnotation(Class<?> clazz) {
		Annotation[] annotations = clazz.getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof Author) {
				Author author = (Author) annotation;
				System.out.println("author : " + author.name());
			}
			if (annotation instanceof Version) {
				Version version = (Version) annotation;
				System.out.println("version : " + version.number());
			}
		}
	}

	public static void main(String[] args) {

		try {
			System.out.println("-----------Annotated Class----------------\n");
			Class<?> clazz = Class.forName("work.solution.v1.AnnotatedClass");

			System.out.println("Method Annotations=>");
			Method methods[] = clazz.getDeclaredMethods();
			readAnnotation(methods);

			System.out.println("\nConstructor Annotations=>");
			Constructor<?>[] constructors = clazz.getConstructors();
			readAnnotation(constructors);

			System.out.println("\nClass Annotations=>");
			readAnnotation(clazz);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("-----------Testing Class----------------\n");

			Class<?> clazz2 = Class.forName("work.solution.v1.Testing");

			System.out.println("Class Annotations=>");
			readAnnotation(clazz2);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("-----------ExtendedTesting Class----------------\n");

			Class<?> clazz3 = Class.forName("work.solution.v1.ExtendedTesting");

			System.out.println("Class Annotations=>");
			readAnnotation(clazz3);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
