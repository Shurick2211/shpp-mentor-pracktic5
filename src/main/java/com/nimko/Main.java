package com.nimko;

import com.nimko.services.MainLogic;

public class Main {

    public static void main(String[] args) {
        MainLogic logic = new MainLogic();
        logic
                .startAction()
                .endAction();
        }
}
