package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.MagnifyingGlassCircle: ImageVector
    get() {
        if (_MagnifyingGlassCircle != null) return _MagnifyingGlassCircle!!
        
        _MagnifyingGlassCircle = ImageVector.Builder(
            name = "magnifying-glass-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.94f, 8.06f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 2.12f, -2.12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -2.12f, 2.12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, false, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, 14f)
                close()
                moveTo(4.879f, 4.879f)
                arcToRelative(3f, 3f, 0f, false, false, 3.645f, 4.706f)
                lineTo(9.72f, 10.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.061f, -1.06f)
                lineTo(9.585f, 8.524f)
                arcTo(3.001f, 3.001f, 0f, false, false, 4.879f, 4.88f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassCircle!!
    }

private var _MagnifyingGlassCircle: ImageVector? = null

