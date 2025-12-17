package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.View_day: ImageVector
    get() {
        if (_View_day != null) return _View_day!!
        
        _View_day = ImageVector.Builder(
            name = "view_day",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(159f, 800f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(120f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 720f)
                horizontalLineToRelative(641f)
                quadToRelative(17f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(159f)
                close()
                moveToRelative(41f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 320f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 640f)
                horizontalLineTo(200f)
                close()
                moveToRelative(-41f, -400f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(641f)
                quadToRelative(17f, 0f, 28f, 11.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 240f)
                horizontalLineTo(159f)
                close()
            }
        }.build()
        
        return _View_day!!
    }

private var _View_day: ImageVector? = null

