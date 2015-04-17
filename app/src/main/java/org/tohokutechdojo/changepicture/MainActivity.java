package org.tohokutechdojo.changepicture;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private ImageView imageView;
    private int touchCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // レイアウトファイル(activity_main.xml)を読み込む
        setContentView(R.layout.activity_main);

        // 画像を入れるレイアウトを指定する
        imageView = (ImageView) findViewById(R.id.imageView);

        // 初期値の画像を入れる
        imageView.setImageResource(R.drawable.sheep_1);
    }

    public void onTouchLayout(View v) {
        if (touchCount == 0){
            // 1種類目の画像を入れる
            imageView.setImageResource(R.drawable.sheep_2);

            // touchCountを1にする
            touchCount = 1;
        }
        else {
            // 2種類目の画像を入れる
            imageView.setImageResource(R.drawable.sheep_1);

            // touchCountを0にする
            touchCount = 0;
        }
    }
}
