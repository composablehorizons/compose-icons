package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Download: ImageVector
    get() {
        if (_Download != null) return _Download!!
        
        _Download = ImageVector.Builder(
            name = "download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 13f, 13f, 13.2239f, 13f, 13.5f)
                curveTo(13f, 13.7455f, 12.8231f, 13.9496f, 12.5899f, 13.9919f)
                lineTo(12.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 14f, 3f, 13.7761f, 3f, 13.5f)
                curveTo(3f, 13.2545f, 3.17688f, 13.0504f, 3.41012f, 13.0081f)
                lineTo(3.5f, 13f)
                close()
                moveTo(7.91012f, 1.00806f)
                lineTo(8f, 1f)
                curveTo(8.24546f, 1f, 8.44961f, 1.17688f, 8.49194f, 1.41012f)
                lineTo(8.5f, 1.5f)
                verticalLineTo(10.292f)
                lineTo(11.182f, 7.61091f)
                curveTo(11.3555f, 7.43735f, 11.625f, 7.41806f, 11.8198f, 7.55306f)
                lineTo(11.8891f, 7.61091f)
                curveTo(12.0627f, 7.78448f, 12.0819f, 8.0539f, 11.9469f, 8.24877f)
                lineTo(11.8891f, 8.31802f)
                lineTo(8.35355f, 11.8536f)
                curveTo(8.17999f, 12.0271f, 7.91056f, 12.0464f, 7.71569f, 11.9114f)
                lineTo(7.64645f, 11.8536f)
                lineTo(4.11091f, 8.31802f)
                curveTo(3.91565f, 8.12276f, 3.91565f, 7.80617f, 4.11091f, 7.61091f)
                curveTo(4.28448f, 7.43735f, 4.5539f, 7.41806f, 4.74877f, 7.55306f)
                lineTo(4.81802f, 7.61091f)
                lineTo(7.5f, 10.292f)
                verticalLineTo(1.5f)
                curveTo(7.5f, 1.25454f, 7.67688f, 1.05039f, 7.91012f, 1.00806f)
                close()
            }
        }.build()
        
        return _Download!!
    }

private var _Download: ImageVector? = null

