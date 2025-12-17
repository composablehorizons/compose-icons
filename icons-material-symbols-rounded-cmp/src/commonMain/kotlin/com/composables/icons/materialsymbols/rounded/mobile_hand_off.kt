package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_hand_off: ImageVector
    get() {
        if (_Mobile_hand_off != null) return _Mobile_hand_off!!
        
        _Mobile_hand_off = ImageVector.Builder(
            name = "mobile_hand_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 728f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-208f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 360f)
                verticalLineToRelative(208f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-208f)
                horizontalLineToRelative(80f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(288f)
                close()
                moveTo(637f, 920f)
                quadToRelative(-26f, 0f, -49f, -10.5f)
                reflectiveQuadTo(548f, 880f)
                lineTo(369f, 666f)
                quadToRelative(-10f, -12f, -9.5f, -27.5f)
                reflectiveQuadTo(371f, 612f)
                quadToRelative(24f, -25f, 50.5f, -39.5f)
                reflectiveQuadTo(484f, 577f)
                lineToRelative(186f, 93f)
                lineToRelative(155f, 156f)
                quadToRelative(-19f, 42f, -58f, 68f)
                reflectiveQuadToRelative(-87f, 26f)
                horizontalLineToRelative(-43f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(43f)
                quadToRelative(10f, 0f, 19.5f, -2f)
                reflectiveQuadToRelative(17.5f, -7f)
                lineToRelative(-94f, -94f)
                lineToRelative(-155f, -79f)
                lineToRelative(138f, 168f)
                quadToRelative(6f, 7f, 14f, 10.5f)
                reflectiveQuadToRelative(17f, 3.5f)
                close()
                moveTo(416f, 304f)
                close()
                moveToRelative(5f, 230f)
                close()
                moveToRelative(179f, -254f)
                verticalLineToRelative(-120f)
                horizontalLineTo(272f)
                lineToRelative(-71f, -70f)
                quadToRelative(9f, -5f, 18.5f, -7.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 160f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-527f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(847f, 904f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(791f, 904f)
                lineTo(240f, 353f)
                verticalLineToRelative(447f)
                horizontalLineToRelative(241f)
                lineToRelative(67f, 80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(180f, -600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 280f)
                close()
            }
        }.build()
        
        return _Mobile_hand_off!!
    }

private var _Mobile_hand_off: ImageVector? = null

