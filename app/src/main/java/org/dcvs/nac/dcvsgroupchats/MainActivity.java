package org.dcvs.nac.dcvsgroupchats;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String groupnametxt = "";
    String grouplinktxt = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onACGClick(View V){
        groupdialog();
        Boolean defaultbtn;
        /*ArrayList<String> btnlist = new ArrayList<String>(12);

        btnlist.add(1, "Chat Button");
        btnlist.add(2, "Chat Button");
        btnlist.add(3, "Chat Button");
        btnlist.add(4, "Chat Button");
        btnlist.add(5, "Chat Button");
        btnlist.add(6, "Chat Button");
        btnlist.add(7, "Chat Button");
        btnlist.add(8, "Chat Button");
        btnlist.add(9, "Chat Button");
        btnlist.add(10, "Chat Button");
        btnlist.add(11, "Chat Button");
        btnlist.add(12, "Chat Button");*/

        Button chat1btn = (Button)findViewById(R.id.chatbtn1);
        chat1btn.defaultbtn = true;
        Button chat2btn = (Button)findViewById(R.id.chatbtn2);
        Button chat3btn = (Button)findViewById(R.id.chatbtn3);
        Button chat4btn = (Button)findViewById(R.id.chatbtn4);
        Button chat5btn = (Button)findViewById(R.id.chatbtn5);
        Button chat6btn = (Button)findViewById(R.id.chatbtn6);
        Button chat7btn = (Button)findViewById(R.id.chatbtn7);
        Button chat8btn = (Button)findViewById(R.id.chatbtn8);
        Button chat9btn = (Button)findViewById(R.id.chatbtn9);
        Button chat10btn = (Button)findViewById(R.id.chatbtn10);
        Button chat11btn = (Button)findViewById(R.id.chatbtn11);
        Button chat12btn = (Button)findViewById(R.id.chatbtn12);

        if (chat1btn.getTag()) {
            chat1btn.setText(groupnametxt);
            chat1btn.setVisibility(View.VISIBLE);
        } else if(chat2btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat2btn.setText(groupnametxt);
            chat2btn.setVisibility(View.VISIBLE);
        } else if(chat3btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat3btn.setText(groupnametxt);
            chat3btn.setVisibility(View.VISIBLE);
        } else if(chat4btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat4btn.setText(groupnametxt);
            chat4btn.setVisibility(View.VISIBLE);
        } else if(chat5btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat5btn.setText(groupnametxt);
            chat5btn.setVisibility(View.VISIBLE);
        } else if(chat6btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat6btn.setText(groupnametxt);
            chat6btn.setVisibility(View.VISIBLE);
        } else if(chat7btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat7btn.setText(groupnametxt);
            chat7btn.setVisibility(View.VISIBLE);
        } else if(chat8btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat8btn.setText(groupnametxt);
            chat8btn.setVisibility(View.VISIBLE);
        } else if(chat9btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat9btn.setText(groupnametxt);
            chat9btn.setVisibility(View.VISIBLE);
        } else if(chat10btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat10btn.setText(groupnametxt);
            chat10btn.setVisibility(View.VISIBLE);
        } else if(chat11btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat11btn.setText(groupnametxt);
            chat11btn.setVisibility(View.VISIBLE);
        } else if(chat12btn.getText().toString().equals(R.string.defaultbtntext)) {
            chat12btn.setText(groupnametxt);
            chat12btn.setVisibility(View.VISIBLE);
        } else {
            errordialog();
        }
    }

    public void errordialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("ERROR");
        final TextView errortext = new TextView(this);
        errortext.setText(getString(R.string.errordialogtext));
        builder.setView(errortext);
    }

    public void groupdialog(){
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
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });
        builder.show();
    }
}


//todo Goal of project is to make it so that you can press the add button which opens a dialog with "Button Text" "Button Name" "Button URL" and maybe later add in button and text color
// chat button array on button touch
// check button array one at time for if the buttons are still default, when it finds a default button a dialog will pop up asking for "Group Name" "Group Link" then the button will be changed to Button Text: "Group Name" and Button Link: "Group Link" and set button to visible.
// add a default boolean ie isdefault = false/true