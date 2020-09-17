package com.bit.sts06.emp.model.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@ToString
//@EqualsAndHashCode
//@AllArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpVo {
//	@Getter
//	@Setter
	private int sabun;
//	@Getter
//	@Setter
	private String name;
//	@Getter
//	@Setter
//	@ToString.Exclude
//	@EqualsAndHashCode.Exclude
	private Timestamp nalja;
//	@Getter
//	@Setter
	private int pay, deptno;
	
	
}
