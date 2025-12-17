package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.MagnifyingGlassCircle: ImageVector
    get() {
        if (_MagnifyingGlassCircle != null) return _MagnifyingGlassCircle!!
        
        _MagnifyingGlassCircle = ImageVector.Builder(
            name = "magnifying-glass-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15.75f, 15.75f)
                lineToRelative(-2.489f, -2.489f)
                moveToRelative(0f, 0f)
                arcToRelative(3.375f, 3.375f, 0f, true, false, -4.773f, -4.773f)
                arcToRelative(3.375f, 3.375f, 0f, false, false, 4.774f, 4.774f)
                close()
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
            }
        }.build()
        
        return _MagnifyingGlassCircle!!
    }

private var _MagnifyingGlassCircle: ImageVector? = null

