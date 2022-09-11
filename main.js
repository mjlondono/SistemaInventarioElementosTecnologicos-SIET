
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

    menu = document.getElementById("div-menuBuscarElemento")
    menu.style.display="none";  

    menu = document.getElementById("div-menuPrincipal");
    menu.style.display="inline";  

}

function cerrarSesion(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-login")
    menu.style.display="inline";

}

function registrarUsuario(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-menuRegistrarUsuario")
    menu.style.display="inline";

    menu = document.getElementById("div-registrarUsuario")
    menu.style.display="inline";

}

function ingresarElemento(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-menuIngresarElemento")
    menu.style.display="inline";

    menu = document.getElementById("div-ingresarElemento")
    menu.style.display="inline";

}

function buscarElemento(){

    var menu;
    menu = document.getElementById("div-menuPrincipal")
    menu.style.display="none";

    menu = document.getElementById("div-menuBuscarElemento")
    menu.style.display="inline";

    menu = document.getElementById("div-buscarElemento")
    menu.style.display="inline";

}

function eliminarElemento(){

    alert("¿ Desea Eliminar Este Elemento Placa: 1 ?");
}

function editarElemento(){

    alert("Voy Editar Este Elemento");
}