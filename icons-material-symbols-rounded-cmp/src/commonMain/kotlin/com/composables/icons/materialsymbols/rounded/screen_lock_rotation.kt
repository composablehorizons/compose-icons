package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Screen_lock_rotation: ImageVector
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
                moveTo(634f, 360f)
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
                moveTo(441f, 831f)
                lineToRelative(-77f, -77f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineTo(590f, 868f)
                quadToRelative(12f, 12f, 7f, 28f)
                reflectiveQuadToRelative(-22f, 19f)
                quadToRelative(-14f, 2f, -27.5f, 2.5f)
                reflectiveQuadTo(520f, 918f)
                quadToRelative(-99f, 0f, -186.5f, -38f)
                reflectiveQuadTo(181f, 777f)
                quadToRelative(-65f, -65f, -103f, -152.5f)
                reflectiveQuadTo(40f, 438f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 398f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 438f)
                quadToRelative(0f, 72f, 24.5f, 137f)
                reflectiveQuadTo(212f, 692f)
                quadToRelative(43f, 52f, 102f, 88.5f)
                reflectiveQuadTo(441f, 831f)
                close()
                moveToRelative(149f, -73f)
                quadToRelative(-14f, 0f, -28.5f, -5.5f)
                reflectiveQuadTo(536f, 736f)
                lineTo(222f, 422f)
                quadToRelative(-11f, -11f, -16.5f, -25.5f)
                reflectiveQuadTo(200f, 368f)
                quadToRelative(0f, -15f, 5.5f, -29f)
                reflectiveQuadToRelative(16.5f, -25f)
                lineToRelative(174f, -174f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(28.5f, -6f)
                quadToRelative(15f, 0f, 29f, 6f)
                reflectiveQuadToRelative(25f, 17f)
                lineToRelative(17f, 17f)
                quadToRelative(11f, 11f, 11.5f, 27f)
                reflectiveQuadTo(522f, 212f)
                quadToRelative(-11f, 12f, -28f, 12.5f)
                reflectiveQuadTo(465f, 213f)
                lineToRelative(-15f, -15f)
                lineToRelative(-170f, 170f)
                lineToRelative(310f, 310f)
                lineToRelative(170f, -170f)
                lineToRelative(-14f, -14f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(16f, 16f)
                quadToRelative(11f, 11f, 17f, 25f)
                reflectiveQuadToRelative(6f, 29f)
                quadToRelative(0f, 14f, -6f, 28.5f)
                reflectiveQuadTo(818f, 562f)
                lineTo(644f, 736f)
                quadToRelative(-11f, 11f, -25f, 16.5f)
                reflectiveQuadToRelative(-29f, 5.5f)
                close()
                moveToRelative(-70f, -320f)
                close()
            }
        }.build()
        
        return _Screen_lock_rotation!!
    }

private var _Screen_lock_rotation: ImageVector? = null

