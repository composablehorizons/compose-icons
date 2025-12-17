package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Map_pin_review: ImageVector
    get() {
        if (_Map_pin_review != null) return _Map_pin_review!!
        
        _Map_pin_review = ImageVector.Builder(
            name = "map_pin_review",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 800f)
                horizontalLineToRelative(98f)
                quadToRelative(-28f, -26f, -59f, -59f)
                reflectiveQuadToRelative(-57f, -71f)
                quadToRelative(-26f, -38f, -44f, -78f)
                reflectiveQuadToRelative(-18f, -82f)
                quadToRelative(0f, -98f, 64f, -164f)
                reflectiveQuadToRelative(160f, -66f)
                quadToRelative(96f, 0f, 160f, 66f)
                reflectiveQuadToRelative(64f, 164f)
                quadToRelative(0f, 42f, -18f, 82f)
                reflectiveQuadToRelative(-44f, 78f)
                quadToRelative(-26f, 38f, -57f, 71f)
                reflectiveQuadToRelative(-59f, 59f)
                horizontalLineToRelative(530f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(144f, -320f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(324f, 500f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(264f, 440f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(204f, 500f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(264f, 560f)
                close()
                moveToRelative(336f, 124f)
                quadToRelative(-10f, 0f, -19f, -4f)
                reflectiveQuadToRelative(-15f, -14f)
                lineToRelative(-24f, -39f)
                quadToRelative(12f, -29f, 19f, -58.5f)
                reflectiveQuadToRelative(7f, -58.5f)
                quadToRelative(0f, -23f, -3f, -46f)
                reflectiveQuadToRelative(-9f, -44f)
                lineToRelative(48f, -29f)
                lineToRelative(61f, 37f)
                quadToRelative(6f, 4f, 11.5f, 0f)
                reflectiveQuadToRelative(3.5f, -11f)
                lineToRelative(-16f, -69f)
                lineToRelative(54f, -47f)
                quadToRelative(5f, -5f, 3f, -11f)
                reflectiveQuadToRelative(-9f, -7f)
                lineToRelative(-71f, -6f)
                lineToRelative(-28f, -65f)
                quadToRelative(-2f, -6f, -9f, -6f)
                reflectiveQuadToRelative(-9f, 6f)
                lineToRelative(-28f, 65f)
                lineToRelative(-91f, 8f)
                quadToRelative(-27f, -26f, -60.5f, -45.5f)
                reflectiveQuadTo(344f, 210f)
                quadToRelative(-11f, -3f, -17.5f, -11f)
                reflectiveQuadToRelative(-6.5f, -19f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineTo(675f)
                lineToRelative(-41f, 66f)
                quadToRelative(-6f, 10f, -15f, 14f)
                reflectiveQuadToRelative(-19f, 4f)
                close()
            }
        }.build()
        
        return _Map_pin_review!!
    }

private var _Map_pin_review: ImageVector? = null

