package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Remove: ImageVector
    get() {
        if (_Remove != null) return _Remove!!
        
        _Remove = ImageVector.Builder(
            name = "remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 440f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 520f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Remove!!
    }

private var _Remove: ImageVector? = null

