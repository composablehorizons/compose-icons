package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Contactless: ImageVector
    get() {
        if (_Contactless != null) return _Contactless!!
        
        _Contactless = ImageVector.Builder(
            name = "contactless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(276f, 480f)
                quadToRelative(0f, 9f, -1f, 18.5f)
                reflectiveQuadToRelative(-3f, 18.5f)
                quadToRelative(-3f, 17f, 4f, 32.5f)
                reflectiveQuadToRelative(23f, 21.5f)
                quadToRelative(16f, 6f, 30.5f, -1f)
                reflectiveQuadToRelative(18.5f, -23f)
                quadToRelative(4f, -16f, 6f, -33f)
                reflectiveQuadToRelative(2f, -34f)
                quadToRelative(0f, -17f, -2f, -34f)
                reflectiveQuadToRelative(-6f, -33f)
                quadToRelative(-4f, -16f, -18.5f, -23f)
                reflectiveQuadToRelative(-30.5f, -1f)
                quadToRelative(-16f, 6f, -23f, 21.5f)
                reflectiveQuadToRelative(-4f, 32.5f)
                quadToRelative(2f, 9f, 3f, 18.5f)
                reflectiveQuadToRelative(1f, 18.5f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(0f, 24f, -3f, 47f)
                reflectiveQuadToRelative(-9f, 45f)
                quadToRelative(-5f, 17f, 1.5f, 32f)
                reflectiveQuadToRelative(21.5f, 21f)
                quadToRelative(16f, 7f, 31.5f, -0.5f)
                reflectiveQuadTo(479f, 600f)
                quadToRelative(9f, -29f, 13f, -59f)
                reflectiveQuadToRelative(4f, -61f)
                quadToRelative(0f, -31f, -4f, -61f)
                reflectiveQuadToRelative(-13f, -59f)
                quadToRelative(-5f, -17f, -20.5f, -24.5f)
                reflectiveQuadTo(427f, 335f)
                quadToRelative(-15f, 6f, -21.5f, 21f)
                reflectiveQuadToRelative(-1.5f, 32f)
                quadToRelative(6f, 22f, 9f, 45f)
                reflectiveQuadToRelative(3f, 47f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(0f, 37f, -5f, 72.5f)
                reflectiveQuadTo(535f, 622f)
                quadToRelative(-5f, 17f, 0.5f, 33f)
                reflectiveQuadToRelative(21.5f, 23f)
                quadToRelative(16f, 7f, 31.5f, 0f)
                reflectiveQuadToRelative(20.5f, -24f)
                quadToRelative(14f, -42f, 20.5f, -85f)
                reflectiveQuadToRelative(6.5f, -89f)
                quadToRelative(0f, -46f, -6.5f, -89f)
                reflectiveQuadTo(609f, 306f)
                quadToRelative(-5f, -17f, -20.5f, -24f)
                reflectiveQuadToRelative(-31.5f, 0f)
                quadToRelative(-16f, 7f, -21.5f, 23f)
                reflectiveQuadToRelative(-0.5f, 33f)
                quadToRelative(11f, 34f, 16f, 69.5f)
                reflectiveQuadToRelative(5f, 72.5f)
                close()
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
            }
        }.build()
        
        return _Contactless!!
    }

private var _Contactless: ImageVector? = null

