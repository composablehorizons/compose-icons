package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Person_search: ImageVector
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
                moveToRelative(-460f, 40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-31f)
                quadToRelative(0f, -34f, 17f, -63f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(45f, -23f, 99.5f, -39.5f)
                reflectiveQuadTo(403f, 521f)
                quadToRelative(12f, -1f, 18f, 10f)
                reflectiveQuadToRelative(1f, 23f)
                quadToRelative(-11f, 25f, -16.5f, 51.5f)
                reflectiveQuadTo(400f, 659f)
                quadToRelative(0f, 26f, 4.5f, 52.5f)
                reflectiveQuadTo(420f, 762f)
                quadToRelative(6f, 14f, -1f, 26f)
                reflectiveQuadToRelative(-21f, 12f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Person_search!!
    }

private var _Person_search: ImageVector? = null

