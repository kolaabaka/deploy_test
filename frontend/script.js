async function fetchHello() {
    const response = await fetch('http://backend:5000/hello');
    const text = await response.text();
    document.getElementById('response').innerText = text;
}