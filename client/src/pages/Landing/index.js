// Styles
import { PageContainer, Content, FlexStartCenter } from 'shared/styles'
import { Header } from './style'

// Components
import { Typography } from '@material-ui/core'
import ActionText from 'components/ActionText'
import ActionButton from "components/ActionButton";

export default function Landing() {
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
        <Typography variant={"body1"}>Not logged in :(</Typography>
      </Content>
    </PageContainer>
  )
}