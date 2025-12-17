package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.MagnifyingGlassMinus: ImageVector
    get() {
        if (_MagnifyingGlassMinus != null) return _MagnifyingGlassMinus!!
        
        _MagnifyingGlassMinus = ImageVector.Builder(
            name = "magnifying-glass-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.75f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 2f)
                arcToRelative(7f, 7f, 0f, true, false, 4.391f, 12.452f)
                lineToRelative(3.329f, 3.328f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-3.328f, -3.329f)
                arcTo(7f, 7f, 0f, false, false, 9f, 2f)
                close()
                moveTo(3.5f, 9f)
                arcToRelative(5.5f, 5.5f, 0f, true, true, 11f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, -11f, 0f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassMinus!!
    }

private var _MagnifyingGlassMinus: ImageVector? = null

