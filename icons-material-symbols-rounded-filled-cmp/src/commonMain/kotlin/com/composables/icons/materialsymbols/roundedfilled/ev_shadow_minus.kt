package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ev_shadow_minus: ImageVector
    get() {
        if (_Ev_shadow_minus != null) return _Ev_shadow_minus!!
        
        _Ev_shadow_minus = ImageVector.Builder(
            name = "ev_shadow_minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 680f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineTo(600f)
                close()
                moveTo(439f, 878f)
                quadToRelative(-70f, 0f, -131f, -32.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-57f, -57f, -87f, -130f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(156f, 0f, 268f, 101.5f)
                reflectiveQuadTo(877f, 435f)
                quadToRelative(2f, 18f, -9.5f, 31.5f)
                reflectiveQuadTo(838f, 480f)
                quadToRelative(-15f, 0f, -26.5f, -9.5f)
                reflectiveQuadTo(798f, 446f)
                quadToRelative(-5f, -29f, -9.5f, -50.5f)
                reflectiveQuadTo(770f, 345f)
                lineTo(432f, 682f)
                quadToRelative(13f, 16f, 27.5f, 29.5f)
                reflectiveQuadTo(491f, 738f)
                quadToRelative(20f, 16f, 27f, 40f)
                reflectiveQuadToRelative(-2f, 48f)
                quadToRelative(-9f, 25f, -30f, 38.5f)
                reflectiveQuadTo(439f, 878f)
                close()
                moveToRelative(-50f, -265f)
                lineToRelative(337f, -337f)
                quadToRelative(-11f, -12f, -22f, -23.5f)
                reflectiveQuadTo(680f, 231f)
                lineTo(367f, 545f)
                quadToRelative(4f, 18f, 9f, 34.5f)
                reflectiveQuadToRelative(13f, 33.5f)
                close()
                moveToRelative(-26f, -178f)
                lineToRelative(247f, -247f)
                quadToRelative(-8f, -3f, -14.5f, -6.5f)
                reflectiveQuadTo(581f, 176f)
                quadToRelative(-86f, 28f, -145.5f, 97.5f)
                reflectiveQuadTo(363f, 435f)
                close()
            }
        }.build()
        
        return _Ev_shadow_minus!!
    }

private var _Ev_shadow_minus: ImageVector? = null

