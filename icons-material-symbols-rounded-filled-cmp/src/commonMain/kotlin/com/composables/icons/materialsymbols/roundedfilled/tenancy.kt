package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tenancy: ImageVector
    get() {
        if (_Tenancy != null) return _Tenancy!!
        
        _Tenancy = ImageVector.Builder(
            name = "tenancy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(9f, 0f, 17.5f, 1.5f)
                reflectiveQuadTo(194f, 605f)
                lineToRelative(162f, -223f)
                quadToRelative(-17f, -21f, -26.5f, -47f)
                reflectiveQuadToRelative(-9.5f, -55f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 29f, -10f, 55f)
                reflectiveQuadToRelative(-27f, 47f)
                lineToRelative(163f, 223f)
                quadToRelative(8f, -2f, 16.5f, -3.5f)
                reflectiveQuadTo(800f, 600f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -19f, 5.5f, -36.5f)
                reflectiveQuadTo(701f, 652f)
                lineTo(539f, 429f)
                quadToRelative(-5f, 2f, -9.5f, 3f)
                reflectiveQuadToRelative(-9.5f, 3f)
                verticalLineToRelative(172f)
                quadToRelative(35f, 12f, 57.5f, 43f)
                reflectiveQuadToRelative(22.5f, 70f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -39f, 22.5f, -69.5f)
                reflectiveQuadTo(440f, 607f)
                verticalLineToRelative(-172f)
                quadToRelative(-5f, -2f, -9.5f, -3f)
                reflectiveQuadToRelative(-9.5f, -3f)
                lineTo(259f, 652f)
                quadToRelative(10f, 14f, 15.5f, 31.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Tenancy!!
    }

private var _Tenancy: ImageVector? = null

