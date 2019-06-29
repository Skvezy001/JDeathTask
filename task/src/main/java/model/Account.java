package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Account {
    private int id;
    private int account;
    private int userid;
    private List<String> accountList;

    public Account(int id, int account, int userid) {
        this.id = id;
        this.account = account;
        this.userid = userid;
    }

    public Account(ResultSet resultSet) {
        accountList = new ArrayList<>();
        try {
            while(resultSet.next()){
                accountList.add("id:  " + resultSet.getInt("id") + " | Account number:  " + resultSet.getInt("account") +
                        " | User id: " + resultSet.getInt("userid") + "</br>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public int getAccount() {
        return account;
    }

    public int getUserid() {
        return userid;
    }

    public List<String> getAccountList() {
        return accountList;
    }

    public String accountsToString() {
        String str = "";
        for(String list: accountList) {
            str += list;
        }
        return str;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account=" + account +
                ", userid=" + userid +
                '}';
    }
}
