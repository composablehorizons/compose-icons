package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Offline_bolt: ImageVector
    get() {
        if (_Offline_bolt != null) return _Offline_bolt!!
        
        _Offline_bolt = ImageVector.Builder(
            name = "offline_bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
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
                moveToRelative(-24f, 60f)
                verticalLineToRelative(137f)
                quadToRelative(0f, 16f, 15f, 19.5f)
                reflectiveQuadToRelative(23f, -10.5f)
                lineToRelative(121f, -237f)
                quadToRelative(5f, -10f, -1f, -19.5f)
                reflectiveQuadToRelative(-17f, -9.5f)
                horizontalLineToRelative(-87f)
                verticalLineToRelative(-139f)
                quadToRelative(0f, -16f, -15f, -20f)
                reflectiveQuadToRelative(-23f, 10f)
                lineTo(346f, 511f)
                quadToRelative(-5f, 11f, 0.5f, 20f)
                reflectiveQuadToRelative(16.5f, 9f)
                horizontalLineToRelative(93f)
                close()
            }
        }.build()
        
        return _Offline_bolt!!
    }

private var _Offline_bolt: ImageVector? = null

