package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nest_found_savings: ImageVector
    get() {
        if (_Nest_found_savings != null) return _Nest_found_savings!!
        
        _Nest_found_savings = ImageVector.Builder(
            name = "nest_found_savings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                lineTo(360f, 800f)
                horizontalLineTo(120f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(600f)
                lineTo(480f, 920f)
                close()
                moveTo(200f, 720f)
                horizontalLineToRelative(192f)
                lineToRelative(88f, 88f)
                lineToRelative(88f, -88f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(280f, -280f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(86f, 0f, 143f, -60f)
                reflectiveQuadToRelative(57f, -140f)
                verticalLineToRelative(-200f)
                horizontalLineTo(480f)
                quadToRelative(-81f, 0f, -140.5f, 57f)
                reflectiveQuadTo(280f, 440f)
                quadToRelative(0f, 30f, 8.5f, 57f)
                reflectiveQuadToRelative(23.5f, 50f)
                lineToRelative(-44f, 44f)
                lineToRelative(54f, 54f)
                lineToRelative(41f, -40f)
                quadToRelative(27f, 17f, 56f, 26f)
                reflectiveQuadToRelative(61f, 9f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-15f, 0f, -29f, -4f)
                reflectiveQuadToRelative(-28f, -10f)
                lineToRelative(136f, -133f)
                lineToRelative(-57f, -56f)
                lineToRelative(-132f, 132f)
                quadToRelative(-5f, -11f, -7.5f, -23.5f)
                reflectiveQuadTo(360f, 440f)
                quadToRelative(0f, -52f, 36f, -86f)
                reflectiveQuadToRelative(84f, -34f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-16f, -109f)
                close()
            }
        }.build()
        
        return _Nest_found_savings!!
    }

private var _Nest_found_savings: ImageVector? = null

