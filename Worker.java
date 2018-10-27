import java.util.ArrayList;
import java.util.Scanner;


public class Worker {
	public static ArrayList<Client> al = new ArrayList<Client>();
	static Scanner sc = new Scanner(System.in);
	
	public static void ask(){
		System.out.println("What will we do? Choose one of them\n" +
				"Add new client, please enter \"add\"\n" +
				"Search client by client name/pet name, please enter \"search\"");// +
				//"Change client data , please enter \"change\"\n" +
				//"Delete client , please enter \"delete\"");
		String command = sc.next();
		commands(command);
		}
	public static void commands(String command){
		while(true){
		if(command.equals("add")){
			add();
			break;
		}else if(command.equals("search")){
			search();
			break;
		}/*else if(command.equals("change")){
			change();
			break;
		}else if(command.equals("delete")){
			delete();
			break;
		}*/else{
			System.out.println("What will we do? Choose one of them\n" +
					"Add new client, please enter \"add\"\n" +
					"Search client by client name/pet name, please enter \"search\"");// +
					//"Change client data , please enter \"change\"\n" +
					//"Delete client , please enter \"delete\"");
			 command = sc.next();
		}
	}
	}
	public static void add(){
			System.out.println("Add please client name");
				String clientname = sc.next();
				System.out.println("Add please pet name");
				String petname = sc.next();
				System.out.println("Add please pet type.(available types: cat or dog)");
				String petType = sc.next();
				while(true){
				if(petType.equals("cat")){
					al.add(new Client(clientname, new Cat(petname, petType)));
					break;
				}else if (petType.equals("dog")){
					al.add(new Client(clientname, new Dog(petname, petType)));
					break;
				}else{
					System.out.println("Add please pet type.(available types: cat or dog)");
					 petType = sc.next();
				}
		}
			//al.get(0).getPet().say();
		}
	public static void search(){
			String typeOfSearch = searchText();
			System.out.println("Enter please a data for search");
			String searchData = sc.next();
			Client temp = new Client(null, null);
			for(int i =0; i<al.size(); i++){
				if(typeOfSearch.equals("clientname")&& searchData.equals(al.get(i).getName())){
		System.out.println("Client with name " + al.get(i).getName() +
				" found . Name of pet is "+ al.get(i).getPet().getPetname()+"."+
							"Type of Pet is "+al.get(i).getPet().getPetType());
					System.out.println("What we would to do with client\n"+
							"if you want o change client data enter \"change\"\n"+
							"if you want to delete client data enter \"delete\"\n"+
							"if you want to exit enter \"exit\"");
			      String typeOfDo = sc.next();
			      if(typeOfDo.equals("change")){
			    	  temp = al.get(i);
			    	  change(temp);
			      }else if(typeOfDo.equals("delete")){
			    	  temp = al.get(i);
			    	  delete(temp);
			      }else if(typeOfDo.equals("exit")){
			    	  break;
				}
				}
				else if(typeOfSearch.equals("petname")&& searchData.equals(al.get(i).getPet().getPetname())){
					System.out.println("Pet with name " +al.get(i).getPet().getPetname() +
							" found . Client name is "+ al.get(i).getName()+"."+
										"Type of Pet is "+al.get(i).getPet().getPetType());
								System.out.println("What we would to do with client\n"+
										"if you want o change client data enter \"change\"\n"+
										"if you want to delete client data enter \"delete\"\n"+
										"if you want to exit enter \"exit\"");
						      String typeOfDo = sc.next();
						      if(typeOfDo.equals("change")){
						    	  temp = al.get(i);
						    	  change(temp);
						      }else if(typeOfDo.equals("delete")){
						    	  temp = al.get(i);
						    	  delete(temp);
						      }else if(typeOfDo.equals("exit")){
						    	  break;
							}
				
			}else{
			    	  System.out.println("Oops ... no data found");
			    	  break;
			      }
				}
			}
	public static void change(Client a){
			String changeType =changeText();
			if(changeType.equals("clientname")){
				System.out.println("Client name is " +a.getName()+" now. Enter please new client name");
				String clientname = sc.next();
				a.setName(clientname);
			}else if(changeType.equals("petname")){
				System.out.println("Pet name is " +a.getPet().getPetname()+" now. Enter please new pet name");
				String petname = sc.next();
				a.setName(petname);
			}else if(changeType.equals("petType")){
				System.out.println("Pet type is " +a.getPet().getPetType()+" now. Enter please new pet type (available types: cat or dog)");
				String petType = sc.next();
				while(true){
				if(petType.equals("cat")){
					a = new Client(a.getName(), new Cat(a.getPet().getPetname(), petType));
					break;
				}else if (petType.equals("dog")){
					a = new Client(a.getName(), new Cat(a.getPet().getPetname(), petType));
					break;
				}else{
					System.out.println("Add please pet type.(available types: cat or dog)");
					 petType = sc.next();
				}
			}
		}
	}
    public static void delete(Client a){
			al.remove(a);
			//System.out.println(al.size());
		}
	public static String searchText(){
			System.out.println("Enter please, type of search\n"+ 
					"available types by petname or clientname\n"+
					"search by petname enter \"petname\"\n"+
					"search by clientname enter \"clientname\"");
			String typeOfSearch = sc.next();
			while(true){
				if(typeOfSearch.equals("petname")|| typeOfSearch.equals("clientname")){
					break;
				}else{
					System.out.println("Enter please, type of search\n"+ 
							"available types by petname or clientname\n"+
							"search by petname enter \"petname\"\n"+
							"search by clientname enter \"clientname\"");
					        typeOfSearch = sc.next();
				}
		}
			return typeOfSearch;
}
	public static String changeText(){
	System.out.println("Enter please, what we need to change\n"+ 
			"change client name enter \"clientname\" \n"+
			"change pet name enter \"petname\"\n"+
			"change pet type enter \"petType\"");
	String typeOfChange = sc.next();
	while(true){
		if(typeOfChange.equals("petname")|| typeOfChange.equals("clientname")|| typeOfChange.equals("petType")){
			break;
		}else{
			System.out.println("Enter please, type of search\n"+ 
					"available types by petname or clientname\n"+
					"search by petname enter \"petname\"\n"+
					"search by clientname enter \"clientname\"");
			        typeOfChange = sc.next();
		}
}
	return typeOfChange;
}
}