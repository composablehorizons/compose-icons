package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Settings: ImageVector
    get() {
        if (_Settings != null) return _Settings!!
        
        _Settings = ImageVector.Builder(
            name = "settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 9.5f)
                curveTo(6.93191f, 9.5f, 7.71496f, 10.1374f, 7.93699f, 11f)
                lineTo(13.5f, 11f)
                curveTo(13.7761f, 11f, 14f, 11.2239f, 14f, 11.5f)
                curveTo(14f, 11.7455f, 13.8231f, 11.9496f, 13.5899f, 11.9919f)
                lineTo(13.5f, 12f)
                lineTo(7.93673f, 12.001f)
                curveTo(7.71435f, 12.8631f, 6.93155f, 13.5f, 6f, 13.5f)
                curveTo(5.06845f, 13.5f, 4.28565f, 12.8631f, 4.06327f, 12.001f)
                lineTo(2.5f, 12f)
                curveTo(2.22386f, 12f, 2f, 11.7761f, 2f, 11.5f)
                curveTo(2f, 11.2545f, 2.17688f, 11.0504f, 2.41012f, 11.0081f)
                lineTo(2.5f, 11f)
                lineTo(4.06301f, 11f)
                curveTo(4.28504f, 10.1374f, 5.06809f, 9.5f, 6f, 9.5f)
                close()
                moveTo(6f, 10.5f)
                curveTo(5.44772f, 10.5f, 5f, 10.9477f, 5f, 11.5f)
                curveTo(5f, 12.0523f, 5.44772f, 12.5f, 6f, 12.5f)
                curveTo(6.55228f, 12.5f, 7f, 12.0523f, 7f, 11.5f)
                curveTo(7f, 10.9477f, 6.55228f, 10.5f, 6f, 10.5f)
                close()
                moveTo(10f, 2.5f)
                curveTo(10.9319f, 2.5f, 11.715f, 3.13738f, 11.937f, 3.99998f)
                lineTo(13.5f, 4f)
                curveTo(13.7761f, 4f, 14f, 4.22386f, 14f, 4.5f)
                curveTo(14f, 4.74546f, 13.8231f, 4.94961f, 13.5899f, 4.99194f)
                lineTo(13.5f, 5f)
                lineTo(11.9367f, 5.00102f)
                curveTo(11.7144f, 5.86312f, 10.9316f, 6.5f, 10f, 6.5f)
                curveTo(9.06845f, 6.5f, 8.28565f, 5.86312f, 8.06327f, 5.00102f)
                lineTo(2.5f, 5f)
                curveTo(2.22386f, 5f, 2f, 4.77614f, 2f, 4.5f)
                curveTo(2f, 4.25454f, 2.17688f, 4.05039f, 2.41012f, 4.00806f)
                lineTo(2.5f, 4f)
                lineTo(8.06301f, 3.99998f)
                curveTo(8.28504f, 3.13738f, 9.06809f, 2.5f, 10f, 2.5f)
                close()
                moveTo(10f, 3.5f)
                curveTo(9.44772f, 3.5f, 9f, 3.94772f, 9f, 4.5f)
                curveTo(9f, 5.05228f, 9.44772f, 5.5f, 10f, 5.5f)
                curveTo(10.5523f, 5.5f, 11f, 5.05228f, 11f, 4.5f)
                curveTo(11f, 3.94772f, 10.5523f, 3.5f, 10f, 3.5f)
                close()
            }
        }.build()
        
        return _Settings!!
    }

private var _Settings: ImageVector? = null

