package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Order_play: ImageVector
    get() {
        if (_Order_play != null) return _Order_play!!
        
        _Order_play = ImageVector.Builder(
            name = "order_play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(701f, 801f)
                lineToRelative(102f, -64f)
                quadToRelative(10f, -6f, 10f, -17f)
                reflectiveQuadToRelative(-10f, -17f)
                lineToRelative(-102f, -64f)
                quadToRelative(-10f, -6f, -20.5f, -0.5f)
                reflectiveQuadTo(670f, 656f)
                verticalLineToRelative(128f)
                quadToRelative(0f, 12f, 10.5f, 17.5f)
                reflectiveQuadToRelative(20.5f, -0.5f)
                close()
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 280f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 360f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(120f, 875f)
                verticalLineToRelative(-675f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(267f)
                quadToRelative(-19f, -9f, -39f, -15f)
                reflectiveQuadToRelative(-41f, -9f)
                verticalLineToRelative(-243f)
                horizontalLineTo(200f)
                verticalLineToRelative(562f)
                horizontalLineToRelative(243f)
                quadToRelative(5f, 31f, 15.5f, 59f)
                reflectiveQuadTo(486f, 874f)
                quadToRelative(-5f, 1f, -10.5f, -1.5f)
                reflectiveQuadTo(466f, 866f)
                lineToRelative(-46f, -46f)
                lineToRelative(-46f, 46f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-46f, -46f)
                lineToRelative(-46f, 46f)
                quadToRelative(-6f, 6f, -14f, 6f)
                reflectiveQuadToRelative(-14f, -6f)
                lineToRelative(-46f, -46f)
                lineToRelative(-46f, 46f)
                lineToRelative(-14f, 9f)
                close()
                moveToRelative(160f, -195f)
                horizontalLineToRelative(163f)
                quadToRelative(3f, -21f, 9f, -41f)
                reflectiveQuadToRelative(15f, -39f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 680f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(244f)
                quadToRelative(38f, -37f, 88.5f, -58.5f)
                reflectiveQuadTo(720f, 440f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 520f)
                close()
                moveToRelative(-80f, 242f)
                verticalLineToRelative(-562f)
                verticalLineToRelative(562f)
                close()
            }
        }.build()
        
        return _Order_play!!
    }

private var _Order_play: ImageVector? = null

