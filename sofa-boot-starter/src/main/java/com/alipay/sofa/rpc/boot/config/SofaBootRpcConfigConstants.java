/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.boot.config;

import com.alipay.sofa.rpc.common.SystemInfo;

/**
 *
 * SOFABoot RPC 配置相关常量
 * @author <a href="mailto:lw111072@antfin.com">LiWei</a>
 */
public class SofaBootRpcConfigConstants {

    /** key start ********************************************************/

    /** application */
    public static final String  APP_NAME                                     = "spring.application.name";

    public static final String  LOG_PATH                                     = "logging.path";

    /** fault-tolerance */
    public static final String  RPC_AFT_REGULATION_EFFECTIVE                 = "com.alipay.sofa.rpc.aft.regulation.effective";

    public static final String  RPC_AFT_DEGRADE_EFFECTIVE                    = "com.alipay.sofa.rpc.aft.degrade.effective";

    public static final String  RPC_AFT_TIME_WINDOW                          = "com.alipay.sofa.rpc.aft.time.window";

    public static final String  RPC_AFT_LEAST_WINDOW_COUNT                   = "com.alipay.sofa.rpc.aft.least.window.count";

    public static final String  RPC_AFT_LEAST_WINDOW_EXCEPTION_RATE_MULTIPLE = "com.alipay.sofa.rpc.aft.least.window.exception.rate.multiple";

    public static final String  RPC_AFT_WEIGHT_DEGRADE_RATE                  = "com.alipay.sofa.rpc.aft.weight.degrade.rate";

    public static final String  RPC_AFT_WEIGHT_RECOVER_RATE                  = "com.alipay.sofa.rpc.aft.weight.recover.rate";

    public static final String  RPC_AFT_DEGRADE_LEAST_WEIGHT                 = "com.alipay.sofa.rpc.aft.degrade.least.weight";

    public static final String  RPC_AFT_DEGRADE_MAX_IP_COUNT                 = "com.alipay.sofa.rpc.aft.degrade.max.ip.count";

    /** bolt */
    public static final String  BOLT_PORT                                    = "com.alipay.sofa.rpc.bolt.port";

    public static final String  BOLT_IO_THREAD_COUNT                         = "com.alipay.sofa.rpc.bolt.io.thread.count";

    public static final String  BOLT_EXECUTOR_THREAD_COUNT                   = "com.alipay.sofa.rpc.bolt.executor.thread.count";

    public static final String  BOLT_ACCEPTS_COUNT                           = "com.alipay.sofa.rpc.bolt.accepts.count";

    /** rest */
    public static final String  REST_HOSTNAME                                = "com.alipay.sofa.rpc.rest.hostname";

    public static final String  REST_PORT                                    = "com.alipay.sofa.rpc.rest.port";

    public static final String  REST_IO_THREAD_COUNT                         = "com.alipay.sofa.rpc.rest.io.thread.count";

    public static final String  REST_EXECUTOR_THREAD_COUNT                   = "com.alipay.sofa.rpc.rest.executor.thread.count";

    public static final String  REST_MAX_REQUEST_SIZE                        = "com.alipay.sofa.rpc.rest.max.request.size";

    public static final String  REST_TELNET                                  = "com.alipay.sofa.rpc.rest.telnet";

    public static final String  REST_DAEMON                                  = "com.alipay.sofa.rpc.rest.daemon";

    /** dubbo */
    public static final String  DUBBO_PORT                                   = "com.alipay.sofa.rpc.dubbo.port";

    public static final String  DUBBO_IO_THREAD_COUNT                        = "com.alipay.sofa.rpc.dubbo.io.thread.count";

    public static final String  DUBBO_EXECUTOR_THREAD_COUNT                  = "com.alipay.sofa.rpc.dubbo.executor.thread.count";

    public static final String  DUBBO_ACCEPTS_COUNT                          = "com.alipay.sofa.rpc.dubbo.accepts.count";

    /** registry */
    public static final String  REGISTRY_PROTOCOL                            = "com.alipay.sofa.rpc.registry.address";

    /** key end ********************************************************/

    /** default config value start ********************************************************/

    /** rest */
    public static final int     REST_PORT_DEFAULT                            = 8341;
    public static final int     REST_IO_THREAD_COUNT_DEFAULT                 = SystemInfo.getCpuCores() * 2;
    public static final int     REST_EXECUTOR_THREAD_COUNT_DEFAULT           = 200;
    public static final int     REST_MAX_REQUEST_SIZE_DEFAULT                = 1024 * 1024 * 10;
    public static final boolean REST_TELNET_DEFAULT                          = true;
    public static final boolean REST_DAEMON_DEFAULT                          = true;

    /** dubbo */
    public static final int     DUBBO_PORT_DEFAULT                           = 20880;

    /** registry */
    public static final String  REGISTRY_FILE_PATH_DEFAULT                   = System.getProperty("user.home")
                                                                                 +
                                                                                 System
                                                                                     .getProperty("file.separator") +
                                                                                 "localFileRegistry"
                                                                                 +
                                                                                 System
                                                                                     .getProperty("file.separator") +
                                                                                 "localRegistry.reg";

    /** default config value end ********************************************************/

    /** possible config value start ********************************************************/

    /** registry */
    public static final String  REGISTRY_PROTOCOL_LOCAL                      = "local";
    public static final String  REGISTRY_PROTOCOL_ZOOKEEPER                  = "zookeeper";

    /** server */
    public static final String  RPC_PROTOCOL_BOLT                            = "bolt";
    public static final String  RPC_PROTOCOL_REST                            = "rest";
    public static final String  RPC_PROTOCOL_DUBBO                           = "dubbo";

    /** possible config value end ********************************************************/

}