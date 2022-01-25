package Pattern.Composite;

import Pattern.VisitorGame.AcceptVisitor;
import Pattern.VisitorGame.StateVisit;

import java.util.ArrayList;
import java.util.List;

/** "Komposition" */
public class ElementComposite implements Component {

    private List<Component> childComponents = new ArrayList<Component>();
    private final String name;

    public ElementComposite(String name){
        this.name = name;
    }

    @Override
    public void printBoardElements() {
        System.out.print("Your " + this.name + " board consists of: ");
        for (Component component : childComponents) {
            component.printBoardElements();
            if(childComponents.indexOf(component) == childComponents.size() - 1){
                System.out.println("");
            }
            else{
                System.out.print(", ");
            }
        }
    }

    @Override
    public int getPoints() {
        return 0;
    }

    public void add(Component component) {
        childComponents.add(component);
    }

    public void remove(Component component) {
        childComponents.remove(component);
    }

    public List<Component> getComponentList(){
        return childComponents;
    }


}
