package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Collection: ImageVector
    get() {
        if (_Collection != null) return _Collection!!
        
        _Collection = ImageVector.Builder(
            name = "collection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 1f)
                horizontalLineTo(8.5f)
                curveTo(8.10218f, 1f, 7.72064f, 1.15804f, 7.43934f, 1.43934f)
                curveTo(7.15804f, 1.72064f, 7f, 2.10218f, 7f, 2.5f)
                verticalLineTo(3f)
                horizontalLineTo(2.5f)
                curveTo(2.10218f, 3f, 1.72064f, 3.15804f, 1.43934f, 3.43934f)
                curveTo(1.15804f, 3.72064f, 1f, 4.10218f, 1f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(1f, 11.8978f, 1.15804f, 12.2794f, 1.43934f, 12.5607f)
                curveTo(1.72064f, 12.842f, 2.10218f, 13f, 2.5f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(13.5f)
                curveTo(4f, 13.8978f, 4.15804f, 14.2794f, 4.43934f, 14.5607f)
                curveTo(4.72064f, 14.842f, 5.10218f, 15f, 5.5f, 15f)
                horizontalLineTo(10.5f)
                curveTo(10.8978f, 15f, 11.2794f, 14.842f, 11.5607f, 14.5607f)
                curveTo(11.842f, 14.2794f, 12f, 13.8978f, 12f, 13.5f)
                verticalLineTo(11f)
                horizontalLineTo(13.5f)
                curveTo(13.8978f, 11f, 14.2794f, 10.842f, 14.5607f, 10.5607f)
                curveTo(14.842f, 10.2794f, 15f, 9.89782f, 15f, 9.5f)
                verticalLineTo(2.5f)
                curveTo(15f, 2.10218f, 14.842f, 1.72064f, 14.5607f, 1.43934f)
                curveTo(14.2794f, 1.15804f, 13.8978f, 1f, 13.5f, 1f)
                close()
                moveTo(2.5f, 12f)
                curveTo(2.36739f, 12f, 2.24021f, 11.9473f, 2.14645f, 11.8536f)
                curveTo(2.05268f, 11.7598f, 2f, 11.6326f, 2f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(2f, 4.36739f, 2.05268f, 4.24021f, 2.14645f, 4.14645f)
                curveTo(2.24021f, 4.05268f, 2.36739f, 4f, 2.5f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5.5f)
                curveTo(5.10218f, 5f, 4.72064f, 5.15804f, 4.43934f, 5.43934f)
                curveTo(4.15804f, 5.72064f, 4f, 6.10218f, 4f, 6.5f)
                verticalLineTo(12f)
                horizontalLineTo(2.5f)
                close()
                moveTo(11f, 13.5f)
                curveTo(11f, 13.6326f, 10.9473f, 13.7598f, 10.8536f, 13.8536f)
                curveTo(10.7598f, 13.9473f, 10.6326f, 14f, 10.5f, 14f)
                horizontalLineTo(5.5f)
                curveTo(5.36739f, 14f, 5.24021f, 13.9473f, 5.14645f, 13.8536f)
                curveTo(5.05268f, 13.7598f, 5f, 13.6326f, 5f, 13.5f)
                verticalLineTo(6.5f)
                curveTo(5f, 6.36739f, 5.05268f, 6.24021f, 5.14645f, 6.14645f)
                curveTo(5.24021f, 6.05268f, 5.36739f, 6f, 5.5f, 6f)
                horizontalLineTo(10.5f)
                curveTo(10.6326f, 6f, 10.7598f, 6.05268f, 10.8536f, 6.14645f)
                curveTo(10.9473f, 6.24021f, 11f, 6.36739f, 11f, 6.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(14f, 9.5f)
                curveTo(14f, 9.63261f, 13.9473f, 9.75979f, 13.8536f, 9.85355f)
                curveTo(13.7598f, 9.94732f, 13.6326f, 10f, 13.5f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(6.5f)
                curveTo(12f, 6.10218f, 11.842f, 5.72064f, 11.5607f, 5.43934f)
                curveTo(11.2794f, 5.15804f, 10.8978f, 5f, 10.5f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(2.5f)
                curveTo(8f, 2.36739f, 8.05268f, 2.24021f, 8.14645f, 2.14645f)
                curveTo(8.24021f, 2.05268f, 8.36739f, 2f, 8.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(13.6326f, 2f, 13.7598f, 2.05268f, 13.8536f, 2.14645f)
                curveTo(13.9473f, 2.24021f, 14f, 2.36739f, 14f, 2.5f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()
        
        return _Collection!!
    }

private var _Collection: ImageVector? = null

