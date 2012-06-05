استفاده از این کتابخانه بسیار راحت است.
مثال

    String s = Tools.fa("متن");
	TextView t1 = (TextView) findViewById(R.id.textView1);
	t1.setText(s);

نکته: این اصلاح در نسخه های جدید آندروید ایجاد مشکل می کند. بهتر است در قسمت تنظیمات برنامه ی خود امکان فعال و غیر فعال کردن این اصلاح را قرار دهید. نحوه ی غیر فعال کردن:

    Tools.enable = false;
	
برای تصحیح فونت هم می تونید ا کد زیر استفاده کنید.
<- فونت مورد نظر را هم در پوشه ی assets قرار دهید

    Typeface tf = Typeface.createFromAsset(getAssets(), "BZar.ttf");
	t1.setTypeface(tf);