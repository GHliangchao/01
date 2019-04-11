package com.td.service;

import com.td.pojo.Log;
import com.td.pojo.User;

import java.util.List;

public interface LogService {
    Log addLog(Log log);

    List<Log> showAllLog();

    Log showLogById(long id);

    Log updateLog(Log log);

    User login(String username);

    Log getUser(long id);
}
