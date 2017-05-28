
class GuyVO extends ParentVO{
	//필드
	String name;
	int age;
	int sex;
	
	//생성자
	public GuyVO(){
	}
	public GuyVO(String name, int age, int sex, int asset){
		super(asset);
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//toString 오버라이딩
	public String toString(){
		return name+age+sex+asset;
	}
	
	//setter와 getter 메소드
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
}
