package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretSquareRight: ImageVector
    get() {
        if (_CaretSquareRight != null) return _CaretSquareRight!!
        
        _CaretSquareRight = ImageVector.Builder(
            name = "caret-square-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(48f, 32f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                close()
                moveToRelative(140.485f, 355.515f)
                lineToRelative(123.029f, -123.029f)
                curveToRelative(4.686f, -4.686f, 4.686f, -12.284f, 0f, -16.971f)
                lineToRelative(-123.029f, -123.03f)
                curveToRelative(-7.56f, -7.56f, -20.485f, -2.206f, -20.485f, 8.485f)
                verticalLineToRelative(246.059f)
                curveToRelative(0f, 10.691f, 12.926f, 16.045f, 20.485f, 8.486f)
                close()
            }
        }.build()
        
        return _CaretSquareRight!!
    }

private var _CaretSquareRight: ImageVector? = null

