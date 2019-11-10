package com.google.login;

import com.google.login.DefaultValue;
import java.io.*;

public class UserDaoImpl implements UserDao {


    @Override
    public UserInfo findUserInfoByName(String username) {
        UserInfo userInfo = new UserInfo();
        try {
            if (username == null || username.length() == 0) {
                throw new Exception();
            }
            String filename = DefaultValue.FILEPATH + username + DefaultValue.FILETYPE;
            File file =new File(filename);
            if(!file.exists()){
                throw new Exception();
            }
            BufferedReader in = new BufferedReader(new FileReader(file));
            String findName = in.readLine();
            String findPassword = in.readLine();
            userInfo.setUsername(findName);
            userInfo.setPassword(findPassword);
    } catch (Exception e) {
            e.printStackTrace();
    }
        return userInfo;
    }


        @Override
    public boolean saveUser(UserInfo userInfo) {
            boolean result = false;
            try {
                if (userInfo.getUsername() == null || userInfo.getUsername().length() == 0) {
                    throw new Exception();
                }
                String filename = DefaultValue.FILEPATH + userInfo.getUsername() + DefaultValue.FILETYPE;
                String content = userInfo.getUsername() + "\n" + userInfo.getPassword();
                File file =new File(filename);
                    if(file.exists()){
                        throw new Exception();
                }
                file.createNewFile();
                BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
                out.write(content);
                out.close();
                result = true;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
    }

