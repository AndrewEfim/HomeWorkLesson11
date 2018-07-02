package by.itacademy.homework;

import by.itacademy.homework.domain.FootballTeam;
import by.itacademy.homework.domain.MusicBand;
import by.itacademy.homework.service.BeanFactory;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class TestBeanFactory {

    @Test
    public void beansNotNull() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Assert.assertNotNull(new BeanFactory().getBean(FootballTeam.class));
        Assert.assertNotNull(new BeanFactory().getBean(MusicBand.class));
    }
}
