import { useEffect } from 'react';

function App() {
    useEffect(() => {
        const asyncFetchStudents = async () => {
            const resp = await fetch('http://localhost:8080/api/v1/student')
            console.log('resp', resp)

            const result = await resp.json()

            console.log('result', result)
        }

        asyncFetchStudents();
    }, [])

  return (
    <div className="App">
      <p>Hello Worlddddddd</p>
    </div>
  );
}

export default App;
