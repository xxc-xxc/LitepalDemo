package com.uos.litepaldemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uos.litepaldemo.R;
import com.uos.litepaldemo.bean.User;

import org.litepal.LitePal;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setUsername("xxc");
        user.setGender("男");
        user.setAge(18);
        user.save();

        List<User> userList = LitePal.findAll(User.class);
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).getUsername());
        }
    }
}