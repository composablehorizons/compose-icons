package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) return _PlayCircle!!
        
        _PlayCircle = ImageVector.Builder(
            name = "play-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                curveTo(4.14f, 1f, 1f, 4.14f, 1f, 8f)
                curveTo(1f, 11.86f, 4.14f, 15f, 8f, 15f)
                curveTo(11.86f, 15f, 15f, 11.86f, 15f, 8f)
                curveTo(15f, 4.14f, 11.86f, 1f, 8f, 1f)
                close()
                moveTo(8f, 14f)
                curveTo(4.691f, 14f, 2f, 11.309f, 2f, 8f)
                curveTo(2f, 4.691f, 4.691f, 2f, 8f, 2f)
                curveTo(11.309f, 2f, 14f, 4.691f, 14f, 8f)
                curveTo(14f, 11.309f, 11.309f, 14f, 8f, 14f)
                close()
                moveTo(10.712f, 8f)
                curveTo(10.712f, 8.153f, 10.63f, 8.294f, 10.498f, 8.371f)
                lineTo(6.964f, 10.413f)
                curveTo(6.536f, 10.66f, 6f, 10.351f, 6f, 9.857f)
                verticalLineTo(6.144f)
                curveTo(6f, 5.649f, 6.536f, 5.34f, 6.964f, 5.588f)
                lineTo(10.498f, 7.63f)
                curveTo(10.631f, 7.707f, 10.712f, 7.847f, 10.712f, 8f)
                close()
            }
        }.build()
        
        return _PlayCircle!!
    }

private var _PlayCircle: ImageVector? = null

