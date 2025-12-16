package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Json: ImageVector
    get() {
        if (_Json != null) return _Json!!
        
        _Json = ImageVector.Builder(
            name = "json",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 2f)
                curveTo(3.89543f, 2f, 3f, 2.89543f, 3f, 4f)
                verticalLineTo(6.00469f)
                curveTo(3f, 6.53494f, 2.99231f, 6.79889f, 2.91088f, 7.00209f)
                curveTo(2.84826f, 7.15835f, 2.71576f, 7.33309f, 2.2764f, 7.55276f)
                curveTo(2.10701f, 7.63745f, 2f, 7.81058f, 2f, 7.99997f)
                curveTo(2f, 8.18935f, 2.10699f, 8.36249f, 2.27638f, 8.44719f)
                curveTo(2.71569f, 8.66685f, 2.84809f, 8.84151f, 2.91076f, 8.99819f)
                curveTo(2.99233f, 9.20211f, 3f, 9.46732f, 3f, 10f)
                lineTo(3f, 12f)
                curveTo(3f, 13.1046f, 3.89543f, 14f, 5f, 14f)
                curveTo(5.27614f, 14f, 5.5f, 13.7761f, 5.5f, 13.5f)
                curveTo(5.5f, 13.2239f, 5.27614f, 13f, 5f, 13f)
                curveTo(4.44772f, 13f, 4f, 12.5523f, 4f, 12f)
                lineTo(4.00003f, 9.94145f)
                curveTo(4.00033f, 9.49235f, 4.00065f, 9.03033f, 3.83924f, 8.6268f)
                curveTo(3.74212f, 8.384f, 3.59654f, 8.17962f, 3.40072f, 8.00002f)
                curveTo(3.59646f, 7.82057f, 3.74199f, 7.61645f, 3.83912f, 7.37408f)
                curveTo(4.00065f, 6.971f, 4.00033f, 6.51001f, 4.00003f, 6.063f)
                lineTo(4f, 4f)
                curveTo(4f, 3.44772f, 4.44772f, 3f, 5f, 3f)
                curveTo(5.27614f, 3f, 5.5f, 2.77614f, 5.5f, 2.5f)
                curveTo(5.5f, 2.22386f, 5.27614f, 2f, 5f, 2f)
                close()
                moveTo(11f, 2f)
                curveTo(12.1046f, 2f, 13f, 2.89543f, 13f, 4f)
                verticalLineTo(6.00469f)
                curveTo(13f, 6.53494f, 13.0077f, 6.79889f, 13.0891f, 7.00209f)
                curveTo(13.1517f, 7.15835f, 13.2842f, 7.33309f, 13.7236f, 7.55276f)
                curveTo(13.893f, 7.63745f, 14f, 7.81058f, 14f, 7.99997f)
                curveTo(14f, 8.18935f, 13.893f, 8.36249f, 13.7236f, 8.44719f)
                curveTo(13.2843f, 8.66685f, 13.1519f, 8.84151f, 13.0892f, 8.99819f)
                curveTo(13.0077f, 9.20211f, 13f, 9.46732f, 13f, 10f)
                verticalLineTo(12f)
                curveTo(13f, 13.1046f, 12.1046f, 14f, 11f, 14f)
                curveTo(10.7239f, 14f, 10.5f, 13.7761f, 10.5f, 13.5f)
                curveTo(10.5f, 13.2239f, 10.7239f, 13f, 11f, 13f)
                curveTo(11.5523f, 13f, 12f, 12.5523f, 12f, 12f)
                lineTo(12f, 9.94145f)
                curveTo(11.9997f, 9.49235f, 11.9994f, 9.03033f, 12.1608f, 8.6268f)
                curveTo(12.2579f, 8.384f, 12.4035f, 8.17962f, 12.5993f, 8.00002f)
                curveTo(12.4035f, 7.82057f, 12.258f, 7.61645f, 12.1609f, 7.37408f)
                curveTo(11.9993f, 6.971f, 11.9997f, 6.51001f, 12f, 6.063f)
                lineTo(12f, 4f)
                curveTo(12f, 3.44772f, 11.5523f, 3f, 11f, 3f)
                curveTo(10.7239f, 3f, 10.5f, 2.77614f, 10.5f, 2.5f)
                curveTo(10.5f, 2.22386f, 10.7239f, 2f, 11f, 2f)
                close()
            }
        }.build()
        
        return _Json!!
    }

private var _Json: ImageVector? = null

