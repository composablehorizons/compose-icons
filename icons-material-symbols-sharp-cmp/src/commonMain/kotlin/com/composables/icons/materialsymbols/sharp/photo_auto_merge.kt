package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Photo_auto_merge: ImageVector
    get() {
        if (_Photo_auto_merge != null) return _Photo_auto_merge!!
        
        _Photo_auto_merge = ImageVector.Builder(
            name = "photo_auto_merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(315f)
                quadToRelative(-8f, 19f, -11.5f, 39f)
                reflectiveQuadToRelative(-3.5f, 41f)
                horizontalLineTo(360f)
                verticalLineToRelative(408f)
                quadToRelative(45f, -42f, 101.5f, -65f)
                reflectiveQuadTo(580f, 480f)
                quadToRelative(61f, 0f, 118f, 23.5f)
                reflectiveQuadTo(800f, 569f)
                verticalLineToRelative(-189f)
                quadToRelative(21f, 0f, 41f, -3.5f)
                reflectiveQuadToRelative(39f, -11.5f)
                verticalLineToRelative(315f)
                horizontalLineTo(280f)
                close()
                moveToRelative(300f, -350f)
                close()
                moveTo(144f, 889f)
                lineTo(70f, 294f)
                lineToRelative(130f, -16f)
                verticalLineToRelative(80f)
                lineToRelative(-40f, 5f)
                lineToRelative(54f, 437f)
                lineToRelative(298f, -40f)
                horizontalLineToRelative(218f)
                lineToRelative(6f, 56f)
                lineToRelative(-592f, 73f)
                close()
                moveToRelative(70f, -88f)
                close()
                moveToRelative(493f, -541f)
                lineToRelative(71f, -200f)
                horizontalLineToRelative(44f)
                lineToRelative(72f, 200f)
                horizontalLineToRelative(-43f)
                lineToRelative(-15f, -44f)
                horizontalLineToRelative(-72f)
                lineToRelative(-15f, 44f)
                horizontalLineToRelative(-42f)
                close()
                moveToRelative(67f, -74f)
                horizontalLineToRelative(52f)
                lineToRelative(-26f, -82f)
                lineToRelative(-26f, 82f)
                close()
                moveTo(580f, 560f)
                quadToRelative(-35f, 0f, -69f, 10f)
                reflectiveQuadToRelative(-63f, 30f)
                horizontalLineToRelative(264f)
                quadToRelative(-29f, -20f, -63f, -30f)
                reflectiveQuadToRelative(-69f, -10f)
                close()
                moveToRelative(0f, -340f)
                quadToRelative(46f, 0f, 78f, 32f)
                reflectiveQuadToRelative(32f, 78f)
                quadToRelative(0f, 46f, -32f, 78f)
                reflectiveQuadToRelative(-78f, 32f)
                quadToRelative(-46f, 0f, -78f, -32f)
                reflectiveQuadToRelative(-32f, -78f)
                quadToRelative(0f, -46f, 32f, -78f)
                reflectiveQuadToRelative(78f, -32f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(550f, 330f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(580f, 360f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(610f, 330f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(580f, 300f)
                close()
            }
        }.build()
        
        return _Photo_auto_merge!!
    }

private var _Photo_auto_merge: ImageVector? = null

