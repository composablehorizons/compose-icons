package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VmSmall: ImageVector
    get() {
        if (_VmSmall != null) return _VmSmall!!
        
        _VmSmall = ImageVector.Builder(
            name = "vm-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 10f,
            viewportHeight = 10f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 0f)
                horizontalLineTo(1f)
                curveTo(0.449f, 0f, 0f, 0.448f, 0f, 1f)
                verticalLineTo(6f)
                curveTo(0f, 6.552f, 0.449f, 7f, 1f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                curveTo(1.724f, 8f, 1.5f, 8.224f, 1.5f, 8.5f)
                curveTo(1.5f, 8.776f, 1.724f, 9f, 2f, 9f)
                horizontalLineTo(8f)
                curveTo(8.276f, 9f, 8.5f, 8.776f, 8.5f, 8.5f)
                curveTo(8.5f, 8.224f, 8.276f, 8f, 8f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                curveTo(9.552f, 7f, 10f, 6.552f, 10f, 6f)
                verticalLineTo(1f)
                curveTo(10f, 0.448f, 9.552f, 0f, 9f, 0f)
                close()
                moveTo(6f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                close()
                moveTo(9f, 6f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _VmSmall!!
    }

private var _VmSmall: ImageVector? = null

