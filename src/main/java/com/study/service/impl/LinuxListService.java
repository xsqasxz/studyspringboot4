package com.study.service.impl;

import com.study.service.ListService;

/**
 * @author xueshiqi
 * @since 2020/1/9
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
