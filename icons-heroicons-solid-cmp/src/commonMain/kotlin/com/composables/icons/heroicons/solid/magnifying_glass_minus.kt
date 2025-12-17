package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.MagnifyingGlassMinus: ImageVector
    get() {
        if (_MagnifyingGlassMinus != null) return _MagnifyingGlassMinus!!
        
        _MagnifyingGlassMinus = ImageVector.Builder(
            name = "magnifying-glass-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 3.75f)
                arcToRelative(6.75f, 6.75f, 0f, true, false, 0f, 13.5f)
                arcToRelative(6.75f, 6.75f, 0f, false, false, 0f, -13.5f)
                close()
                moveTo(2.25f, 10.5f)
                arcToRelative(8.25f, 8.25f, 0f, true, true, 14.59f, 5.28f)
                lineToRelative(4.69f, 4.69f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-4.69f, -4.69f)
                arcTo(8.25f, 8.25f, 0f, false, true, 2.25f, 10.5f)
                close()
                moveToRelative(4.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassMinus!!
    }

private var _MagnifyingGlassMinus: ImageVector? = null

