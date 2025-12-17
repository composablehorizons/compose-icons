package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Dishwasher: ImageVector
    get() {
        if (_Dishwasher != null) return _Dishwasher!!
        
        _Dishwasher = ImageVector.Builder(
            name = "dishwasher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 440f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, 280f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 640f)
                quadToRelative(0f, -14f, 3f, -27.5f)
                reflectiveQuadToRelative(12f, -30.5f)
                quadToRelative(11f, -20f, 23f, -39f)
                reflectiveQuadToRelative(25f, -38f)
                quadToRelative(6f, -9f, 17f, -9f)
                reflectiveQuadToRelative(17f, 9f)
                quadToRelative(13f, 19f, 25f, 38f)
                reflectiveQuadToRelative(23f, 39f)
                quadToRelative(9f, 17f, 12f, 30.5f)
                reflectiveQuadToRelative(3f, 27.5f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(200f, -400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 320f)
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
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Dishwasher!!
    }

private var _Dishwasher: ImageVector? = null

