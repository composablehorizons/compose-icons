package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Send_money: ImageVector
    get() {
        if (_Send_money != null) return _Send_money!!
        
        _Send_money = ImageVector.Builder(
            name = "send_money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 480f)
                quadToRelative(0f, 68f, 34f, 124.5f)
                reflectiveQuadToRelative(91f, 86.5f)
                quadToRelative(14f, 8f, 20.5f, 23f)
                reflectiveQuadToRelative(0.5f, 30f)
                quadToRelative(-6f, 16f, -21f, 23f)
                reflectiveQuadToRelative(-29f, -1f)
                quadTo(98f, 726f, 49f, 650.5f)
                reflectiveQuadTo(0f, 480f)
                quadToRelative(0f, -94f, 47.5f, -169f)
                reflectiveQuadTo(172f, 196f)
                quadToRelative(14f, -8f, 29.5f, -1.5f)
                reflectiveQuadTo(224f, 217f)
                quadToRelative(7f, 14f, 1f, 29f)
                reflectiveQuadToRelative(-20f, 23f)
                quadToRelative(-57f, 30f, -91f, 86.5f)
                reflectiveQuadTo(80f, 480f)
                close()
                moveToRelative(480f, 320f)
                quadToRelative(-133f, 0f, -226.5f, -93.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -133f, 93.5f, -226.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(56f, 0f, 106f, 18f)
                reflectiveQuadToRelative(91f, 50f)
                quadToRelative(13f, 10f, 13f, 26f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-11f, 11f, -27.5f, 12f)
                reflectiveQuadToRelative(-30.5f, -9f)
                quadToRelative(-30f, -22f, -65.5f, -33.5f)
                reflectiveQuadTo(560f, 240f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(39f, 0f, 74.5f, -11.5f)
                reflectiveQuadTo(700f, 675f)
                quadToRelative(14f, -10f, 30.5f, -9f)
                reflectiveQuadToRelative(27.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-13f, 26f)
                quadToRelative(-41f, 32f, -91f, 50f)
                reflectiveQuadToRelative(-106f, 18f)
                close()
                moveToRelative(248f, -280f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineToRelative(248f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(828f, 612f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(36f, -36f)
                close()
            }
        }.build()
        
        return _Send_money!!
    }

private var _Send_money: ImageVector? = null

