package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.MagnifyingGlassCircle: ImageVector
    get() {
        if (_MagnifyingGlassCircle != null) return _MagnifyingGlassCircle!!
        
        _MagnifyingGlassCircle = ImageVector.Builder(
            name = "magnifying-glass-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 9f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -5f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, true, false, 0f, -16f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
                close()
                moveTo(9f, 5f)
                arcToRelative(4f, 4f, 0f, true, false, 2.248f, 7.309f)
                lineToRelative(1.472f, 1.471f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.471f, -1.472f)
                arcTo(4f, 4f, 0f, false, false, 9f, 5f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassCircle!!
    }

private var _MagnifyingGlassCircle: ImageVector? = null

