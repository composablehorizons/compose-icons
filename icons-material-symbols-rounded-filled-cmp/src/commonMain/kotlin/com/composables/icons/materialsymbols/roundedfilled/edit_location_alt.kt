package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Edit_location_alt: ImageVector
    get() {
        if (_Edit_location_alt != null) return _Edit_location_alt!!
        
        _Edit_location_alt = ImageVector.Builder(
            name = "edit_location_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 853f)
                quadToRelative(-14f, 0f, -28f, -5f)
                reflectiveQuadToRelative(-25f, -15f)
                quadToRelative(-65f, -60f, -115f, -117f)
                reflectiveQuadToRelative(-83.5f, -110.5f)
                quadToRelative(-33.5f, -53.5f, -51f, -103f)
                reflectiveQuadTo(160f, 408f)
                quadToRelative(0f, -150f, 96.5f, -239f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(27f, 0f, 53.5f, 4.5f)
                reflectiveQuadTo(585f, 97f)
                lineTo(383f, 300f)
                quadToRelative(-11f, 11f, -17f, 25.5f)
                reflectiveQuadToRelative(-6f, 30.5f)
                verticalLineToRelative(84f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 520f)
                horizontalLineToRelative(84f)
                quadToRelative(16f, 0f, 30.5f, -6f)
                reflectiveQuadToRelative(25.5f, -17f)
                lineToRelative(202f, -202f)
                quadToRelative(9f, 26f, 13.5f, 54f)
                reflectiveQuadToRelative(4.5f, 59f)
                quadToRelative(0f, 94f, -68f, 201.5f)
                reflectiveQuadTo(533f, 833f)
                quadToRelative(-11f, 10f, -25f, 15f)
                reflectiveQuadToRelative(-28f, 5f)
                close()
                moveToRelative(254f, -699f)
                lineToRelative(38f, 38f)
                lineToRelative(-236f, 236f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineToRelative(-37f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(440f, 410f)
                verticalLineToRelative(-37f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(236f, -236f)
                lineToRelative(46f, 46f)
                close()
                moveToRelative(66f, 10f)
                lineToRelative(-84f, -84f)
                lineToRelative(28f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(28f, 28f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-28f, 28f)
                close()
            }
        }.build()
        
        return _Edit_location_alt!!
    }

private var _Edit_location_alt: ImageVector? = null

