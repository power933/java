function search(name){
	var list = {
		"Person" : ["김수빈","김정민","오유나","김진수","김창순","이유림","하윤성"],
		"Email" : ["kim@nate.com","jungmin@gmail.com", "ouna123@gmail.com", "kimjsu@nate.com", "soon0707@naver.com","limlee@gmail.com","hayounsong@naver.com"],
	}
	var uemail;
	
	var x = 0;
	
//	list[key[0]][i].length
		for(var i = 0; i< list["Person"].length ;i++){
			if(list["Person"][i] == name){
				uemail = list["Email"][i];
				x++;
				console.log(uemail);
				break;
			}
			
		}
	
	if(x == 0){
		return 0
	}
	else{
		return uemail
	}
}