package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Swatch: ImageVector
    get() {
        if (_Swatch != null) return _Swatch!!
        
        _Swatch = ImageVector.Builder(
            name = "swatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -5f, 0f)
                verticalLineTo(3f)
                close()
                moveToRelative(3.25f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 11.035f)
                lineToRelative(3.778f, -3.778f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-2.122f, -2.121f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-0.242f, 0.242f)
                verticalLineToRelative(7.07f)
                close()
                moveTo(7.656f, 14f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-0.344f)
                lineToRelative(-5f, 5f)
                close()
            }
        }.build()
        
        return _Swatch!!
    }

private var _Swatch: ImageVector? = null

