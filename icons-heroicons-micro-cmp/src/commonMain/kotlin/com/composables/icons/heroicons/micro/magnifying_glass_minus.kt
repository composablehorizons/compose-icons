package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.MagnifyingGlassMinus: ImageVector
    get() {
        if (_MagnifyingGlassMinus != null) return _MagnifyingGlassMinus!!
        
        _MagnifyingGlassMinus = ImageVector.Builder(
            name = "magnifying-glass-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.75f, 6.25f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 12f)
                curveToRelative(1.11f, 0f, 2.136f, -0.362f, 2.965f, -0.974f)
                lineToRelative(2.755f, 2.754f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.754f, -2.755f)
                arcTo(5f, 5f, 0f, true, false, 7f, 12f)
                close()
                moveToRelative(0f, -1.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 7f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassMinus!!
    }

private var _MagnifyingGlassMinus: ImageVector? = null

