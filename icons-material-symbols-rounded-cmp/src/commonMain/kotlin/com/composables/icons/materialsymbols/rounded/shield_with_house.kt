package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shield_with_house: ImageVector
    get() {
        if (_Shield_with_house != null) return _Shield_with_house!!
        
        _Shield_with_house = ImageVector.Builder(
            name = "shield_with_house",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 381f)
                lineTo(256f, 555f)
                quadToRelative(19f, 63f, 56f, 114.5f)
                reflectiveQuadToRelative(88f, 86.5f)
                verticalLineToRelative(-116f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 600f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 640f)
                verticalLineToRelative(116f)
                quadToRelative(51f, -35f, 88f, -86.5f)
                reflectiveQuadTo(704f, 555f)
                lineTo(480f, 381f)
                close()
                moveTo(240f, 255f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 5f, 0.5f, 11f)
                reflectiveQuadToRelative(0.5f, 11f)
                lineToRelative(239f, -186f)
                lineToRelative(239f, 186f)
                quadToRelative(0f, -5f, 0.5f, -11f)
                reflectiveQuadToRelative(0.5f, -11f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
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
            }
        }.build()
        
        return _Shield_with_house!!
    }

private var _Shield_with_house: ImageVector? = null

