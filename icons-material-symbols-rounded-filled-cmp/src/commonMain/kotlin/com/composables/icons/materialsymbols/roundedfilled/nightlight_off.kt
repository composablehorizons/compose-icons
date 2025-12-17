package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nightlight_off: ImageVector
    get() {
        if (_Nightlight_off != null) return _Nightlight_off!!
        
        _Nightlight_off = ImageVector.Builder(
            name = "nightlight_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 999f)
                lineToRelative(-90f, -89f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 976f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 859f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 576f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 355f)
                lineToRelative(-91f, -91f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(56f, 207f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 999f)
                close()
                moveTo(240f, 576f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(17f, 0f, 32f, -2f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(4f, -1f, 12f, -15f)
                quadToRelative(1f, -5f, -1.5f, -10f)
                reflectiveQuadToRelative(-7.5f, -8f)
                quadToRelative(-26f, -15f, -50f, -44f)
                reflectiveQuadToRelative(-38f, -65f)
                lineTo(263f, 472f)
                quadToRelative(-11f, 24f, -17f, 50f)
                reflectiveQuadToRelative(-6f, 54f)
                close()
                moveToRelative(575f, 220f)
                lineTo(473f, 454f)
                quadToRelative(16f, -27f, 36f, -48f)
                reflectiveQuadToRelative(36f, -29f)
                quadToRelative(5f, -4f, 7.5f, -8.5f)
                reflectiveQuadToRelative(1.5f, -9.5f)
                quadToRelative(-1f, -5f, -4f, -9f)
                reflectiveQuadToRelative(-8f, -6f)
                quadToRelative(-15f, -4f, -30f, -6f)
                reflectiveQuadToRelative(-32f, -2f)
                quadToRelative(-28f, 0f, -53.5f, 6f)
                reflectiveQuadTo(378f, 359f)
                lineTo(260f, 241f)
                quadToRelative(48f, -31f, 103.5f, -48f)
                reflectiveQuadTo(480f, 176f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 293f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 576f)
                quadToRelative(0f, 61f, -17f, 116.5f)
                reflectiveQuadTo(815f, 796f)
                close()
            }
        }.build()
        
        return _Nightlight_off!!
    }

private var _Nightlight_off: ImageVector? = null

