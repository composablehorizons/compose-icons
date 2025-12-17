package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Person_search: ImageVector
    get() {
        if (_Person_search != null) return _Person_search!!
        
        _Person_search = ImageVector.Builder(
            name = "person_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 480f)
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
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(440f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 400f)
                close()
                moveTo(856f, 912f)
                lineTo(756f, 812f)
                quadToRelative(-21f, 12f, -45f, 20f)
                reflectiveQuadToRelative(-51f, 8f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 27f, -8f, 51f)
                reflectiveQuadToRelative(-20f, 45f)
                lineToRelative(100f, 100f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(660f, 760f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(-540f, -40f)
                verticalLineToRelative(-31f)
                quadToRelative(0f, -34f, 17f, -63f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(42f, -22f, 93.5f, -38.5f)
                reflectiveQuadTo(383f, 522f)
                quadToRelative(17f, -2f, 29f, 10f)
                reflectiveQuadToRelative(12f, 29f)
                quadToRelative(0f, 17f, -12f, 29.5f)
                reflectiveQuadTo(383f, 605f)
                quadToRelative(-57f, 7f, -96f, 21f)
                reflectiveQuadToRelative(-66f, 28f)
                quadToRelative(-10f, 5f, -15.5f, 14.5f)
                reflectiveQuadTo(200f, 689f)
                verticalLineToRelative(31f)
                horizontalLineToRelative(184f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(424f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(384f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                close()
                moveToRelative(320f, -400f)
                close()
                moveToRelative(-33f, 400f)
                close()
            }
        }.build()
        
        return _Person_search!!
    }

private var _Person_search: ImageVector? = null

