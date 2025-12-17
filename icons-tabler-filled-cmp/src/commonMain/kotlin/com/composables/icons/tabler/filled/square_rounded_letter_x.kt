package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareRoundedLetterX: ImageVector
    get() {
        if (_SquareRoundedLetterX != null) return _SquareRoundedLetterX!!
        
        _SquareRoundedLetterX = ImageVector.Builder(
            name = "square-rounded-letter-x",
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
                moveToRelative(2.771f, 5.105f)
                arcToRelative(1f, 1f, 0f, false, false, -1.341f, 0.447f)
                lineToRelative(-1.106f, 2.21f)
                lineToRelative(-1.106f, -2.21f)
                arcToRelative(1f, 1f, 0f, false, false, -1.234f, -0.494f)
                lineToRelative(-0.107f, 0.047f)
                arcToRelative(1f, 1f, 0f, false, false, -0.447f, 1.341f)
                lineToRelative(1.774f, 3.553f)
                lineToRelative(-1.775f, 3.553f)
                arcToRelative(1f, 1f, 0f, false, false, 0.345f, 1.283f)
                lineToRelative(0.102f, 0.058f)
                arcToRelative(1f, 1f, 0f, false, false, 1.341f, -0.447f)
                lineToRelative(1.107f, -2.211f)
                lineToRelative(1.106f, 2.211f)
                arcToRelative(1f, 1f, 0f, false, false, 1.234f, 0.494f)
                lineToRelative(0.107f, -0.047f)
                arcToRelative(1f, 1f, 0f, false, false, 0.447f, -1.341f)
                lineToRelative(-1.776f, -3.553f)
                lineToRelative(1.776f, -3.553f)
                arcToRelative(1f, 1f, 0f, false, false, -0.345f, -1.283f)
                close()
            }
        }.build()
        
        return _SquareRoundedLetterX!!
    }

private var _SquareRoundedLetterX: ImageVector? = null

