package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.AtSymbol: ImageVector
    get() {
        if (_AtSymbol != null) return _AtSymbol!!
        
        _AtSymbol = ImageVector.Builder(
            name = "at-symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.404f, 14.596f)
                arcTo(6.5f, 6.5f, 0f, true, true, 16.5f, 10f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, -2.5f, 0f)
                arcToRelative(4f, 4f, 0f, true, false, -0.571f, 2.06f)
                arcTo(2.75f, 2.75f, 0f, false, false, 18f, 10f)
                arcToRelative(8f, 8f, 0f, true, false, -2.343f, 5.657f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -9.193f, 0f)
                close()
                moveTo(10f, 7.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, 5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, -5f)
                close()
            }
        }.build()
        
        return _AtSymbol!!
    }

private var _AtSymbol: ImageVector? = null

