package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shield_person: ImageVector
    get() {
        if (_Shield_person != null) return _Shield_person!!
        
        _Shield_person = ImageVector.Builder(
            name = "shield_person",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(340f, 380f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(620f, 380f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(0f, 440f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -400f)
                close()
                moveToRelative(0f, -315f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 54f, 15f, 105f)
                reflectiveQuadToRelative(41f, 96f)
                quadToRelative(42f, -21f, 88f, -33f)
                reflectiveQuadToRelative(96f, -12f)
                quadToRelative(50f, 0f, 96f, 12f)
                reflectiveQuadToRelative(88f, 33f)
                quadToRelative(26f, -45f, 41f, -96f)
                reflectiveQuadToRelative(15f, -105f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                close()
                moveToRelative(0f, 515f)
                quadToRelative(-36f, 0f, -70f, 8f)
                reflectiveQuadToRelative(-65f, 22f)
                quadToRelative(29f, 30f, 63f, 52f)
                reflectiveQuadToRelative(72f, 34f)
                quadToRelative(38f, -12f, 72f, -34f)
                reflectiveQuadToRelative(63f, -52f)
                quadToRelative(-31f, -14f, -65f, -22f)
                reflectiveQuadToRelative(-70f, -8f)
                close()
            }
        }.build()
        
        return _Shield_person!!
    }

private var _Shield_person: ImageVector? = null

