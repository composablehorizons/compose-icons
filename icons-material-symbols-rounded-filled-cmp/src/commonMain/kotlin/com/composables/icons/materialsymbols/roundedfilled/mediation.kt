package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mediation: ImageVector
    get() {
        if (_Mediation != null) return _Mediation!!
        
        _Mediation = ImageVector.Builder(
            name = "mediation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(728f, 520f)
                horizontalLineTo(518f)
                quadToRelative(-11f, 92f, -63f, 166.5f)
                reflectiveQuadTo(320f, 802f)
                quadToRelative(-2f, 50f, -36f, 84f)
                reflectiveQuadToRelative(-84f, 34f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(27f, 0f, 52f, 12.5f)
                reflectiveQuadToRelative(42f, 33.5f)
                quadToRelative(59f, -32f, 96f, -86f)
                reflectiveQuadToRelative(46f, -120f)
                horizontalLineTo(312f)
                quadToRelative(-12f, 36f, -43f, 58f)
                reflectiveQuadToRelative(-69f, 22f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(38f, 0f, 69f, 22f)
                reflectiveQuadToRelative(43f, 58f)
                horizontalLineToRelative(124f)
                quadToRelative(-9f, -66f, -46f, -120f)
                reflectiveQuadToRelative(-96f, -86f)
                quadToRelative(-17f, 21f, -42f, 33.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 84f, 34f)
                reflectiveQuadToRelative(36f, 84f)
                quadToRelative(81f, 42f, 134f, 116f)
                reflectiveQuadToRelative(64f, 166f)
                horizontalLineToRelative(210f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(748f, 612f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(36f, -36f)
                close()
            }
        }.build()
        
        return _Mediation!!
    }

private var _Mediation: ImageVector? = null

