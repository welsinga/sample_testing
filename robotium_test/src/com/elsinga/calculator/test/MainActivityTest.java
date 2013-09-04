package com.elsinga.calculator.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.elsinga.calculator.MainActivity;
import com.jayway.android.robotium.solo.Solo;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>
{

  private Solo _solo;

  public MainActivityTest()
  {
    super(MainActivity.class);
  }

  @Override
  protected void setUp() throws Exception
  {
    super.setUp();
    _solo = new Solo(getInstrumentation(), getActivity());
  }

  public void testAdding()
  {
    _solo.assertCurrentActivity("Is app started", MainActivity.class);
    _solo.clickOnButton("CLR");
    _solo.clickOnButton("1");
    _solo.clickOnButton("+");
    _solo.clickOnButton("3");
    _solo.clickOnButton("=");

    EditText editText = (EditText) getActivity().findViewById(com.elsinga.calculator.R.id.editText1);
    assertEquals("4", editText.getText().toString());
  }

}
