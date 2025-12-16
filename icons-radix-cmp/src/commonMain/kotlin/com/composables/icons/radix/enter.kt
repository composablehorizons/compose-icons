package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Enter: ImageVector
    get() {
        if (_Enter != null) return _Enter!!
        
        _Enter = ImageVector.Builder(
            name = "enter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1f)
                curveTo(12.5523f, 1f, 13f, 1.44772f, 13f, 2f)
                verticalLineTo(13f)
                curveTo(13f, 13.5523f, 12.5523f, 14f, 12f, 14f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 14f, 4f, 13.7761f, 4f, 13.5f)
                curveTo(4f, 13.2239f, 4.22386f, 13f, 4.5f, 13f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 2f, 4f, 1.77614f, 4f, 1.5f)
                curveTo(4f, 1.22386f, 4.22386f, 1f, 4.5f, 1f)
                horizontalLineTo(12f)
                close()
                moveTo(5.89648f, 4.89648f)
                curveTo(6.06735f, 4.72562f, 6.33131f, 4.70387f, 6.52539f, 4.83203f)
                lineTo(6.60352f, 4.89648f)
                lineTo(8.85352f, 7.14648f)
                lineTo(8.91797f, 7.22461f)
                curveTo(9.04613f, 7.41869f, 9.02438f, 7.68265f, 8.85352f, 7.85352f)
                lineTo(6.60352f, 10.1035f)
                curveTo(6.40825f, 10.2988f, 6.09175f, 10.2988f, 5.89648f, 10.1035f)
                curveTo(5.70122f, 9.90825f, 5.70122f, 9.59175f, 5.89648f, 9.39648f)
                lineTo(7.29297f, 8f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 8f, 0f, 7.77614f, 0f, 7.5f)
                curveTo(0f, 7.22386f, 0.223858f, 7f, 0.5f, 7f)
                horizontalLineTo(7.29297f)
                lineTo(5.89648f, 5.60352f)
                lineTo(5.83203f, 5.52539f)
                curveTo(5.70387f, 5.33131f, 5.72562f, 5.06735f, 5.89648f, 4.89648f)
                close()
            }
        }.build()
        
        return _Enter!!
    }

private var _Enter: ImageVector? = null

