package structural.decorator.color;

//concrete component of the base interface
class Black implements Color{
    @Override
    public void fill(){
        System.out.println("Black color");
    }
}
