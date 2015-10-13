package com.mindlin.m2hw.sql;

public enum StdSQLDataType implements SQLDataType {
	CHARACTER {
		@Override
		public String toString(String arg1) {
			return "CHARACTER("+arg1+")";
		}
	},
	VARCHAR {
		@Override
		public String toString(String arg1) {
			return "VARCHAR("+arg1+")";
		}
	},
	BINARY {
		@Override
		public String toString(String arg1) {
			return "BINARY("+arg1+")";
		}
	},
	BOOLEAN,
	VARBINARY {
		@Override
		public String toString(String arg1) {
			return "VARBINARY("+arg1+")";
		}
	},
	INTEGER {
		@Override
		public String toString(String arg1) {
			return arg1.isEmpty()?"INTEGER":("INTEGER("+arg1+")");
		}
	},
	SMALLINT,
	BIGINT,
	DECIMAL {
		@Override
		public String toString(String arg1) {
			return "DECIMAL("+arg1+")";
		}
	},
	NUMERIC {
		@Override
		public String toString(String arg1) {
			return "NUMERIC("+arg1+")";
		}
	},
	FLOAT {
		@Override
		public String toString(String arg1) {
			return "FLOAT("+arg1+")";
		}
	},
	REAL,
	DOUBLE_PRECISION,
	DATE,
	TIME,
	TIMESTAMP,
	INTERVAL,
	ARRAY,
	MULTISET,
	XML,
	DETECT,
	CUSTOM {
		@Override
		public String toString(String arg1) {
			return arg1;
		}
	};
	@Override
	public String getName() {
		return this.name();
	}

	@Override
	public String toString(String arg1) {
		return this.name();
	}
}
