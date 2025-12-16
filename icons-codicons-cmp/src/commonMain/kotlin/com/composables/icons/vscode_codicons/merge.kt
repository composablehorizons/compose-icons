package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Merge: ImageVector
    get() {
        if (_Merge != null) return _Merge!!
        
        _Merge = ImageVector.Builder(
            name = "merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.1472f, 0.146372f)
                curveTo(7.3422f, -0.0486279f, 7.65923f, -0.0486279f, 7.85423f, 0.146372f)
                lineTo(11.3542f, 3.64637f)
                curveTo(11.5489f, 3.8414f, 11.5491f, 4.15852f, 11.3542f, 4.3534f)
                curveTo(11.1593f, 4.54823f, 10.8422f, 4.54804f, 10.6472f, 4.3534f)
                lineTo(8.00071f, 1.70692f)
                verticalLineTo(6.49989f)
                curveTo(8.00071f, 9.99981f, 9.99987f, 10.9998f, 13.4997f, 10.9999f)
                curveTo(13.7757f, 10.9999f, 13.9997f, 11.2239f, 13.9997f, 11.4999f)
                curveTo(13.9997f, 11.7759f, 13.7748f, 11.9999f, 13.4988f, 11.9999f)
                curveTo(10.9978f, 11.9999f, 9.08321f, 11.4131f, 7.99974f, 9.995f)
                verticalLineTo(14.4999f)
                curveTo(7.99974f, 14.776f, 7.77588f, 14.9999f, 7.49974f, 14.9999f)
                curveTo(7.22371f, 14.9998f, 6.99974f, 14.7759f, 6.99974f, 14.4999f)
                verticalLineTo(1.70692f)
                lineTo(4.35423f, 4.3534f)
                curveTo(4.15934f, 4.54823f, 3.84221f, 4.54804f, 3.6472f, 4.3534f)
                curveTo(3.45222f, 4.15842f, 3.45226f, 3.84138f, 3.6472f, 3.64637f)
                lineTo(7.1472f, 0.146372f)
                close()
            }
        }.build()
        
        return _Merge!!
    }

private var _Merge: ImageVector? = null

