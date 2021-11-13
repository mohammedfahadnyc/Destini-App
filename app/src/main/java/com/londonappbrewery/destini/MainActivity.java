package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton, mBottomButton;
    TextView mTextView;
    int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null)
        {
            mIndex = savedInstanceState.getInt("IndexKey");
        }

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyProgressTop();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storyProgressBottom();

            }
        });
    }


    private void storyProgressTop ()
    {
       if (mIndex == 1)
       {
           mTextView.setText(R.string.T3_Story);
           mTopButton.setText(R.string.T3_Ans1);
           mBottomButton.setText(R.string.T3_Ans2);
           mIndex = 2;
       }
       else if (mIndex == 2)
       {
           mTextView.setText(R.string.T6_End);
           mTopButton.setVisibility(View.GONE);
           mBottomButton.setVisibility(View.GONE);
       }
       else if (mIndex==3)
       {
           mTextView.setText(R.string.T3_Story);
           mTopButton.setText(R.string.T3_Ans1);
           mBottomButton.setText(R.string.T3_Ans2);
           mIndex = 4;
       }
       else if (mIndex==4)
       {
           mTextView.setText(R.string.T6_End);
           mTopButton.setVisibility(View.GONE);
           mBottomButton.setVisibility(View.GONE);
       }

    }

    private void storyProgressBottom ()
    {
        if (mIndex == 1)
        {
            mTextView.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
            mIndex = 3;
        }
        else if (mIndex == 2)
        {
            mTextView.setText(R.string.T5_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
        else if (mIndex == 3)
        {
            mTextView.setText(R.string.T4_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
        else if (mIndex==4)
        {
            mTextView.setText(R.string.T5_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("IndexKey",1);
    }
}
