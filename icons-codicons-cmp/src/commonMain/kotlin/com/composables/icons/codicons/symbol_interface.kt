package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolInterface: ImageVector
    get() {
        if (_SymbolInterface != null) return _SymbolInterface!!
        
        _SymbolInterface = ImageVector.Builder(
            name = "symbol-interface",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 4.5f)
                curveTo(9.742f, 4.5f, 8.296f, 5.808f, 8.051f, 7.5f)
                horizontalLineTo(4.929f)
                curveTo(4.705f, 6.64f, 3.929f, 6f, 3f, 6f)
                curveTo(1.897f, 6f, 1f, 6.897f, 1f, 8f)
                curveTo(1f, 9.103f, 1.897f, 10f, 3f, 10f)
                curveTo(3.929f, 10f, 4.705f, 9.36f, 4.929f, 8.5f)
                horizontalLineTo(8.051f)
                curveTo(8.296f, 10.192f, 9.742f, 11.5f, 11.5f, 11.5f)
                curveTo(13.43f, 11.5f, 15f, 9.93f, 15f, 8f)
                curveTo(15f, 6.07f, 13.43f, 4.5f, 11.5f, 4.5f)
                close()
                moveTo(3f, 9f)
                curveTo(2.448f, 9f, 2f, 8.551f, 2f, 8f)
                curveTo(2f, 7.449f, 2.448f, 7f, 3f, 7f)
                curveTo(3.552f, 7f, 4f, 7.449f, 4f, 8f)
                curveTo(4f, 8.551f, 3.552f, 9f, 3f, 9f)
                close()
                moveTo(11.5f, 10.5f)
                curveTo(10.121f, 10.5f, 9f, 9.378f, 9f, 8f)
                curveTo(9f, 6.622f, 10.121f, 5.5f, 11.5f, 5.5f)
                curveTo(12.879f, 5.5f, 14f, 6.622f, 14f, 8f)
                curveTo(14f, 9.378f, 12.879f, 10.5f, 11.5f, 10.5f)
                close()
            }
        }.build()
        
        return _SymbolInterface!!
    }

private var _SymbolInterface: ImageVector? = null

