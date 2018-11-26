package package4;
	
	
	import java.io.IOException;
	import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
	import java.util.List;
import java.util.Map;

	public class RunWebsite  {
		
		public static void main(String[] args) throws IOException {
			
			 Website web1 = new About("About", "https://website/about/1.com", "this id content");
			 Website web2 = new About2("About", "https://website/about/2.com", "About2 page content");
			 Website web3 = new ForumPage1("Forum", "https://website/forum/1.com", "Forum1page content");
			 Website web4 = new ForumPage2("Forum", "https://website/forum/2.com", "Forum2page content");
			 Website web5 = new HomePage("Home", "https://website/home.com", "HomePage content");
			 Website web6 = new LogInPage("LogInPage", "https://website/loginPage.com", "LoginPage content");
			 
			 
			 HashSet <String> distinctTitles = new HashSet <String>();
			 
			 distinctTitles.add(web1.getPageTitle());
			 distinctTitles.add(web2.getPageTitle());
			 distinctTitles.add(web3.getPageTitle());
			 distinctTitles.add(web4.getPageTitle());
			 distinctTitles.add(web5.getPageTitle());
			 distinctTitles.add(web6.getPageTitle());
			 
			 ArrayList<String> htmlBuilder = new ArrayList<>();
		 
			 htmlBuilder.add(web1.getContent("About1Page"));
			 htmlBuilder.add(web1.getContent("About2Page"));
			 htmlBuilder.add(web1.getContent("Forum1Page"));
			 htmlBuilder.add(web1.getContent("Forum2Page"));
			 htmlBuilder.add(web1.getContent("HomePage"));
			 htmlBuilder.add(web1.getContent("LogInPage"));
			 
			
			 
			 ArrayList<Website> chromeWebsite1 = new ArrayList<>();
			 ArrayList<Website> ffWebsite1 = new ArrayList<>();
			 List<Website> listWebsite1 = new ArrayList<>();
			 
			    listWebsite1.add(web1);
				listWebsite1.add(web2);
				listWebsite1.add(web3);
				listWebsite1.add(web4);
				listWebsite1.add(web5);
				listWebsite1.add(web6);
				
				
				Map<String,ArrayList> webMap = new HashMap<String,ArrayList>();
				for( int i=0;i<listWebsite1.size();i++) {
					String title = listWebsite1.get( i ).title;
					if( webMap.get(title) == null ) {
						 ArrayList<Website> newArrayMap = new ArrayList<>();
						 newArrayMap.add(listWebsite1.get( i ) );
						 webMap.put(title, newArrayMap );
					} else {
						webMap.get( title ).add( listWebsite1.get( i ) );
					}

					
				}
				
				
				System.out.println("All pages: "+ listWebsite1);
				System.out.println("-----------------------------------------------------------");
		 
		for (int x=0;  x<listWebsite1.size(); x++) {
			listWebsite1.get(x).isInst(ffWebsite1, chromeWebsite1);	
		}
		
		System.out.println("Opened in Ch: " + chromeWebsite1.toString());
		System.out.println("Opened in FF: " + ffWebsite1.toString());
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("HtmlBuilder: " + htmlBuilder);
	

		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Distinct titles: " + distinctTitles);
		System.out.println("-----------------------------------------------------------");
		
		System.out.println(webMap.toString());
		System.out.println("-------------------------------------------------");	
		
		for (Map.Entry<String,ArrayList> entry : webMap.entrySet()) {
			ArrayList values = entry.getValue();
			for( int i = 0;i<values.size();i++) {
				  System.out.println(((Website) values.get(i)).title+  "This page at Chrome = " + ((Website) values.get(i)).getHtmlChrome());	
				  System.out.println(((Website) values.get(i)).title+ "This page at FF = " + ((Website) values.get(i)).getHtmlFF());	
			}
			
			  System.out.println("-------------------------------------------------");	 
		}
			
		
		}

}
	
