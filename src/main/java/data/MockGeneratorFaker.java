package data;

import com.github.javafaker.Faker;
import gherkin.lexer.Fa;

public class MockGeneratorFaker {

    protected static final Faker faker = new Faker();


    public static String generatorMockFirstName(){
        return faker.name().firstName();
    }
    public static String generatorMockLastName(){
        return faker.name().lastName();
    }
    public static String generatorMockEmail(){
        return faker.internet().emailAddress();
    }
    public static String generatorMockUserName() {
        return faker.name().username();
    }
    public static String generatorMockPassword(){
        return faker.internet().password(7,8,true,true)
                .substring(0,1).toUpperCase().substring(1);
    }
    public static String generatorMockBIO(){
        return faker.internet().macAddress();
    }
    public static String generatorMockNumber(){
        return String.valueOf(MockGeneratorFaker.faker.number().numberBetween(0,10));
    }
    public static int generatorMockNumber1(){
        return MockGeneratorFaker.faker.number().numberBetween(0,2);
    }
}
