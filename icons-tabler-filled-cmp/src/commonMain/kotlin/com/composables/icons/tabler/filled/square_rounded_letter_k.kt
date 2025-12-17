package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedLetterK: ImageVector
    get() {
        if (_SquareRoundedLetterK != null) return _SquareRoundedLetterK!!
        
        _SquareRoundedLetterK = ImageVector.Builder(
            name = "square-rounded-letter-k",
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
                moveToRelative(2.854f, 5.151f)
                arcToRelative(1f, 1f, 0f, false, false, -1.378f, 0.318f)
                lineToRelative(-2.152f, 3.443f)
                verticalLineToRelative(-2.913f)
                arcToRelative(1f, 1f, 0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-2.914f)
                lineToRelative(2.152f, 3.444f)
                arcToRelative(1f, 1f, 0f, false, false, 1.276f, 0.374f)
                lineToRelative(0.102f, -0.056f)
                lineToRelative(0.095f, -0.068f)
                arcToRelative(1f, 1f, 0f, false, false, 0.223f, -1.31f)
                lineToRelative(-2.17f, -3.47f)
                lineToRelative(2.17f, -3.47f)
                arcToRelative(1f, 1f, 0f, false, false, -0.318f, -1.378f)
            }
        }.build()
        
        return _SquareRoundedLetterK!!
    }

private var _SquareRoundedLetterK: ImageVector? = null

