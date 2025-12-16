package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Graph: ImageVector
    get() {
        if (_Graph != null) return _Graph!!
        
        _Graph = ImageVector.Builder(
            name = "graph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.25f, 15f)
                lineTo(13.75f, 15f)
                curveTo(14.439f, 15f, 15f, 14.439f, 15f, 13.75f)
                lineTo(15f, 2.25f)
                curveTo(15f, 1.561f, 14.439f, 1f, 13.75f, 1f)
                lineTo(12.25f, 1f)
                curveTo(11.561f, 1f, 11f, 1.561f, 11f, 2.25f)
                lineTo(11f, 13.75f)
                curveTo(11f, 14.439f, 11.561f, 15f, 12.25f, 15f)
                close()
                moveTo(12f, 2.25f)
                curveTo(12f, 2.112f, 12.112f, 2f, 12.25f, 2f)
                lineTo(13.75f, 2f)
                curveTo(13.888f, 2f, 14f, 2.112f, 14f, 2.25f)
                lineTo(14f, 13.75f)
                curveTo(14f, 13.888f, 13.888f, 14f, 13.75f, 14f)
                lineTo(12.25f, 14f)
                curveTo(12.112f, 14f, 12f, 13.888f, 12f, 13.75f)
                lineTo(12f, 2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.75f, 15f)
                lineTo(7.25f, 15f)
                curveTo(6.561f, 15f, 6f, 14.439f, 6f, 13.75f)
                lineTo(6f, 6.25f)
                curveTo(6f, 5.561f, 6.561f, 5f, 7.25f, 5f)
                lineTo(8.75f, 5f)
                curveTo(9.439f, 5f, 10f, 5.561f, 10f, 6.25f)
                lineTo(10f, 13.75f)
                curveTo(10f, 14.439f, 9.439f, 15f, 8.75f, 15f)
                close()
                moveTo(7.25f, 6f)
                curveTo(7.112f, 6f, 7f, 6.112f, 7f, 6.25f)
                lineTo(7f, 13.75f)
                curveTo(7f, 13.888f, 7.112f, 14f, 7.25f, 14f)
                lineTo(8.75f, 14f)
                curveTo(8.888f, 14f, 9f, 13.888f, 9f, 13.75f)
                lineTo(9f, 6.25f)
                curveTo(9f, 6.112f, 8.888f, 6f, 8.75f, 6f)
                lineTo(7.25f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 15f)
                lineTo(2.25f, 15f)
                curveTo(1.561f, 15f, 1f, 14.439f, 1f, 13.75f)
                lineTo(1f, 8.25f)
                curveTo(1f, 7.561f, 1.561f, 7f, 2.25f, 7f)
                lineTo(3.75f, 7f)
                curveTo(4.439f, 7f, 5f, 7.561f, 5f, 8.25f)
                lineTo(5f, 13.75f)
                curveTo(5f, 14.439f, 4.439f, 15f, 3.75f, 15f)
                close()
                moveTo(2.25f, 8f)
                curveTo(2.112f, 8f, 2f, 8.112f, 2f, 8.25f)
                lineTo(2f, 13.75f)
                curveTo(2f, 13.888f, 2.112f, 14f, 2.25f, 14f)
                lineTo(3.75f, 14f)
                curveTo(3.888f, 14f, 4f, 13.888f, 4f, 13.75f)
                lineTo(4f, 8.25f)
                curveTo(4f, 8.112f, 3.888f, 8f, 3.75f, 8f)
                lineTo(2.25f, 8f)
                close()
            }
        }.build()
        
        return _Graph!!
    }

private var _Graph: ImageVector? = null

