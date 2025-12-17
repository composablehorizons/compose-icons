package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sports_bar: ImageVector
    get() {
        if (_Sports_bar != null) return _Sports_bar!!
        
        _Sports_bar = ImageVector.Builder(
            name = "sports_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-80f)
                quadToRelative(-28f, 0f, -46f, 14f)
                reflectiveQuadToRelative(-43f, 41f)
                quadToRelative(-20f, 22f, -46.5f, 45.5f)
                reflectiveQuadTo(320f, 495f)
                verticalLineToRelative(265f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-346f)
                quadToRelative(-52f, -14f, -86f, -56f)
                reflectiveQuadToRelative(-34f, -98f)
                quadToRelative(0f, -53f, 30.5f, -94f)
                reflectiveQuadToRelative(78.5f, -57f)
                quadToRelative(23f, -48f, 68.5f, -78f)
                reflectiveQuadTo(400f, 81f)
                quadToRelative(35f, 0f, 65.5f, 12f)
                reflectiveQuadToRelative(55.5f, 32f)
                quadToRelative(10f, -2f, 19f, -3.5f)
                reflectiveQuadToRelative(20f, -1.5f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 22f, -5.5f, 42f)
                reflectiveQuadTo(698f, 360f)
                horizontalLineToRelative(142f)
                verticalLineToRelative(400f)
                horizontalLineTo(680f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-40f, -500f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 420f)
                quadToRelative(32f, 0f, 54.5f, -21f)
                reflectiveQuadToRelative(46.5f, -47f)
                quadToRelative(25f, -27f, 56.5f, -49.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(-25f, 0f, -42f, 6.5f)
                lineToRelative(-17f, 6.5f)
                lineToRelative(-31f, -26f)
                quadToRelative(-11f, -9f, -28.5f, -17.5f)
                reflectiveQuadTo(400f, 161f)
                quadToRelative(-32f, 0f, -58.5f, 17f)
                reflectiveQuadTo(301f, 224f)
                lineToRelative(-14f, 30f)
                lineToRelative(-32f, 11f)
                quadToRelative(-25f, 8f, -40f, 28.5f)
                reflectiveQuadTo(200f, 340f)
                close()
                moveToRelative(480f, 340f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-360f, 80f)
                horizontalLineToRelative(280f)
                horizontalLineToRelative(-280f)
                close()
            }
        }.build()
        
        return _Sports_bar!!
    }

private var _Sports_bar: ImageVector? = null

