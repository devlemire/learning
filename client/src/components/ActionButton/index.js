import PropTypes from 'prop-types'
import styled from "styled-components";
import { Button } from "@material-ui/core";

const ActionButton = styled(({ children, classes, ...props }) => {
  return (
    <Button classes={{ root: 'root' }} {...props}>
      {children}
    </Button>
  )
})`
  &.root {
    
  }
`

ActionButton.propTypes = {
  onClick: PropTypes.func.isRequired
}

export default ActionButton