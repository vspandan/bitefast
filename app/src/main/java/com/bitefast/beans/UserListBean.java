package com.bitefast.beans;

import java.util.Date;

/**
 * Created by rubbernecker on 7/7/15.
 */
public class UserListBean  implements Comparable<UserListBean> {
    public long id;
    public String name;
    public String read;
    public long timestamp;
    public String regPhn;


    public UserListBean(String name, String read,String regPhn) {
        this.name = name;
        this.read = read;
        this.timestamp= new Date().getTime();
        this.regPhn=regPhn;
    }

    public UserListBean(long id, String name, String read,long timestamp,String regPhn) {
        this.id=id;
        this.name = name;
        this.read = read;
        this.timestamp= timestamp;
        this.regPhn=regPhn;
    }

    public UserListBean() {

    }


    public int compareTo(UserListBean userListBean) {
        return (int)(this.timestamp-userListBean.timestamp);
    }

}
