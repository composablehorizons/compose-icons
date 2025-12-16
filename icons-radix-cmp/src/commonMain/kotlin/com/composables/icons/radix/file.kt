package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.File: ImageVector
    get() {
        if (_File != null) return _File!!
        
        _File = ImageVector.Builder(
            name = "file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.59766f, 1.00977f)
                curveTo(8.69389f, 1.02894f, 8.78311f, 1.07608f, 8.85352f, 1.14648f)
                lineTo(12.8535f, 5.14648f)
                curveTo(12.9473f, 5.24025f, 13f, 5.36739f, 13f, 5.5f)
                verticalLineTo(12.5f)
                curveTo(13f, 13.3284f, 12.3284f, 14f, 11.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14f, 2f, 13.3284f, 2f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(2f, 1.67157f, 2.67157f, 1f, 3.5f, 1f)
                horizontalLineTo(8.5f)
                lineTo(8.59766f, 1.00977f)
                close()
                moveTo(3.5f, 2f)
                curveTo(3.22386f, 2f, 3f, 2.22386f, 3f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 12.7761f, 3.22386f, 13f, 3.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 13f, 12f, 12.7761f, 12f, 12.5f)
                verticalLineTo(6f)
                horizontalLineTo(8.5f)
                curveTo(8.22386f, 6f, 8f, 5.77614f, 8f, 5.5f)
                verticalLineTo(2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(9f, 5f)
                horizontalLineTo(11.293f)
                lineTo(9f, 2.70703f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _File!!
    }

private var _File: ImageVector? = null

