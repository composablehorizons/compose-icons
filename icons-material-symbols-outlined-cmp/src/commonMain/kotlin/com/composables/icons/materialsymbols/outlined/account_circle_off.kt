package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Account_circle_off: ImageVector
    get() {
        if (_Account_circle_off != null) return _Account_circle_off!!
        
        _Account_circle_off = ImageVector.Builder(
            name = "account_circle_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(538f, 422f)
                close()
                moveTo(424f, 536f)
                close()
                moveToRelative(56f, 264f)
                quadToRelative(51f, 0f, 98f, -15.5f)
                reflectiveQuadToRelative(88f, -44.5f)
                quadToRelative(-41f, -29f, -88f, -44.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-51f, 0f, -98f, 15.5f)
                reflectiveQuadTo(294f, 740f)
                quadToRelative(41f, 29f, 88f, 44.5f)
                reflectiveQuadToRelative(98f, 15.5f)
                close()
                moveToRelative(106f, -328f)
                lineToRelative(-57f, -57f)
                quadToRelative(5f, -8f, 8f, -17f)
                reflectiveQuadToRelative(3f, -18f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-9f, 0f, -18f, 3f)
                reflectiveQuadToRelative(-17f, 8f)
                lineToRelative(-57f, -57f)
                quadToRelative(19f, -17f, 42.5f, -25.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 26f, -8.5f, 49.5f)
                reflectiveQuadTo(586f, 472f)
                close()
                moveToRelative(228f, 228f)
                lineToRelative(-58f, -58f)
                quadToRelative(22f, -37f, 33f, -78f)
                reflectiveQuadToRelative(11f, -84f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-43f, 0f, -84f, 11f)
                reflectiveQuadToRelative(-78f, 33f)
                lineToRelative(-58f, -58f)
                quadToRelative(49f, -32f, 105f, -49f)
                reflectiveQuadToRelative(115f, -17f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 59f, -17f, 115f)
                reflectiveQuadToRelative(-49f, 105f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -59f, 16.5f, -115f)
                reflectiveQuadTo(145f, 259f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                lineToRelative(-615f, -614f)
                quadToRelative(-22f, 37f, -33f, 78f)
                reflectiveQuadToRelative(-11f, 84f)
                quadToRelative(0f, 57f, 19f, 109f)
                reflectiveQuadToRelative(55f, 95f)
                quadToRelative(54f, -41f, 116.5f, -62.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(38f, 0f, 76f, 8f)
                reflectiveQuadToRelative(74f, 22f)
                lineToRelative(133f, 133f)
                quadToRelative(-57f, 57f, -130f, 87f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Account_circle_off!!
    }

private var _Account_circle_off: ImageVector? = null

