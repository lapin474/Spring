import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean_1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_1.getMessage());

        HelloWorld bean_2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean_2.getMessage());

        System.out.println("Одинаковые ли объекты 'HelloWorld' ? -> " + (bean_1 == bean_2));

        Cat bean_3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean_3.getMessage());

        Cat bean_4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean_4.getMessage());

        System.out.println("Одинаковые ли объекты 'Cat' ? -> " + (bean_3 == bean_4));
    }
}
