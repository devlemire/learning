import { BrowserRouter } from "react-router-dom";
import 'typeface-roboto';

// Utils
import routes from 'utils/routes'

export default function App() {
  return (
    <BrowserRouter>
      {routes}
    </BrowserRouter>
  )
}