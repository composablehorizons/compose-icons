package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Family_home: ImageVector
    get() {
        if (_Family_home != null) return _Family_home!!
        
        _Family_home = ImageVector.Builder(
            name = "family_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 706f)
                quadToRelative(8f, 0f, 14.5f, -2.5f)
                reflectiveQuadTo(507f, 696f)
                quadToRelative(32f, -29f, 61f, -57f)
                reflectiveQuadToRelative(50.5f, -55f)
                quadToRelative(21.5f, -27f, 34.5f, -52.5f)
                reflectiveQuadToRelative(13f, -49.5f)
                quadToRelative(0f, -44f, -30f, -73f)
                reflectiveQuadToRelative(-72f, -29f)
                quadToRelative(-26f, 0f, -47.5f, 10.5f)
                reflectiveQuadTo(480f, 418f)
                quadToRelative(-15f, -17f, -37.5f, -27.5f)
                reflectiveQuadTo(396f, 380f)
                quadToRelative(-42f, 0f, -72f, 29f)
                reflectiveQuadToRelative(-30f, 73f)
                quadToRelative(0f, 24f, 13f, 49.5f)
                reflectiveQuadToRelative(34.5f, 52.5f)
                quadToRelative(21.5f, 27f, 50.5f, 55f)
                reflectiveQuadToRelative(61f, 57f)
                quadToRelative(6f, 5f, 12.5f, 7.5f)
                reflectiveQuadTo(480f, 706f)
                close()
                moveTo(240f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-295f)
                lineToRelative(-40f, 31f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                quadToRelative(-10f, -14f, -7.5f, -30f)
                reflectiveQuadTo(72f, 432f)
                lineToRelative(359f, -275f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(360f, 275f)
                quadToRelative(13f, 10f, 15f, 26f)
                reflectiveQuadToRelative(-8f, 30f)
                quadToRelative(-10f, 13f, -26f, 15f)
                reflectiveQuadToRelative(-29f, -8f)
                lineToRelative(-41f, -30f)
                verticalLineToRelative(295f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Family_home!!
    }

private var _Family_home: ImageVector? = null

