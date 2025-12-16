package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FileMinus: ImageVector
    get() {
        if (_FileMinus != null) return _FileMinus!!
        
        _FileMinus = ImageVector.Builder(
            name = "file-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.59766f, 1.00977f)
                curveTo(9.69389f, 1.02894f, 9.78311f, 1.07608f, 9.85352f, 1.14648f)
                lineTo(12.7803f, 4.07324f)
                curveTo(12.9209f, 4.21389f, 13f, 4.40462f, 13f, 4.60352f)
                verticalLineTo(12.5f)
                curveTo(13f, 13.3284f, 12.3284f, 14f, 11.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14f, 2f, 13.3284f, 2f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(2f, 1.67157f, 2.67157f, 1f, 3.5f, 1f)
                horizontalLineTo(9.5f)
                lineTo(9.59766f, 1.00977f)
                close()
                moveTo(3.5f, 2f)
                curveTo(3.22386f, 2f, 3f, 2.22386f, 3f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 12.7761f, 3.22386f, 13f, 3.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 13f, 12f, 12.7761f, 12f, 12.5f)
                verticalLineTo(4.70703f)
                lineTo(9.29297f, 2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(9.75f, 7f)
                curveTo(10.0261f, 7f, 10.25f, 7.22386f, 10.25f, 7.5f)
                curveTo(10.25f, 7.77614f, 10.0261f, 8f, 9.75f, 8f)
                horizontalLineTo(5.25f)
                curveTo(4.97386f, 8f, 4.75f, 7.77614f, 4.75f, 7.5f)
                curveTo(4.75f, 7.22386f, 4.97386f, 7f, 5.25f, 7f)
                horizontalLineTo(9.75f)
                close()
            }
        }.build()
        
        return _FileMinus!!
    }

private var _FileMinus: ImageVector? = null

