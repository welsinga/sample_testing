package com.elsinga.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.widget.Button;
import android.widget.EditText;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest
{
  private MainActivity _activity;

  @Before
  public void setUp() throws Exception
  {
    _activity = Robolectric.buildActivity(MainActivity.class).create().get();
  }

  @Test
  public void testAdding() throws Exception
  {
    Button btnOne = (Button) _activity.findViewById(R.id.num_1);
    Button btnAdd = (Button) _activity.findViewById(R.id.op_add);
    Button btnThree = (Button) _activity.findViewById(R.id.num_3);
    Button btnEquals = (Button) _activity.findViewById(R.id.op_equ);

    btnOne.performClick();
    btnAdd.performClick();
    btnThree.performClick();
    btnEquals.performClick();

    EditText resultText = (EditText) _activity.findViewById(R.id.editText1);
    assertEquals("4", resultText.getText().toString());
  }
}
