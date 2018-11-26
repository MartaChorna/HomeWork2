package package4;



public class HomePage extends Website implements FF, Chrome {

	public HomePage(String title, String url, String content) {
		super(title, url, content);
		super.title=title;
		super.url = url;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getHtmlContent() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return "Home";
	}

	@Override
	public void LoadPage() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ReloadPage() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean OpensInFF(String title) {
		// TODO Auto-generated method stub
		return false;
	
	}

	@Override
	public boolean OpensInChrome(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getHtmlChrome() {
		if ( this instanceof  Chrome ) {
			return this.getMyContent();
		} else {
			return "This page doesn't support FF browser";
		}
	}
	
	

	@Override
	public String getHtmlFF() {
		if ( this instanceof  FF ) {
			return this.getMyContent();
		} else {
			return "This page doesn't support Chrome browser";
		}
	}

}