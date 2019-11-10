package com.google.login;

public interface UserDao {
    /**
     * @Description: to find user by user name
     * @Param: [username]
     * @return: com.google.login
     * @Author: 啦啦啦
     * @Date: 2019/11/10
     */
    public UserInfo findUserInfoByName(String username);

    /**
     * @Description: to register user in data source
     * @Param: [userInfo]
     * @return: int
     * @Author: 啦啦啦
     * @Date: 2019/11/10
     */
    public boolean saveUser(UserInfo userInfo);
}
