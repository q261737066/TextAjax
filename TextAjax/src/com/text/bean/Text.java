package com.text.bean;

public class Text {
 private int  id;
 private String name;
 private String sex;
 private int  age;
/**
 * @return id
 */
public int getId() {
	return id;
}
/**
 * @param id �Z�b�g���� id
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
 * @param name �Z�b�g���� name
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return sex
 */
public String getSex() {
	return sex;
}
/**
 * @param sex �Z�b�g���� sex
 */
public void setSex(String sex) {
	this.sex = sex;
}
/**
 * @return age
 */
public int getAge() {
	return age;
}
/**
 * @param age �Z�b�g���� age
 */
public void setAge(int age) {
	this.age = age;
}
/* (�� Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Text [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
}
/**
 * @param id
 * @param name
 * @param sex
 * @param age
 */
public Text(int id, String name, String sex, int age) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.age = age;
}
/**
 *
 */
public Text() {
	super();
	// TODO �����������ꂽ�R���X�g���N�^�[�E�X�^�u
}

}
