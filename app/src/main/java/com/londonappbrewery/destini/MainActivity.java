package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    setT3Story();
                } else if (mStoryIndex == 2) {
                    setT3Story();
                }
                else if (mStoryIndex == 3) {
                    setT6End();
                }
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    setT2Story();
                } else if (mStoryIndex == 2) {
                    setT4End();
                }
                else if (mStoryIndex == 3) {
                    setT5End();
                }
            }
        });
    }

    private void setT3Story() {
        mStoryTextView.setText(R.string.T3_Story);
        mButtonTop.setText(R.string.T3_Ans1);
        mButtonBottom.setText(R.string.T3_Ans2);
        mStoryIndex = 3;
    }

    private void setT2Story() {
        mStoryTextView.setText(R.string.T2_Story);
        mButtonTop.setText(R.string.T2_Ans1);
        mButtonBottom.setText(R.string.T2_Ans2);
        mStoryIndex = 2;
    }

    private void setT4End() {
        mStoryTextView.setText(R.string.T4_End);
        hideButtons();
    }

    private void setT5End() {
        mStoryTextView.setText(R.string.T5_End);
        hideButtons();
    }

    private void setT6End() {
        mStoryTextView.setText(R.string.T6_End);
        hideButtons();
    }

    private void hideButtons() {
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
}
