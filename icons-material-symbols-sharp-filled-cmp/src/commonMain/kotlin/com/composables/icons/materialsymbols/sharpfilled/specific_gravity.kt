package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Specific_gravity: ImageVector
    get() {
        if (_Specific_gravity != null) return _Specific_gravity!!
        
        _Specific_gravity = ImageVector.Builder(
            name = "specific_gravity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(208f, 880f)
                lineToRelative(-88f, -800f)
                horizontalLineToRelative(720f)
                lineTo(752f, 880f)
                horizontalLineTo(208f)
                close()
                moveToRelative(19f, -560f)
                horizontalLineToRelative(147f)
                quadToRelative(21f, -19f, 48f, -29.5f)
                reflectiveQuadToRelative(58f, -10.5f)
                quadToRelative(31f, 0f, 58f, 10.5f)
                reflectiveQuadToRelative(48f, 29.5f)
                horizontalLineToRelative(147f)
                lineToRelative(17f, -160f)
                horizontalLineTo(209f)
                lineToRelative(18f, 160f)
                close()
                moveToRelative(253f, 200f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 520f)
                close()
            }
        }.build()
        
        return _Specific_gravity!!
    }

private var _Specific_gravity: ImageVector? = null

