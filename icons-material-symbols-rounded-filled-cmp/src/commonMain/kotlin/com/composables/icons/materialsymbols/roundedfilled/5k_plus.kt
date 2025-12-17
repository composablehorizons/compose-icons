package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`5k_plus`: ImageVector
    get() {
        if (_5k_plus != null) return _5k_plus!!
        
        _5k_plus = ImageVector.Builder(
            name = "5k_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 500f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(-160f, 10f)
                lineToRelative(62f, 79f)
                quadToRelative(2f, 3f, 22f, 11f)
                quadToRelative(17f, 0f, 25f, -15.5f)
                reflectiveQuadToRelative(-3f, -29.5f)
                lineToRelative(-56f, -75f)
                lineToRelative(57f, -76f)
                quadToRelative(11f, -14f, 3f, -29f)
                reflectiveQuadToRelative(-26f, -15f)
                quadToRelative(-7f, 0f, -12.5f, 3f)
                reflectiveQuadToRelative(-9.5f, 8f)
                lineToRelative(-62f, 79f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(470f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(440f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(470f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(500f, 570f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-160f, 30f)
                horizontalLineToRelative(-70f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 570f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 600f)
                horizontalLineToRelative(90f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 560f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 460f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(70f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(400f, 390f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(370f, 360f)
                horizontalLineTo(270f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 390f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 500f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(40f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _5k_plus!!
    }

private var _5k_plus: ImageVector? = null

