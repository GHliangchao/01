package com.td.dao;

import com.td.pojo.Log;

import java.util.List;

public interface LogDao {
    Log addLog(Log log);

    List<Log> showAllLog();

    Log showLogById(long id);

    Log updateLog(Log log);

    Log Login(Log user);

    Log getUser(long id);
}
