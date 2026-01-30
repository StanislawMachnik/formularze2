int idRadioButton = radioGroup.getCheckedRadioButtonId();
int[] radios = new int[]{R.id.radio1, R.id.radio2, R.id.radio3};
for(int i = 0; i < radios.length; i++){
    if(idRadioButton == radios[i]){
        ...
    }
}
