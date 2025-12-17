package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Swatch: ImageVector
    get() {
        if (_Swatch != null) return _Swatch!!
        
        _Swatch = ImageVector.Builder(
            name = "swatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2f, 3.5f)
                verticalLineTo(15f)
                arcToRelative(3f, 3f, 0f, true, false, 6f, 0f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 2f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(11.753f, 6.99f)
                lineTo(9.5f, 14.743f)
                verticalLineTo(6.257f)
                lineToRelative(1.51f, -1.51f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.122f, 0f)
                lineToRelative(2.121f, 2.121f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 2.122f)
                close()
                moveTo(8.364f, 18f)
                horizontalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.136f)
                lineToRelative(-6f, 6f)
                close()
                moveTo(5f, 16f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _Swatch!!
    }

private var _Swatch: ImageVector? = null

