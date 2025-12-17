package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Yard: ImageVector
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
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
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
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
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

