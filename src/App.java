//code organization using packages

//imported package... added class name as an extension to import that specific class from the specified package
import ocean.Fish;
import ocean.plants.Seaweed;

//global import from the package ends in * instead of class name... Ex: import ocean.* <-- imports everything in Ocean package

//ctrl+shift+o keyboard shortcut in Eclipse to auto import needed packages

public class App {

	public static void main(String[] args) {
		Fish fish = new Fish();
		Seaweed seaweed = new Seaweed();

	}

}
//something wrong with tutorial video for packages so it'll be cut short. This is generally how packages are used anyways.