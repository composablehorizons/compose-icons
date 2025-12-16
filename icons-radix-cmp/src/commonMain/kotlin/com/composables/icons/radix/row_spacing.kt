package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.RowSpacing: ImageVector
    get() {
        if (_RowSpacing != null) return _RowSpacing!!
        
        _RowSpacing = ImageVector.Builder(
            name = "row-spacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49994f, 9.05003f)
                curveTo(7.74839f, 9.05003f, 7.95f, 9.25181f, 7.95013f, 9.50022f)
                verticalLineTo(12.9133f)
                lineTo(9.18158f, 11.6819f)
                curveTo(9.35732f, 11.5061f, 9.64256f, 11.5061f, 9.8183f, 11.6819f)
                curveTo(9.99403f, 11.8576f, 9.99403f, 12.1428f, 9.8183f, 12.3186f)
                lineTo(7.8183f, 14.3186f)
                curveTo(7.73392f, 14.4029f, 7.6192f, 14.4504f, 7.49994f, 14.4504f)
                curveTo(7.41033f, 14.4504f, 7.32336f, 14.4233f, 7.24994f, 14.3742f)
                lineTo(7.18158f, 14.3186f)
                lineTo(5.18158f, 12.3186f)
                lineTo(5.12396f, 12.2483f)
                curveTo(5.0085f, 12.0736f, 5.02791f, 11.8357f, 5.18158f, 11.6819f)
                curveTo(5.33541f, 11.528f, 5.5733f, 11.5088f, 5.74799f, 11.6242f)
                lineTo(5.8183f, 11.6819f)
                lineTo(7.04974f, 12.9133f)
                verticalLineTo(9.50022f)
                curveTo(7.04988f, 9.25187f, 7.25158f, 9.05013f, 7.49994f, 9.05003f)
                close()
                moveTo(13.6005f, 7.00999f)
                curveTo(13.8285f, 7.05652f, 13.9999f, 7.25851f, 13.9999f, 7.50022f)
                curveTo(13.9999f, 7.74193f, 13.8285f, 7.94393f, 13.6005f, 7.99046f)
                lineTo(13.4999f, 8.00022f)
                horizontalLineTo(1.49994f)
                curveTo(1.2238f, 8.00022f, 0.999946f, 7.77636f, 0.999939f, 7.50022f)
                curveTo(0.999939f, 7.22408f, 1.2238f, 7.00022f, 1.49994f, 7.00022f)
                horizontalLineTo(13.4999f)
                lineTo(13.6005f, 7.00999f)
                close()
                moveTo(7.25189f, 0.624246f)
                curveTo(7.42658f, 0.508733f, 7.66445f, 0.52802f, 7.8183f, 0.681864f)
                lineTo(9.8183f, 2.68186f)
                lineTo(9.87592f, 2.75218f)
                curveTo(9.99139f, 2.92686f, 9.97213f, 3.16475f, 9.8183f, 3.31858f)
                curveTo(9.66445f, 3.47225f, 9.42651f, 3.49167f, 9.25189f, 3.3762f)
                lineTo(9.18158f, 3.31858f)
                lineTo(7.95013f, 2.08714f)
                verticalLineTo(5.50022f)
                curveTo(7.95003f, 5.74866f, 7.7484f, 5.95042f, 7.49994f, 5.95042f)
                curveTo(7.25156f, 5.95032f, 7.04985f, 5.7486f, 7.04974f, 5.50022f)
                verticalLineTo(2.08714f)
                lineTo(5.8183f, 3.31858f)
                curveTo(5.64255f, 3.49413f, 5.35725f, 3.49425f, 5.18158f, 3.31858f)
                curveTo(5.00591f, 3.14291f, 5.00603f, 2.85761f, 5.18158f, 2.68186f)
                lineTo(7.18158f, 0.681864f)
                lineTo(7.25189f, 0.624246f)
                close()
            }
        }.build()
        
        return _RowSpacing!!
    }

private var _RowSpacing: ImageVector? = null

