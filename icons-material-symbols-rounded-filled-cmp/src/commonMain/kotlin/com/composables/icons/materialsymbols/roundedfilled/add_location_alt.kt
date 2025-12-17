package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Add_location_alt: ImageVector
    get() {
        if (_Add_location_alt != null) return _Add_location_alt!!
        
        _Add_location_alt = ImageVector.Builder(
            name = "add_location_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveToRelative(0f, -400f)
                quadToRelative(20f, 0f, 40f, 2.5f)
                reflectiveQuadToRelative(40f, 7.5f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineToRelative(37f)
                quadToRelative(2f, 11f, 2.5f, 23.5f)
                reflectiveQuadToRelative(0.5f, 24.5f)
                quadToRelative(0f, 66f, -30.5f, 131f)
                reflectiveQuadToRelative(-73f, 122f)
                quadToRelative(-42.5f, 57f, -88f, 101.5f)
                reflectiveQuadTo(533f, 833f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                close()
                moveToRelative(240f, 120f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 0f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 280f)
                verticalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Add_location_alt!!
    }

private var _Add_location_alt: ImageVector? = null

