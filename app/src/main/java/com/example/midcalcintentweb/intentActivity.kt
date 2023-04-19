package com.example.midcalcintentweb

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class intentActivity : AppCompatActivity() {
    lateinit var Buttonsms:Button
    lateinit var Buttoncall:Button
    lateinit var Buttondial:Button
    lateinit var Buttonshare:Button
    lateinit var Buttoncamera:Button
    lateinit var Buttonstk:Button
    lateinit var Buttonemail:Button
//    sms,call,dial,share,camera,stk(mpesa),email
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
    Buttonsms=findViewById(R.id.btn_sms)
    Buttoncall=findViewById(R.id.btn_call)
    Buttondial=findViewById(R.id.btn_dial)
    Buttonshare=findViewById(R.id.btn_share)
    Buttoncamera=findViewById(R.id.btn_camera)
    Buttonstk=findViewById(R.id.btn_stk)
    Buttonemail=findViewById(R.id.btn_email)

    Buttonsms.setOnClickListener {
        val uri = Uri.parse("smsto:07456789")

        val intent = Intent(Intent.ACTION_SENDTO, uri)

        intent.putExtra("Hello", "How is todays weather")

        startActivity(intent)

    }
    Buttoncall.setOnClickListener {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918511812660"))

        if (ContextCompat.checkSelfPermission(
                this@intentActivity,
                android.Manifest.permission.CALL_PHONE            )
            != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this@intentActivity,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                1
            )
        } else {
            startActivity(intent)

    }
    Buttondial.setOnClickListener {
        val phone = "+34666777888"

        val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

        startActivity(intent)


    }
    Buttonshare.setOnClickListener {
        val shareIntent = Intent(Intent.ACTION_SEND)

        shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

        shareIntent.type = "text/plain"

        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

        startActivity(shareIntent)

    Buttoncamera.setOnClickListener {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        startActivityForResult(takePictureIntent, 1)

    }
    }
    Buttonstk.setOnClickListener {
        val simToolKitLaunchIntent =
            applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

        simToolKitLaunchIntent?.let { startActivity(it)}


    }
    Buttonemail.setOnClickListener {

        val emailIntent =
            Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

        startActivity(Intent.createChooser(emailIntent, "Send email..."))

    }
    }
}
}