package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretSquareLeft: ImageVector
    get() {
        if (_CaretSquareLeft != null) return _CaretSquareLeft!!
        
        _CaretSquareLeft = ImageVector.Builder(
            name = "caret-square-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 480f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                close()
                moveTo(259.515f, 124.485f)
                lineToRelative(-123.03f, 123.03f)
                curveToRelative(-4.686f, 4.686f, -4.686f, 12.284f, 0f, 16.971f)
                lineToRelative(123.029f, 123.029f)
                curveToRelative(7.56f, 7.56f, 20.485f, 2.206f, 20.485f, -8.485f)
                verticalLineTo(132.971f)
                curveToRelative(0.001f, -10.691f, -12.925f, -16.045f, -20.484f, -8.486f)
                close()
            }
        }.build()
        
        return _CaretSquareLeft!!
    }

private var _CaretSquareLeft: ImageVector? = null

