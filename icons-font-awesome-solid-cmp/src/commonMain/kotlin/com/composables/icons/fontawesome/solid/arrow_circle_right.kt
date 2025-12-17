package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowCircleRight: ImageVector
    get() {
        if (_ArrowCircleRight != null) return _ArrowCircleRight!!
        
        _ArrowCircleRight = ImageVector.Builder(
            name = "arrow-circle-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveToRelative(137f, 0f, 248f, 111f, 248f, 248f)
                reflectiveCurveTo(393f, 504f, 256f, 504f)
                reflectiveCurveTo(8f, 393f, 8f, 256f)
                reflectiveCurveTo(119f, 8f, 256f, 8f)
                close()
                moveToRelative(-28.9f, 143.6f)
                lineToRelative(75.5f, 72.4f)
                horizontalLineTo(120f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(182.6f)
                lineToRelative(-75.5f, 72.4f)
                curveToRelative(-9.7f, 9.3f, -9.9f, 24.8f, -0.4f, 34.3f)
                lineToRelative(11f, 10.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineTo(404.3f, 273f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineTo(271.6f, 106.3f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineToRelative(-11f, 10.9f)
                curveToRelative(-9.5f, 9.6f, -9.3f, 25.1f, 0.4f, 34.4f)
                close()
            }
        }.build()
        
        return _ArrowCircleRight!!
    }

private var _ArrowCircleRight: ImageVector? = null

