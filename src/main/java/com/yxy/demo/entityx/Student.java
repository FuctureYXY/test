package com.yxy.demo.entityx;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component  		//优先级  properties > yaml > value>@PropertySource 
@ConfigurationProperties(prefix="stu")//注入 stu
@Validated//JSR303开启的注解
//@PropertySource(value= {"classpath:config.properties"})  外部导入properties文件  为其赋值
public class Student {
	//@Value("ddddd")
	@Email//JSR303
	private String email ;
	//@Value("${stu.xiaoming}")
	private String userName;
	@Value("ddd")
	  private String name;
	@Value("${random.int}")
	  private int age;
	  @Value("true")
	  private Boolean x;
	  @Value("588")
	  private BigDecimal y;
	  @Value("588")
	  private Integer z;
	  //@Value("1997-2-11")
	  @Value("1997/2/11")
	  private Date  birthday;
	// @Value("{province: \"福\\n建\",city: '泉\\n州',zone: 安\\n海}") 复杂类型 value无法注入
	 private Map<String,Object> location;
	  private String[] hobbies;
	  private List<String> skills;
	  private Pet pet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Map<String, Object> getLocation() {
		return location;
	}
	public void setLocation(Map<String, Object> location) {
		this.location = location;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getX() {
		return x;
	}
	public void setX(Boolean x) {
		this.x = x;
	}
	public BigDecimal getY() {
		return y;
	}
	public void setY(BigDecimal y) {
		this.y = y;
	}
	public Integer getZ() {
		return z;
	}
	public void setZ(Integer z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Student [email=" + email + ", userName=" + userName + ", name=" + name + ", age=" + age + ", x=" + x
				+ ", y=" + y + ", z=" + z + ", birthday=" + birthday + ", location=" + location + ", hobbies="
				+ Arrays.toString(hobbies) + ", skills=" + skills + ", pet=" + pet + "]";
	}

	   
}
