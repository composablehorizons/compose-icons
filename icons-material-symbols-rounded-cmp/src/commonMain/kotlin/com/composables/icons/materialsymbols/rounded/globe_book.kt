package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Globe_book: ImageVector
    get() {
        if (_Globe_book != null) return _Globe_book!!
        
        _Globe_book = ImageVector.Builder(
            name = "globe_book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28f)
                reflectiveQuadTo(735f, 225f)
                quadToRelative(25f, 25f, 44f, 54f)
                reflectiveQuadToRelative(33f, 61f)
                quadToRelative(14f, 33f, 21f, 68f)
                reflectiveQuadToRelative(7f, 71f)
                quadToRelative(0f, 17f, -13f, 29f)
                reflectiveQuadToRelative(-30f, 12f)
                quadToRelative(-16f, 0f, -26.5f, -11.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -10f, -0.5f, -20f)
                reflectiveQuadToRelative(-2.5f, -20f)
                horizontalLineTo(639f)
                quadToRelative(1f, 10f, 1f, 20f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 17f, -12f, 28.5f)
                reflectiveQuadTo(599f, 520f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -10f, -0.5f, -20f)
                reflectiveQuadToRelative(-1.5f, -20f)
                horizontalLineTo(403f)
                quadToRelative(-1f, 10f, -1.5f, 20f)
                reflectiveQuadToRelative(-0.5f, 20f)
                quadToRelative(0f, 17f, -11f, 28.5f)
                reflectiveQuadTo(362f, 520f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(321f, 480f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -10f, 1f, -20f)
                horizontalLineTo(204f)
                quadToRelative(-2f, 10f, -2.5f, 20f)
                reflectiveQuadToRelative(-0.5f, 20f)
                quadToRelative(0f, 17f, -10.5f, 28.5f)
                reflectiveQuadTo(164f, 520f)
                quadToRelative(-17f, 0f, -30f, -11.5f)
                reflectiveQuadTo(121f, 480f)
                quadToRelative(0f, -36f, 7f, -71.5f)
                reflectiveQuadToRelative(21f, -68.5f)
                quadToRelative(14f, -32f, 33f, -61f)
                reflectiveQuadToRelative(44f, -54f)
                quadToRelative(49f, -49f, 114f, -77f)
                reflectiveQuadToRelative(140f, -28f)
                close()
                moveTo(228f, 360f)
                horizontalLineToRelative(103f)
                quadToRelative(8f, -43f, 20f, -77.5f)
                reflectiveQuadToRelative(26f, -62.5f)
                quadToRelative(-48f, 18f, -87f, 54.5f)
                reflectiveQuadTo(228f, 360f)
                close()
                moveToRelative(186f, 0f)
                horizontalLineToRelative(132f)
                quadToRelative(-10f, -43f, -25f, -84f)
                reflectiveQuadToRelative(-41f, -76f)
                quadToRelative(-26f, 35f, -41.5f, 76f)
                reflectiveQuadTo(414f, 360f)
                close()
                moveToRelative(216f, 0f)
                horizontalLineToRelative(103f)
                quadToRelative(-23f, -49f, -62.5f, -85.5f)
                reflectiveQuadTo(583f, 220f)
                quadToRelative(14f, 30f, 26.5f, 63.5f)
                reflectiveQuadTo(630f, 360f)
                close()
                moveTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 600f)
                horizontalLineToRelative(200f)
                quadToRelative(48f, 0f, 89.5f, 21f)
                reflectiveQuadToRelative(70.5f, 59f)
                quadToRelative(29f, -38f, 70.5f, -59f)
                reflectiveQuadToRelative(89.5f, -21f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(640f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Globe_book!!
    }

private var _Globe_book: ImageVector? = null

