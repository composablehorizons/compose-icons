package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Account: ImageVector
    get() {
        if (_Account != null) return _Account!!
        
        _Account = ImageVector.Builder(
            name = "account",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
                curveTo(2f, 11.314f, 4.686f, 14f, 8f, 14f)
                curveTo(11.314f, 14f, 14f, 11.314f, 14f, 8f)
                curveTo(14f, 4.686f, 11.314f, 2f, 8f, 2f)
                close()
                moveTo(1f, 8f)
                curveTo(1f, 4.134f, 4.134f, 1f, 8f, 1f)
                curveTo(11.866f, 1f, 15f, 4.134f, 15f, 8f)
                curveTo(15f, 11.866f, 11.866f, 15f, 8f, 15f)
                curveTo(4.134f, 15f, 1f, 11.866f, 1f, 8f)
                close()
                moveTo(8f, 12.25f)
                curveTo(9.933f, 12.25f, 11.5f, 11.036f, 11.5f, 9.214f)
                curveTo(11.5f, 8.543f, 10.956f, 8f, 10.286f, 8f)
                horizontalLineTo(5.715f)
                curveTo(5.044f, 8f, 4.501f, 8.544f, 4.501f, 9.214f)
                curveTo(4.501f, 11.035f, 6.068f, 12.25f, 8.001f, 12.25f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 7.25f)
                curveTo(9.036f, 7.25f, 9.875f, 6.411f, 9.875f, 5.375f)
                curveTo(9.875f, 4.339f, 9.036f, 3.5f, 8f, 3.5f)
                curveTo(6.964f, 3.5f, 6.125f, 4.339f, 6.125f, 5.375f)
                curveTo(6.125f, 6.411f, 6.964f, 7.25f, 8f, 7.25f)
                close()
            }
        }.build()
        
        return _Account!!
    }

private var _Account: ImageVector? = null

