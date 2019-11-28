package hs.kr.emirim.dahee866.pageinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class AddActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Button buttons = (Button)findViewById(R.id.savebutton);
        buttons.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
                startActivity(intent);
            }
        });
        //final EditText edittext=(EditText)findViewById(R.id.edittext);
        Button buttonc = (Button)findViewById(R.id.cancelbutton);
        final EditText textView1=(EditText)findViewById(R.id.homepagename);
        final EditText textView2=(EditText)findViewById(R.id.homepagelink);
        final EditText textView3=(EditText)findViewById(R.id.homepageid);
        final EditText textView4=(EditText)findViewById(R.id.homepagepw);
        final EditText textView5=(EditText)findViewById(R.id.homepageemail);
        final EditText textView6=(EditText)findViewById(R.id.hompagetext);
        buttonc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
//                Intent intent = new Intent(getApplicationContext(), ViewActivity.class);
//                startActivity(intent);
                textView1.setText(null);
                textView2.setText(null);
                textView3.setText(null);
                textView4.setText(null);
                textView5.setText(null);
                textView6.setText(null);
            }
        });
    }
}
