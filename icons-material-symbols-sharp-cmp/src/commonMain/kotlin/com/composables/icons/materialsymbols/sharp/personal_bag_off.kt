package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Personal_bag_off: ImageVector
    get() {
        if (_Personal_bag_off != null) return _Personal_bag_off!!
        
        _Personal_bag_off = ImageVector.Builder(
            name = "personal_bag_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 80f)
                quadToRelative(51f, 0f, 85.5f, 37.5f)
                reflectiveQuadTo(600f, 206f)
                verticalLineToRelative(22f)
                quadToRelative(71f, 33f, 115.5f, 100f)
                reflectiveQuadTo(760f, 480f)
                verticalLineToRelative(166f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-86f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-20f, 0f, -37.5f, 4f)
                reflectiveQuadTo(408f, 294f)
                lineToRelative(-48f, -48f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                verticalLineToRelative(4f)
                quadToRelative(11f, -2f, 20f, -3f)
                reflectiveQuadToRelative(20f, -1f)
                quadToRelative(11f, 0f, 20f, 1f)
                reflectiveQuadToRelative(20f, 3f)
                verticalLineToRelative(-4f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveTo(792f, 904f)
                lineTo(446f, 560f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(46f)
                lineToRelative(-72f, -72f)
                quadToRelative(-6f, 17f, -10f, 34.5f)
                reflectiveQuadToRelative(-4f, 37.5f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-120f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(120f)
                horizontalLineTo(200f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -36f, 8.5f, -69.5f)
                reflectiveQuadTo(234f, 348f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(544f, 423f)
                close()
                moveToRelative(-98f, 137f)
                close()
                moveToRelative(34f, 44f)
                close()
            }
        }.build()
        
        return _Personal_bag_off!!
    }

private var _Personal_bag_off: ImageVector? = null

