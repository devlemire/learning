import { Switch, Route } from 'react-router-dom'

// Components
import Landing from "pages/Landing";

export default (
  <Switch>
    <Route exact path="/" component={Landing} />
  </Switch>
)