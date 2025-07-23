async function fetchHello() {
    const response = await fetch('/api/hello',{
		mode: 'no-cors'
	});
    const text = await response.text();
    document.getElementById('response').innerText = text;
}