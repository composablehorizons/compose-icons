package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedLetterN: ImageVector
    get() {
        if (_SquareRoundedLetterN != null) return _SquareRoundedLetterN!!
        
        _SquareRoundedLetterN = ImageVector.Builder(
            name = "square-rounded-letter-n",
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
                moveToRelative(-0.782f, 5.552f)
                curveToRelative(-0.471f, -0.944f, -1.894f, -0.608f, -1.894f, 0.447f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-3.764f)
                lineToRelative(2.106f, 4.211f)
                curveToRelative(0.471f, 0.944f, 1.894f, 0.608f, 1.894f, -0.447f)
                verticalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(3.764f)
                close()
            }
        }.build()
        
        return _SquareRoundedLetterN!!
    }

private var _SquareRoundedLetterN: ImageVector? = null

