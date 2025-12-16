package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Vm: ImageVector
    get() {
        if (_Vm != null) return _Vm!!
        
        _Vm = ImageVector.Builder(
            name = "vm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 1f)
                curveTo(1.895f, 1f, 1f, 1.895f, 1f, 3f)
                verticalLineTo(10f)
                curveTo(1f, 11.105f, 1.895f, 12f, 3f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 14f, 3f, 14.224f, 3f, 14.5f)
                curveTo(3f, 14.776f, 3.224f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 15f, 13f, 14.776f, 13f, 14.5f)
                curveTo(13f, 14.224f, 12.776f, 14f, 12.5f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                curveTo(14.105f, 12f, 15f, 11.105f, 15f, 10f)
                verticalLineTo(3f)
                curveTo(15f, 1.895f, 14.105f, 1f, 13f, 1f)
                horizontalLineTo(3f)
                close()
                moveTo(10f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                close()
                moveTo(2f, 3f)
                curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(10f)
                curveTo(14f, 10.552f, 13.552f, 11f, 13f, 11f)
                horizontalLineTo(3f)
                curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Vm!!
    }

private var _Vm: ImageVector? = null

