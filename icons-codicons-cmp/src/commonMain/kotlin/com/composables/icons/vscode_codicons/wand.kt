package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Wand: ImageVector
    get() {
        if (_Wand != null) return _Wand!!
        
        _Wand = ImageVector.Builder(
            name = "wand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 1f)
                curveTo(13.7761f, 1f, 14f, 1.22386f, 14f, 1.5f)
                verticalLineTo(2f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 2f, 15f, 2.22386f, 15f, 2.5f)
                curveTo(15f, 2.77614f, 14.7761f, 3f, 14.5f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(3.5f)
                curveTo(14f, 3.77614f, 13.7761f, 4f, 13.5f, 4f)
                curveTo(13.2239f, 4f, 13f, 3.77614f, 13f, 3.5f)
                verticalLineTo(3f)
                horizontalLineTo(12.5f)
                curveTo(12.2239f, 3f, 12f, 2.77614f, 12f, 2.5f)
                curveTo(12f, 2.22386f, 12.2239f, 2f, 12.5f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(1.5f)
                curveTo(13f, 1.22386f, 13.2239f, 1f, 13.5f, 1f)
                close()
                moveTo(3.5f, 3f)
                curveTo(3.77615f, 3f, 4f, 3.22386f, 4f, 3.5f)
                verticalLineTo(4f)
                horizontalLineTo(4.5f)
                curveTo(4.77615f, 4f, 5f, 4.22386f, 5f, 4.5f)
                curveTo(5f, 4.77614f, 4.77615f, 5f, 4.5f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(5.5f)
                curveTo(4f, 5.77614f, 3.77615f, 6f, 3.5f, 6f)
                curveTo(3.22386f, 6f, 3f, 5.77614f, 3f, 5.5f)
                verticalLineTo(5f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 5f, 2f, 4.77614f, 2f, 4.5f)
                curveTo(2f, 4.22386f, 2.22386f, 4f, 2.5f, 4f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                curveTo(3f, 3.22386f, 3.22386f, 3f, 3.5f, 3f)
                close()
                moveTo(12.5f, 12f)
                curveTo(12.7761f, 12f, 13f, 11.7761f, 13f, 11.5f)
                curveTo(13f, 11.2239f, 12.7761f, 11f, 12.5f, 11f)
                horizontalLineTo(12f)
                verticalLineTo(10.5f)
                curveTo(12f, 10.2239f, 11.7761f, 10f, 11.5f, 10f)
                curveTo(11.2239f, 10f, 11f, 10.2239f, 11f, 10.5f)
                verticalLineTo(11f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 11f, 10f, 11.2239f, 10f, 11.5f)
                curveTo(10f, 11.7761f, 10.2239f, 12f, 10.5f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(12.5f)
                curveTo(11f, 12.7761f, 11.2239f, 13f, 11.5f, 13f)
                curveTo(11.7761f, 13f, 12f, 12.7761f, 12f, 12.5f)
                verticalLineTo(12f)
                horizontalLineTo(12.5f)
                close()
                moveTo(8.72956f, 4.56346f)
                curveTo(9.4771f, 3.81592f, 10.6891f, 3.81592f, 11.4367f, 4.56347f)
                curveTo(12.1842f, 5.31102f, 12.1842f, 6.52303f, 11.4367f, 7.27058f)
                lineTo(4.26679f, 14.4404f)
                curveTo(3.51924f, 15.1879f, 2.30723f, 15.1879f, 1.55968f, 14.4404f)
                curveTo(0.812134f, 13.6928f, 0.812138f, 12.4808f, 1.55969f, 11.7333f)
                lineTo(8.72956f, 4.56346f)
                close()
                moveTo(8.25002f, 6.4572f)
                lineTo(2.26679f, 12.4404f)
                curveTo(1.90977f, 12.7974f, 1.90977f, 13.3763f, 2.26679f, 13.7333f)
                curveTo(2.62381f, 14.0903f, 3.20266f, 14.0903f, 3.55968f, 13.7333f)
                lineTo(9.54292f, 7.75009f)
                lineTo(8.25002f, 6.4572f)
                close()
                moveTo(10.25f, 7.04299f)
                lineTo(10.7295f, 6.56347f)
                curveTo(11.0866f, 6.20645f, 11.0866f, 5.6276f, 10.7296f, 5.27057f)
                curveTo(10.3725f, 4.91355f, 9.79368f, 4.91355f, 9.43666f, 5.27057f)
                lineTo(8.95713f, 5.7501f)
                lineTo(10.25f, 7.04299f)
                close()
            }
        }.build()
        
        return _Wand!!
    }

private var _Wand: ImageVector? = null

