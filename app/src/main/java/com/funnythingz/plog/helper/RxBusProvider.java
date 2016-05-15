package com.funnythingz.plog.helper;

public class RxBusProvider {

    private static final RxBus BUS = new RxBus();

    private RxBusProvider() {
        // No instances.
    }

    public static RxBus getInstance() {
        return BUS;
    }
}
