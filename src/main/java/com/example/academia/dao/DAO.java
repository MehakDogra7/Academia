package com.example.academia.dao;

import org.hibernate.Session;

public interface DAO {

    public Session createSession();

    public void terminateSession(Session session);
}
