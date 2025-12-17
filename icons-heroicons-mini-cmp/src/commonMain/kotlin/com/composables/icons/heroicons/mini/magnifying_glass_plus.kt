package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.MagnifyingGlassPlus: ImageVector
    get() {
        if (_MagnifyingGlassPlus != null) return _MagnifyingGlassPlus!!
        
        _MagnifyingGlassPlus = ImageVector.Builder(
            name = "magnifying-glass-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 9f)
                arcToRelative(7f, 7f, 0f, true, true, 12.452f, 4.391f)
                lineToRelative(3.328f, 3.329f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.329f, -3.328f)
                arcTo(7f, 7f, 0f, false, true, 2f, 9f)
                close()
                moveToRelative(7f, -5.5f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 0f, 11f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 0f, -11f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassPlus!!
    }

private var _MagnifyingGlassPlus: ImageVector? = null

