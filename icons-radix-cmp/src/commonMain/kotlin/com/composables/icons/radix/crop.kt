package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Crop: ImageVector
    get() {
        if (_Crop != null) return _Crop!!
        
        _Crop = ImageVector.Builder(
            name = "crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(-5.0268E-7f, 3.5f)
                curveTo(5.61896E-6f, 3.22386f, 0.223862f, 3f, 0.499999f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 0.5f)
                curveTo(3f, 0.223858f, 3.22386f, -1.40919E-7f, 3.5f, -1.5299E-7f)
                curveTo(3.77614f, -1.6506E-7f, 4f, 0.223858f, 4f, 0.5f)
                lineTo(4f, 3f)
                lineTo(11.5f, 3f)
                curveTo(11.7761f, 3f, 12f, 3.22389f, 12f, 3.5f)
                lineTo(12f, 11f)
                lineTo(14.5f, 11f)
                lineTo(14.6006f, 11.0098f)
                curveTo(14.8285f, 11.0563f, 15f, 11.2583f, 15f, 11.5f)
                curveTo(15f, 11.7417f, 14.8286f, 11.9437f, 14.6006f, 11.9902f)
                lineTo(14.5f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 14.5f)
                curveTo(12f, 14.7761f, 11.7761f, 15f, 11.5f, 15f)
                curveTo(11.2239f, 15f, 11f, 14.7761f, 11f, 14.5f)
                lineTo(11f, 12f)
                lineTo(3.5f, 12f)
                curveTo(3.22386f, 12f, 3f, 11.7761f, 3f, 11.5f)
                lineTo(3f, 4f)
                lineTo(0.5f, 4f)
                curveTo(0.22386f, 3.99999f, -8.80855E-7f, 3.77614f, -5.0268E-7f, 3.5f)
                close()
                moveTo(11f, 11f)
                lineTo(11f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 11f)
                lineTo(11f, 11f)
                close()
            }
        }.build()
        
        return _Crop!!
    }

private var _Crop: ImageVector? = null

