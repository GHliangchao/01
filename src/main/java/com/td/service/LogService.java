package com.td.service;

import com.td.pojo.Log;

import java.util.List;

public interface LogService {
    Log addLog(Log log);

    List<Log> showAllLog();

    Log showLogById(long id);

    Log updateLog(Log log);

    Log Login(Log user);

    Log getUser(long id);
}
