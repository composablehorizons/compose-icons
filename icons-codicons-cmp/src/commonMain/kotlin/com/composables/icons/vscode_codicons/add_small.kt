package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.AddSmall: ImageVector
    get() {
        if (_AddSmall != null) return _AddSmall!!
        
        _AddSmall = ImageVector.Builder(
            name = "add-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 11f,
            viewportHeight = 11f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 5.5f)
                curveTo(11f, 5.776f, 10.776f, 6f, 10.5f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(10.5f)
                curveTo(6f, 10.776f, 5.776f, 11f, 5.5f, 11f)
                curveTo(5.224f, 11f, 5f, 10.776f, 5f, 10.5f)
                verticalLineTo(6f)
                horizontalLineTo(0.5f)
                curveTo(0.224f, 6f, 0f, 5.776f, 0f, 5.5f)
                curveTo(0f, 5.224f, 0.224f, 5f, 0.5f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(0.5f)
                curveTo(5f, 0.224f, 5.224f, 0f, 5.5f, 0f)
                curveTo(5.776f, 0f, 6f, 0.224f, 6f, 0.5f)
                verticalLineTo(5f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 5f, 11f, 5.224f, 11f, 5.5f)
                close()
            }
        }.build()
        
        return _AddSmall!!
    }

private var _AddSmall: ImageVector? = null

