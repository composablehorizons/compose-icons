package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nightlight_badge: ImageVector
    get() {
        if (_Nightlight_badge != null) return _Nightlight_badge!!
        
        _Nightlight_badge = ImageVector.Builder(
            name = "nightlight_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 976f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 859f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 576f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 293f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 176f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 293f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 576f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 859f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 976f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -320f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(17f, 0f, 32f, -2f)
                reflectiveQuadToRelative(30f, -6f)
                quadToRelative(4f, -1f, 12f, -15f)
                quadToRelative(1f, -5f, -1.5f, -10f)
                reflectiveQuadToRelative(-7.5f, -8f)
                quadToRelative(-48f, -32f, -76.5f, -84f)
                reflectiveQuadTo(440f, 576f)
                quadToRelative(0f, -63f, 28.5f, -115f)
                reflectiveQuadToRelative(76.5f, -84f)
                quadToRelative(5f, -4f, 7.5f, -8.5f)
                reflectiveQuadToRelative(1.5f, -9.5f)
                quadToRelative(-1f, -5f, -4f, -9f)
                reflectiveQuadToRelative(-8f, -6f)
                quadToRelative(-15f, -4f, -30f, -6f)
                reflectiveQuadToRelative(-32f, -2f)
                quadToRelative(-100f, 0f, -170f, 69.5f)
                reflectiveQuadTo(240f, 576f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
            }
        }.build()
        
        return _Nightlight_badge!!
    }

private var _Nightlight_badge: ImageVector? = null

