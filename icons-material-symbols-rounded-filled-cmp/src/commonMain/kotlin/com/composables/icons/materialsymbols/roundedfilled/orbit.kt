package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Orbit: ImageVector
    get() {
        if (_Orbit != null) return _Orbit!!
        
        _Orbit = ImageVector.Builder(
            name = "orbit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 860f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 22f, -6.5f, 42.5f)
                reflectiveQuadTo(354f, 801f)
                verticalLineToRelative(-27f)
                quadToRelative(30f, 13f, 62f, 19.5f)
                reflectiveQuadToRelative(64f, 6.5f)
                quadToRelative(123f, 0f, 212.5f, -80f)
                reflectiveQuadTo(797f, 521f)
                quadToRelative(2f, -17f, 14f, -29f)
                reflectiveQuadToRelative(29f, -12f)
                quadToRelative(17f, 0f, 28.5f, 12f)
                reflectiveQuadToRelative(9.5f, 29f)
                quadToRelative(-16f, 152f, -129f, 255.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-45f, 0f, -88f, -9.5f)
                reflectiveQuadTo(309f, 842f)
                quadToRelative(-16f, 9f, -33.5f, 13.5f)
                reflectiveQuadTo(240f, 860f)
                close()
                moveToRelative(240f, -240f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -460f)
                quadToRelative(-123f, 0f, -212.5f, 80f)
                reflectiveQuadTo(163f, 439f)
                quadToRelative(-2f, 17f, -14f, 29f)
                reflectiveQuadToRelative(-29f, 12f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(82f, 439f)
                quadToRelative(16f, -152f, 129f, -255.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(45f, 0f, 88f, 9.5f)
                reflectiveQuadToRelative(83f, 28.5f)
                quadToRelative(16f, -9f, 33.5f, -13.5f)
                reflectiveQuadTo(720f, 100f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -22f, 6.5f, -42.5f)
                reflectiveQuadTo(606f, 159f)
                verticalLineToRelative(27f)
                quadToRelative(-30f, -13f, -62f, -19.5f)
                reflectiveQuadToRelative(-64f, -6.5f)
                close()
            }
        }.build()
        
        return _Orbit!!
    }

private var _Orbit: ImageVector? = null

