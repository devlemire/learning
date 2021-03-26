import PropTypes from 'prop-types'

// Styles
import { PageContainer, Content, FlexStartCenter } from 'shared/styles'
import { Header } from './style'

// Components
import { Typography } from '@material-ui/core'
import ActionText from 'components/ActionText'
import ActionButton from "components/ActionButton";

// Redux
import { connect } from 'react-redux'

function Landing({
  // Redux
  userFetched,
  user
}) {
  return (
    <PageContainer>
      <Header>
        <Typography variant={"h5"}>JustDoIt</Typography>

        <FlexStartCenter>
          <ActionText onClick={() => {}} style={{ marginRight: '16px' }}>
            Login
          </ActionText>

          <ActionButton onClick={() => {}} variant={"contained"} color={"primary"}>
            Sign Up
          </ActionButton>
        </FlexStartCenter>
      </Header>

      <Content>
        <Typography variant={"body1"}>{userFetched ? user?.firstName : "Loading..."}</Typography>
      </Content>
    </PageContainer>
  )
}

Landing.propTypes = {
  userFetched: PropTypes.bool.isRequired,
  user: PropTypes.object
}

export default connect(state => {
  const { auth } = state;

  return {
    ...auth
  }
}, {})(Landing)

