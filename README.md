dev.soomro.ali.arshad.sindhi.lib
================================

This is a tiny lib for enabling Sindhi wirtting in android EditText

Usage: 
This can be used in couple of ways like :

protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Swap.setSindhiEnabled(MainActivity.this, R.id.messageInput);// give the activity reference where the EditText is and the default keyboarb will write Sindhi in editText
	}
