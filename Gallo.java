public class Gallo{
  Integer altura;
  Integer peso;
  String  nombre;
  String color;

  public Gallo (){
  }

  public Gallo(Integer altura,Integer peso,String nombre,String color){
    this.altura=altura;
    this.peso=peso;
    this.nombre=nombre;
    this.color=color; 
  }

  public void setAltura(Integer altura){
   this.altura=altura ;
  }

  public void setPeso(Integer peso){
    this.peso=peso; 
  }

  public void setNombre(String nombre){
    this.nombre=nombre; 
  }

  public void setColor(String color){
    this.color=color; 
  }

  public Integer getAltura(){
    return this.altura;
  }

  public Integer getPeso(){
    return this.peso;
  }

  public String getNombre(){
    return this.nombre;
  }

  public String getColor(){
    return this.color; 
  }

  @Override
    public String toString() {
        return "Gallo{" + "nombre=" + nombre + ", color=" +color  + ",altura=" + altura +", peso=" + peso +'}';
    }
  
}