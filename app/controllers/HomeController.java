package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

      public Result welcomePage() {
        return ok(welcomePage.render("Welcome Page"));
    }
      public Result characters() {
        return ok(characters.render("Characters"));
    }
      public Result hobbit() {
        return ok(hobbit.render("hobbit"));
    }
      public Result hobbitbook() {
        return ok(hobbitbook.render("hobbitbook"));
    }
      public Result tolkien() {
        return ok(tolkien.render("Tolkien"));
    }
      public Result lotr() {
        return ok(lotr.render("lotr"));
    }
      public Result lotrbook() {
        return ok(lotrbook.render("lotrbook"));
    }
      public Result map_lotr() {
        return ok(map_lotr.render("Welcome Page"));
    }

}
