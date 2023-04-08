/*
- Replica el ejercicio completo del vídeo
- Añade dos párrafos más en cada una de las secciones
- Pon un icono de papelera para eliminar párrafos 
(Esta imagen puede valer: https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSMWeEC0tULzOjfWFAOdOHjUw9WjXhBDbirg&usqp=CAU)
- Añade el código necesario para que al arrastrar un fragmento del puzzle a la papelera, éste se elimine
*/

const parrafos = document.querySelectorAll(".parrafo");
const secciones = document.querySelectorAll(".seccion");
const papelera = document.querySelector(".papelera");

parrafos.forEach(parrafo => {
    parrafo.addEventListener("dragstart", event => {
        console.log(`Estoy arrastrando el párrafo ${parrafo.innerHTML}`);
        parrafo.classList.add("dragging");
        event.dataTransfer.setData("p-id", parrafo.id);
        event.dataTransfer.setData("s-id", parrafo.parentElement.id);
    })
    parrafo.addEventListener("dragend", () => {
        parrafo.classList.remove("dragging");
    })
})

secciones.forEach(seccion => {
    seccion.addEventListener("dragover", event => {
        event.preventDefault();
        event.dataTransfer.dropEffect = "move";
    })
    seccion.addEventListener("drop", event => {
        console.log('dropping');
        const parrafoId = event.dataTransfer.getData("p-id");
        seccion.appendChild(document.getElementById(parrafoId));
    })
})

papelera.addEventListener("dragover", event => {
    event.preventDefault();
    event.dataTransfer.dropEffect = "link";
})
papelera.addEventListener("drop", event => {
    console.log('Deleting');
    const parrafoId = event.dataTransfer.getData("p-id");
    const seccionId = event.dataTransfer.getData("s-id");
    document.getElementById(seccionId).removeChild(document.getElementById(parrafoId));
})