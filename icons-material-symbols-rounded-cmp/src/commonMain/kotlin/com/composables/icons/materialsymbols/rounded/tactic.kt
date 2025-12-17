package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tactic: ImageVector
    get() {
        if (_Tactic != null) return _Tactic!!
        
        _Tactic = ImageVector.Builder(
            name = "tactic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 777f)
                lineToRelative(-36f, 36f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(628f, 812f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(35f, -36f)
                lineToRelative(-35f, -35f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(35f, 35f)
                lineToRelative(35f, -36f)
                quadToRelative(11f, -12f, 27.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(811f, 685f)
                lineToRelative(-35f, 35f)
                lineToRelative(36f, 36f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(811f, 812f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(755f, 812f)
                lineToRelative(-35f, -35f)
                close()
                moveToRelative(-480f, -17f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 760f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(37f, 0f, 67.5f, 20.5f)
                reflectiveQuadTo(352f, 676f)
                quadToRelative(39f, -11f, 63.5f, -43f)
                reflectiveQuadToRelative(24.5f, -73f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(640f, 200f)
                horizontalLineToRelative(46f)
                lineToRelative(-35f, -35f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(652f, 108f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(103f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(708f, 372f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(652f, 372f)
                quadToRelative(-12f, -11f, -12f, -28f)
                reflectiveQuadToRelative(11f, -29f)
                lineToRelative(35f, -35f)
                horizontalLineToRelative(-46f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 73f, -47f, 128.5f)
                reflectiveQuadTo(354f, 757f)
                quadToRelative(-12f, 37f, -43.5f, 60f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(0f, -543f)
                lineToRelative(-36f, 36f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(148f, 332f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(35f, -36f)
                lineToRelative(-35f, -35f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(35f, 35f)
                lineToRelative(35f, -36f)
                quadToRelative(11f, -12f, 27.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(331f, 205f)
                lineToRelative(-35f, 35f)
                lineToRelative(36f, 36f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(331f, 332f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(275f, 332f)
                lineToRelative(-35f, -35f)
                close()
            }
        }.build()
        
        return _Tactic!!
    }

private var _Tactic: ImageVector? = null

