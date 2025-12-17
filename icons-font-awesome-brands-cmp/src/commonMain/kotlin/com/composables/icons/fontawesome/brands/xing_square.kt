package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.XingSquare: ImageVector
    get() {
        if (_XingSquare != null) return _XingSquare!!
        
        _XingSquare = ImageVector.Builder(
            name = "xing-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(140.4f, 320.2f)
                horizontalLineTo(93.8f)
                curveToRelative(-5.5f, 0f, -8.7f, -5.3f, -6f, -10.3f)
                lineToRelative(49.3f, -86.7f)
                curveToRelative(0.1f, 0f, 0.1f, -0.1f, 0f, -0.2f)
                lineToRelative(-31.4f, -54f)
                curveToRelative(-3f, -5.6f, 0.2f, -10.1f, 6f, -10.1f)
                horizontalLineToRelative(46.6f)
                curveToRelative(5.2f, 0f, 9.5f, 2.9f, 12.9f, 8.7f)
                lineToRelative(31.9f, 55.3f)
                curveToRelative(-1.3f, 2.3f, -18f, 31.7f, -50.1f, 88.2f)
                curveToRelative(-3.5f, 6.2f, -7.7f, 9.1f, -12.6f, 9.1f)
                close()
                moveToRelative(219.7f, -214.1f)
                lineTo(257.3f, 286.8f)
                verticalLineToRelative(0.2f)
                lineToRelative(65.5f, 119f)
                curveToRelative(2.8f, 5.1f, 0.1f, 10.1f, -6f, 10.1f)
                horizontalLineToRelative(-46.6f)
                curveToRelative(-5.5f, 0f, -9.7f, -2.9f, -12.9f, -8.7f)
                lineToRelative(-66f, -120.3f)
                curveToRelative(2.3f, -4.1f, 36.8f, -64.9f, 103.4f, -182.3f)
                curveToRelative(3.3f, -5.8f, 7.4f, -8.7f, 12.5f, -8.7f)
                horizontalLineToRelative(46.9f)
                curveToRelative(5.7f, -0.1f, 8.8f, 4.7f, 6f, 10f)
                close()
            }
        }.build()
        
        return _XingSquare!!
    }

private var _XingSquare: ImageVector? = null

