package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Macro_off: ImageVector
    get() {
        if (_Macro_off != null) return _Macro_off!!
        
        _Macro_off = ImageVector.Builder(
            name = "macro_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(794f, 695f)
                lineTo(665f, 566f)
                quadToRelative(39f, -22f, 83f, -34f)
                reflectiveQuadToRelative(92f, -12f)
                quadToRelative(0f, 48f, -12f, 92f)
                reflectiveQuadToRelative(-34f, 83f)
                close()
                moveToRelative(54f, 168f)
                lineToRelative(-57f, 57f)
                lineToRelative(-105f, -105f)
                quadToRelative(-44f, 31f, -96.5f, 48f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(0f, -57f, 17f, -109.5f)
                reflectiveQuadToRelative(48f, -96.5f)
                lineToRelative(-74f, -74f)
                quadToRelative(-36f, -3f, -65f, -24f)
                reflectiveQuadToRelative(-42f, -54f)
                quadToRelative(-5f, 0f, -9f, 0.5f)
                reflectiveQuadToRelative(-9f, 0.5f)
                quadToRelative(-53f, 0f, -89.5f, -36.5f)
                reflectiveQuadTo(220f, 397f)
                quadToRelative(0f, -11f, 1.5f, -21f)
                reflectiveQuadToRelative(5.5f, -20f)
                lineTo(55f, 184f)
                lineToRelative(57f, -57f)
                lineTo(848f, 863f)
                close()
                moveTo(480f, 40f)
                quadToRelative(38f, 0f, 70f, 21.5f)
                reflectiveQuadToRelative(46f, 56.5f)
                quadToRelative(5f, 0f, 9f, -0.5f)
                reflectiveQuadToRelative(9f, -0.5f)
                quadToRelative(52f, 0f, 88.5f, 37f)
                reflectiveQuadToRelative(36.5f, 89f)
                quadToRelative(0f, 21f, -6.5f, 40.5f)
                reflectiveQuadTo(712f, 320f)
                quadToRelative(13f, 17f, 20f, 36.5f)
                reflectiveQuadToRelative(7f, 40.5f)
                quadToRelative(0f, 50f, -33.5f, 86.5f)
                reflectiveQuadTo(622f, 523f)
                lineTo(513f, 414f)
                quadToRelative(29f, -11f, 48f, -36.5f)
                reflectiveQuadToRelative(19f, -57.5f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-32f, 0f, -57.5f, 19f)
                reflectiveQuadTo(386f, 287f)
                lineTo(255f, 156f)
                quadToRelative(21f, -22f, 50f, -31f)
                reflectiveQuadToRelative(59f, -7f)
                quadToRelative(14f, -35f, 46f, -56.5f)
                reflectiveQuadToRelative(70f, -21.5f)
                close()
                moveToRelative(0f, 840f)
                quadToRelative(0f, -74f, -28.5f, -139.5f)
                reflectiveQuadTo(374f, 626f)
                quadToRelative(-49f, -49f, -114.5f, -77.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, 74f, 28.5f, 139.5f)
                reflectiveQuadTo(226f, 774f)
                quadToRelative(49f, 49f, 114.5f, 77.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Macro_off!!
    }

private var _Macro_off: ImageVector? = null

