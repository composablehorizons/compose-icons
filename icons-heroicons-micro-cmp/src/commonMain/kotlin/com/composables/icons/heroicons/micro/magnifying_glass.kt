package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.MagnifyingGlass: ImageVector
    get() {
        if (_MagnifyingGlass != null) return _MagnifyingGlass!!
        
        _MagnifyingGlass = ImageVector.Builder(
            name = "magnifying-glass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.965f, 11.026f)
                arcToRelative(5f, 5f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.755f, 2.754f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-2.755f, -2.754f)
                close()
                moveTo(10.5f, 7f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                close()
            }
        }.build()
        
        return _MagnifyingGlass!!
    }

private var _MagnifyingGlass: ImageVector? = null

