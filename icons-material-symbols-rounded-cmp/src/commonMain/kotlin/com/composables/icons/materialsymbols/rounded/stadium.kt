package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Stadium: ImageVector
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
                moveTo(406f, 879f)
                quadToRelative(-140f, -8f, -233f, -41.5f)
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
                quadToRelative(0f, 45f, -93.5f, 78f)
                reflectiveQuadTo(553f, 879f)
                quadToRelative(-14f, 1f, -23.5f, -8.5f)
                reflectiveQuadTo(520f, 847f)
                verticalLineToRelative(-127f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(126f)
                quadToRelative(0f, 14f, -10f, 24f)
                reflectiveQuadToRelative(-24f, 9f)
                close()
                moveToRelative(74f, -439f)
                quadToRelative(97f, 0f, 167.5f, -11.5f)
                reflectiveQuadTo(760f, 402f)
                quadToRelative(0f, -5f, -76f, -23.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-128f, 0f, -204f, 18.5f)
                reflectiveQuadTo(200f, 402f)
                quadToRelative(42f, 15f, 112.5f, 26.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(360f, 794f)
                verticalLineToRelative(-74f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 640f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 720f)
                verticalLineToRelative(74f)
                quadToRelative(80f, -8f, 131f, -23.5f)
                reflectiveQuadToRelative(69f, -27.5f)
                verticalLineToRelative(-271f)
                quadToRelative(-55f, 22f, -138f, 35f)
                reflectiveQuadToRelative(-182f, 13f)
                quadToRelative(-99f, 0f, -182f, -13f)
                reflectiveQuadToRelative(-138f, -35f)
                verticalLineToRelative(271f)
                quadToRelative(18f, 12f, 69f, 27.5f)
                reflectiveQuadTo(360f, 794f)
                close()
                moveToRelative(120f, -161f)
                close()
            }
        }.build()
        
        return _Stadium!!
    }

private var _Stadium: ImageVector? = null

