package top.bobyr.healthlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration05 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration05);

        Button btn_register = (Button)findViewById(R.id.button_reg05_next);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                startActivity(new Intent(Registration05.this, RegistartionGolograma.class));
            }
        });
    }
}
