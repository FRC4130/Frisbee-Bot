/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package org.usfirst.frc.team4130.robot;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
public class Robot extends IterativeRobot {
    private static final String kDefaultAuto = "Default";
    private static final String kCustomAuto = "My Auto";
    private String m_autoSelected;
    private SendableChooser<String> m_chooser = new SendableChooser<>();
    
    TalonSRX leftDrive1 = new TalonSRX(1);
    TalonSRX leftDrive2 = new TalonSRX(2);
    TalonSRX rightDrive1 = new TalonSRX(3);
    TalonSRX rightDrive2 = new TalonSRX(4);
    
    Joystick primaryJoy = new Joystick(0);
    Joystick secondaryJoy = new Joystick(1);
    
    @Override
    public void robotInit() {
        m_chooser.addDefault("Default Auto", kDefaultAuto);
        m_chooser.addObject("My Auto", kCustomAuto);
        SmartDashboard.putData("Auto choices", m_chooser);
        
        //leftDrive1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
        
        leftDrive1.set(ControlMode.PercentOutput, 0);
        leftDrive2.set(ControlMode.Follower, 1);
        
        rightDrive1.set(ControlMode.PercentOutput, 0);
        rightDrive2.set(ControlMode.Follower, 3);
        
    }
    @Override
    public void autonomousInit() {
        m_autoSelected = m_chooser.getSelected();
        // autoSelected = SmartDashboard.getString("Auto Selector",
        // defaultAuto);
        System.out.println("Auto selected: " + m_autoSelected);
    }
    @Override
    public void autonomousPeriodic() {
        switch (m_autoSelected) {
            case kCustomAuto:
                // Put custom auto code here
                break;
            case kDefaultAuto:
            default:
                // Put default auto code here
                break;
        }
    }
    @Override
    public void teleopPeriodic() {
       leftDrive1.set(ControlMode.PercentOutput, primaryJoy.getRawAxis(1));
       rightDrive1.set(ControlMode.PercentOutput, primaryJoy.getRawAxis(5));
    	
    	
    	
    	
    	
    }
    @Override
    public void testPeriodic() {
        
    }





public void setDriveNeutral(boolean brake) {
    
    if (brake) {
        
        leftDrive1.setNeutralMode(NeutralMode.Brake);
        leftDrive2.setNeutralMode(NeutralMode.Brake);
        rightDrive1.setNeutralMode(NeutralMode.Brake);
        rightDrive2.setNeutralMode(NeutralMode.Brake);
        
    }
    else {
        
        leftDrive1.setNeutralMode(NeutralMode.Coast);
        leftDrive2.setNeutralMode(NeutralMode.Coast);
        rightDrive1.setNeutralMode(NeutralMode.Coast);
        rightDrive2.setNeutralMode(NeutralMode.Coast);
        
    }
    
}

}

