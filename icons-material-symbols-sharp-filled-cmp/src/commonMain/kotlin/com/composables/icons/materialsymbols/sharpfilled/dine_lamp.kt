package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dine_lamp: ImageVector
    get() {
        if (_Dine_lamp != null) return _Dine_lamp!!
        
        _Dine_lamp = ImageVector.Builder(
            name = "dine_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineTo(81f)
                lineTo(40f, 280f)
                horizontalLineToRelative(80f)
                lineToRelative(29f, 320f)
                horizontalLineToRelative(251f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineTo(180f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(252f)
                lineToRelative(29f, -320f)
                horizontalLineToRelative(79f)
                lineToRelative(-40f, 440f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineTo(660f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(280f, 360f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(40f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Dine_lamp!!
    }

private var _Dine_lamp: ImageVector? = null

