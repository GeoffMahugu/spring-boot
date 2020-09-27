package com.springinit.demo.yarn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

public class HelloPojo {
    private static final Log log = LogFactory.getLog(HelloPojo.class);

    @Autowired
//    private Configuration configuration;

//    @OnYarnContainerStart
//    public void publicVoidNoArgsMethod() {
//        log.info("Hello from HelloPojo");
//        log.info("About to list from hdfs root content");
//        FsShell shell = new FsShell(configuration);
//        for (FileStatus s : shell.ls(false, "/")) {
//            log.info(s);
//        }
//    }
}
