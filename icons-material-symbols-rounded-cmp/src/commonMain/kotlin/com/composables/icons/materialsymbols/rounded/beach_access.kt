package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Beach_access: ImageVector
    get() {
        if (_Beach_access != null) return _Beach_access!!
        
        _Beach_access = ImageVector.Builder(
            name = "beach_access",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(756f, 812f)
                lineTo(558f, 614f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(198f, 198f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(-575f, -72f)
                quadToRelative(-31f, -50f, -46f, -104.5f)
                reflectiveQuadTo(120f, 524f)
                quadToRelative(0f, -78f, 29f, -152f)
                reflectiveQuadToRelative(89f, -134f)
                quadToRelative(60f, -60f, 134.5f, -89.5f)
                reflectiveQuadTo(525f, 119f)
                quadToRelative(57f, 0f, 111.5f, 15.5f)
                reflectiveQuadTo(740f, 181f)
                quadToRelative(31f, 20f, 33f, 57f)
                reflectiveQuadToRelative(-26f, 65f)
                lineTo(303f, 747f)
                quadToRelative(-28f, 28f, -65.5f, 26f)
                reflectiveQuadTo(181f, 740f)
                close()
                moveToRelative(65f, -50f)
                lineToRelative(54f, -54f)
                quadToRelative(-16f, -21f, -30.5f, -43f)
                reflectiveQuadTo(243f, 549f)
                quadToRelative(-12f, -22f, -21f, -44f)
                reflectiveQuadToRelative(-16f, -43f)
                quadToRelative(-11f, 59f, -1.5f, 118f)
                reflectiveQuadTo(246f, 690f)
                close()
                moveToRelative(112f, -110f)
                lineToRelative(222f, -224f)
                quadToRelative(-43f, -33f, -86.5f, -53.5f)
                reflectiveQuadToRelative(-81.5f, -28f)
                quadToRelative(-38f, -7.5f, -68.5f, -2.5f)
                reflectiveQuadTo(296f, 294f)
                quadToRelative(-17f, 18f, -22f, 48.5f)
                reflectiveQuadToRelative(2.5f, 69f)
                quadToRelative(7.5f, 38.5f, 28f, 81.5f)
                reflectiveQuadToRelative(53.5f, 87f)
                close()
                moveToRelative(334f, -334f)
                quadToRelative(-53f, -32f, -112f, -42f)
                reflectiveQuadToRelative(-118f, 2f)
                quadToRelative(22f, 7f, 44f, 16f)
                reflectiveQuadToRelative(44f, 20.5f)
                quadToRelative(22f, 11.5f, 43.5f, 26f)
                reflectiveQuadTo(636f, 300f)
                lineToRelative(56f, -54f)
                close()
            }
        }.build()
        
        return _Beach_access!!
    }

private var _Beach_access: ImageVector? = null

