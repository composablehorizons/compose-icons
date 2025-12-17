package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Car_tag: ImageVector
    get() {
        if (_Car_tag != null) return _Car_tag!!
        
        _Car_tag = ImageVector.Builder(
            name = "car_tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 640f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(20f, 0f, 36f, -12f)
                reflectiveQuadToRelative(21f, -31f)
                quadToRelative(-20f, -4f, -38f, -13.5f)
                reflectiveQuadTo(606f, 559f)
                lineToRelative(-25f, -25f)
                quadToRelative(-10f, 8f, -15.5f, 20f)
                reflectiveQuadToRelative(-5.5f, 26f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 640f)
                close()
                moveToRelative(-460f, 40f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(200f)
                close()
                moveTo(80f, 494f)
                quadToRelative(0f, -7f, 1f, -14f)
                reflectiveQuadToRelative(3f, -13f)
                lineToRelative(80f, -227f)
                quadToRelative(6f, -18f, 21.5f, -29f)
                reflectiveQuadToRelative(34.5f, -11f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(-86f)
                lineToRelative(-42f, 120f)
                horizontalLineToRelative(248f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 480f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(680f, 780f)
                verticalLineToRelative(-20f)
                horizontalLineTo(200f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(140f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 780f)
                verticalLineToRelative(-286f)
                close()
                moveToRelative(520f, -254f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 240f)
                close()
                moveToRelative(62f, 262f)
                lineTo(458f, 298f)
                quadToRelative(-8f, -8f, -13f, -19.5f)
                reflectiveQuadToRelative(-5f, -23.5f)
                verticalLineToRelative(-155f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(500f, 40f)
                horizontalLineToRelative(155f)
                quadToRelative(12f, 0f, 23.5f, 5f)
                reflectiveQuadToRelative(19.5f, 13f)
                lineToRelative(204f, 204f)
                quadToRelative(17f, 17f, 17f, 42.5f)
                reflectiveQuadTo(902f, 347f)
                lineTo(747f, 502f)
                quadToRelative(-17f, 17f, -42.5f, 17f)
                reflectiveQuadTo(662f, 502f)
                close()
                moveToRelative(43f, -70f)
                lineToRelative(127f, -127f)
                lineToRelative(-185f, -185f)
                horizontalLineTo(520f)
                verticalLineToRelative(127f)
                lineToRelative(185f, 185f)
                close()
                moveToRelative(-29f, -156f)
                close()
            }
        }.build()
        
        return _Car_tag!!
    }

private var _Car_tag: ImageVector? = null

