package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedLetterV: ImageVector
    get() {
        if (_SquareRoundedLetterV != null) return _SquareRoundedLetterV!!
        
        _SquareRoundedLetterV = ImageVector.Builder(
            name = "square-rounded-letter-v",
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
                moveToRelative(2.567f, 5.029f)
                arcToRelative(1f, 1f, 0f, false, false, -1.213f, 0.727f)
                lineToRelative(-1.03f, 4.118f)
                lineToRelative(-1.03f, -4.118f)
                arcToRelative(1f, 1f, 0f, true, false, -1.94f, 0.486f)
                lineToRelative(2f, 8f)
                curveToRelative(0.252f, 1.01f, 1.688f, 1.01f, 1.94f, 0f)
                lineToRelative(2f, -8f)
                arcToRelative(1f, 1f, 0f, false, false, -0.727f, -1.213f)
            }
        }.build()
        
        return _SquareRoundedLetterV!!
    }

private var _SquareRoundedLetterV: ImageVector? = null

