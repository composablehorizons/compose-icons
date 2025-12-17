package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Temple_hindu: ImageVector
    get() {
        if (_Temple_hindu != null) return _Temple_hindu!!
        
        _Temple_hindu = ImageVector.Builder(
            name = "temple_hindu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 480f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                lineToRelative(119f, -395f)
                verticalLineToRelative(-45f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(399f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(439f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(81f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 80f)
                verticalLineToRelative(40f)
                lineToRelative(120f, 400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                close()
                moveToRelative(268f, -360f)
                horizontalLineToRelative(264f)
                lineToRelative(-24f, -80f)
                horizontalLineTo(372f)
                lineToRelative(-24f, 80f)
                close()
                moveToRelative(48f, -160f)
                horizontalLineToRelative(168f)
                lineToRelative(-24f, -80f)
                horizontalLineTo(420f)
                lineToRelative(-24f, 80f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 600f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 680f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                quadToRelative(-26f, 0f, -47.5f, -15.5f)
                reflectiveQuadTo(643f, 543f)
                lineToRelative(-7f, -23f)
                horizontalLineTo(324f)
                lineToRelative(-7f, 23f)
                quadToRelative(-8f, 26f, -29.5f, 41.5f)
                reflectiveQuadTo(240f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(320f, -280f)
                close()
            }
        }.build()
        
        return _Temple_hindu!!
    }

private var _Temple_hindu: ImageVector? = null

