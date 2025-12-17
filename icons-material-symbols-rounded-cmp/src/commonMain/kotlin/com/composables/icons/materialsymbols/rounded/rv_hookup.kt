package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rv_hookup: ImageVector
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
                moveTo(360f, 840f)
                quadToRelative(-38f, 0f, -68.5f, -22f)
                reflectiveQuadTo(248f, 760f)
                horizontalLineToRelative(-48f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 400f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 200f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 280f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(86f)
                lineToRelative(-14f, -14f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(11.5f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12.5f)
                reflectiveQuadTo(809f, 609f)
                lineToRelative(83f, 83f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-84f, 84f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(16f, -16f)
                horizontalLineTo(472f)
                quadToRelative(-12f, 36f, -43f, 58f)
                reflectiveQuadToRelative(-69f, 22f)
                close()
                moveToRelative(40f, -440f)
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
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(48f)
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

