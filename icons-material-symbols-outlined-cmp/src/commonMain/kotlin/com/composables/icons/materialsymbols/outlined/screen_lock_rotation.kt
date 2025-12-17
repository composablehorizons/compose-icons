package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Screen_lock_rotation: ImageVector
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
                moveTo(718f, 466f)
                lineToRelative(56f, -56f)
                lineToRelative(44f, 44f)
                quadToRelative(23f, 23f, 23f, 54f)
                reflectiveQuadToRelative(-23f, 54f)
                lineTo(644f, 736f)
                quadToRelative(-23f, 23f, -54f, 23f)
                reflectiveQuadToRelative(-54f, -23f)
                lineTo(222f, 422f)
                quadToRelative(-23f, -23f, -23f, -54f)
                reflectiveQuadToRelative(23f, -54f)
                lineToRelative(174f, -174f)
                quadToRelative(23f, -23f, 54f, -23f)
                reflectiveQuadToRelative(54f, 23f)
                lineToRelative(44f, 44f)
                lineToRelative(-54f, 58f)
                lineToRelative(-44f, -44f)
                lineToRelative(-170f, 170f)
                lineToRelative(310f, 310f)
                lineToRelative(170f, -170f)
                lineToRelative(-42f, -42f)
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
                moveToRelative(114f, -558f)
                quadToRelative(-14f, 0f, -24f, -10f)
                reflectiveQuadToRelative(-10f, -24f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(720f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(6f)
                quadToRelative(14f, 0f, 24f, 10f)
                reflectiveQuadToRelative(10f, 24f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 14f, -10f, 24f)
                reflectiveQuadToRelative(-24f, 10f)
                horizontalLineTo(634f)
                close()
                moveToRelative(46f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(40f)
                close()
                moveTo(520f, 438f)
                close()
            }
        }.build()
        
        return _Screen_lock_rotation!!
    }

private var _Screen_lock_rotation: ImageVector? = null

