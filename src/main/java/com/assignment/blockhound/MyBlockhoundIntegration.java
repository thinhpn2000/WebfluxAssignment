package com.assignment.blockhound;
import reactor.blockhound.BlockHound;
import reactor.blockhound.integration.BlockHoundIntegration;

import java.util.zip.InflaterInputStream;

public class MyBlockhoundIntegration implements BlockHoundIntegration {
    @Override
    public void applyTo(BlockHound.Builder builder) {
        builder.markAsBlocking(
                SomeThingBlocking.class,
                "printBlocking",
                "()V");
        builder.allowBlockingCallsInside(
                InflaterInputStream.class.getName(),
                "read");
        builder.allowBlockingCallsInside(
                "com.assignment.controller.UserController",
                "getAllUser"
        );
    }
}
