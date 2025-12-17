package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.MagnifyingGlass: ImageVector
    get() {
        if (_MagnifyingGlass != null) return _MagnifyingGlass!!
        
        _MagnifyingGlass = ImageVector.Builder(
            name = "magnifying-glass",
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
                moveTo(21f, 21f)
                lineToRelative(-5.197f, -5.197f)
                moveToRelative(0f, 0f)
                arcTo(7.5f, 7.5f, 0f, true, false, 5.196f, 5.196f)
                arcToRelative(7.5f, 7.5f, 0f, false, false, 10.607f, 10.607f)
                close()
            }
        }.build()
        
        return _MagnifyingGlass!!
    }

private var _MagnifyingGlass: ImageVector? = null

