package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Air: ImageVector
    get() {
        if (_Air != null) return _Air!!
        
        _Air = ImageVector.Builder(
            name = "air",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(460f, 800f)
                quadToRelative(-32f, 0f, -59.5f, -16f)
                reflectiveQuadTo(356f, 740f)
                quadToRelative(-11f, -20f, -0.5f, -40f)
                reflectiveQuadToRelative(32.5f, -20f)
                quadToRelative(13f, 0f, 23f, 8f)
                reflectiveQuadToRelative(18f, 18f)
                quadToRelative(5f, 7f, 13.5f, 10.5f)
                reflectiveQuadTo(460f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(500f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(460f, 640f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 560f)
                horizontalLineToRelative(340f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(120f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 320f)
                horizontalLineToRelative(500f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(620f, 200f)
                quadToRelative(-16f, 0f, -30f, 7.5f)
                reflectiveQuadTo(568f, 229f)
                quadToRelative(-7f, 12f, -17f, 21.5f)
                reflectiveQuadToRelative(-24f, 9.5f)
                quadToRelative(-20f, 0f, -32.5f, -15f)
                reflectiveQuadToRelative(-6.5f, -32f)
                quadToRelative(14f, -42f, 50.5f, -67.5f)
                reflectiveQuadTo(620f, 120f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineTo(120f)
                close()
                moveToRelative(678f, 308f)
                quadToRelative(-20f, 9f, -39f, -2.5f)
                reflectiveQuadTo(740f, 672f)
                quadToRelative(0f, -14f, 9.5f, -23.5f)
                reflectiveQuadTo(771f, 632f)
                quadToRelative(14f, -8f, 21.5f, -22f)
                reflectiveQuadToRelative(7.5f, -30f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(740f, 520f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(620f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 42f, -22f, 76.5f)
                reflectiveQuadTo(798f, 708f)
                close()
            }
        }.build()
        
        return _Air!!
    }

private var _Air: ImageVector? = null

