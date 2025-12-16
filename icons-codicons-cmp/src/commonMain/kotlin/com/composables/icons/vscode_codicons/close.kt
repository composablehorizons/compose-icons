package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Close: ImageVector
    get() {
        if (_Close != null) return _Close!!
        
        _Close = ImageVector.Builder(
            name = "close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.70701f, 8.00001f)
                lineTo(12.353f, 4.35401f)
                curveTo(12.548f, 4.15901f, 12.548f, 3.84201f, 12.353f, 3.64701f)
                curveTo(12.158f, 3.45201f, 11.841f, 3.45201f, 11.646f, 3.64701f)
                lineTo(8.00001f, 7.29301f)
                lineTo(4.35401f, 3.64701f)
                curveTo(4.15901f, 3.45201f, 3.84201f, 3.45201f, 3.64701f, 3.64701f)
                curveTo(3.45201f, 3.84201f, 3.45201f, 4.15901f, 3.64701f, 4.35401f)
                lineTo(7.29301f, 8.00001f)
                lineTo(3.64701f, 11.646f)
                curveTo(3.45201f, 11.841f, 3.45201f, 12.158f, 3.64701f, 12.353f)
                curveTo(3.74501f, 12.451f, 3.87301f, 12.499f, 4.00101f, 12.499f)
                curveTo(4.12901f, 12.499f, 4.25701f, 12.45f, 4.35501f, 12.353f)
                lineTo(8.00101f, 8.70701f)
                lineTo(11.647f, 12.353f)
                curveTo(11.745f, 12.451f, 11.873f, 12.499f, 12.001f, 12.499f)
                curveTo(12.129f, 12.499f, 12.257f, 12.45f, 12.355f, 12.353f)
                curveTo(12.55f, 12.158f, 12.55f, 11.841f, 12.355f, 11.646f)
                lineTo(8.70901f, 8.00001f)
                horizontalLineTo(8.70701f)
                close()
            }
        }.build()
        
        return _Close!!
    }

private var _Close: ImageVector? = null

