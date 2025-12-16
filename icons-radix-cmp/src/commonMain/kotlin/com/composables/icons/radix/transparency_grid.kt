package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TransparencyGrid: ImageVector
    get() {
        if (_TransparencyGrid != null) return _TransparencyGrid!!
        
        _TransparencyGrid = ImageVector.Builder(
            name = "transparency-grid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 15f)
                horizontalLineTo(0f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                close()
                moveTo(9f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                close()
                moveTo(15f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                close()
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                close()
                moveTo(12f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                close()
                moveTo(3f, 9f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                close()
                moveTo(9f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                close()
                moveTo(15f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                close()
                moveTo(6f, 6f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
                moveTo(12f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
                moveTo(9f, 3f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                close()
                moveTo(15f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(0f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _TransparencyGrid!!
    }

private var _TransparencyGrid: ImageVector? = null

