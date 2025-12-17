package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Interests: ImageVector
    get() {
        if (_Interests != null) return _Interests!!
        
        _Interests = ImageVector.Builder(
            name = "interests",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 440f)
                lineToRelative(200f, -360f)
                lineToRelative(200f, 360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, 400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(160f, -400f)
                quadToRelative(-57f, -48f, -95.5f, -81f)
                reflectiveQuadTo(523f, 301f)
                quadToRelative(-23f, -25f, -33f, -47f)
                reflectiveQuadToRelative(-10f, -47f)
                quadToRelative(0f, -45f, 31.5f, -76f)
                reflectiveQuadToRelative(78.5f, -31f)
                quadToRelative(27f, 0f, 50.5f, 12.5f)
                reflectiveQuadTo(680f, 147f)
                quadToRelative(16f, -22f, 39.5f, -34.5f)
                reflectiveQuadTo(770f, 100f)
                quadToRelative(47f, 0f, 78.5f, 31f)
                reflectiveQuadToRelative(31.5f, 76f)
                quadToRelative(0f, 25f, -10f, 47f)
                reflectiveQuadToRelative(-33f, 47f)
                quadToRelative(-23f, 25f, -61.5f, 58f)
                reflectiveQuadTo(680f, 440f)
                close()
            }
        }.build()
        
        return _Interests!!
    }

private var _Interests: ImageVector? = null

