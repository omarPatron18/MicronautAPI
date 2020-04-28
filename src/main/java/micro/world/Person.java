package micro.world;

import javax.inject.Singleton;

@Singleton
public class Person {
 private Integer id;
 private String name;
 private String fechaInicio;
 private String fechaFinal;
 private String descripcion;

 public Integer getId() {
 return id;
 }
 
 public void setId(Integer id) {
 this.id = id;
 }
 
 public String getName() {
 return name;
 }
 
 public void setName(String name) {
 this.name = name;
 }
 
public String getDescripcion() {
 return descripcion;
 }
 
 public void setDescripcion(String descripcion) {
 this.descripcion = descripcion;
 }

 public String getFechaInicio() {
 return fechaInicio;
 }
 
 public void setFechaInicio(String fechaInicio) {
 this.fechaInicio = fechaInicio;
 } 

 public String getFechaFinal() {
 return fechaFinal;
 }
 
 public void setFechaFinal(String fechaFinal) {
 this.fechaFinal = fechaFinal;
 } 

}