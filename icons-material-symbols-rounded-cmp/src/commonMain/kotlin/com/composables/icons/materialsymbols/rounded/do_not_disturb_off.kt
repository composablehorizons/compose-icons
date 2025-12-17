package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Do_not_disturb_off: ImageVector
    get() {
        if (_Do_not_disturb_off != null) return _Do_not_disturb_off!!
        
        _Do_not_disturb_off = ImageVector.Builder(
            name = "do_not_disturb_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(634f, 520f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(87f)
                quadToRelative(17f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 520f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(-227f, -80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-87f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 440f)
                horizontalLineToRelative(87f)
                close()
                moveToRelative(73f, 440f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineToRelative(-90f, -91f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(56f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 735f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(848f, 903f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-90f, -89f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(45f, 0f, 85.5f, -12f)
                reflectiveQuadToRelative(76.5f, -33f)
                lineTo(205f, 318f)
                quadToRelative(-21f, 36f, -33f, 76.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(-56f, -264f)
                close()
                moveToRelative(135f, -135f)
                close()
                moveTo(314f, 116f)
                quadToRelative(39f, -18f, 81f, -27f)
                reflectiveQuadToRelative(85f, -9f)
                quadToRelative(80f, 0f, 153f, 30f)
                reflectiveQuadToRelative(130f, 87f)
                quadToRelative(57f, 57f, 87f, 130f)
                reflectiveQuadToRelative(30f, 153f)
                quadToRelative(0f, 43f, -9f, 85f)
                reflectiveQuadToRelative(-27f, 81f)
                quadToRelative(-7f, 15f, -23f, 19.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                quadToRelative(-14f, -8f, -19f, -24f)
                reflectiveQuadToRelative(2f, -32f)
                quadToRelative(13f, -30f, 19.5f, -62f)
                reflectiveQuadToRelative(6.5f, -64f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-32f, 0f, -64f, 6.5f)
                reflectiveQuadTo(354f, 186f)
                quadToRelative(-16f, 7f, -32f, 2f)
                reflectiveQuadToRelative(-24f, -19f)
                quadToRelative(-8f, -14f, -3.5f, -30f)
                reflectiveQuadToRelative(19.5f, -23f)
                close()
            }
        }.build()
        
        return _Do_not_disturb_off!!
    }

private var _Do_not_disturb_off: ImageVector? = null

