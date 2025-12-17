package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedLetterM: ImageVector
    get() {
        if (_SquareRoundedLetterM != null) return _SquareRoundedLetterM!!
        
        _SquareRoundedLetterM = ImageVector.Builder(
            name = "square-rounded-letter-m",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.676f, 2.001f)
                lineToRelative(0.324f, -0.001f)
                curveToRelative(7.752f, 0f, 10f, 2.248f, 10f, 10f)
                lineToRelative(-0.005f, 0.642f)
                curveToRelative(-0.126f, 7.235f, -2.461f, 9.358f, -9.995f, 9.358f)
                lineToRelative(-0.642f, -0.005f)
                curveToRelative(-7.13f, -0.125f, -9.295f, -2.395f, -9.358f, -9.67f)
                verticalLineToRelative(-0.325f)
                curveToRelative(0f, -7.643f, 2.185f, -9.936f, 9.676f, -9.999f)
                moveToRelative(4.324f, 5.999f)
                curveToRelative(0f, -1.014f, -1.336f, -1.384f, -1.857f, -0.514f)
                lineToRelative(-2.143f, 3.57f)
                lineToRelative(-2.143f, -3.57f)
                curveToRelative(-0.521f, -0.87f, -1.857f, -0.5f, -1.857f, 0.514f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-4.39f)
                lineToRelative(1.143f, 1.904f)
                lineToRelative(0.074f, 0.108f)
                arcToRelative(1f, 1f, 0f, false, false, 1.64f, -0.108f)
                lineToRelative(1.143f, -1.904f)
                verticalLineToRelative(4.39f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                close()
            }
        }.build()
        
        return _SquareRoundedLetterM!!
    }

private var _SquareRoundedLetterM: ImageVector? = null

