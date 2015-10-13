package com.mindlin.m2hw.data;

import com.mindlin.m2hw.sql.SQLPrimairyKey;
import com.mindlin.m2hw.sql.SQLSerializable;
import com.mindlin.m2hw.sql.SQLSerializableField;
import com.mindlin.m2hw.sql.StdSQLDataType;

@SQLSerializable("TEACHER")
public class Teacher {
	@SQLPrimairyKey
	@SQLSerializableField(name="TEACHER_ID",type=StdSQLDataType.INTEGER)
	protected int id;
	
	@SQLSerializableField(name="FIRST_NAME", type=StdSQLDataType.VARCHAR, arg="20")
	protected String firstName;
	
	@SQLSerializableField(name="LAST_NAME", type=StdSQLDataType.VARCHAR, arg="20")
	protected String lastName;
}
