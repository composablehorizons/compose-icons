package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CaretSquareLeft: ImageVector
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
                moveTo(272f, 157.1f)
                verticalLineToRelative(197.8f)
                curveToRelative(0f, 10.7f, -13f, 16.1f, -20.5f, 8.5f)
                lineToRelative(-98.3f, -98.9f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.2f, 0f, -16.9f)
                lineToRelative(98.3f, -98.9f)
                curveToRelative(7.5f, -7.7f, 20.5f, -2.3f, 20.5f, 8.4f)
                close()
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
                moveToRelative(-48f, 346f)
                verticalLineTo(86f)
                curveToRelative(0f, -3.3f, -2.7f, -6f, -6f, -6f)
                horizontalLineTo(54f)
                curveToRelative(-3.3f, 0f, -6f, 2.7f, -6f, 6f)
                verticalLineToRelative(340f)
                curveToRelative(0f, 3.3f, 2.7f, 6f, 6f, 6f)
                horizontalLineToRelative(340f)
                curveToRelative(3.3f, 0f, 6f, -2.7f, 6f, -6f)
                close()
            }
        }.build()
        
        return _CaretSquareLeft!!
    }

private var _CaretSquareLeft: ImageVector? = null

