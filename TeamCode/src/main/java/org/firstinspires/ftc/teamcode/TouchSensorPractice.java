package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

public class TouchSensorPractice extends OpMode {
    TestBench bench = new TestBench();


    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        String touchSensorState = "not pressed!";
        if (bench.getTouchSensorState()) {
            touchSensorState = "pressed!";
        }
        telemetry.addData("Touch Sensor State", touchSensorState);
    }



/*
1. create a new getter method in your test bench class called is touch sensor released and this will return true if touch is not pressed
2. In telemetry have it say pressed or not pressed
 */

}
