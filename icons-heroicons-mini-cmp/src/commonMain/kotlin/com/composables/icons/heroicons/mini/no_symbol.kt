package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.NoSymbol: ImageVector
    get() {
        if (_NoSymbol != null) return _NoSymbol!!
        
        _NoSymbol = ImageVector.Builder(
            name = "no-symbol",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.965f, 4.904f)
                lineToRelative(9.131f, 9.131f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, -9.131f, -9.131f)
                close()
                moveToRelative(8.07f, 10.192f)
                lineTo(4.904f, 5.965f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 9.131f, 9.131f)
                close()
                moveTo(4.343f, 4.343f)
                arcToRelative(8f, 8f, 0f, true, true, 11.314f, 11.314f)
                arcTo(8f, 8f, 0f, false, true, 4.343f, 4.343f)
                close()
            }
        }.build()
        
        return _NoSymbol!!
    }

private var _NoSymbol: ImageVector? = null

