function caturarDatosLogin(){

    var usuario = document.getElementById("login-usuario").value;
    var contrasena = document.getElementById("login-contrasena").value;

    if(usuario != "" && contrasena != ""){

        console.log("<-- Pruebas Captura Login -->");
        console.log("Usuario:" + usuario);
        console.log("Contraseña:" +  contrasena);

        alert("${usuario.usuario}");
        limpiarFormulario("form-login");
        menuPrincipal();

    }
    else{

        alert("Debes Ingresar los Datos")
    }

    
}

function caturarDatosResgistrarUsuario(){

    var cedula = document.getElementById("ru-cedula").value;
    var nombres = document.getElementById("ru-nombres").value;
    var apellidos = document.getElementById("ru-apellidos").value;
    var area = document.getElementById("ru-area").value;
    var usuario = document.getElementById("ru-usuario").value;
    var contrasena = document.getElementById("ru-contrasena").value;

        console.log("<-- Pruebas Captura Registrar Usuario -->");
        console.log("Cedula:" + cedula);
        console.log("Nombres:" +  nombres);
        console.log("Apellidos:" + apellidos);
        console.log("Area:" +  area);
        console.log("Usuario:" + usuario);
        console.log("Contraseña:" +  contrasena);

        limpiarFormulario("form-registrarUsuario");
    
}

function caturarDatosIngresarElemento(){

    var placa = document.getElementById("ingr-placa").value;
    var nombre = document.getElementById("ingr-nombre").value;
    var modelo = document.getElementById("ingr-modelo").value;
    var serial = document.getElementById("ingr-serial").value;
    var ubicacion = document.getElementById("ingr-ubicacion").value;
    var asignacion = document.getElementById("ingr-asignacion").value;
    var estado = document.getElementById("ingr-estado").value;

        console.log("<-- Pruebas Captura Ingresar Elemento -->");
        console.log("Placa:" + placa);
        console.log("Nombre:" +  nombre);
        console.log("Modelo:" + modelo);
        console.log("Serial:" +  serial);
        console.log("Ubicacion:" + ubicacion);
        console.log("Asignacion:" +  asignacion);
        console.log("Estado:" +  estado);

        limpiarFormulario("form-ingresarElemento");
    
}

function caturarDatosBuscarElemento(){

    var placa = document.getElementById("busc-placa").value;

        //console.log("<-- Pruebas Captura Buscar Elemento -->");
        //console.log("Placa:" + placa);
            limpiarFormulario("form-buscarElemento");        
    
}

function caturarDatosActualizarElemento(){

    var placa = document.getElementById("ingr-placa").value;
    var nombre = document.getElementById("ingr-nombre").value;
    var modelo = document.getElementById("ingr-modelo").value;
    var serial = document.getElementById("ingr-serial").value;
    var ubicacion = document.getElementById("ingr-ubicacion").value;
    var asignacion = document.getElementById("ingr-asignacion").value;
    var estado = document.getElementById("ingr-estado").value;

        console.log("<-- Pruebas Captura Ingresar Elemento -->");
        console.log("Placa:" + placa);
        console.log("Nombre:" +  nombre);
        console.log("Modelo:" + modelo);
        console.log("Serial:" +  serial);
        console.log("Ubicacion:" + ubicacion);
        console.log("Asignacion:" +  asignacion);
        console.log("Estado:" +  estado);

        limpiarFormulario("form-ingresarElemento");
    
}

function caturarDatosEliminarElemento(){

    var placa = document.getElementById("ingr-placa").value;
    var nombre = document.getElementById("ingr-nombre").value;
    var modelo = document.getElementById("ingr-modelo").value;
    var serial = document.getElementById("ingr-serial").value;
    var ubicacion = document.getElementById("ingr-ubicacion").value;
    var asignacion = document.getElementById("ingr-asignacion").value;
    var estado = document.getElementById("ingr-estado").value;

        console.log("<-- Pruebas Captura Ingresar Elemento -->");
        console.log("Placa:" + placa);
        console.log("Nombre:" +  nombre);
        console.log("Modelo:" + modelo);
        console.log("Serial:" +  serial);
        console.log("Ubicacion:" + ubicacion);
        console.log("Asignacion:" +  asignacion);
        console.log("Estado:" +  estado);

        limpiarFormulario("form-ingresarElemento");
    
}