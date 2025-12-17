package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Quotes: ImageVector
    get() {
        if (_Quotes != null) return _Quotes!!
        
        _Quotes = ImageVector.Builder(
            name = "quotes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 6.50002f)
                curveTo(9f, 6.22402f, 9.224f, 6.00002f, 9.5f, 6.00002f)
                lineTo(10.5f, 5.99902f)
                curveTo(10.776f, 5.99902f, 11f, 6.22302f, 11f, 6.49902f)
                curveTo(11f, 8.22902f, 10.283f, 9.42402f, 9.854f, 9.85302f)
                curveTo(9.659f, 10.048f, 9.342f, 10.048f, 9.147f, 9.85302f)
                curveTo(8.952f, 9.65802f, 8.952f, 9.34102f, 9.147f, 9.14602f)
                curveTo(9.297f, 8.99602f, 9.598f, 8.56702f, 9.799f, 7.90102f)
                curveTo(9.715f, 7.96302f, 9.612f, 8.00002f, 9.5f, 8.00002f)
                curveTo(9.224f, 8.00002f, 9f, 7.77602f, 9f, 7.50002f)
                verticalLineTo(6.50002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.50002f)
                curveTo(12f, 6.22402f, 12.224f, 6.00002f, 12.5f, 6.00002f)
                lineTo(13.5f, 5.99902f)
                curveTo(13.776f, 5.99902f, 14f, 6.22302f, 14f, 6.49902f)
                curveTo(14f, 8.22902f, 13.283f, 9.42402f, 12.854f, 9.85302f)
                curveTo(12.659f, 10.048f, 12.342f, 10.048f, 12.147f, 9.85302f)
                curveTo(11.952f, 9.65802f, 11.952f, 9.34102f, 12.147f, 9.14602f)
                curveTo(12.297f, 8.99602f, 12.598f, 8.56702f, 12.799f, 7.90102f)
                curveTo(12.715f, 7.96302f, 12.612f, 8.00002f, 12.5f, 8.00002f)
                curveTo(12.224f, 8.00002f, 12f, 7.77602f, 12f, 7.50002f)
                verticalLineTo(6.50002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 10.0002f)
                curveTo(6.776f, 10.0002f, 7f, 9.77623f, 7f, 9.50023f)
                verticalLineTo(8.50023f)
                curveTo(7f, 8.22423f, 6.776f, 8.00023f, 6.5f, 8.00023f)
                curveTo(6.388f, 8.00023f, 6.285f, 8.03723f, 6.201f, 8.09923f)
                curveTo(6.402f, 7.43323f, 6.703f, 7.00423f, 6.853f, 6.85423f)
                curveTo(7.048f, 6.65923f, 7.048f, 6.34223f, 6.853f, 6.14723f)
                curveTo(6.658f, 5.95223f, 6.341f, 5.95223f, 6.146f, 6.14723f)
                curveTo(5.717f, 6.57623f, 5f, 7.77123f, 5f, 9.50123f)
                curveTo(5f, 9.77723f, 5.224f, 10.0012f, 5.5f, 10.0012f)
                lineTo(6.5f, 10.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9.50023f)
                curveTo(4f, 9.77623f, 3.776f, 10.0002f, 3.5f, 10.0002f)
                lineTo(2.5f, 10.0012f)
                curveTo(2.224f, 10.0012f, 2f, 9.77723f, 2f, 9.50123f)
                curveTo(2f, 7.77123f, 2.717f, 6.57623f, 3.146f, 6.14723f)
                curveTo(3.341f, 5.95223f, 3.658f, 5.95223f, 3.853f, 6.14723f)
                curveTo(4.048f, 6.34223f, 4.048f, 6.65923f, 3.853f, 6.85423f)
                curveTo(3.703f, 7.00423f, 3.402f, 7.43323f, 3.201f, 8.09923f)
                curveTo(3.285f, 8.03723f, 3.388f, 8.00023f, 3.5f, 8.00023f)
                curveTo(3.776f, 8.00023f, 4f, 8.22423f, 4f, 8.50023f)
                verticalLineTo(9.50023f)
                close()
            }
        }.build()
        
        return _Quotes!!
    }

private var _Quotes: ImageVector? = null

