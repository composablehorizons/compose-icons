package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Shield_moon: ImageVector
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
                moveTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -84f)
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

