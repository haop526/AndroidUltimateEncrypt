package com.masonliu.ndk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MasonMainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.ndk_text);

        textView.setText(JNIUtil.getPwd(this));

//		 try {
//			 PackageInfo info =getPackageManager().getPackageInfo(getPackageName(), 64);
//			 Signature sign = info.signatures[0];
//			 Log.e("test", "hashCode : " + sign.hashCode());
//			 Log.e("test", "hashCodestring : " + sign.toCharsString());
//		 } catch (NameNotFoundException e) {
//			 e.printStackTrace();
//		 }
    }


}
