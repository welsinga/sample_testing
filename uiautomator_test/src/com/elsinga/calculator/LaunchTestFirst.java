package com.elsinga.calculator;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

//import com.android.uiautomator.core.UiScrollable;

public class LaunchTestFirst extends UiAutomatorTestCase
{

  public void testDemo() throws UiObjectNotFoundException
  {

    StartsMethods start = new StartsMethods();

    start.openAllAppsScreen();
    start.openAppsTab();
    start.swipAndOpen();

    UiObject oneButton = new UiObject(new UiSelector().text("1"));
    oneButton.click();

    UiObject plusButton = new UiObject(new UiSelector().text("+"));
    plusButton.click();

    UiObject threeButton = new UiObject(new UiSelector().text("3"));
    threeButton.click();

    UiObject eqButton = new UiObject(new UiSelector().text("="));
    eqButton.click();

    UiObject text = new UiObject(new UiSelector().className("android.widget.EditText").text("4"));
    assertTrue(text.exists());
  }
}