package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ambient_screen: ImageVector
    get() {
        if (_Ambient_screen != null) return _Ambient_screen!!
        
        _Ambient_screen = ImageVector.Builder(
            name = "ambient_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(736f, 840f)
                lineToRelative(-56f, -26f)
                quadToRelative(-12f, -5f, -12f, -18f)
                reflectiveQuadToRelative(12f, -18f)
                lineToRelative(56f, -26f)
                lineToRelative(26f, -56f)
                quadToRelative(5f, -12f, 18f, -12f)
                reflectiveQuadToRelative(18f, 12f)
                lineToRelative(26f, 56f)
                lineToRelative(56f, 26f)
                quadToRelative(12f, 5f, 12f, 18f)
                reflectiveQuadToRelative(-12f, 18f)
                lineToRelative(-56f, 26f)
                lineToRelative(-26f, 56f)
                quadToRelative(-5f, 12f, -18f, 12f)
                reflectiveQuadToRelative(-18f, -12f)
                lineToRelative(-26f, -56f)
                close()
                moveTo(430f, 626f)
                lineToRelative(32f, 70f)
                quadToRelative(5f, 12f, 18f, 12f)
                reflectiveQuadToRelative(18f, -12f)
                lineToRelative(32f, -70f)
                lineToRelative(70f, -32f)
                quadToRelative(12f, -5f, 12f, -18f)
                reflectiveQuadToRelative(-12f, -18f)
                lineToRelative(-70f, -32f)
                lineToRelative(-32f, -70f)
                quadToRelative(-5f, -12f, -18f, -12f)
                reflectiveQuadToRelative(-18f, 12f)
                lineToRelative(-32f, 70f)
                lineToRelative(-70f, 32f)
                quadToRelative(-12f, 5f, -12f, 18f)
                reflectiveQuadToRelative(12f, 18f)
                lineToRelative(70f, 32f)
                close()
                moveTo(160f, 896f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 256f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 336f)
                verticalLineToRelative(287f)
                quadToRelative(-23f, -14f, -48.5f, -20.5f)
                reflectiveQuadTo(780f, 596f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(580f, 796f)
                quadToRelative(0f, 26f, 6.5f, 51.5f)
                reflectiveQuadTo(607f, 896f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Ambient_screen!!
    }

private var _Ambient_screen: ImageVector? = null

