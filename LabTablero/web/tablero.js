/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var canvas = document.getElementById("myCanvas");
var context = canvas.getContext("2d");
canvas.addEventListener("mousedown", drawLine, false);
canvas.addEventListener("mouseup", endDrawLine, false);
var clearButton = document.getElementById("clear");
clearButton.addEventListener("click", clear, false);
//Funcion que toma las coordenadas x y y
function getCurrentPos(evt) {
var rect = canvas.getBoundingClientRect();
return {
x: evt.clientX - rect.left,
y: evt.clientY - rect.top
};
}

function drawLine(evt) {
    canvas.addEventListener("mousemove", defineImage, false);
}
function endDrawLine(evt) {
    canvas.removeEventListener("mousemove", defineImage, false);
}
//Funcion para tomar el color y la forma desde el formulario HTML5
function defineImage(evt) {
var currentPos = getCurrentPos(evt);
for (i = 0; i < document.inputForm.color.length; i++) {
if (document.inputForm.color[i].checked) {
var color = document.inputForm.color[i];
break;
}
}
for (i = 0; i < document.inputForm.shape.length; i++) {
if (document.inputForm.shape[i].checked) {
var shape = document.inputForm.shape[i];
break;
}
}
//Armamos la estructura del JSON a usar
var json = JSON.stringify({
"clearFlag": false,
"shape": shape.value,
"color": color.value,
"coords": {
"x": currentPos.x,
"y": currentPos.y
}
});
drawImageText(json);
sendText(json);
}
function drawImageText(image) {
var json = JSON.parse(image);
context.fillStyle = json.color;
switch (json.shape) {
case "circle":
context.beginPath();
context.arc(json.coords.x, json.coords.y, 5, 0, 2 * Math.PI, false);
context.fill();
break;
case "square":
default:
context.fillRect(json.coords.x, json.coords.y, 10, 10);
break;
}
}

function clear() {
    var json = JSON.stringify({"clearFlag": true});
    clearBoard(json);
    sendText(json);
}

function clearBoard(clearFlag) {
    var json = JSON.parse(clearFlag);
    if (json.clearFlag) {
        context.clearRect(0, 0, canvas.width, canvas.height);
    }
}

function descargar(){
    
    if (canvas.msToBlob){ //para internet explorer
        var filename = prompt("Guardar imagen como: ","Nombre del archivo");
        var blob = canvas.msToBlob();
        window.navigator.msSaveBlob(blob, filename + ".png" );
    } else {        
        var dato = canvas.toDataURL("image/png");
        dato = dato.replace("image/png", "image/octet-stream;base64");
        document.location.href = dato;
    }
}

function myFunction(e) {
    x = e.clientX;
    y = e.clientY;
    coor = "Coordenadas: (" + x + "," + y + ")";
    document.getElementById("demo").innerHTML = coor
}