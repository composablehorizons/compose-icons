package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Dine_in: ImageVector
    get() {
        if (_Dine_in != null) return _Dine_in!!
        
        _Dine_in = ImageVector.Builder(
            name = "dine_in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 240f)
                close()
                moveToRelative(200f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-236f)
                quadToRelative(0f, -35f, 24f, -59.5f)
                reflectiveQuadToRelative(58f, -24.5f)
                quadToRelative(19f, 0f, 35.5f, 8f)
                reflectiveQuadToRelative(28.5f, 22f)
                quadToRelative(45f, 49f, 96.5f, 89.5f)
                reflectiveQuadTo(560f, 440f)
                horizontalLineToRelative(54f)
                quadToRelative(-18f, -12f, -30.5f, -29f)
                reflectiveQuadTo(565f, 373f)
                quadToRelative(-4f, -13f, 5f, -23f)
                reflectiveQuadToRelative(23f, -10f)
                horizontalLineToRelative(175f)
                quadToRelative(14f, 0f, 22.5f, 10f)
                reflectiveQuadToRelative(5.5f, 23f)
                quadToRelative(-5f, 21f, -18f, 38f)
                reflectiveQuadToRelative(-31f, 29f)
                horizontalLineToRelative(93f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineTo(720f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(-80f)
                quadToRelative(-53f, 0f, -107f, -23f)
                reflectiveQuadToRelative(-93f, -55f)
                verticalLineToRelative(138f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 660f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Dine_in!!
    }

private var _Dine_in: ImageVector? = null

