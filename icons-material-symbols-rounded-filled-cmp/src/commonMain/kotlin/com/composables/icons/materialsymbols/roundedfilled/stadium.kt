package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stadium: ImageVector
    get() {
        if (_Stadium != null) return _Stadium!!
        
        _Stadium = ImageVector.Builder(
            name = "stadium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 248f)
                verticalLineToRelative(-96f)
                quadToRelative(0f, -11f, 9.5f, -17f)
                reflectiveQuadToRelative(19.5f, -1f)
                lineToRelative(95f, 48f)
                quadToRelative(11f, 5f, 11f, 18f)
                reflectiveQuadToRelative(-11f, 18f)
                lineToRelative(-95f, 48f)
                quadToRelative(-10f, 5f, -19.5f, -1f)
                reflectiveQuadToRelative(-9.5f, -17f)
                close()
                moveToRelative(600f, 0f)
                verticalLineToRelative(-96f)
                quadToRelative(0f, -11f, 9.5f, -17f)
                reflectiveQuadToRelative(19.5f, -1f)
                lineToRelative(95f, 48f)
                quadToRelative(11f, 5f, 11f, 18f)
                reflectiveQuadToRelative(-11f, 18f)
                lineToRelative(-95f, 48f)
                quadToRelative(-10f, 5f, -19.5f, -1f)
                reflectiveQuadToRelative(-9.5f, -17f)
                close()
                moveToRelative(-280f, -40f)
                verticalLineToRelative(-96f)
                quadToRelative(0f, -11f, 9.5f, -17f)
                reflectiveQuadToRelative(19.5f, -1f)
                lineToRelative(95f, 48f)
                quadToRelative(11f, 5f, 11f, 18f)
                reflectiveQuadToRelative(-11f, 18f)
                lineToRelative(-95f, 48f)
                quadToRelative(-10f, 5f, -19.5f, -1f)
                reflectiveQuadToRelative(-9.5f, -17f)
                close()
                moveTo(336f, 872f)
                quadToRelative(-98f, -11f, -177f, -39.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -25f, 31.5f, -46.5f)
                reflectiveQuadToRelative(85.5f, -38f)
                quadToRelative(54f, -16.5f, 127f, -26f)
                reflectiveQuadToRelative(156f, -9.5f)
                quadToRelative(83f, 0f, 156f, 9.5f)
                reflectiveQuadToRelative(127f, 26f)
                quadToRelative(54f, 16.5f, 85.5f, 38f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 45f, -79.5f, 73.5f)
                reflectiveQuadTo(623f, 873f)
                quadToRelative(-9f, 1f, -16f, -5.5f)
                reflectiveQuadToRelative(-7f, -15.5f)
                verticalLineToRelative(-52f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(51f)
                quadToRelative(0f, 10f, -7f, 16f)
                reflectiveQuadToRelative(-17f, 5f)
                close()
                moveToRelative(144f, -432f)
                quadToRelative(97f, 0f, 167.5f, -11.5f)
                reflectiveQuadTo(760f, 402f)
                quadToRelative(0f, -5f, -76f, -23.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-128f, 0f, -204f, 18.5f)
                reflectiveQuadTo(200f, 402f)
                quadToRelative(42f, 15f, 112.5f, 26.5f)
                reflectiveQuadTo(480f, 440f)
                close()
            }
        }.build()
        
        return _Stadium!!
    }

private var _Stadium: ImageVector? = null

