package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Box_add: ImageVector
    get() {
        if (_Box_add != null) return _Box_add!!
        
        _Box_add = ImageVector.Builder(
            name = "box_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 320f)
                horizontalLineToRelative(338f)
                horizontalLineToRelative(-18f)
                horizontalLineToRelative(14f)
                horizontalLineToRelative(-334f)
                close()
                moveToRelative(440f, 0f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(-424f, -80f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
                moveToRelative(184f, 270f)
                lineToRelative(80f, -40f)
                lineToRelative(80f, 40f)
                verticalLineToRelative(-190f)
                horizontalLineTo(400f)
                verticalLineToRelative(190f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-499f)
                quadToRelative(0f, -14f, 4.5f, -27f)
                reflectiveQuadToRelative(13.5f, -24f)
                lineToRelative(50f, -61f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(250f, 120f)
                horizontalLineToRelative(460f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(772f, 149f)
                lineToRelative(50f, 61f)
                quadToRelative(9f, 11f, 13.5f, 24f)
                reflectiveQuadToRelative(4.5f, 27f)
                verticalLineToRelative(156f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 457f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 417f)
                verticalLineToRelative(-97f)
                horizontalLineTo(640f)
                verticalLineToRelative(153f)
                quadToRelative(-35f, 20f, -61f, 49.5f)
                reflectiveQuadTo(538f, 589f)
                lineToRelative(-58f, -29f)
                lineToRelative(-102f, 51f)
                quadToRelative(-20f, 10f, -39f, -1.5f)
                reflectiveQuadTo(320f, 575f)
                verticalLineToRelative(-255f)
                horizontalLineTo(200f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(311f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(551f, 800f)
                quadToRelative(0f, 16f, -11.5f, 28f)
                reflectiveQuadTo(511f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(560f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 720f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                close()
                moveTo(200f, 320f)
                horizontalLineToRelative(338f)
                horizontalLineToRelative(-18f)
                horizontalLineToRelative(14f)
                horizontalLineToRelative(-334f)
                close()
            }
        }.build()
        
        return _Box_add!!
    }

private var _Box_add: ImageVector? = null

