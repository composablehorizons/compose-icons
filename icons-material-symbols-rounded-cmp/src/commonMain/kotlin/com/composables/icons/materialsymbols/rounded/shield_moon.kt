package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shield_moon: ImageVector
    get() {
        if (_Shield_moon != null) return _Shield_moon!!
        
        _Shield_moon = ImageVector.Builder(
            name = "shield_moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(501f, 640f)
                quadToRelative(38f, 0f, 74.5f, -16f)
                reflectiveQuadToRelative(63.5f, -48f)
                quadToRelative(7f, -8f, 3f, -18f)
                reflectiveQuadToRelative(-14f, -12f)
                quadToRelative(-38f, -6f, -72f, -28.5f)
                reflectiveQuadTo(501f, 458f)
                quadToRelative(-20f, -35f, -23.5f, -75.5f)
                reflectiveQuadTo(488f, 304f)
                quadToRelative(4f, -10f, -2.5f, -18f)
                reflectiveQuadToRelative(-17.5f, -6f)
                quadToRelative(-69f, 13f, -109f, 65f)
                reflectiveQuadToRelative(-40f, 115f)
                quadToRelative(0f, 75f, 53.5f, 127.5f)
                reflectiveQuadTo(501f, 640f)
                close()
                moveTo(480f, 876f)
                quadToRelative(-7f, 0f, -13f, -1f)
                reflectiveQuadToRelative(-12f, -3f)
                quadToRelative(-135f, -45f, -215f, -166.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 140f, -80f, 261.5f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(104f, -33f, 172f, -132f)
                reflectiveQuadToRelative(68f, -220f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
                moveToRelative(0f, -316f)
                close()
            }
        }.build()
        
        return _Shield_moon!!
    }

private var _Shield_moon: ImageVector? = null

