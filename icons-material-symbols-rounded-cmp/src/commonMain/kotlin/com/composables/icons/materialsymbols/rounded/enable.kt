package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Enable: ImageVector
    get() {
        if (_Enable != null) return _Enable!!
        
        _Enable = ImageVector.Builder(
            name = "enable",
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
                quadToRelative(0f, -112f, 56.5f, -206.5f)
                reflectiveQuadTo(290f, 127f)
                quadToRelative(15f, -8f, 31.5f, -2f)
                reflectiveQuadToRelative(23.5f, 22f)
                quadToRelative(6f, 15f, 0f, 30.5f)
                reflectiveQuadTo(325f, 201f)
                quadToRelative(-75f, 42f, -120f, 116.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                quadToRelative(0f, -88f, -45f, -162.5f)
                reflectiveQuadTo(635f, 201f)
                quadToRelative(-14f, -8f, -20f, -23.5f)
                reflectiveQuadToRelative(0f, -30.5f)
                quadToRelative(6f, -16f, 21.5f, -23f)
                reflectiveQuadToRelative(29.5f, 1f)
                quadToRelative(98f, 51f, 156f, 146f)
                reflectiveQuadToRelative(58f, 209f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-40f, -393f)
                verticalLineToRelative(-367f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(367f)
                lineToRelative(76f, -75f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(652f, 412f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(508f, 612f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(308f, 468f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(308f, 412f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(76f, 75f)
                close()
            }
        }.build()
        
        return _Enable!!
    }

private var _Enable: ImageVector? = null

