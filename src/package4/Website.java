package package4;

public abstract class Website extends IsInstance {
	
	
	protected String title;
	protected String url;
	protected String content;
    
    
	public Website (String title, String url, String content) {
			super();
			this.title=title;
			this.url=url;
			this.content = this.getContent( content );
	 }
	 
	public String getHtmlContent() {
		// TODO Auto-generated method stub
		return null;
	}
	public abstract String getHtmlChrome();
	public abstract String getHtmlFF();
	public abstract String getPageTitle();
	public abstract void LoadPage();
	public abstract void ReloadPage();
	

	@Override
	public String toString() {
	    return "Website [title=" + title + ", url=" + url + "]"+content;
	}
	
	public String getMyContent() {
		return this.content;
	}





}
