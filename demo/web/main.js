console.log("start from Jss ")

fetch("http://localhost:8080/cal", {
    method: "POST",
    headers: {
        "Content-Type": "application/json"
    },
    body: JSON.stringify({ age: 25 }) // Replace 25 with any desired age
})
    .then(response => {
        if (!response.ok) {
            throw new Error("Network response was not ok");
        }
        return response.text(); // Because LocalDate is returned as plain text
    })
    .then(data => {
        document.getElementById("a").innerHTML = data;
        console.log("Calculated Date of Birth:", data);
    })
    .catch(error => {
        console.error("There was a problem with the fetch operation:", error);
    });