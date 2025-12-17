package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shield_watch: ImageVector
    get() {
        if (_Shield_watch != null) return _Shield_watch!!
        
        _Shield_watch = ImageVector.Builder(
            name = "shield_watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(671f, 880f)
                quadToRelative(-14f, 0f, -25f, -8f)
                reflectiveQuadToRelative(-14f, -22f)
                lineToRelative(-15f, -62f)
                quadToRelative(-36f, -26f, -56.5f, -64.5f)
                reflectiveQuadTo(540f, 640f)
                quadToRelative(0f, -45f, 20.5f, -83.5f)
                reflectiveQuadTo(617f, 492f)
                lineToRelative(15f, -62f)
                quadToRelative(3f, -14f, 14f, -22f)
                reflectiveQuadToRelative(25f, -8f)
                horizontalLineToRelative(98f)
                quadToRelative(14f, 0f, 25f, 8f)
                reflectiveQuadToRelative(14f, 22f)
                lineToRelative(15f, 62f)
                quadToRelative(36f, 26f, 56.5f, 64.5f)
                reflectiveQuadTo(900f, 640f)
                quadToRelative(0f, 45f, -20.5f, 83.5f)
                reflectiveQuadTo(823f, 788f)
                lineToRelative(-15f, 62f)
                quadToRelative(-3f, 14f, -14f, 22f)
                reflectiveQuadToRelative(-25f, 8f)
                horizontalLineToRelative(-98f)
                close()
                moveToRelative(49f, -140f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
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
                verticalLineToRelative(25f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 320f)
                horizontalLineTo(640f)
                quadToRelative(-28f, 0f, -49.5f, 17f)
                reflectiveQuadTo(562f, 381f)
                lineToRelative(-16f, 66f)
                quadToRelative(-41f, 37f, -63.5f, 87f)
                reflectiveQuadTo(460f, 640f)
                quadToRelative(0f, 51f, 18.5f, 97f)
                reflectiveQuadToRelative(52.5f, 82f)
                quadToRelative(11f, 11f, 9f, 25.5f)
                reflectiveQuadTo(524f, 865f)
                quadToRelative(-5f, 2f, -9.5f, 3.5f)
                reflectiveQuadTo(505f, 872f)
                quadToRelative(-6f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-13f, 1f)
                close()
            }
        }.build()
        
        return _Shield_watch!!
    }

private var _Shield_watch: ImageVector? = null

