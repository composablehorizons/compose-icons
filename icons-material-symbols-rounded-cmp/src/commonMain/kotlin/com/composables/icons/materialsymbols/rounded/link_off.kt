package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Link_off: ImageVector
    get() {
        if (_Link_off != null) return _Link_off!!
        
        _Link_off = ImageVector.Builder(
            name = "link_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(625f, 511f)
                lineToRelative(-71f, -71f)
                horizontalLineToRelative(46f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, 10f, -4f, 18f)
                reflectiveQuadToRelative(-11f, 13f)
                close()
                moveTo(820f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
                moveTo(280f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -69f, 42f, -123f)
                reflectiveQuadToRelative(108f, -71f)
                lineToRelative(74f, 74f)
                horizontalLineToRelative(-24f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 680f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 440f)
                horizontalLineToRelative(25f)
                lineToRelative(79f, 80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(380f, 112f)
                quadToRelative(-9f, -14f, -6.5f, -30f)
                reflectiveQuadToRelative(16.5f, -25f)
                quadToRelative(23f, -17f, 36.5f, -42f)
                reflectiveQuadToRelative(13.5f, -55f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 280f)
                horizontalLineToRelative(120f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 49f, -22.5f, 91.5f)
                reflectiveQuadTo(795f, 642f)
                quadToRelative(-14f, 9f, -30f, 6.5f)
                reflectiveQuadTo(740f, 632f)
                close()
            }
        }.build()
        
        return _Link_off!!
    }

private var _Link_off: ImageVector? = null

