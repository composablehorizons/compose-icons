package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Festival: ImageVector
    get() {
        if (_Festival != null) return _Festival!!
        
        _Festival = ImageVector.Builder(
            name = "festival",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(190f, 880f)
                quadToRelative(-40f, 0f, -64f, -32.5f)
                reflectiveQuadTo(110f, 774f)
                quadToRelative(11f, -51f, 15f, -102f)
                reflectiveQuadToRelative(5f, -102f)
                quadToRelative(-41f, -16f, -65.5f, -51f)
                reflectiveQuadTo(40f, 440f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -23f, 13.5f, -42f)
                reflectiveQuadTo(89f, 342f)
                quadToRelative(95f, -38f, 179f, -94f)
                reflectiveQuadToRelative(162f, -122f)
                quadToRelative(11f, -9f, 23.5f, -13.5f)
                reflectiveQuadTo(480f, 108f)
                quadToRelative(14f, 0f, 26.5f, 4.5f)
                reflectiveQuadTo(530f, 126f)
                quadToRelative(78f, 66f, 162f, 122f)
                reflectiveQuadToRelative(179f, 94f)
                quadToRelative(22f, 9f, 35.5f, 28f)
                reflectiveQuadToRelative(13.5f, 42f)
                verticalLineToRelative(28f)
                quadToRelative(0f, 44f, -24.5f, 79f)
                reflectiveQuadTo(830f, 570f)
                quadToRelative(1f, 51f, 5f, 102f)
                reflectiveQuadToRelative(15f, 102f)
                quadToRelative(8f, 41f, -16f, 73.5f)
                reflectiveQuadTo(770f, 880f)
                horizontalLineTo(190f)
                close()
                moveToRelative(46f, -520f)
                horizontalLineToRelative(488f)
                quadToRelative(-66f, -37f, -126.5f, -80f)
                reflectiveQuadTo(480f, 188f)
                quadToRelative(-57f, 49f, -117.5f, 92f)
                reflectiveQuadTo(236f, 360f)
                close()
                moveToRelative(344f, 140f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(640f, 440f)
                horizontalLineTo(520f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(580f, 500f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 440f)
                horizontalLineTo(320f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 500f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(240f, 440f)
                horizontalLineTo(120f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(180f, 500f)
                close()
                moveToRelative(6f, 300f)
                horizontalLineToRelative(107f)
                quadToRelative(9f, -60f, 14f, -119f)
                reflectiveQuadToRelative(8f, -119f)
                quadToRelative(-10f, -5f, -18.5f, -10.5f)
                reflectiveQuadTo(280f, 538f)
                quadToRelative(-14f, 14f, -32f, 24f)
                reflectiveQuadToRelative(-38f, 15f)
                quadToRelative(-2f, 57f, -7f, 112.5f)
                reflectiveQuadTo(186f, 800f)
                close()
                moveToRelative(188f, 0f)
                horizontalLineToRelative(212f)
                quadToRelative(-8f, -55f, -12.5f, -110f)
                reflectiveQuadTo(566f, 579f)
                quadToRelative(-25f, -2f, -47f, -12.5f)
                reflectiveQuadTo(480f, 539f)
                quadToRelative(-17f, 17f, -39f, 27.5f)
                reflectiveQuadTo(394f, 579f)
                quadToRelative(-3f, 56f, -7.5f, 111f)
                reflectiveQuadTo(374f, 800f)
                close()
                moveToRelative(293f, 0f)
                horizontalLineToRelative(107f)
                quadToRelative(-12f, -55f, -17f, -110.5f)
                reflectiveQuadTo(750f, 577f)
                quadToRelative(-20f, -5f, -38f, -14.5f)
                reflectiveQuadTo(680f, 538f)
                quadToRelative(-8f, 8f, -16.5f, 13.5f)
                reflectiveQuadTo(645f, 562f)
                quadToRelative(3f, 60f, 8.5f, 119f)
                reflectiveQuadTo(667f, 800f)
                close()
                moveToRelative(113f, -300f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineTo(720f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(780f, 500f)
                close()
            }
        }.build()
        
        return _Festival!!
    }

private var _Festival: ImageVector? = null

