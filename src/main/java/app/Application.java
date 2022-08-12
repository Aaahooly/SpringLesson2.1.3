package app;

import app.config.AppConfig;
import app.model.Animal;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalsCage bean2 = applicationContext.getBean("animalsCage", AnimalsCage.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
            System.out.println(bean2.getTimer().getTime() == bean.getTimer().getTime());
        }

    }

}
