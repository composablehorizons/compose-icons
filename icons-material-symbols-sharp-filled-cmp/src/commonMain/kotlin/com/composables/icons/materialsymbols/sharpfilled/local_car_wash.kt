package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Local_car_wash: ImageVector
    get() {
        if (_Local_car_wash != null) return _Local_car_wash!!
        
        _Local_car_wash = ImageVector.Builder(
            name = "local_car_wash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 200f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 140f)
                quadToRelative(0f, -21f, 14.5f, -45f)
                reflectiveQuadToRelative(45.5f, -55f)
                quadToRelative(31f, 31f, 45.5f, 55f)
                reflectiveQuadToRelative(14.5f, 45f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(220f, 140f)
                quadToRelative(0f, -21f, 14.5f, -45f)
                reflectiveQuadToRelative(45.5f, -55f)
                quadToRelative(31f, 31f, 45.5f, 55f)
                reflectiveQuadToRelative(14.5f, 45f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(280f, 200f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, -21f, 14.5f, -45f)
                reflectiveQuadToRelative(45.5f, -55f)
                quadToRelative(31f, 31f, 45.5f, 55f)
                reflectiveQuadToRelative(14.5f, 45f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(680f, 200f)
                close()
                moveTo(240f, 840f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-360f)
                lineToRelative(98f, -280f)
                horizontalLineToRelative(524f)
                lineToRelative(98f, 280f)
                verticalLineToRelative(360f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-8f, -360f)
                horizontalLineToRelative(496f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(274f)
                lineToRelative(-42f, 120f)
                close()
                moveToRelative(68f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 720f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 720f)
                close()
            }
        }.build()
        
        return _Local_car_wash!!
    }

private var _Local_car_wash: ImageVector? = null

