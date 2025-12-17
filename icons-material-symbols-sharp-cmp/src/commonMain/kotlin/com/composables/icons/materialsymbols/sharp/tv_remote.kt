package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tv_remote: ImageVector
    get() {
        if (_Tv_remote != null) return _Tv_remote!!
        
        _Tv_remote = ImageVector.Builder(
            name = "tv_remote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                quadToRelative(-25f, 19f, -55.5f, 29.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-34f, 0f, -64.5f, -10.5f)
                reflectiveQuadTo(360f, 640f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(120f, -240f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(360f, 320f)
                quadToRelative(25f, -19f, 55.5f, -29.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(34f, 0f, 64.5f, 10.5f)
                reflectiveQuadTo(600f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineTo(360f)
                verticalLineToRelative(200f)
                close()
                moveTo(280f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -380f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(0f, -300f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(0f, 440f)
                close()
                moveToRelative(0f, -400f)
                close()
            }
        }.build()
        
        return _Tv_remote!!
    }

private var _Tv_remote: ImageVector? = null

