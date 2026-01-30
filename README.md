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
