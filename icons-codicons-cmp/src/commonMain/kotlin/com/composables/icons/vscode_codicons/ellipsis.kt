package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Ellipsis: ImageVector
    get() {
        if (_Ellipsis != null) return _Ellipsis!!
        
        _Ellipsis = ImageVector.Builder(
            name = "ellipsis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 8f)
                curveTo(5f, 8.55229f, 4.55228f, 9f, 4f, 9f)
                curveTo(3.44772f, 9f, 3f, 8.55229f, 3f, 8f)
                curveTo(3f, 7.44772f, 3.44772f, 7f, 4f, 7f)
                curveTo(4.55228f, 7f, 5f, 7.44772f, 5f, 8f)
                close()
                moveTo(9f, 8f)
                curveTo(9f, 8.55229f, 8.55229f, 9f, 8f, 9f)
                curveTo(7.44772f, 9f, 7f, 8.55229f, 7f, 8f)
                curveTo(7f, 7.44772f, 7.44772f, 7f, 8f, 7f)
                curveTo(8.55229f, 7f, 9f, 7.44772f, 9f, 8f)
                close()
                moveTo(12f, 9f)
                curveTo(12.5523f, 9f, 13f, 8.55229f, 13f, 8f)
                curveTo(13f, 7.44772f, 12.5523f, 7f, 12f, 7f)
                curveTo(11.4477f, 7f, 11f, 7.44772f, 11f, 8f)
                curveTo(11f, 8.55229f, 11.4477f, 9f, 12f, 9f)
                close()
            }
        }.build()
        
        return _Ellipsis!!
    }

private var _Ellipsis: ImageVector? = null

