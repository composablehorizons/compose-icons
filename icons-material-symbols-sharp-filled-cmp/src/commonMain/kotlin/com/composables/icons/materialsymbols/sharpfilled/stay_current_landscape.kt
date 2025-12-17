package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stay_current_landscape: ImageVector
    get() {
        if (_Stay_current_landscape != null) return _Stay_current_landscape!!
        
        _Stay_current_landscape = ImageVector.Builder(
            name = "stay_current_landscape",
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
                horizontalLineToRelative(880f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(200f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-400f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Stay_current_landscape!!
    }

private var _Stay_current_landscape: ImageVector? = null

