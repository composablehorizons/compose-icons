package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DragHandleDots2: ImageVector
    get() {
        if (_DragHandleDots2 != null) return _DragHandleDots2!!
        
        _DragHandleDots2 = ImageVector.Builder(
            name = "drag-handle-dots-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 10.375f)
                curveTo(6.12132f, 10.375f, 6.625f, 10.8787f, 6.625f, 11.5f)
                curveTo(6.625f, 12.1213f, 6.12132f, 12.625f, 5.5f, 12.625f)
                curveTo(4.87868f, 12.625f, 4.375f, 12.1213f, 4.375f, 11.5f)
                curveTo(4.375f, 10.8787f, 4.87868f, 10.375f, 5.5f, 10.375f)
                close()
                moveTo(9.5f, 10.375f)
                curveTo(10.1213f, 10.375f, 10.625f, 10.8787f, 10.625f, 11.5f)
                curveTo(10.625f, 12.1213f, 10.1213f, 12.625f, 9.5f, 12.625f)
                curveTo(8.87868f, 12.625f, 8.375f, 12.1213f, 8.375f, 11.5f)
                curveTo(8.375f, 10.8787f, 8.87868f, 10.375f, 9.5f, 10.375f)
                close()
                moveTo(5.5f, 6.375f)
                curveTo(6.12132f, 6.375f, 6.625f, 6.87868f, 6.625f, 7.5f)
                curveTo(6.625f, 8.12132f, 6.12132f, 8.625f, 5.5f, 8.625f)
                curveTo(4.87868f, 8.625f, 4.375f, 8.12132f, 4.375f, 7.5f)
                curveTo(4.375f, 6.87868f, 4.87868f, 6.375f, 5.5f, 6.375f)
                close()
                moveTo(9.5f, 6.375f)
                curveTo(10.1213f, 6.375f, 10.625f, 6.87868f, 10.625f, 7.5f)
                curveTo(10.625f, 8.12132f, 10.1213f, 8.625f, 9.5f, 8.625f)
                curveTo(8.87868f, 8.625f, 8.375f, 8.12132f, 8.375f, 7.5f)
                curveTo(8.375f, 6.87868f, 8.87868f, 6.375f, 9.5f, 6.375f)
                close()
                moveTo(5.5f, 2.375f)
                curveTo(6.12132f, 2.375f, 6.625f, 2.87868f, 6.625f, 3.5f)
                curveTo(6.625f, 4.12132f, 6.12132f, 4.625f, 5.5f, 4.625f)
                curveTo(4.87868f, 4.625f, 4.375f, 4.12132f, 4.375f, 3.5f)
                curveTo(4.375f, 2.87868f, 4.87868f, 2.375f, 5.5f, 2.375f)
                close()
                moveTo(9.5f, 2.375f)
                curveTo(10.1213f, 2.375f, 10.625f, 2.87868f, 10.625f, 3.5f)
                curveTo(10.625f, 4.12132f, 10.1213f, 4.625f, 9.5f, 4.625f)
                curveTo(8.87868f, 4.625f, 8.375f, 4.12132f, 8.375f, 3.5f)
                curveTo(8.375f, 2.87868f, 8.87868f, 2.375f, 9.5f, 2.375f)
                close()
            }
        }.build()
        
        return _DragHandleDots2!!
    }

private var _DragHandleDots2: ImageVector? = null

