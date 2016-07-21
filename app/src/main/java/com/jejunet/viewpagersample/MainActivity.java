package com.jejunet.viewpagersample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private ImageSlidePagerAdapter imageSlidePagerAdapter;
    private Button btnFirstPanel;
    private Button btnSecondPanel;
    private Button btnThirdPanel;
    private Button btnNextPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        viewPager = (ViewPager) findViewById(R.id.container);
        imageSlidePagerAdapter = new ImageSlidePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(imageSlidePagerAdapter);

        btnFirstPanel = (Button) findViewById(R.id.btn_first_panel);
        btnSecondPanel = (Button) findViewById(R.id.btn_second_panel);
        btnThirdPanel = (Button) findViewById(R.id.btn_third_panel);
        btnNextPanel = (Button) findViewById(R.id.btn_next_panel);

        btnFirstPanel.setOnClickListener(this);
        btnSecondPanel.setOnClickListener(this);
        btnThirdPanel.setOnClickListener(this);
        btnNextPanel.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_first_panel:
                viewPager.setCurrentItem(0, true);
                break;
            case R.id.btn_second_panel:
                viewPager.setCurrentItem(1, true);
                break;
            case R.id.btn_third_panel:
                viewPager.setCurrentItem(2, true);
                break;
            case R.id.btn_next_panel:
                int currentItem = viewPager.getCurrentItem();
                int nextItem = currentItem + 1;
                if(nextItem > 2) {
                    nextItem = 0;
                }
                viewPager.setCurrentItem(nextItem, false);
                break;
        }
    }
}
