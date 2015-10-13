package com.mindlin.m2hw.data;

import com.mindlin.m2hw.sql.SQLForeign;
import com.mindlin.m2hw.sql.SQLSerializable;
import com.mindlin.m2hw.sql.SQLSerializableField;
import com.mindlin.m2hw.sql.StdSQLDataType;

@SQLSerializable("CLASS")
public class Class {
	@SQLSerializableField(name="CLASS_NAME", type=StdSQLDataType.VARCHAR, arg="20")
	String name;
	
	@SQLSerializableField(name="BLOCK", type=StdSQLDataType.INTEGER)
	Block block;
	
	SQLForeign<Teacher> teacher;
}
