package com.text.bean;

public class Text {
 private int  id;
 private String name;
 private String birthday;
 private int  age;
/**
 * @return id
 */
public int getId() {
	return id;
}
/**
 * @param id セットする id
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return name
 */
public String getName() {
	return name;
}
/**
 * @param name セットする name
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return birthday
 */
public String getBirthday() {
	return birthday;
}
/**
 * @param birthday セットする birthday
 */
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
/**
 * @return age
 */
public int getAge() {
	return age;
}
/**
 * @param age セットする age
 */
public void setAge(int age) {
	this.age = age;
}
/* (非 Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Text [id=" + id + ", name=" + name + ", birthday=" + birthday + ", age=" + age + "]";
}
/**
 * @param id
 * @param name
 * @param birthday
 * @param age
 */
public Text(int id, String name, String birthday, int age) {
	super();
	this.id = id;
	this.name = name;
	this.birthday = birthday;
	this.age = age;
}
/**
 *
 */
public Text() {
	super();
	// TODO 自動生成されたコンストラクター・スタブ
}

}
