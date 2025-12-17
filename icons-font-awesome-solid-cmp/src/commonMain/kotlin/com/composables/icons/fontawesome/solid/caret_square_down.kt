package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CaretSquareDown: ImageVector
    get() {
        if (_CaretSquareDown != null) return _CaretSquareDown!!
        
        _CaretSquareDown = ImageVector.Builder(
            name = "caret-square-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveTo(92.5f, 220.5f)
                lineToRelative(123f, 123f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17f, 0f)
                lineToRelative(123f, -123f)
                curveToRelative(7.6f, -7.6f, 2.2f, -20.5f, -8.5f, -20.5f)
                horizontalLineTo(101f)
                curveToRelative(-10.7f, 0f, -16.1f, 12.9f, -8.5f, 20.5f)
                close()
            }
        }.build()
        
        return _CaretSquareDown!!
    }

private var _CaretSquareDown: ImageVector? = null

