package by.itacademy.homework;

import by.itacademy.homework.domain.FootballTeam;
import by.itacademy.homework.domain.MusicBand;
import by.itacademy.homework.service.BeanFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static Logger LOGGER = Logger.getLogger(App.class.getName( ));

    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("logApp");
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.CONFIG, "Configuration fail");
            LOGGER.log(Level.INFO, "Write Log with info level");
        }

        BeanFactory beanFactory = new BeanFactory( );
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(beanFactory.getBean(FootballTeam.class).toString( ));
                System.out.println(beanFactory.getBean(MusicBand.class).toString( ));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace( );
        }
    }
}
