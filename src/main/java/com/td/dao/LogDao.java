package com.td.dao;

import com.td.pojo.Log;
import com.td.pojo.User;

import java.util.List;

public interface LogDao {
    Log addLog(Log log);

    List<Log> showAllLog();

    Log showLogById(long id);

    Log updateLog(Log log);

    User login(String username);

    Log getUser(long id);
}
