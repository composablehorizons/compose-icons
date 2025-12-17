package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Music: ImageVector
    get() {
        if (_Music != null) return _Music!!
        
        _Music = ImageVector.Builder(
            name = "music",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5.20951f)
                verticalLineTo(10.2675f)
                curveTo(11.7058f, 10.0974f, 11.3643f, 9.99998f, 11f, 9.99998f)
                curveTo(9.89543f, 9.99998f, 9f, 10.8954f, 9f, 12f)
                curveTo(9f, 13.1045f, 9.89543f, 14f, 11f, 14f)
                curveTo(12.1046f, 14f, 13f, 13.1045f, 13f, 12f)
                verticalLineTo(1.92568f)
                curveTo(13f, 1.37245f, 12.4519f, 0.986213f, 11.9309f, 1.17228f)
                lineTo(5.53093f, 3.458f)
                curveTo(5.21254f, 3.57171f, 5f, 3.8733f, 5f, 4.21139f)
                verticalLineTo(11.2675f)
                curveTo(4.70583f, 11.0974f, 4.36429f, 11f, 4f, 11f)
                curveTo(2.89543f, 11f, 2f, 11.8954f, 2f, 13f)
                curveTo(2f, 14.1045f, 2.89543f, 15f, 4f, 15f)
                curveTo(5.10457f, 15f, 6f, 14.1045f, 6f, 13f)
                verticalLineTo(7.35237f)
                lineTo(12f, 5.20951f)
                close()
                moveTo(12f, 4.14765f)
                lineTo(6f, 6.2905f)
                verticalLineTo(4.35233f)
                lineTo(12f, 2.20948f)
                verticalLineTo(4.14765f)
                close()
                moveTo(11f, 11f)
                curveTo(11.5523f, 11f, 12f, 11.4477f, 12f, 12f)
                curveTo(12f, 12.5523f, 11.5523f, 13f, 11f, 13f)
                curveTo(10.4477f, 13f, 10f, 12.5523f, 10f, 12f)
                curveTo(10f, 11.4477f, 10.4477f, 11f, 11f, 11f)
                close()
                moveTo(4f, 12f)
                curveTo(4.55228f, 12f, 5f, 12.4477f, 5f, 13f)
                curveTo(5f, 13.5523f, 4.55228f, 14f, 4f, 14f)
                curveTo(3.44772f, 14f, 3f, 13.5523f, 3f, 13f)
                curveTo(3f, 12.4477f, 3.44772f, 12f, 4f, 12f)
                close()
            }
        }.build()
        
        return _Music!!
    }

private var _Music: ImageVector? = null

