package org.whs542.ftc2018.tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.whs542.ftc2018.subsys.FourBarImpl;
import org.whs542.subsys.fourbar.FourBar;

/**
 * Created by ivanm on 11/4/2017.
 */

public class FourBarTest extends OpMode {

    FourBar fourBar;

    @Override
    public void init() {
        fourBar = new FourBarImpl(hardwareMap);
    }

    @Override
    public void loop() {
        fourBar.operate(gamepad1.a, gamepad1.x, gamepad1.y, gamepad1.b);
        telemetry.addData("Four bar level: ", fourBar.getFourBarLevel());
    }
}