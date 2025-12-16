package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Clockface: ImageVector
    get() {
        if (_Clockface != null) return _Clockface!!
        
        _Clockface = ImageVector.Builder(
            name = "clockface",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 8f)
                curveTo(2f, 4.68629f, 4.68629f, 2f, 8f, 2f)
                curveTo(11.3137f, 2f, 14f, 4.68629f, 14f, 8f)
                curveTo(14f, 11.3137f, 11.3137f, 14f, 8f, 14f)
                curveTo(4.68629f, 14f, 2f, 11.3137f, 2f, 8f)
                close()
                moveTo(8f, 1f)
                curveTo(4.13401f, 1f, 1f, 4.13401f, 1f, 8f)
                curveTo(1f, 11.866f, 4.13401f, 15f, 8f, 15f)
                curveTo(11.866f, 15f, 15f, 11.866f, 15f, 8f)
                curveTo(15f, 4.13401f, 11.866f, 1f, 8f, 1f)
                close()
                moveTo(8f, 4.5f)
                curveTo(8f, 4.22386f, 7.77614f, 4f, 7.5f, 4f)
                curveTo(7.22386f, 4f, 7f, 4.22386f, 7f, 4.5f)
                verticalLineTo(8.5f)
                curveTo(7f, 8.77614f, 7.22386f, 9f, 7.5f, 9f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 9f, 11f, 8.77614f, 11f, 8.5f)
                curveTo(11f, 8.22386f, 10.7761f, 8f, 10.5f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _Clockface!!
    }

private var _Clockface: ImageVector? = null

