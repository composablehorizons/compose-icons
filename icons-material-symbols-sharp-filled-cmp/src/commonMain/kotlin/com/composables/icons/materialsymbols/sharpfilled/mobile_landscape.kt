package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_landscape: ImageVector
    get() {
        if (_Mobile_landscape != null) return _Mobile_landscape!!
        
        _Mobile_landscape = ImageVector.Builder(
            name = "mobile_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(204f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(484f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(160f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(200f, 520f)
                close()
            }
        }.build()
        
        return _Mobile_landscape!!
    }

private var _Mobile_landscape: ImageVector? = null

