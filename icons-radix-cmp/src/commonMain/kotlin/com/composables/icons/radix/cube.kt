package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Cube: ImageVector
    get() {
        if (_Cube != null) return _Cube!!
        
        _Cube = ImageVector.Builder(
            name = "cube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.39258f, 0.761694f)
                curveTo(7.49888f, 0.738311f, 7.61147f, 0.749978f, 7.71191f, 0.796851f)
                lineTo(13.7119f, 3.59666f)
                curveTo(13.8877f, 3.67884f, 13.9999f, 3.85571f, 14f, 4.04978f)
                verticalLineTo(10.9502f)
                curveTo(13.9999f, 11.1442f, 13.8877f, 11.3211f, 13.7119f, 11.4033f)
                lineTo(7.71191f, 14.2031f)
                curveTo(7.57789f, 14.2656f, 7.42211f, 14.2656f, 7.28809f, 14.2031f)
                lineTo(1.28809f, 11.4033f)
                curveTo(1.11228f, 11.3211f, 1.00008f, 11.1442f, 1f, 10.9502f)
                verticalLineTo(4.04978f)
                curveTo(1.00008f, 3.85571f, 1.11228f, 3.67884f, 1.28809f, 3.59666f)
                lineTo(7.28809f, 0.796851f)
                lineTo(7.39258f, 0.761694f)
                close()
                moveTo(2f, 10.6308f)
                lineTo(7f, 12.9638f)
                verticalLineTo(6.93064f)
                lineTo(2f, 4.80466f)
                verticalLineTo(10.6308f)
                close()
                moveTo(8f, 6.93064f)
                verticalLineTo(12.9638f)
                lineTo(13f, 10.6308f)
                verticalLineTo(4.80466f)
                lineTo(8f, 6.93064f)
                close()
                moveTo(2.72754f, 4.0283f)
                lineTo(7.5f, 6.05662f)
                lineTo(12.2715f, 4.0283f)
                lineTo(7.5f, 1.80173f)
                lineTo(2.72754f, 4.0283f)
                close()
            }
        }.build()
        
        return _Cube!!
    }

private var _Cube: ImageVector? = null

