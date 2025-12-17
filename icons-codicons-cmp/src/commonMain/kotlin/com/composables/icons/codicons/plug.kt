package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Plug: ImageVector
    get() {
        if (_Plug != null) return _Plug!!
        
        _Plug = ImageVector.Builder(
            name = "plug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.723f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(1.5f)
                curveTo(10f, 1.224f, 9.776f, 1f, 9.5f, 1f)
                curveTo(9.224f, 1f, 9f, 1.224f, 9f, 1.5f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(1.5f)
                curveTo(7f, 1.224f, 6.776f, 1f, 6.5f, 1f)
                curveTo(6.224f, 1f, 6f, 1.224f, 6f, 1.5f)
                verticalLineTo(4f)
                horizontalLineTo(5.277f)
                curveTo(4.573f, 4f, 4f, 4.573f, 4f, 5.278f)
                verticalLineTo(8f)
                curveTo(4f, 10.036f, 5.529f, 11.722f, 7.5f, 11.969f)
                verticalLineTo(14.5f)
                curveTo(7.5f, 14.776f, 7.724f, 15f, 8f, 15f)
                curveTo(8.276f, 15f, 8.5f, 14.776f, 8.5f, 14.5f)
                verticalLineTo(11.969f)
                curveTo(10.471f, 11.722f, 12f, 10.037f, 12f, 8f)
                verticalLineTo(5.278f)
                curveTo(12f, 4.573f, 11.427f, 4f, 10.723f, 4f)
                close()
                moveTo(11f, 8f)
                curveTo(11f, 9.654f, 9.654f, 11f, 8f, 11f)
                curveTo(6.346f, 11f, 5f, 9.654f, 5f, 8f)
                verticalLineTo(5.278f)
                curveTo(5f, 5.125f, 5.124f, 5f, 5.277f, 5f)
                horizontalLineTo(10.722f)
                curveTo(10.875f, 5f, 10.999f, 5.125f, 10.999f, 5.278f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                close()
            }
        }.build()
        
        return _Plug!!
    }

private var _Plug: ImageVector? = null

