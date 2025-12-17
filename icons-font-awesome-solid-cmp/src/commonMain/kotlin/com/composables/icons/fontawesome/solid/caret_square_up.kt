package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretSquareUp: ImageVector
    get() {
        if (_CaretSquareUp != null) return _CaretSquareUp!!
        
        _CaretSquareUp = ImageVector.Builder(
            name = "caret-square-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 432f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                close()
                moveToRelative(355.515f, -140.485f)
                lineToRelative(-123.03f, -123.03f)
                curveToRelative(-4.686f, -4.686f, -12.284f, -4.686f, -16.971f, 0f)
                lineTo(92.485f, 291.515f)
                curveToRelative(-7.56f, 7.56f, -2.206f, 20.485f, 8.485f, 20.485f)
                horizontalLineToRelative(246.059f)
                curveToRelative(10.691f, 0f, 16.045f, -12.926f, 8.486f, -20.485f)
                close()
            }
        }.build()
        
        return _CaretSquareUp!!
    }

private var _CaretSquareUp: ImageVector? = null

