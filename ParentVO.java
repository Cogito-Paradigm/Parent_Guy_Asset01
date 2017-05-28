
abstract class ParentVO {
	//필드
	int asset;
	
	//생성자
	public ParentVO(){
	}
	
	public ParentVO(int asset){
		this.asset = asset;
	}

	//toString 오버라이딩
	public String toString(){
		return ""+asset;
	}
	
	//setter와 getter 메소드
	public int getAsset() {
		return asset;
	}
	public void setAsset(int asset) {
	}
}
