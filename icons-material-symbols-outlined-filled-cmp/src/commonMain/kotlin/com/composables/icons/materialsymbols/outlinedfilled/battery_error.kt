package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Battery_error: ImageVector
    get() {
        if (_Battery_error != null) return _Battery_error!!
        
        _Battery_error = ImageVector.Builder(
            name = "battery_error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(656f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
                moveToRelative(-336f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 200f)
                verticalLineToRelative(308f)
                quadToRelative(-79f, 21f, -129f, 85.5f)
                reflectiveQuadTo(501f, 741f)
                quadToRelative(0f, 38f, 11f, 73f)
                reflectiveQuadToRelative(33f, 66f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Battery_error!!
    }

private var _Battery_error: ImageVector? = null

