
function menuPrincipal(){

    var menu;

    menu = document.getElementById("div-login")
    menu.style.display="none";

    menu = document.getElementById("div-registrarUsuario")
    menu.style.display="none";
    
    menu = document.getElementById("div-ingresarElemento")
    menu.style.display="none";    

    menu = document.getElementById("div-buscarElemento")
    menu.style.display="none"; 

    menu = document.getElementById("div-menuRegistrarUsuario")
    menu.style.display="none";

    menu = document.getElementById("div-menuIngresarElemento")
    menu.style.display="none";

    menu = document.getElementById("div-menuActualizarElemento")
    menu.style.display="none";

    menu = document.getElementById("div-menuBuscarElemento")
    menu.style.display="none";  

    menu = document.getElementById("div-menuPrincipal");
    menu.style.display="inline";  

}

function cerrarSesion(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    limpiarFormulario("form-login");

    menu = document.getElementById("div-login")
    menu.style.display="flex";

}

function registrarUsuario(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-menuRegistrarUsuario")
    menu.style.display="inline";

    menu = document.getElementById("div-registrarUsuario")
    menu.style.display="flex";

}

function ingresarElemento(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-menuIngresarElemento")
    menu.style.display="inline";

    menu = document.getElementById("div-ingresarElemento")
    menu.style.display="flex";

}

function buscarElemento(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-menuActualizarElemento")
    menu.style.display="none";

    menu = document.getElementById("div-actualizarElemento")
    menu.style.display="none";

    menu = document.getElementById("div-menuBuscarElemento")
    menu.style.display="inline";

    menu = document.getElementById("div-buscarElemento")
    menu.style.display="flex";

}

function actualizarElemento(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-buscarElemento")
    menu.style.display="none"; 

    menu = document.getElementById("div-menuBuscarElemento")
    menu.style.display="none";  

    menu = document.getElementById("div-menuActualizarElemento")
    menu.style.display="inline";

    menu = document.getElementById("div-actualizarElemento")
    menu.style.display="flex";
}

function eliminarElemento(){

    alert("¿ Desea Eliminar Este Elemento Placa: 1 ?");
}

function limpiarFormulario(myform) {
    document.getElementById(myform).reset();
}

function mainClickAction() {
    alert("Boton enviar clickeado")
   // executeAction()
}

function executeAction() {
    //cargar jQuery
    let action = document.getElementById("action_type").value
    let idWritten = document.getElementById("reference_id").value
    let entity = document.getElementById("type_entity").value
    //
    let controlador = "";
    switch (entity) {
        case "categorias":
            controlador = "cat";
            break;
        case "usuarios":
            controlador = "usu";
            break;
        case "productos":
            controlador = "pro";
            break;
        case "roles":
            controlador = "rol";
            break;
    }
    if (action == "eliminar" || action == "actualizar") {
        if (idWritten != "") {
            let url = "http://localhost:5000/" + controlador + "/" + action + "/" + idWritten
            window.location = url;
        } else {
            alert("Por favor introduzca el id para eliminar.");
        }
    } else {
        let url = "http://localhost:5000/" + controlador + "/" + action + "/" + idWritten
        window.location = url;
    }
}

function imprimirInforme(informe){


    var contenido= document.getElementById(informe).innerHTML;
    
    var contenidoOriginal= document.body.innerHTML;

    document.body.innerHTML = contenido;

    window.print();

    document.body.innerHTML = contenidoOriginal;

}