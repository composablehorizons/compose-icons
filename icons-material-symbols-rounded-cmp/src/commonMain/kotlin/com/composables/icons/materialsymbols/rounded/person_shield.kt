package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Person_shield: ImageVector
    get() {
        if (_Person_shield != null) return _Person_shield!!
        
        _Person_shield = ImageVector.Builder(
            name = "person_shield",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(458f, 720f)
                close()
                moveToRelative(-218f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(224f, 582f)
                quadToRelative(31f, -16f, 62.5f, -27f)
                reflectiveQuadToRelative(63.5f, -19f)
                quadToRelative(23f, -5f, 45f, -9f)
                reflectiveQuadToRelative(45f, -6f)
                quadToRelative(17f, -2f, 28.5f, 10f)
                reflectiveQuadToRelative(11.5f, 29f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 602f)
                quadToRelative(-18f, 2f, -35.5f, 4f)
                reflectiveQuadToRelative(-35.5f, 7f)
                quadToRelative(-28f, 7f, -55f, 17f)
                reflectiveQuadToRelative(-54f, 24f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(218f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(498f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(458f, 800f)
                horizontalLineTo(240f)
                close()
                moveToRelative(320f, -215f)
                quadToRelative(0f, -11f, 5.5f, -21f)
                reflectiveQuadToRelative(16.5f, -15f)
                lineToRelative(120f, -60f)
                quadToRelative(8f, -5f, 18f, -5f)
                reflectiveQuadToRelative(18f, 5f)
                lineToRelative(120f, 60f)
                quadToRelative(11f, 5f, 16.5f, 15f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(77f)
                quadToRelative(0f, 69f, -36f, 125f)
                reflectiveQuadToRelative(-98f, 85f)
                quadToRelative(-6f, 3f, -12.5f, 4f)
                reflectiveQuadTo(720f, 877f)
                quadToRelative(-7f, 0f, -13.5f, -1f)
                reflectiveQuadTo(694f, 872f)
                quadToRelative(-62f, -29f, -98f, -85f)
                reflectiveQuadToRelative(-36f, -125f)
                verticalLineToRelative(-77f)
                close()
                moveToRelative(160f, 211f)
                quadToRelative(38f, -18f, 59f, -55f)
                reflectiveQuadToRelative(21f, -79f)
                verticalLineToRelative(-52f)
                lineToRelative(-80f, -40f)
                lineToRelative(-80f, 40f)
                verticalLineToRelative(52f)
                quadToRelative(0f, 42f, 21f, 79f)
                reflectiveQuadToRelative(59f, 55f)
                close()
                moveTo(480f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(240f, 363f)
                close()
            }
        }.build()
        
        return _Person_shield!!
    }

private var _Person_shield: ImageVector? = null

