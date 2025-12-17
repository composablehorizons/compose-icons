package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Drone: ImageVector
    get() {
        if (_Drone != null) return _Drone!!
        
        _Drone = ImageVector.Builder(
            name = "drone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 640f)
                quadToRelative(-57f, 0f, -99f, 34f)
                reflectiveQuadToRelative(-56f, 86f)
                quadToRelative(-5f, 17f, -16.5f, 28.5f)
                reflectiveQuadTo(200f, 800f)
                quadToRelative(-17f, 0f, -28f, -12f)
                reflectiveQuadToRelative(-8f, -28f)
                quadToRelative(11f, -62f, 49f, -110f)
                reflectiveQuadToRelative(94f, -71f)
                lineToRelative(-10f, -99f)
                horizontalLineToRelative(-97f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 440f)
                verticalLineToRelative(-200f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 160f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(48f)
                lineToRelative(-3f, -36f)
                quadToRelative(-2f, -18f, 9.5f, -31f)
                reflectiveQuadToRelative(29.5f, -13f)
                horizontalLineToRelative(312f)
                quadToRelative(18f, 0f, 29.5f, 13f)
                reflectiveQuadToRelative(9.5f, 31f)
                lineToRelative(-3f, 36f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 160f)
                horizontalLineToRelative(241f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(921f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(881f, 240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(761f, 480f)
                horizontalLineToRelative(-97f)
                lineToRelative(-10f, 99f)
                quadToRelative(56f, 23f, 94f, 71f)
                reflectiveQuadToRelative(49f, 110f)
                quadToRelative(3f, 16f, -8.5f, 28f)
                reflectiveQuadTo(760f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(715f, 760f)
                quadToRelative(-14f, -52f, -56.5f, -86f)
                reflectiveQuadTo(560f, 640f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-15f, -80f)
                horizontalLineToRelative(189f)
                lineToRelative(17f, -160f)
                horizontalLineTo(368f)
                lineToRelative(17f, 160f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(189f)
                horizontalLineToRelative(-189f)
                close()
            }
        }.build()
        
        return _Drone!!
    }

private var _Drone: ImageVector? = null

