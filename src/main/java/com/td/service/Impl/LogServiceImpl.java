package com.td.service.Impl;

import com.td.dao.LogDao;
import com.td.pojo.Log;
import com.td.pojo.User;
import com.td.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    public Log addLog(Log log) {
        return logDao.addLog(log);
    }

    public List<Log> showAllLog() {
        return logDao.showAllLog();
    }

    public Log showLogById(long id) {
        return logDao.showLogById(id);
    }

    public Log updateLog(Log log) {
        return logDao.updateLog(log);

    }

    public User Login(User user) {
        return logDao.Login(user);
    }
}
