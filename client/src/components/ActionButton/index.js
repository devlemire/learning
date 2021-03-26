import PropTypes from 'prop-types'
import styled from "styled-components";

//Components
import { Button } from "@material-ui/core";

//Styles
import colors from "shared/styles/colors";

const ActionButton = styled(({ children, classes, ...props }) => {
  return (
    <Button classes={{ root: 'root' }} {...props}>
      {children}
    </Button>
  )
})`
  &.root {
    background-color: ${colors.blue};
    
    &:hover {
      background-color: ${colors.darkBlue};
    }
  }
`

ActionButton.propTypes = {
  onClick: PropTypes.func.isRequired
}

export default ActionButton