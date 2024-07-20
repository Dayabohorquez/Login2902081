package co.edu.sena.login2902081.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.sena.login2902081.R
import co.edu.sena.login2902081.ui.theme.BgColor
import co.edu.sena.login2902081.ui.theme.Primary
import co.edu.sena.login2902081.ui.theme.componentShape

@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = colorResource(id = R.color.colorText),
        textAlign = TextAlign.Center
    )
}

@Composable
fun MyTextFieldComponent(labelValue: String, painterResource: Painter) {
    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        label = { Text(text = labelValue) },
        value = textValue.value,
        onValueChange = {
            textValue.value = it
        },
        leadingIcon = {
            Icon(painter = painterResource, contentDescription = "")
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Primary,
            focusedLabelColor = Primary,
            cursorColor = Primary
        ),
        keyboardOptions = KeyboardOptions.Default,
        modifier = Modifier
            .fillMaxWidth()
            .background(BgColor)
            .clip(componentShape.small)
    )
}
