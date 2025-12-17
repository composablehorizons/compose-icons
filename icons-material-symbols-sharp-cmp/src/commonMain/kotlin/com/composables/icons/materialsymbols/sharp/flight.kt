package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flight: ImageVector
    get() {
        if (_Flight != null) return _Flight!!
        
        _Flight = ImageVector.Builder(
            name = "flight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 880f)
                verticalLineToRelative(-60f)
                lineToRelative(80f, -60f)
                verticalLineToRelative(-220f)
                lineTo(80f, 640f)
                verticalLineToRelative(-80f)
                lineToRelative(340f, -200f)
                verticalLineToRelative(-220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(220f)
                lineToRelative(340f, 200f)
                verticalLineToRelative(80f)
                lineTo(540f, 540f)
                verticalLineToRelative(220f)
                lineToRelative(80f, 60f)
                verticalLineToRelative(60f)
                lineToRelative(-140f, -40f)
                lineToRelative(-140f, 40f)
                close()
            }
        }.build()
        
        return _Flight!!
    }

private var _Flight: ImageVector? = null

