package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DividerHorizontal: ImageVector
    get() {
        if (_DividerHorizontal != null) return _DividerHorizontal!!
        
        _DividerHorizontal = ImageVector.Builder(
            name = "divider-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 7f)
                curveTo(12.7761f, 7f, 13f, 7.22386f, 13f, 7.5f)
                curveTo(13f, 7.77614f, 12.7761f, 8f, 12.5f, 8f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 8f, 2f, 7.77614f, 2f, 7.5f)
                curveTo(2f, 7.22386f, 2.22386f, 7f, 2.5f, 7f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _DividerHorizontal!!
    }

private var _DividerHorizontal: ImageVector? = null

