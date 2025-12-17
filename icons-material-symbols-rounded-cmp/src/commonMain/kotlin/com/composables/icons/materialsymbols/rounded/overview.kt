package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Overview: ImageVector
    get() {
        if (_Overview != null) return _Overview!!
        
        _Overview = ImageVector.Builder(
            name = "overview",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(740f, 712f)
                verticalLineToRelative(-92f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(92f)
                quadToRelative(0f, 8f, 3f, 15f)
                reflectiveQuadToRelative(9f, 13f)
                lineToRelative(61f, 61f)
                quadToRelative(6f, 6f, 14f, 6f)
                reflectiveQuadToRelative(14f, -6f)
                quadToRelative(6f, -6f, 6f, -14f)
                reflectiveQuadToRelative(-6f, -14f)
                lineToRelative(-61f, -61f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(40f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(243f)
                verticalLineToRelative(-3f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(80f, -80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 680f)
                horizontalLineToRelative(83f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(443f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(403f, 600f)
                horizontalLineToRelative(-83f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 640f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 440f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 480f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 360f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 280f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 320f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
            }
        }.build()
        
        return _Overview!!
    }

private var _Overview: ImageVector? = null

