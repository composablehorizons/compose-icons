package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.74514f, 3.06414f)
                curveTo(4.41183f, 2.87665f, 4f, 3.11751f, 4f, 3.49993f)
                verticalLineTo(12.5002f)
                curveTo(4f, 12.8826f, 4.41182f, 13.1235f, 4.74512f, 12.936f)
                lineTo(12.7454f, 8.43601f)
                curveTo(13.0852f, 8.24486f, 13.0852f, 7.75559f, 12.7454f, 7.56443f)
                lineTo(4.74514f, 3.06414f)
                close()
                moveTo(3f, 3.49993f)
                curveTo(3f, 2.35268f, 4.2355f, 1.63011f, 5.23541f, 2.19257f)
                lineTo(13.2357f, 6.69286f)
                curveTo(14.2551f, 7.26633f, 14.2551f, 8.73415f, 13.2356f, 9.30759f)
                lineTo(5.23537f, 13.8076f)
                curveTo(4.23546f, 14.37f, 3f, 13.6474f, 3f, 12.5002f)
                verticalLineTo(3.49993f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

