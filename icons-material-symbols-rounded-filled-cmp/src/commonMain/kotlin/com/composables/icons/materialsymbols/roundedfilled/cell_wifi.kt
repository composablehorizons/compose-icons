package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cell_wifi: ImageVector
    get() {
        if (_Cell_wifi != null) return _Cell_wifi!!
        
        _Cell_wifi = ImageVector.Builder(
            name = "cell_wifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 880f)
                quadToRelative(-27f, 0f, -37f, -24.5f)
                reflectiveQuadToRelative(9f, -43.5f)
                lineToRelative(504f, -505f)
                quadToRelative(19f, -19f, 43.5f, -9f)
                reflectiveQuadToRelative(24.5f, 37f)
                verticalLineToRelative(485f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(820f, 880f)
                horizontalLineTo(336f)
                close()
                moveToRelative(384f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-368f)
                lineToRelative(-80f, 80f)
                verticalLineToRelative(288f)
                close()
                moveTo(442f, 524f)
                quadToRelative(-24f, 0f, -42f, -18f)
                reflectiveQuadToRelative(-18f, -42f)
                quadToRelative(0f, -24f, 18f, -42f)
                reflectiveQuadToRelative(42f, -18f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                close()
                moveToRelative(0f, -186f)
                quadToRelative(-26f, 0f, -51.5f, 7.5f)
                reflectiveQuadTo(342f, 369f)
                quadToRelative(-13f, 8f, -28f, 8f)
                reflectiveQuadToRelative(-26f, -11f)
                quadToRelative(-11f, -11f, -10.5f, -26f)
                reflectiveQuadToRelative(12.5f, -24f)
                quadToRelative(34f, -25f, 72.5f, -37.5f)
                reflectiveQuadTo(442f, 266f)
                quadToRelative(41f, 0f, 79.5f, 12.5f)
                reflectiveQuadTo(594f, 316f)
                quadToRelative(12f, 9f, 12.5f, 24f)
                reflectiveQuadTo(596f, 366f)
                quadToRelative(-11f, 11f, -26f, 11f)
                reflectiveQuadToRelative(-28f, -8f)
                quadToRelative(-23f, -16f, -48.5f, -23.5f)
                reflectiveQuadTo(442f, 338f)
                close()
                moveToRelative(0f, -144f)
                quadToRelative(-54f, 0f, -105.5f, 17f)
                reflectiveQuadTo(240f, 263f)
                quadToRelative(-12f, 10f, -27.5f, 10.5f)
                reflectiveQuadTo(186f, 263f)
                quadToRelative(-11f, -11f, -10f, -26f)
                reflectiveQuadToRelative(13f, -25f)
                quadToRelative(55f, -46f, 120f, -69f)
                reflectiveQuadToRelative(133f, -23f)
                quadToRelative(68f, 0f, 133.5f, 23f)
                reflectiveQuadTo(697f, 212f)
                quadToRelative(12f, 10f, 13f, 25f)
                reflectiveQuadToRelative(-10f, 26f)
                quadToRelative(-11f, 11f, -26.5f, 10.5f)
                reflectiveQuadTo(646f, 263f)
                quadToRelative(-45f, -35f, -97.5f, -52f)
                reflectiveQuadTo(442f, 194f)
                close()
            }
        }.build()
        
        return _Cell_wifi!!
    }

private var _Cell_wifi: ImageVector? = null

