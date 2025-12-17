package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Touch_long: ImageVector
    get() {
        if (_Touch_long != null) return _Touch_long!!
        
        _Touch_long = ImageVector.Builder(
            name = "touch_long",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(419f, 880f)
                quadToRelative(-28f, 0f, -52.5f, -12f)
                reflectiveQuadTo(325f, 834f)
                lineTo(124f, 579f)
                quadToRelative(-8f, -9f, -7f, -21.5f)
                reflectiveQuadToRelative(9f, -20.5f)
                quadToRelative(20f, -21f, 48f, -25f)
                reflectiveQuadToRelative(52f, 11f)
                lineToRelative(74f, 45f)
                verticalLineToRelative(-328f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(17f, 0f, 29f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 23f, -20.5f, 34.5f)
                reflectiveQuadTo(320f, 674f)
                lineToRelative(-36f, -22f)
                lineToRelative(104f, 133f)
                quadToRelative(6f, 7f, 14f, 11f)
                reflectiveQuadToRelative(17f, 4f)
                horizontalLineToRelative(221f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineTo(501f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(461f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(501f, 440f)
                horizontalLineToRelative(179f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(419f)
                close()
                moveToRelative(83f, -260f)
                close()
                moveTo(340f, 140f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                verticalLineToRelative(136f)
                quadToRelative(0f, 12f, -11f, 17.5f)
                reflectiveQuadToRelative(-20f, -2.5f)
                quadToRelative(-32f, -28f, -50.5f, -67f)
                reflectiveQuadTo(140f, 240f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(340f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(540f, 240f)
                quadToRelative(0f, 45f, -18f, 83.5f)
                reflectiveQuadTo(472f, 390f)
                quadToRelative(-9f, 8f, -20f, 3f)
                reflectiveQuadToRelative(-11f, -18f)
                verticalLineToRelative(-135f)
                quadToRelative(0f, -42f, -30f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                close()
            }
        }.build()
        
        return _Touch_long!!
    }

private var _Touch_long: ImageVector? = null

