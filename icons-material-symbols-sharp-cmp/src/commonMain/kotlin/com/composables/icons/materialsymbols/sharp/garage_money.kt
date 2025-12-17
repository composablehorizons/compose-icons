package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Garage_money: ImageVector
    get() {
        if (_Garage_money != null) return _Garage_money!!
        
        _Garage_money = ImageVector.Builder(
            name = "garage_money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, -140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-16f)
                lineToRelative(-77f, -224f)
                horizontalLineTo(277f)
                lineToRelative(-77f, 224f)
                verticalLineToRelative(296f)
                close()
                moveToRelative(106f, -360f)
                lineToRelative(28f, -80f)
                horizontalLineToRelative(292f)
                lineToRelative(28f, 80f)
                horizontalLineTo(306f)
                close()
                moveToRelative(54f, 180f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(197f, 260f)
                horizontalLineToRelative(246f)
                quadToRelative(5f, -21f, 20.5f, -36.5f)
                reflectiveQuadTo(860f, 763f)
                verticalLineToRelative(-86f)
                quadToRelative(-21f, -5f, -36.5f, -20.5f)
                reflectiveQuadTo(803f, 620f)
                horizontalLineTo(557f)
                quadToRelative(-5f, 21f, -20.5f, 36.5f)
                reflectiveQuadTo(500f, 677f)
                verticalLineToRelative(86f)
                quadToRelative(21f, 5f, 36.5f, 20.5f)
                reflectiveQuadTo(557f, 820f)
                close()
                moveToRelative(123f, -40f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 720f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 660f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(620f, 720f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(680f, 780f)
                close()
                moveTo(440f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(320f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Garage_money!!
    }

private var _Garage_money: ImageVector? = null

