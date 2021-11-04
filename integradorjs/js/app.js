

let container = document.getElementById("seccion");

const comprarTicket=()=>{
    container.innerHTML=`
        <div id="js" class="container">
            <div class="row">
                <div class="col col-md-10 offset-md-1 col-lg-8 offset-lg-2 pt-2">
                    <div class="card-group">
                        <div class="card">
                            <div class="card-body border border-primary mr-1">
                                <h5 class="card-title text-center">Estudiantes</h5>
                                <p class="card-text text-center">Tienen un descuento</p>
                                <p class="card-title text-center font-weight-bold">80%</p>
                                <p class="card-text text-center">
                                    <small class="text-muted">
                                        * presentar documentación
                                    </small>
                                </p>
                            </div>
                        </div>
                        <div class="card">
                        <div class="card-body border border-info mr-1">
                            <h5 class="card-title text-center">Trainee</h5>
                            <p class="card-text text-center">Tienen un descuento</p>
                            <p class="card-title text-center font-weight-bold">50%</p>
                            <p class="card-text text-center">
                                <small class="text-muted">
                                    * presentar documentación
                                </small>
                            </p>
                        </div>
                    </div>
                    <div class="card">
                    <div class="card-body border border-warning mr-1">
                        <h5 class="card-title text-center">Junior</h5>
                        <p class="card-text text-center">Tienen un descuento</p>
                        <p class="card-title text-center font-weight-bold">15%</p>
                        <p class="card-text text-center">
                            <small class="text-muted">
                                * presentar documentación
                            </small>
                        </p>
                    </div>
                </div>
                    </div>
                </div>            
            </div>
            <div class="row">
                <div class="col text-uppercase text-center">
                    <small>venta</small>
               <h2> Valor de ticket</h2>
                </div>
            </div>
            <div class="row">
                <div class="col col-md-10 offset-md-1 col-lg-8 offset-lg-2 pt-2">
                    <form>
                        <div class="form-row">
                            <div class="d-flex ">
                                <div class="form-group col-6 col-md-6 m-1">
                                    <input type="text" class="form-control" placeholder="Nombre"/>
                                </div>
                                <div class="form-group col-6 col-md-6 m-1">
                                    <input type="text" class="form-control" placeholder="Apellido"/>
                                </div>
                            </div>
                            <div class="form-group col-12 col-md-12 m-1">
                                <input type="email" class="form-control" placeholder="Correo"/> 
                            </div>
                            <div class="d-flex">
                                <div class="form-group col-6 col-md-6 m-1" >
                                    <label for="">Cantidad</label>
                                    <input id="cantidad" type="number" class="form-control" placeholder="Cantidad"/>
                                </div>
                                <div class="form-group col-6 col-md-6 m-1" >
                                <label for="">Categoria</label>
                                <select class="form-select" id="categoria">
                                    <option value="estudiante">Estudiante</option>
                                    <option value="trainee">Trainee</option>
                                    <option value="junior">Junior</option>
                                </select>
                                </div>
                            </div>

                        </div>
                        <div id= class="form-row">
                            <div class="alert alert-primary" role="alert" >
                            Cantidad a pagar: $
                            <span id="cantidadapagar" type="number">..</span>
                            </div>
                        </div>
                        <div class="form-row d-flex">
                       
                            <button class="btn btn-lg btn-primary col-6 m-1">Borrar</button>
                        
                       
                            <button id="resumen" type= "button" class="btn btn-lg btn-primary col-6 m-1"  onclick= "calcular()" ) >Resumen</button>
                        
                        </div>
                    </form>
                </div>
            </div>
        </div>

    `
}
  

    const calcular=()=> {
        let cantidad=document.getElementById("cantidad") 
        cantidad.value
        let categoria= document.getElementById("categoria")
        cantidad.value
        let resultado=0
         if( categoria.value == "estudiante") {resultado= parseInt(cantidad.value) *200 * 0.2} 
        else if( categoria.value == "trainee") { resultado= cantidad.value *200 *0.5}
        else if( categoria.value == "junior") { resultado= cantidad.value *200 *0.85}
       document.getElementById("cantidadapagar").innerHTML= resultado }
        

