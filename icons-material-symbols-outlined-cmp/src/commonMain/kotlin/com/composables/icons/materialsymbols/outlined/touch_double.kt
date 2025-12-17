package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Touch_double: ImageVector
    get() {
        if (_Touch_double != null) return _Touch_double!!
        
        _Touch_double = ImageVector.Builder(
            name = "touch_double",
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
                lineTo(107f, 557f)
                lineToRelative(19f, -20f)
                quadToRelative(20f, -21f, 48f, -25f)
                reflectiveQuadToRelative(52f, 11f)
                lineToRelative(74f, 45f)
                verticalLineToRelative(-328f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 200f)
                quadToRelative(17f, 0f, 29f, 11.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                verticalLineToRelative(472f)
                lineToRelative(-97f, -60f)
                lineToRelative(104f, 133f)
                quadToRelative(6f, 7f, 14f, 11f)
                reflectiveQuadToRelative(17f, 4f)
                horizontalLineToRelative(221f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineTo(461f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(219f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(419f)
                close()
                moveTo(167f, 340f)
                quadToRelative(-13f, -22f, -20f, -47.5f)
                reflectiveQuadToRelative(-7f, -52.5f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(340f, 40f)
                quadToRelative(27f, 0f, 52f, 6.5f)
                reflectiveQuadToRelative(47f, 19.5f)
                quadToRelative(47f, 26f, 74f, 73f)
                reflectiveQuadToRelative(27f, 101f)
                quadToRelative(0f, 27f, -7f, 52.5f)
                reflectiveQuadTo(513f, 340f)
                lineToRelative(-69f, -40f)
                quadToRelative(8f, -14f, 12f, -28.5f)
                reflectiveQuadToRelative(4f, -31.5f)
                quadToRelative(0f, -32f, -16.5f, -60f)
                reflectiveQuadTo(399f, 136f)
                quadToRelative(-13f, -8f, -28f, -12f)
                reflectiveQuadToRelative(-31f, -4f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 17f, 4f, 31.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                lineToRelative(-69f, 40f)
                close()
                moveToRelative(335f, 280f)
                close()
                moveToRelative(57f, -484f)
                lineToRelative(40f, -70f)
                quadToRelative(47f, 26f, 74f, 73f)
                reflectiveQuadToRelative(27f, 101f)
                quadToRelative(0f, 27f, -7f, 52.5f)
                reflectiveQuadTo(673f, 340f)
                lineToRelative(-69f, -40f)
                quadToRelative(8f, -14f, 12f, -28.5f)
                reflectiveQuadToRelative(4f, -31.5f)
                quadToRelative(0f, -32f, -16.5f, -60f)
                reflectiveQuadTo(559f, 136f)
                close()
            }
        }.build()
        
        return _Touch_double!!
    }

private var _Touch_double: ImageVector? = null

