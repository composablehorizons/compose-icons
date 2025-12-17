package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mouse: ImageVector
    get() {
        if (_Mouse != null) return _Mouse!!
        
        _Mouse = ImageVector.Builder(
            name = "mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(200f, 360f)
                quadToRelative(0f, -105f, 68f, -183.5f)
                reflectiveQuadTo(440f, 83f)
                verticalLineToRelative(277f)
                horizontalLineTo(200f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-277f)
                quadToRelative(104f, 15f, 172f, 93.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Mouse!!
    }

private var _Mouse: ImageVector? = null

