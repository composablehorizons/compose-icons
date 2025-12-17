package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nightlight_off: ImageVector
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
                moveTo(819f, 1028f)
                lineTo(701f, 910f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 976f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 859f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 576f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 355f)
                lineTo(27f, 236f)
                lineToRelative(57f, -57f)
                lineToRelative(792f, 792f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 816f)
                quadToRelative(27f, 0f, 52f, -5f)
                reflectiveQuadToRelative(48f, -16f)
                quadToRelative(-42f, -20f, -74f, -53f)
                reflectiveQuadToRelative(-49f, -76f)
                lineTo(263f, 472f)
                quadToRelative(-11f, 24f, -17f, 50f)
                reflectiveQuadToRelative(-6f, 54f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(335f, -20f)
                lineTo(473f, 454f)
                quadToRelative(19f, -32f, 46f, -57f)
                reflectiveQuadToRelative(61f, -40f)
                quadToRelative(-23f, -11f, -48f, -16f)
                reflectiveQuadToRelative(-52f, -5f)
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

