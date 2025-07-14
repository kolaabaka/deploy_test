async function fetchHello() {
    const response = await fetch('http://localhost:80/api/hello',{
		mode: 'no-cors'
	});
    const text = await response.text();
    document.getElementById('response').innerText = text;
}