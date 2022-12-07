package com.nimko.services;

import com.nimko.model.Person;
import com.nimko.model.SuperMarket;
import com.nimko.role.Client;
import com.nimko.role.Role;
import com.nimko.role.Sales;
import com.nimko.role.Security;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class MainLogic {
    private static final Logger log = LoggerFactory.getLogger(MainLogic.class);
    private final  List<String> names = List.of("Саша", "Маша", "Вася", "Соня", "Сергій", "Наташа", "Іван");
    private final List<Role> roles = List.of(new Client(), new Security(), new Sales());
    private final Random random = new Random();
    public static final int NUM_PEOPLE = 20;
    private final SuperMarket market;
    public MainLogic() {
        market = SuperMarket.getInstance();
        Stream.generate(this::generateMan)
                .limit(NUM_PEOPLE).forEach(market::addPerson);
    }
    private Person generateMan(){
        return new Person.Builder()
                .name(names.get(random.nextInt(names.size())))
                .role(roles.get(random.nextInt(roles.size())))
                .build();
    }

    public MainLogic startAction() {
        market.getPeople().stream()
                .filter(p -> p.getRole().getClass().equals(Security.class))
                .forEach(p -> log.info(p.sayHello()));
        market.getPeople().stream()
                .filter(p -> p.getRole().getClass().equals(Client.class))
                .forEach(p -> log.info(p.sayHello()));
        market.getPeople().stream()
                .filter(p -> p.getRole().getClass().equals(Sales.class))
                .forEach(p -> log.info(p.sayHello()));
        return this;
    }

    public void endAction(){
        market.getPeople().stream()
                .filter(p -> p.getRole().getClass().equals(Client.class))
                .forEach(p -> log.info(p.sayGoodBay()));
    }
}
