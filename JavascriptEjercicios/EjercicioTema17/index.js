/*
- Crea un mapa en HTML
- Pon chinchetas en tus 3 lugares favoritos del planeta tierra
*/

let map;
// Initialize and add the map
function initMap() {
    // The location of Concept
    const place1 = { lat: -24.786062, lng: -65.425687 };
    const place2 = { lat: -0.476442, lng: -76.311617 };
    const place3 = { lat: 36.727170, lng: -3.735539 };
    // The map, centered at concept
    map = new google.maps.Map(document.getElementById("map"), {
        zoom: 2,
        center: place1,
    });
    const svgMarker = {
        path: "M-1.547 12l6.563-6.609-1.406-1.406-5.156 5.203-2.063-2.109-1.406 1.406zM0 0q2.906 0 4.945 2.039t2.039 4.945q0 1.453-0.727 3.328t-1.758 3.516-2.039 3.070-1.711 2.273l-0.75 0.797q-0.281-0.328-0.75-0.867t-1.688-2.156-2.133-3.141-1.664-3.445-0.75-3.375q0-2.906 2.039-4.945t4.945-2.039z",
        fillColor: "green",
        fillOpacity: 0.6,
        strokeWeight: 0,
        rotation: 0,
        scale: 2,
        anchor: new google.maps.Point(0, 20),
    };
    // The marker, positioned at places
    const marker1 = new google.maps.Marker({
        position: place1,
        map: map, 
        icon: svgMarker
    });
    const marker2 = new google.maps.Marker({
        position: place2,
        map: map, 
        icon: svgMarker
    });
    const marker3 = new google.maps.Marker({
        position: place3,
        map: map, 
        icon: svgMarker
    });
    geoposiciona();
}

// Obtener la geolocalizacion
// marker.setPosition({ lar, lng })
function geoposiciona(){
    if (navigator.geolocation){
        const geolocalizacion = navigator.geolocation;
        const options = {timeout: 60000};
        const watchPos = geolocalizacion.watchPosition(centrarMapa, onError, options)
    } else {
        alert("Tu navegador no admite geolocalización");
    }
    
}

function centrarMapa(position){
    const nuevaPos = {
        lat: position.coords.latitude, 
        lng: position.coords.longitude
    }
    console.log('nuevaPos :>> ', nuevaPos);
    map.setCenter(nuevaPos);
}

function onError(error){
    console.error(error);
}
