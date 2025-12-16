package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) return _Clipboard!!
        
        _Clipboard = ImageVector.Builder(
            name = "clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.25f, 0f)
                curveTo(10.6642f, 0f, 11f, 0.335786f, 11f, 0.75f)
                verticalLineTo(1f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 1f, 13f, 1.67157f, 13f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(13f, 13.3284f, 12.3284f, 14f, 11.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14f, 2f, 13.3284f, 2f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(2f, 1.67157f, 2.67157f, 1f, 3.5f, 1f)
                horizontalLineTo(4f)
                verticalLineTo(0.75f)
                curveTo(4f, 0.335786f, 4.33579f, 9.39539E-9f, 4.75f, 0f)
                horizontalLineTo(10.25f)
                close()
                moveTo(3.5f, 2f)
                curveTo(3.22386f, 2f, 3f, 2.22386f, 3f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 12.7761f, 3.22386f, 13f, 3.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 13f, 12f, 12.7761f, 12f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(12f, 2.22386f, 11.7761f, 2f, 11.5f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(2.25f)
                curveTo(11f, 2.66421f, 10.6642f, 3f, 10.25f, 3f)
                horizontalLineTo(4.75f)
                curveTo(4.33579f, 3f, 4f, 2.66421f, 4f, 2.25f)
                verticalLineTo(2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(5f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Clipboard!!
    }

private var _Clipboard: ImageVector? = null

