package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Send_time_extension: ImageVector
    get() {
        if (_Send_time_extension != null) return _Send_time_extension!!
        
        _Send_time_extension = ImageVector.Builder(
            name = "send_time_extension",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 880f)
                verticalLineToRelative(-160f)
                lineToRelative(160f, -40f)
                lineToRelative(-160f, -40f)
                verticalLineToRelative(-160f)
                lineToRelative(400f, 200f)
                lineTo(520f, 880f)
                close()
                moveToRelative(-400f, -40f)
                verticalLineToRelative(-232f)
                quadToRelative(48f, 0f, 84f, -30.5f)
                reflectiveQuadToRelative(36f, -77.5f)
                quadToRelative(0f, -47f, -36f, -77.5f)
                reflectiveQuadTo(120f, 392f)
                verticalLineToRelative(-232f)
                horizontalLineToRelative(240f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(370f)
                lineTo(440f, 350f)
                verticalLineToRelative(372f)
                quadToRelative(-40f, 8f, -64f, 37.5f)
                reflectiveQuadTo(352f, 840f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Send_time_extension!!
    }

private var _Send_time_extension: ImageVector? = null

