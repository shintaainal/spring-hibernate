package mainClass;

public class MainClass {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(KonfigurasiApps.class);
		ctx.refresh();
}
