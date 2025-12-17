package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Screen_lock_rotation: ImageVector
    get() {
        if (_Screen_lock_rotation != null) return _Screen_lock_rotation!!
        
        _Screen_lock_rotation = ImageVector.Builder(
            name = "screen_lock_rotation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(40f)
                close()
                moveTo(520f, 918f)
                quadToRelative(-99f, 0f, -186.5f, -38f)
                reflectiveQuadTo(181f, 777f)
                quadToRelative(-65f, -65f, -103f, -152.5f)
                reflectiveQuadTo(40f, 438f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 72f, 24.5f, 137f)
                reflectiveQuadTo(212f, 692f)
                quadToRelative(43f, 52f, 102f, 88.5f)
                reflectiveQuadTo(441f, 831f)
                lineTo(336f, 726f)
                lineToRelative(56f, -56f)
                lineTo(628f, 906f)
                quadToRelative(-27f, 6f, -53f, 9f)
                reflectiveQuadToRelative(-55f, 3f)
                close()
                moveToRelative(70f, -128f)
                lineTo(168f, 368f)
                lineToRelative(282f, -282f)
                lineToRelative(70f, 70f)
                verticalLineToRelative(284f)
                horizontalLineToRelative(283f)
                lineToRelative(71f, 66f)
                lineToRelative(-284f, 284f)
                close()
                moveToRelative(10f, -430f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Screen_lock_rotation!!
    }

private var _Screen_lock_rotation: ImageVector? = null

