package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Contrast_square: ImageVector
    get() {
        if (_Contrast_square != null) return _Contrast_square!!
        
        _Contrast_square = ImageVector.Builder(
            name = "contrast_square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                lineTo(200f, 760f)
                close()
                moveToRelative(100f, -400f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(330f, 440f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(360f, 410f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(440f, 330f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(410f, 300f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(330f, 220f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(300f, 250f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-50f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(220f, 330f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(250f, 360f)
                horizontalLineToRelative(50f)
                close()
                moveToRelative(351f, 280f)
                horizontalLineTo(511f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(481f, 610f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(511f, 580f)
                horizontalLineToRelative(140f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(681f, 610f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(651f, 640f)
                close()
            }
        }.build()
        
        return _Contrast_square!!
    }

private var _Contrast_square: ImageVector? = null

