package by.itacademy.homework.service;

import by.itacademy.homework.random.RandomBoolean;
import by.itacademy.homework.random.RandomInt;
import by.itacademy.homework.random.RandomLocalDate;
import by.itacademy.homework.random.RandomString;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanFactory {
    private RandomString randomStringMusicBand;
    private RandomInt randomInt;
    private RandomLocalDate randomLocalDate;
    private RandomBoolean randomBoolean;

    public Object getBean(Class clazz) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Object bean = clazz.newInstance( );
        Field[] fields = clazz.getDeclaredFields( );
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].isAnnotationPresent(Generate.class))
                createMethod(bean, fields[i]);
        }
        return bean;
    }

    private void createMethod(Object bean, Field field) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String methodName = getMethodName(field);
        Class methodParameter = field.getType( );
        Method method = bean.getClass( ).getMethod(methodName, methodParameter);
        setType(bean, method, methodParameter.getSimpleName( ));
    }

    private String getMethodName(Field field) {
        String fieldName = field.getName( );
        char firstChar = fieldName.charAt(0);
        return "set" + fieldName.replaceFirst(String.valueOf(firstChar), String.valueOf(Character.toUpperCase(firstChar)));
    }

    private void setType(Object bean, Method method, String fieldName) throws IllegalAccessException, InvocationTargetException {
        if (fieldName.equals("String"))
            method.invoke(bean, new RandomString( ).execute( ));
        else if (fieldName.equals("LocalDate"))
            method.invoke(bean, new RandomLocalDate( ).execute( ));
        else if (fieldName.equals("int"))
            method.invoke(bean, new RandomInt( ).execute( ));
        else if (fieldName.equals("boolean"))
            method.invoke(bean, new RandomBoolean( ).execute( ));
    }
}



