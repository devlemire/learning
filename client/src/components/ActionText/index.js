import PropTypes from 'prop-types'

//Components
import { Typography } from '@material-ui/core'

//Styles
import styled from 'styled-components'
import colors from 'shared/styles/colors'

const ActionText = styled(({ children, classes, ...props }) => {
  return (
    <Typography variant={"body1"} classes={{ root: 'root' }} {...props}>
      {children}
    </Typography>
  )
})`
  &.root {
    color: ${colors.blue};
    text-decoration: underline;
    cursor: pointer;
    user-select: none;
  }
`

ActionText.propTypes = {
  onClick: PropTypes.func.isRequired
}

export default ActionText

