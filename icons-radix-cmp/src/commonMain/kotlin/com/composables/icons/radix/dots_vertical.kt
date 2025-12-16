package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DotsVertical: ImageVector
    get() {
        if (_DotsVertical != null) return _DotsVertical!!
        
        _DotsVertical = ImageVector.Builder(
            name = "dots-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 11.375f)
                curveTo(8.12132f, 11.375f, 8.625f, 11.8787f, 8.625f, 12.5f)
                curveTo(8.625f, 13.1213f, 8.12132f, 13.625f, 7.5f, 13.625f)
                curveTo(6.87868f, 13.625f, 6.375f, 13.1213f, 6.375f, 12.5f)
                curveTo(6.375f, 11.8787f, 6.87868f, 11.375f, 7.5f, 11.375f)
                close()
                moveTo(7.5f, 6.375f)
                curveTo(8.12132f, 6.375f, 8.625f, 6.87868f, 8.625f, 7.5f)
                curveTo(8.625f, 8.12132f, 8.12132f, 8.625f, 7.5f, 8.625f)
                curveTo(6.87868f, 8.625f, 6.375f, 8.12132f, 6.375f, 7.5f)
                curveTo(6.375f, 6.87868f, 6.87868f, 6.375f, 7.5f, 6.375f)
                close()
                moveTo(7.5f, 1.375f)
                curveTo(8.12132f, 1.375f, 8.625f, 1.87868f, 8.625f, 2.5f)
                curveTo(8.625f, 3.12132f, 8.12132f, 3.625f, 7.5f, 3.625f)
                curveTo(6.87868f, 3.625f, 6.375f, 3.12132f, 6.375f, 2.5f)
                curveTo(6.375f, 1.87868f, 6.87868f, 1.375f, 7.5f, 1.375f)
                close()
            }
        }.build()
        
        return _DotsVertical!!
    }

private var _DotsVertical: ImageVector? = null

