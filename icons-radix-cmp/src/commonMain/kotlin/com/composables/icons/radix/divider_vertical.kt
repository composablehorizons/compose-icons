package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DividerVertical: ImageVector
    get() {
        if (_DividerVertical != null) return _DividerVertical!!
        
        _DividerVertical = ImageVector.Builder(
            name = "divider-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 2f)
                curveTo(7.77614f, 2f, 8f, 2.22386f, 8f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(8f, 12.7761f, 7.77614f, 13f, 7.5f, 13f)
                curveTo(7.22386f, 13f, 7f, 12.7761f, 7f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(7f, 2.22386f, 7.22386f, 2f, 7.5f, 2f)
                close()
            }
        }.build()
        
        return _DividerVertical!!
    }

private var _DividerVertical: ImageVector? = null

