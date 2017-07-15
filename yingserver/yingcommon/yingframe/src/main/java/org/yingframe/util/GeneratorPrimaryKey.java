package org.yingframe.util;

import org.yingframe.common.SnowflakeIdWorker;

public class GeneratorPrimaryKey {
	public static SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0, 0);
	public static long getPk(){
		return snowflakeIdWorker.nextId();
	}

}
