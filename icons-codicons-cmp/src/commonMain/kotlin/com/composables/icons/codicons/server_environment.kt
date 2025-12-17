package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ServerEnvironment: ImageVector
    get() {
        if (_ServerEnvironment != null) return _ServerEnvironment!!
        
        _ServerEnvironment = ImageVector.Builder(
            name = "server-environment",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.968f, 14.324f)
                lineTo(12.468f, 10.324f)
                curveTo(12.4322f, 10.2288f, 12.3682f, 10.1468f, 12.2846f, 10.0889f)
                curveTo(12.201f, 10.031f, 12.1017f, 10f, 12f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(2.5f)
                curveTo(11f, 2.10218f, 10.842f, 1.72064f, 10.5607f, 1.43934f)
                curveTo(10.2794f, 1.15804f, 9.89782f, 1f, 9.5f, 1f)
                horizontalLineTo(5.5f)
                curveTo(5.10218f, 1f, 4.72064f, 1.15804f, 4.43934f, 1.43934f)
                curveTo(4.15804f, 1.72064f, 4f, 2.10218f, 4f, 2.5f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                curveTo(2.8983f, 10f, 2.79901f, 10.031f, 2.7154f, 10.0889f)
                curveTo(2.63178f, 10.1468f, 2.5678f, 10.2288f, 2.532f, 10.324f)
                lineTo(1.032f, 14.324f)
                curveTo(1.00355f, 14.3997f, 0.993862f, 14.4811f, 1.00377f, 14.5613f)
                curveTo(1.01368f, 14.6415f, 1.04289f, 14.7181f, 1.0889f, 14.7846f)
                curveTo(1.13491f, 14.8511f, 1.19635f, 14.9054f, 1.26795f, 14.9429f)
                curveTo(1.33954f, 14.9804f, 1.41917f, 15f, 1.5f, 15f)
                horizontalLineTo(13.5f)
                curveTo(13.5808f, 15f, 13.6605f, 14.9804f, 13.7321f, 14.9429f)
                curveTo(13.8037f, 14.9054f, 13.8651f, 14.8511f, 13.9111f, 14.7846f)
                curveTo(13.9571f, 14.7181f, 13.9863f, 14.6415f, 13.9962f, 14.5613f)
                curveTo(14.0061f, 14.4811f, 13.9965f, 14.3997f, 13.968f, 14.324f)
                close()
                moveTo(5f, 2.5f)
                curveTo(5f, 2.36739f, 5.05268f, 2.24021f, 5.14645f, 2.14645f)
                curveTo(5.24021f, 2.05268f, 5.36739f, 2f, 5.5f, 2f)
                horizontalLineTo(9.5f)
                curveTo(9.63261f, 2f, 9.75979f, 2.05268f, 9.85355f, 2.14645f)
                curveTo(9.94732f, 2.24021f, 10f, 2.36739f, 10f, 2.5f)
                verticalLineTo(11.5f)
                curveTo(10f, 11.6326f, 9.94732f, 11.7598f, 9.85355f, 11.8536f)
                curveTo(9.75979f, 11.9473f, 9.63261f, 12f, 9.5f, 12f)
                horizontalLineTo(5.5f)
                curveTo(5.36739f, 12f, 5.24021f, 11.9473f, 5.14645f, 11.8536f)
                curveTo(5.05268f, 11.7598f, 5f, 11.6326f, 5f, 11.5f)
                verticalLineTo(2.5f)
                close()
                moveTo(2.222f, 14f)
                lineTo(3.347f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(11.5f)
                curveTo(4f, 11.8978f, 4.15804f, 12.2794f, 4.43934f, 12.5607f)
                curveTo(4.72064f, 12.842f, 5.10218f, 13f, 5.5f, 13f)
                horizontalLineTo(9.5f)
                curveTo(9.89782f, 13f, 10.2794f, 12.842f, 10.5607f, 12.5607f)
                curveTo(10.842f, 12.2794f, 11f, 11.8978f, 11f, 11.5f)
                verticalLineTo(11f)
                horizontalLineTo(11.653f)
                lineTo(12.778f, 14f)
                horizontalLineTo(2.222f)
                close()
                moveTo(6f, 4.5f)
                curveTo(6f, 4.36739f, 6.05268f, 4.24021f, 6.14645f, 4.14645f)
                curveTo(6.24021f, 4.05268f, 6.36739f, 4f, 6.5f, 4f)
                horizontalLineTo(8.5f)
                curveTo(8.63261f, 4f, 8.75979f, 4.05268f, 8.85355f, 4.14645f)
                curveTo(8.94732f, 4.24021f, 9f, 4.36739f, 9f, 4.5f)
                curveTo(9f, 4.63261f, 8.94732f, 4.75979f, 8.85355f, 4.85355f)
                curveTo(8.75979f, 4.94732f, 8.63261f, 5f, 8.5f, 5f)
                horizontalLineTo(6.5f)
                curveTo(6.36739f, 5f, 6.24021f, 4.94732f, 6.14645f, 4.85355f)
                curveTo(6.05268f, 4.75979f, 6f, 4.63261f, 6f, 4.5f)
                close()
                moveTo(6f, 8.5f)
                curveTo(6f, 8.36739f, 6.05268f, 8.24021f, 6.14645f, 8.14645f)
                curveTo(6.24021f, 8.05268f, 6.36739f, 8f, 6.5f, 8f)
                horizontalLineTo(8.5f)
                curveTo(8.63261f, 8f, 8.75979f, 8.05268f, 8.85355f, 8.14645f)
                curveTo(8.94732f, 8.24021f, 9f, 8.36739f, 9f, 8.5f)
                curveTo(9f, 8.63261f, 8.94732f, 8.75979f, 8.85355f, 8.85355f)
                curveTo(8.75979f, 8.94732f, 8.63261f, 9f, 8.5f, 9f)
                horizontalLineTo(6.5f)
                curveTo(6.36739f, 9f, 6.24021f, 8.94732f, 6.14645f, 8.85355f)
                curveTo(6.05268f, 8.75979f, 6f, 8.63261f, 6f, 8.5f)
                close()
                moveTo(6f, 10.5f)
                curveTo(6f, 10.3674f, 6.05268f, 10.2402f, 6.14645f, 10.1464f)
                curveTo(6.24021f, 10.0527f, 6.36739f, 10f, 6.5f, 10f)
                horizontalLineTo(8.5f)
                curveTo(8.63261f, 10f, 8.75979f, 10.0527f, 8.85355f, 10.1464f)
                curveTo(8.94732f, 10.2402f, 9f, 10.3674f, 9f, 10.5f)
                curveTo(9f, 10.6326f, 8.94732f, 10.7598f, 8.85355f, 10.8536f)
                curveTo(8.75979f, 10.9473f, 8.63261f, 11f, 8.5f, 11f)
                horizontalLineTo(6.5f)
                curveTo(6.36739f, 11f, 6.24021f, 10.9473f, 6.14645f, 10.8536f)
                curveTo(6.05268f, 10.7598f, 6f, 10.6326f, 6f, 10.5f)
                close()
            }
        }.build()
        
        return _ServerEnvironment!!
    }

private var _ServerEnvironment: ImageVector? = null

