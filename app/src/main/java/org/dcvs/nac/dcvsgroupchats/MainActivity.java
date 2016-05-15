package org.dcvs.nac.dcvsgroupchats;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.net.URI;
import java.util.ArrayList;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    String groupnametxt = "";
    String grouplinktxt = "";

    Boolean acgcheckbox = false;

    Boolean b1enabled = false;
    Boolean b2enabled = false;
    Boolean b3enabled = false;
    Boolean b4enabled = false;
    Boolean b5enabled = false;
    Boolean b6enabled = false;
    Boolean b7enabled = false;
    Boolean b8enabled = false;
    Boolean b9enabled = false;
    Boolean b10enabled = false;
    Boolean b11enabled = false;
    Boolean b12enabled = false;

    //default checks
    Boolean c1default = true;
    Boolean c2default = true;
    Boolean c3default = true;
    Boolean c4default = true;
    Boolean c5default = true;
    Boolean c6default = true;
    Boolean c7default = true;
    Boolean c8default = true;
    Boolean c9default = true;
    Boolean c10default = true;
    Boolean c11default = true;
    Boolean c12default = true;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void C1OnClick(View v) {
        String strName = "";
        String strLink = "";
        Boolean c1isdefault = true;
        //create object of shared preferences
        SharedPreferences sharedPrefs=getSharedPreferences("c1", 0);
        //get editor
        SharedPreferences.Editor editor=sharedPrefs.edit();

        if (acgcheckbox){
            b1enabled = true;
            groupdialog();
            //put value
            editor.putString("strName", groupnametxt);
            editor.putString("strLink", grouplinktxt);
            //commit edit
            editor.apply();
            c1default = false;
            b1enabled = false;
        } else {
            String btnlinkc1 = sharedPrefs.getString("btnlink", "http://www.google.com");
            Uri btnurl = Uri.parse(btnlinkc1);
            Intent openURL = new Intent();
            openURL.setAction(Intent.ACTION_VIEW);
            openURL.addCategory(Intent.CATEGORY_BROWSABLE);
            openURL.setData(btnurl);
            startActivity(openURL);
        }

    }

    public void C2OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");

    }

    public void C3OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C4OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C5OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C6OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C7OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C8OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C9OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C10OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C11OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void C12OnClick(View v) {
        String btntext = "";
        Uri btnurl = Uri.parse("");
    }

    public void acgonclick(View v) {
        final View b1 = findViewById(R.id.chatbtn1);
        final View b2 = findViewById(R.id.chatbtn2);
        final View b3 = findViewById(R.id.chatbtn3);
        final View b4 = findViewById(R.id.chatbtn4);
        final View b5 = findViewById(R.id.chatbtn5);
        final View b6 = findViewById(R.id.chatbtn6);
        final View b7 = findViewById(R.id.chatbtn7);
        final View b8 = findViewById(R.id.chatbtn8);
        final View b9 = findViewById(R.id.chatbtn9);
        final View b10 = findViewById(R.id.chatbtn10);
        final View b11 = findViewById(R.id.chatbtn11);
        final View b12 = findViewById(R.id.chatbtn12);

        Switch switched = (Switch) findViewById(R.id.acgswitch);
        assert switched != null;
        switched.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    acgcheckbox = true;
                    //switch enabled
                    if (c1default = false) {
                        b1.setVisibility(View.VISIBLE);
                    }
                    if (c2default = false) {
                        b2.setVisibility(View.VISIBLE);
                    }
                    if (c3default = false) {
                        b3.setVisibility(View.VISIBLE);
                    }
                    if (c4default = false) {
                        b4.setVisibility(View.VISIBLE);
                    }
                    if (c5default = false) {
                        b5.setVisibility(View.VISIBLE);
                    }
                    if (c6default = false) {
                        b6.setVisibility(View.VISIBLE);
                    }
                    if (c7default = false)
                    b7.setVisibility(View.VISIBLE);
                    b8.setVisibility(View.VISIBLE);
                    b9.setVisibility(View.VISIBLE);
                    b10.setVisibility(View.VISIBLE);
                    b11.setVisibility(View.VISIBLE);
                    b12.setVisibility(View.VISIBLE);

                    Log.d("ACGCheck","ACGCheck Enabled");


                } else {
                    acgcheckbox = false;
                    //switch disabled
                    b1.setVisibility(View.INVISIBLE);
                    b2.setVisibility(View.INVISIBLE);
                    b3.setVisibility(View.INVISIBLE);
                    b4.setVisibility(View.INVISIBLE);
                    b5.setVisibility(View.INVISIBLE);
                    b6.setVisibility(View.INVISIBLE);
                    b7.setVisibility(View.INVISIBLE);
                    b8.setVisibility(View.INVISIBLE);
                    b9.setVisibility(View.INVISIBLE);
                    b10.setVisibility(View.INVISIBLE);
                    b11.setVisibility(View.INVISIBLE);
                    b12.setVisibility(View.INVISIBLE);

                    Log.d("ACGCheck","ACGCheck Disabled");

                }
            }
        });

    }


    public void errordialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("ERROR");
        final TextView errortext = new TextView(this);
        errortext.setText(getString(R.string.errordialogtext));
        builder.setView(errortext);
    }

    public void groupdialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Group Chat Details");
        LinearLayout grouplayout = new LinearLayout(this);
        grouplayout.setOrientation(LinearLayout.VERTICAL);

        // Set up the input for Group Name
        final TextView groupnametitle = new TextView(this);
        groupnametitle.setText(getString(R.string.groupnametitle));
        grouplayout.addView(groupnametitle);
        final EditText groupname = new EditText(this);
        groupname.setHint("Social Butterflies");
        grouplayout.addView(groupname);

        // Set up the input for the Group Link
        final TextView grouplinktitle = new TextView(this);
        grouplinktitle.setText(getString(R.string.grouplinktitle));
        grouplayout.addView(grouplinktitle);
        final EditText grouplink = new EditText(this);
        grouplink.setHint("use bitly to make it easier to type in the link or copy the link");
        grouplayout.addView(grouplink);

        builder.setView(grouplayout);

        //Set up the buttons
        builder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                groupnametxt = groupname.getText().toString();
                grouplinktxt = grouplink.getText().toString();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://org.dcvs.nac.dcvsgroupchats/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://org.dcvs.nac.dcvsgroupchats/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}


//todo Goal of project is to make it so that you can press the add button which opens a dialog with "Button Text" "Button Name" "Button URL" and maybe later add in button and text color
// chat button array on button touch
// check button array one at time for if the buttons are still default, when it finds a default button a dialog will pop up asking for "Group Name" "Group Link" then the button will be changed to Button Text: "Group Name" and Button Link: "Group Link" and set button to visible.
// add a default boolean ie isdefault = false/true