package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Personal_bag_off: ImageVector
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
                quadToRelative(52f, 0f, 86f, 37.5f)
                reflectiveQuadToRelative(34f, 88.5f)
                verticalLineToRelative(22f)
                quadToRelative(71f, 33f, 115.5f, 100f)
                reflectiveQuadTo(760f, 480f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(680f, 559f)
                verticalLineToRelative(-79f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 200f)
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
                moveTo(764f, 876f)
                lineTo(446f, 560f)
                horizontalLineToRelative(-86f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                horizontalLineToRelative(6f)
                lineToRelative(-72f, -72f)
                quadToRelative(-6f, 17f, -10f, 34.5f)
                reflectiveQuadToRelative(-4f, 37.5f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-120f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -36f, 8.5f, -69.5f)
                reflectiveQuadTo(234f, 348f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
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

