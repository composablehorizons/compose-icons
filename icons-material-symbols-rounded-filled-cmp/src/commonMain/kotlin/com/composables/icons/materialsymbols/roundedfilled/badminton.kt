package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Badminton: ImageVector
    get() {
        if (_Badminton != null) return _Badminton!!
        
        _Badminton = ImageVector.Builder(
            name = "badminton",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(608f, 171f)
                lineToRelative(153f, -73f)
                quadToRelative(19f, -9f, 37f, 1.5f)
                reflectiveQuadToRelative(20f, 30.5f)
                lineToRelative(9f, 92f)
                quadToRelative(2f, 13f, -4.5f, 24f)
                reflectiveQuadTo(805f, 262f)
                lineToRelative(-95f, 47f)
                quadToRelative(-11f, 6f, -24.5f, 4f)
                reflectiveQuadTo(663f, 302f)
                lineToRelative(-66f, -67f)
                quadToRelative(-15f, -15f, -11.5f, -35f)
                reflectiveQuadToRelative(22.5f, -29f)
                close()
                moveToRelative(202f, 222f)
                quadToRelative(-16f, 8f, -33f, 5f)
                reflectiveQuadToRelative(-31f, -15f)
                quadToRelative(-7f, -6f, -5.5f, -14.5f)
                reflectiveQuadTo(750f, 356f)
                lineToRelative(72f, -34f)
                quadToRelative(5f, -2f, 10.5f, 0.5f)
                reflectiveQuadToRelative(6.5f, 8.5f)
                quadToRelative(2f, 22f, -6f, 38.5f)
                reflectiveQuadTo(810f, 393f)
                close()
                moveTo(337f, 630f)
                quadToRelative(-48f, -1f, -90.5f, -23f)
                reflectiveQuadTo(172f, 548f)
                quadToRelative(-45f, -51f, -68.5f, -115f)
                reflectiveQuadTo(80f, 300f)
                quadToRelative(0f, -66f, 37.5f, -103f)
                reflectiveQuadTo(223f, 160f)
                quadToRelative(71f, 0f, 139f, 27f)
                reflectiveQuadToRelative(119f, 78f)
                quadToRelative(31f, 31f, 49.5f, 70f)
                reflectiveQuadToRelative(18.5f, 83f)
                quadToRelative(0f, 32f, -9.5f, 62f)
                reflectiveQuadTo(510f, 535f)
                lineToRelative(261f, 260f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(771f, 852f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(454f, 591f)
                quadToRelative(-26f, 19f, -55.5f, 29.5f)
                reflectiveQuadTo(337f, 630f)
                close()
            }
        }.build()
        
        return _Badminton!!
    }

private var _Badminton: ImageVector? = null

