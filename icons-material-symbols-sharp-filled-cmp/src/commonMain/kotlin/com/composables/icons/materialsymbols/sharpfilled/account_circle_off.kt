package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Account_circle_off: ImageVector
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
                moveTo(480f, 800f)
                quadToRelative(43f, 0f, 84f, -11.5f)
                reflectiveQuadToRelative(78f, -33.5f)
                lineTo(487f, 600f)
                horizontalLineToRelative(-7f)
                quadToRelative(-67f, 0f, -130f, 21.5f)
                reflectiveQuadTo(234f, 684f)
                quadToRelative(50f, 55f, 110f, 85.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveTo(819f, 932f)
                lineTo(701f, 814f)
                quadToRelative(-49f, 32f, -105f, 49f)
                reflectiveQuadTo(480f, 880f)
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
                close()
                moveToRelative(-5f, -232f)
                lineTo(586f, 472f)
                quadToRelative(17f, -19f, 25.5f, -42.5f)
                reflectiveQuadTo(620f, 380f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-26f, 0f, -49.5f, 8.5f)
                reflectiveQuadTo(388f, 274f)
                lineTo(260f, 146f)
                quadToRelative(49f, -32f, 105f, -49f)
                reflectiveQuadToRelative(115f, -17f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 59f, -17f, 115f)
                reflectiveQuadToRelative(-49f, 105f)
                close()
            }
        }.build()
        
        return _Account_circle_off!!
    }

private var _Account_circle_off: ImageVector? = null

