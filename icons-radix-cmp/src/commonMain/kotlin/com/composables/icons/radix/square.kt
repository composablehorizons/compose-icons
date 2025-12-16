package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Square: ImageVector
    get() {
        if (_Square != null) return _Square!!
        
        _Square = ImageVector.Builder(
            name = "square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 14f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                close()
                moveTo(2f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _Square!!
    }

private var _Square: ImageVector? = null

