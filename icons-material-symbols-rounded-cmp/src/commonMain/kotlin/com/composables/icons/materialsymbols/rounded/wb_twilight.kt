package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wb_twilight: ImageVector
    get() {
        if (_Wb_twilight != null) return _Wb_twilight!!
        
        _Wb_twilight = ImageVector.Builder(
            name = "wb_twilight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 290f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-29f, 29f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(706f, 375f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(707f, 318f)
                lineToRelative(29f, -29f)
                quadToRelative(12f, -11f, 28.5f, -10.5f)
                reflectiveQuadTo(792f, 290f)
                close()
                moveTo(120f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 720f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, -640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 200f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                close()
                moveTo(170f, 288f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(29f, 29f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(255f, 374f)
                quadToRelative(-12f, 11f, -29f, 11f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-29f, -29f)
                quadToRelative(-11f, -12f, -10.5f, -28.5f)
                reflectiveQuadTo(170f, 288f)
                close()
                moveToRelative(127f, 272f)
                horizontalLineToRelative(366f)
                quadToRelative(-23f, -54f, -72f, -87f)
                reflectiveQuadToRelative(-111f, -33f)
                quadToRelative(-62f, 0f, -111f, 33f)
                reflectiveQuadToRelative(-72f, 87f)
                close()
                moveToRelative(-97f, 80f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 640f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -80f)
                close()
            }
        }.build()
        
        return _Wb_twilight!!
    }

private var _Wb_twilight: ImageVector? = null

