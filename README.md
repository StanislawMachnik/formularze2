int idRadioButton = radioGroup.getCheckedRadioButtonId();
int[] radios = new int[]{R.id.radio1, R.id.radio2, R.id.radio3};
for(int i = 0; i < radios.length; i++){
    if(idRadioButton == radios[i]){
        ...
    }
}

    <LinearLayout
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    android:layout_margin="12.5dp"
    android:layout_marginTop="40dp">

    <LinearLayout
        android:id="@+id/main2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        tools:context=".MainActivity"
        android:orientation="horizontal"
        android:layout_marginBottom="25dp">

        <TextView
            android:id="@+id/szesnascieText1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="R: " />
        <EditText
            android:id="@+id/szesnascie1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:inputType="number" />

        <TextView
            android:id="@+id/szesnascieText2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="G: " />
        <EditText
            android:id="@+id/szesnascie2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:inputType="number" />

        <TextView
            android:id="@+id/szesnascieText3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="B: " />
        <EditText
            android:id="@+id/szesnascie3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:inputType="number" />
    </LinearLayout>

    <LinearLayout
        android:id="@+id/main3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        tools:context=".MainActivity"
        android:orientation="horizontal"
        android:layout_marginBottom="25dp">


        <TextView
            android:id="@+id/dziesiecText1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="R: " />
        <EditText
            android:id="@+id/dziesiec1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:inputType="number" />

        <TextView
            android:id="@+id/dziesiecText2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="G: " />
        <EditText
            android:id="@+id/dziesiec2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:inputType="number" />

        <TextView
            android:id="@+id/dziesiecText3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="B: " />
        <EditText
            android:id="@+id/dziesiec3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:inputType="number" />
    </LinearLayout>

    <Button
        android:id="@+id/przelicz"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:text="Sprawdź" />
    </LinearLayout>

    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    
    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    
    
    public class MainActivity extends AppCompatActivity {
        private Button przelicz;
        private EditText szesnascie1;
        private EditText szesnascie2;
        private EditText szesnascie3;
        private EditText dziesiec1;
        private EditText dziesiec2;
        private EditText dziesiec3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        przelicz = findViewById(R.id.przelicz);

        szesnascie1 = findViewById(R.id.szesnascie1);
        szesnascie2 = findViewById(R.id.szesnascie2);
        szesnascie3 = findViewById(R.id.szesnascie3);

        dziesiec1 = findViewById(R.id.dziesiec1);
        dziesiec2 = findViewById(R.id.dziesiec2);
        dziesiec3 = findViewById(R.id.dziesiec3);

        szesnascie1.setOnFocusChangeListener(
                new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View view, boolean b) {
                        
                    }
                }
        );
    }
}
