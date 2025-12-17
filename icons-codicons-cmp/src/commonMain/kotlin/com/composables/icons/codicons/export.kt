package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Export: ImageVector
    get() {
        if (_Export != null) return _Export!!
        
        _Export = ImageVector.Builder(
            name = "export",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 2.9999f)
                curveTo(1.77614f, 2.9999f, 2f, 3.22376f, 2f, 3.4999f)
                verticalLineTo(11.9999f)
                curveTo(2f, 12.276f, 1.77614f, 12.4999f, 1.5f, 12.4999f)
                curveTo(1.22386f, 12.4999f, 1f, 12.276f, 1f, 11.9999f)
                verticalLineTo(3.4999f)
                curveTo(1f, 3.22376f, 1.22386f, 2.9999f, 1.5f, 2.9999f)
                close()
                moveTo(10.6464f, 3.64635f)
                curveTo(10.8417f, 3.45109f, 11.1583f, 3.45109f, 11.3536f, 3.64635f)
                lineTo(14.8536f, 7.14635f)
                curveTo(15.0488f, 7.34161f, 15.0488f, 7.65819f, 14.8536f, 7.85345f)
                lineTo(11.3536f, 11.3535f)
                curveTo(11.1583f, 11.5487f, 10.8417f, 11.5487f, 10.6464f, 11.3535f)
                curveTo(10.4512f, 11.1582f, 10.4512f, 10.8416f, 10.6464f, 10.6463f)
                lineTo(13.2929f, 7.9999f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 7.9999f, 4f, 7.77604f, 4f, 7.4999f)
                curveTo(4f, 7.22376f, 4.22386f, 6.9999f, 4.5f, 6.9999f)
                horizontalLineTo(13.2929f)
                lineTo(10.6464f, 4.35345f)
                curveTo(10.4512f, 4.15819f, 10.4512f, 3.84161f, 10.6464f, 3.64635f)
                close()
            }
        }.build()
        
        return _Export!!
    }

private var _Export: ImageVector? = null

