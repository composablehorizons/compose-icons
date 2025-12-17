package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Rv_hookup: ImageVector
    get() {
        if (_Rv_hookup != null) return _Rv_hookup!!
        
        _Rv_hookup = ImageVector.Builder(
            name = "rv_hookup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 860f)
                lineToRelative(-56f, -56f)
                lineToRelative(44f, -44f)
                horizontalLineTo(472f)
                quadToRelative(-12f, 36f, -43f, 58f)
                reflectiveQuadToRelative(-69f, 22f)
                quadToRelative(-38f, 0f, -68.5f, -22f)
                reflectiveQuadTo(248f, 760f)
                horizontalLineTo(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-120f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(86f)
                lineToRelative(-42f, -42f)
                lineToRelative(56f, -58f)
                lineToRelative(140f, 140f)
                lineToRelative(-140f, 140f)
                close()
                moveTo(400f, 400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(400f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-40f, 360f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 720f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 720f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 760f)
                close()
                moveToRelative(-112f, -80f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(38f, 0f, 69f, 22f)
                reflectiveQuadToRelative(43f, 58f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(88f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(-88f)
                horizontalLineToRelative(440f)
                horizontalLineToRelative(-352f)
                close()
            }
        }.build()
        
        return _Rv_hookup!!
    }

private var _Rv_hookup: ImageVector? = null

