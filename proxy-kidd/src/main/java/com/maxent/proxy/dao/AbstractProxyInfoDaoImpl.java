package com.maxent.proxy.dao;

import com.maxent.proxy.detector.ProxyInfo;

import java.io.File;

/**
 * Created by kevin on 5/31/16.
 */
public abstract class AbstractProxyInfoDaoImpl implements ProxyInfoDao {

    @Override
    public void insert(ProxyInfo proxyInfo) {
    }

    @Override
    public void deleteByIPAndPort(String ip, int port) {
    }

    @Override
    public void append(ProxyInfo proxyInfo, File distFile) {
    }
}
