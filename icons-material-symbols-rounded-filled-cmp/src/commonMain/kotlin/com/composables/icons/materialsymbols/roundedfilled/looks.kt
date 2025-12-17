package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Looks: ImageVector
    get() {
        if (_Looks != null) return _Looks!!
        
        _Looks = ImageVector.Builder(
            name = "looks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 320f)
                quadToRelative(-140f, 0f, -242f, 94f)
                reflectiveQuadTo(122f, 645f)
                quadToRelative(-2f, 16f, -14f, 25.5f)
                reflectiveQuadTo(80f, 680f)
                quadToRelative(-17f, 0f, -29f, -10.5f)
                reflectiveQuadTo(41f, 644f)
                quadToRelative(7f, -84f, 44f, -158f)
                reflectiveQuadToRelative(96f, -128.5f)
                quadToRelative(59f, -54.5f, 136f, -86f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(86f, 0f, 163f, 31.5f)
                reflectiveQuadToRelative(136f, 86f)
                quadTo(838f, 412f, 875f, 486f)
                reflectiveQuadToRelative(44f, 158f)
                quadToRelative(2f, 15f, -10f, 25.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(-16f, 0f, -28f, -9.5f)
                reflectiveQuadTo(838f, 645f)
                quadToRelative(-14f, -137f, -116f, -231f)
                reflectiveQuadToRelative(-242f, -94f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(-75f, 0f, -130f, 48f)
                reflectiveQuadToRelative(-67f, 120f)
                quadToRelative(-2f, 15f, -14.5f, 23.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -10.5f)
                reflectiveQuadTo(202f, 644f)
                quadToRelative(14f, -103f, 92.5f, -173.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(107f, 0f, 185.5f, 70.5f)
                reflectiveQuadTo(758f, 644f)
                quadToRelative(2f, 15f, -9.5f, 25.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(-16f, 0f, -28.5f, -8.5f)
                reflectiveQuadTo(677f, 648f)
                quadToRelative(-12f, -72f, -67f, -120f)
                reflectiveQuadToRelative(-130f, -48f)
                close()
            }
        }.build()
        
        return _Looks!!
    }

private var _Looks: ImageVector? = null

