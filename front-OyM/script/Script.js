const url = "http://localhost:8080/user/home";

fetch(url, {
  method: "GET",
  headers: {
    "Content-Type": "application/json",
  },
})
  .then(response => {
    if (!response.ok) {
      throw new Error("Error en la solicitud");
    }
    return response.text(); // Puedes usar response.json() si la respuesta es JSON
  })
  .then(data => {
    console.log("Contenido de la respuesta:", data);
  })
  .catch(error => {
    console.error("Error en la solicitud:", error);
  });
