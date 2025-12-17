package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Yard: ImageVector
    get() {
        if (_Yard != null) return _Yard!!
        
        _Yard = ImageVector.Builder(
            name = "yard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(0f, -48f, -18f, -92f)
                reflectiveQuadToRelative(-52f, -78f)
                quadToRelative(-29f, -29f, -67f, -47f)
                reflectiveQuadToRelative(-80f, -21f)
                quadToRelative(-9f, -1f, -15.5f, 5.5f)
                reflectiveQuadTo(242f, 543f)
                quadToRelative(3f, 42f, 21.5f, 79.5f)
                reflectiveQuadTo(311f, 689f)
                quadToRelative(34f, 34f, 77.5f, 52.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(0f, -202f)
                quadToRelative(26f, 0f, 44f, -18f)
                reflectiveQuadToRelative(18f, -44f)
                verticalLineToRelative(-6f)
                quadToRelative(8f, 6f, 16.5f, 9f)
                reflectiveQuadToRelative(19.5f, 3f)
                quadToRelative(26f, 0f, 44f, -18f)
                reflectiveQuadToRelative(18f, -44f)
                quadToRelative(0f, -20f, -9.5f, -35f)
                reflectiveQuadTo(604f, 384f)
                quadToRelative(17f, -6f, 26.5f, -21f)
                reflectiveQuadToRelative(9.5f, -35f)
                quadToRelative(0f, -26f, -18f, -44f)
                reflectiveQuadToRelative(-44f, -18f)
                quadToRelative(-11f, 0f, -19.5f, 3f)
                reflectiveQuadToRelative(-16.5f, 9f)
                verticalLineToRelative(-6f)
                quadToRelative(0f, -26f, -18f, -44f)
                reflectiveQuadToRelative(-44f, -18f)
                quadToRelative(-26f, 0f, -44f, 18f)
                reflectiveQuadToRelative(-18f, 44f)
                verticalLineToRelative(6f)
                quadToRelative(-8f, -6f, -16.5f, -9f)
                reflectiveQuadToRelative(-19.5f, -3f)
                quadToRelative(-26f, 0f, -44f, 18f)
                reflectiveQuadToRelative(-18f, 44f)
                quadToRelative(0f, 20f, 9.5f, 35f)
                reflectiveQuadToRelative(26.5f, 21f)
                quadToRelative(-17f, 6f, -26.5f, 21f)
                reflectiveQuadToRelative(-9.5f, 35f)
                quadToRelative(0f, 26f, 18f, 44f)
                reflectiveQuadToRelative(44f, 18f)
                quadToRelative(11f, 0f, 19.5f, -3f)
                reflectiveQuadToRelative(16.5f, -9f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 26f, 18f, 44f)
                reflectiveQuadToRelative(44f, 18f)
                close()
                moveToRelative(0f, -112f)
                quadToRelative(-26f, 0f, -44f, -17.5f)
                reflectiveQuadTo(418f, 384f)
                quadToRelative(0f, -26f, 18f, -44f)
                reflectiveQuadToRelative(44f, -18f)
                quadToRelative(26f, 0f, 44f, 18f)
                reflectiveQuadToRelative(18f, 44f)
                quadToRelative(0f, 27f, -18f, 44.5f)
                reflectiveQuadTo(480f, 446f)
                close()
                moveToRelative(0f, 314f)
                quadToRelative(48f, 0f, 92f, -18f)
                reflectiveQuadToRelative(78f, -52f)
                quadToRelative(29f, -29f, 47f, -67f)
                reflectiveQuadToRelative(21f, -80f)
                quadToRelative(1f, -9f, -5.5f, -15.5f)
                reflectiveQuadTo(697f, 522f)
                quadToRelative(-42f, 3f, -79.5f, 21f)
                reflectiveQuadTo(551f, 590f)
                quadToRelative(-34f, 34f, -52.5f, 78f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Yard!!
    }

private var _Yard: ImageVector? = null

