package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@Autonomous
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "Ridhaan"); // My First Comment
    }

    @Override
    public void loop() {

    }

    // Single Line Comment
    /*
    1. Hello: World, Change to your name
    2. Make this code change from TeleOp to Autonomous
     */
}
