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
package org.apache.rocketmq.common.consumer;

/**
 * 用于指定Consumer第一次启动时从Queue的哪个位置开始消费
 * 如果Consumer不是第一次启动，则会从Broker中获取历史offset，就不会受到这个配置的影响
 */
public enum ConsumeFromWhere {
    /**
     * Consumer从Broker中最新的消息开始消费
     */
    CONSUME_FROM_LAST_OFFSET,

    @Deprecated
    CONSUME_FROM_LAST_OFFSET_AND_FROM_MIN_WHEN_BOOT_FIRST,
    @Deprecated
    CONSUME_FROM_MIN_OFFSET,
    @Deprecated
    CONSUME_FROM_MAX_OFFSET,
    /**
     * Consumer从Broker中最早的可用消息开始消费
     */
    CONSUME_FROM_FIRST_OFFSET,
    /**
     * Consumer从指定的时间戳开始消费，这意味着在consumeTimestamp之前生成的消息将被忽略
     */
    CONSUME_FROM_TIMESTAMP,
}
