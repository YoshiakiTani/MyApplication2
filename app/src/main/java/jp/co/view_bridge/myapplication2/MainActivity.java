package jp.co.view_bridge.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView your_name = this.findViewById(R.id.your_name);
        final TextView hello_output = this.findViewById(R.id.hello_output);
        Button say_hello = this.findViewById(R.id.say_hello);

        hello_output.setText("こんにちわ " + your_name.getText() + " さん");

        say_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hello_output.setText("こんにちわ " + your_name.getText() + " さん");
            }
        });

    }
}
