package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.History_2: ImageVector
    get() {
        if (_History_2 != null) return _History_2!!
        
        _History_2 = ImageVector.Builder(
            name = "history_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-155f, 0f, -269f, -103f)
                reflectiveQuadTo(82f, 520f)
                horizontalLineToRelative(81f)
                quadToRelative(15f, 121f, 105.5f, 200.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-86f, 0f, -159.5f, 42.5f)
                reflectiveQuadTo(204f, 320f)
                horizontalLineToRelative(116f)
                verticalLineToRelative(80f)
                horizontalLineTo(88f)
                quadToRelative(29f, -140f, 139f, -230f)
                reflectiveQuadToRelative(253f, -90f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(112f, -232f)
                lineTo(440f, 496f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(128f, 128f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _History_2!!
    }

private var _History_2: ImageVector? = null

