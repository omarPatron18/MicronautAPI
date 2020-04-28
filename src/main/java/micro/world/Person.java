package micro.world;

import javax.inject.Singleton;

@Singleton
public class Person {
 private Integer id;
 private String poc;
 private String fechainicio;
 private String fechafinal;
 private String descripcion;

 public Integer getId() {
 return id;
 }
 
 public void setId(Integer id) {
 this.id = id;
 }
 
 public String getPoc() {
 return poc;
 }
 
 public void setPoc(String poc) {
 this.poc = poc;
 }
 
public String getDescripcion() {
 return descripcion;
 }
 
 public void setDescripcion(String descripcion) {
 this.descripcion = descripcion;
 }

 public String getFechainicio() {
 return fechainicio;
 }
 
 public void setFechainicio(String fechainicio) {
 this.fechainicio = fechainicio;
 } 

 public String getFechafinal() {
 return fechafinal;
 }
 
 public void setFechafinal(String fechafinal) {
 this.fechafinal = fechafinal;
 } 

}