package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CursorText: ImageVector
    get() {
        if (_CursorText != null) return _CursorText!!
        
        _CursorText = ImageVector.Builder(
            name = "cursor-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1f)
                curveTo(10.7761f, 1f, 11f, 1.22386f, 11f, 1.5f)
                curveTo(11f, 1.77614f, 10.7761f, 2f, 10.5f, 2f)
                curveTo(9.5779f, 2f, 8.95996f, 2.23026f, 8.5791f, 2.56348f)
                curveTo(8.20699f, 2.88907f, 8f, 3.36626f, 8f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(9.25f)
                curveTo(9.52614f, 7f, 9.75f, 7.22386f, 9.75f, 7.5f)
                curveTo(9.75f, 7.77614f, 9.52614f, 8f, 9.25f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                curveTo(8f, 11.6337f, 8.20699f, 12.1109f, 8.5791f, 12.4365f)
                curveTo(8.95996f, 12.7697f, 9.5779f, 13f, 10.5f, 13f)
                curveTo(10.7761f, 13f, 11f, 13.2239f, 11f, 13.5f)
                curveTo(11f, 13.7761f, 10.7761f, 14f, 10.5f, 14f)
                curveTo(9.42215f, 14f, 8.54005f, 13.7302f, 7.9209f, 13.1885f)
                curveTo(7.75828f, 13.0462f, 7.6184f, 12.8888f, 7.5f, 12.7188f)
                curveTo(7.3816f, 12.8888f, 7.24172f, 13.0462f, 7.0791f, 13.1885f)
                curveTo(6.45995f, 13.7302f, 5.57785f, 14f, 4.5f, 14f)
                curveTo(4.22386f, 14f, 4f, 13.7761f, 4f, 13.5f)
                curveTo(4f, 13.2239f, 4.22386f, 13f, 4.5f, 13f)
                curveTo(5.4221f, 13f, 6.04004f, 12.7697f, 6.4209f, 12.4365f)
                curveTo(6.79301f, 12.1109f, 7f, 11.6337f, 7f, 11f)
                verticalLineTo(8f)
                horizontalLineTo(5.75f)
                curveTo(5.47386f, 8f, 5.25f, 7.77614f, 5.25f, 7.5f)
                curveTo(5.25f, 7.22386f, 5.47386f, 7f, 5.75f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                curveTo(7f, 3.36626f, 6.79301f, 2.88907f, 6.4209f, 2.56348f)
                curveTo(6.04004f, 2.23026f, 5.4221f, 2f, 4.5f, 2f)
                curveTo(4.22386f, 2f, 4f, 1.77614f, 4f, 1.5f)
                curveTo(4f, 1.22386f, 4.22386f, 1f, 4.5f, 1f)
                curveTo(5.57785f, 1f, 6.45995f, 1.26977f, 7.0791f, 1.81152f)
                curveTo(7.24151f, 1.95364f, 7.3817f, 2.11048f, 7.5f, 2.28027f)
                curveTo(7.6183f, 2.11048f, 7.75849f, 1.95364f, 7.9209f, 1.81152f)
                curveTo(8.54005f, 1.26977f, 9.42215f, 1f, 10.5f, 1f)
                close()
            }
        }.build()
        
        return _CursorText!!
    }

private var _CursorText: ImageVector? = null

