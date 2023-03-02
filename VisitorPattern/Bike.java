package VisitorPattern;

import java.util.ArrayList;
import java.util.List;
public class Bike implements Visitable {
 private List<Visitable> bikeParts = new ArrayList<Visitable>();
 @Override
 public void accept(Visitor visitor) {

 visitor.visit(this);
 for(Visitable part : bikeParts){
 part.accept(visitor);
 }

 }
 public void addBikePart(Visitable part) {
 bikeParts.add(part);
 }
}
