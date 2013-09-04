package com.elsinga.calculator;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class StartsMethods extends UiAutomatorTestCase
{

  public StartsMethods()
  {
  }

  public void simulateHomeButton()
  {
    getUiDevice().pressHome();
  }

  public void openAllAppsScreen() throws UiObjectNotFoundException
  {
    UiObject allAppsButton = new UiObject(new UiSelector().description("Apps"));
    allAppsButton.clickAndWaitForNewWindow();
  }

  public void openAppsTab() throws UiObjectNotFoundException
  {
    UiObject appsTab = new UiObject(new UiSelector().text("Apps"));
    appsTab.click();
  }

  public void swipAndOpen() throws UiObjectNotFoundException
  {
    UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
    appViews.setAsHorizontalList();

    UiObject calculatorApp = appViews.getChildByText(new UiSelector().className(android.widget.TextView.class.getName()), "Calculator app");
    calculatorApp.clickAndWaitForNewWindow();
  }

}
