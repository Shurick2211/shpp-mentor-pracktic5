package com.nimko;

import com.nimko.model.Man;
import com.nimko.model.SuperMarket;
import com.nimko.role.Security;
import com.nimko.services.MainLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        MainLogic logic = new MainLogic();
        logic.action();
    }
}
