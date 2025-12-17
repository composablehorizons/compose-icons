package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ambient_screen: ImageVector
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
                moveTo(160f, 896f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 816f)
                verticalLineTo(336f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 256f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 336f)
                verticalLineToRelative(201f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 577f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 537f)
                verticalLineTo(336f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(361f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(561f, 856f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(521f, 896f)
                horizontalLineTo(160f)
                close()
                moveToRelative(576f, -56f)
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
                moveToRelative(-576f, -24f)
                verticalLineTo(336f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-20f)
                verticalLineToRelative(20f)
                close()
                moveToRelative(270f, -190f)
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
            }
        }.build()
        
        return _Ambient_screen!!
    }

private var _Ambient_screen: ImageVector? = null

