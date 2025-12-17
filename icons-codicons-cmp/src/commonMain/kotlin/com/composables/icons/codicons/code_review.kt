package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CodeReview: ImageVector
    get() {
        if (_CodeReview != null) return _CodeReview!!
        
        _CodeReview = ImageVector.Builder(
            name = "code-review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 2.00002f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 2.00002f, 1f, 3.11902f, 1f, 4.50002f)
                verticalLineTo(9.50002f)
                curveTo(1f, 10.881f, 2.119f, 12f, 3.5f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(13.942f)
                curveTo(4f, 14.784f, 4.992f, 15.234f, 5.625f, 14.679f)
                lineTo(8.688f, 11.999f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 11.999f, 15f, 10.88f, 15f, 9.49902f)
                verticalLineTo(4.49902f)
                curveTo(15f, 3.11802f, 13.881f, 1.99902f, 12.5f, 1.99902f)
                verticalLineTo(2.00002f)
                close()
                moveTo(14f, 9.50002f)
                curveTo(14f, 10.328f, 13.328f, 11f, 12.5f, 11f)
                horizontalLineTo(8.312f)
                lineTo(5f, 13.898f)
                verticalLineTo(11f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.50002f)
                verticalLineTo(4.50002f)
                curveTo(2f, 3.67202f, 2.672f, 3.00002f, 3.5f, 3.00002f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 3.00002f, 14f, 3.67202f, 14f, 4.50002f)
                verticalLineTo(9.50002f)
                close()
                moveTo(6.854f, 4.85402f)
                lineTo(4.708f, 7.00002f)
                lineTo(6.854f, 9.14602f)
                curveTo(7.049f, 9.34102f, 7.049f, 9.65802f, 6.854f, 9.85302f)
                curveTo(6.756f, 9.95102f, 6.628f, 9.99902f, 6.5f, 9.99902f)
                curveTo(6.372f, 9.99902f, 6.244f, 9.95002f, 6.146f, 9.85302f)
                lineTo(3.646f, 7.35302f)
                curveTo(3.451f, 7.15802f, 3.451f, 6.84102f, 3.646f, 6.64602f)
                lineTo(6.146f, 4.14602f)
                curveTo(6.341f, 3.95102f, 6.658f, 3.95102f, 6.853f, 4.14602f)
                curveTo(7.048f, 4.34102f, 7.048f, 4.65802f, 6.853f, 4.85302f)
                lineTo(6.854f, 4.85402f)
                close()
                moveTo(12.354f, 6.64602f)
                curveTo(12.549f, 6.84102f, 12.549f, 7.15802f, 12.354f, 7.35302f)
                lineTo(9.854f, 9.85302f)
                curveTo(9.756f, 9.95102f, 9.628f, 9.99902f, 9.5f, 9.99902f)
                curveTo(9.372f, 9.99902f, 9.244f, 9.95002f, 9.146f, 9.85302f)
                curveTo(8.951f, 9.65802f, 8.951f, 9.34102f, 9.146f, 9.14602f)
                lineTo(11.292f, 7.00002f)
                lineTo(9.146f, 4.85402f)
                curveTo(8.951f, 4.65902f, 8.951f, 4.34202f, 9.146f, 4.14702f)
                curveTo(9.341f, 3.95202f, 9.658f, 3.95202f, 9.853f, 4.14702f)
                lineTo(12.353f, 6.64702f)
                lineTo(12.354f, 6.64602f)
                close()
            }
        }.build()
        
        return _CodeReview!!
    }

private var _CodeReview: ImageVector? = null

