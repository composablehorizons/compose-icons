package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Directions_boat: ImageVector
    get() {
        if (_Directions_boat != null) return _Directions_boat!!
        
        _Directions_boat = ImageVector.Builder(
            name = "directions_boat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(158f, 760f)
                lineTo(82f, 492f)
                quadToRelative(-3f, -12f, 2.5f, -28f)
                reflectiveQuadToRelative(23.5f, -22f)
                lineToRelative(52f, -18f)
                verticalLineToRelative(-184f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(184f)
                lineToRelative(52f, 18f)
                quadToRelative(21f, 8f, 25f, 23.5f)
                reflectiveQuadToRelative(1f, 26.5f)
                lineToRelative(-76f, 268f)
                quadToRelative(-40f, 0f, -74f, -15.5f)
                reflectiveQuadTo(666f, 705f)
                quadToRelative(-11f, -11f, -26f, -11f)
                reflectiveQuadToRelative(-26f, 11f)
                quadToRelative(-28f, 24f, -62f, 39.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-10f, 0f, -19f, -1f)
                reflectiveQuadToRelative(-18f, -3f)
                quadToRelative(-29f, -6f, -55f, -21f)
                reflectiveQuadToRelative(-48f, -35f)
                quadToRelative(-8f, -8f, -20.5f, -8f)
                reflectiveQuadToRelative(-20.5f, 8f)
                quadToRelative(-28f, 27f, -65f, 43.5f)
                reflectiveQuadTo(158f, 760f)
                close()
                moveTo(480f, 920f)
                quadToRelative(-41f, 0f, -81.5f, -10f)
                reflectiveQuadTo(320f, 880f)
                quadToRelative(-38f, 20f, -78f, 30f)
                reflectiveQuadToRelative(-82f, 10f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 840f)
                horizontalLineToRelative(40f)
                quadToRelative(36f, 0f, 72f, -10f)
                reflectiveQuadToRelative(67f, -29f)
                quadToRelative(10f, -6f, 21f, -6f)
                reflectiveQuadToRelative(21f, 6f)
                quadToRelative(22f, 14f, 50.5f, 23f)
                reflectiveQuadToRelative(54.5f, 12f)
                quadToRelative(8f, 1f, 17f, 1.5f)
                reflectiveQuadToRelative(17f, 0.5f)
                quadToRelative(36f, 0f, 72f, -9f)
                reflectiveQuadToRelative(67f, -28f)
                quadToRelative(10f, -6f, 21f, -6f)
                reflectiveQuadToRelative(21f, 6f)
                quadToRelative(31f, 20f, 67f, 29.5f)
                reflectiveQuadToRelative(72f, 9.5f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineToRelative(-40f)
                quadToRelative(-42f, 0f, -82f, -10f)
                reflectiveQuadToRelative(-78f, -30f)
                quadToRelative(-38f, 20f, -78.5f, 30f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveTo(240f, 398f)
                lineToRelative(215f, -70f)
                quadToRelative(12f, -4f, 25f, -4f)
                reflectiveQuadToRelative(25f, 4f)
                lineToRelative(215f, 70f)
                verticalLineToRelative(-158f)
                horizontalLineTo(240f)
                verticalLineToRelative(158f)
                close()
            }
        }.build()
        
        return _Directions_boat!!
    }

private var _Directions_boat: ImageVector? = null

