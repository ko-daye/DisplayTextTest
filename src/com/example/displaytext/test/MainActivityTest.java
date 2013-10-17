package com.example.displaytext.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.displaytext.MainActivity;
import com.example.displaytext.R;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private MainActivity mActivity;
	private EditText mInputLine;
	private Button mAddButton;
	private Button mClearButton;
	private TextView mDisplayText;
	
	private String mAddButtonString;
	private String mClearButtonString;

	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = getActivity();
		
		mInputLine = (EditText)mActivity.findViewById(R.id.editBox);
		mAddButton = (Button)mActivity.findViewById(R.id.addButton);
		mClearButton = (Button)mActivity.findViewById(R.id.deleteButton);
		mDisplayText = (TextView)mActivity.findViewById(R.id.textBox);
		
		mAddButtonString = mActivity.getString(R.string.addButton);
		mClearButtonString = mActivity.getString(R.string.deleteBUtton);
	}
	
	public void testPrecondition() {
		
		assertEquals(mInputLine.getText().toString(), "");
		
		assertEquals(mAddButton.getText().toString(), mAddButtonString);
		
		assertEquals(mClearButton.getText().toString(), mClearButtonString);
		
		assertFalse(mClearButton.isEnabled());
		
		assertEquals(mDisplayText.getText().toString(), "");
	}
	
	public void testEnabledAddButton() {
		
	}
	
}
