package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_lock_landscape: ImageVector
    get() {
        if (_Mobile_lock_landscape != null) return _Mobile_lock_landscape!!
        
        _Mobile_lock_landscape = ImageVector.Builder(
            name = "mobile_lock_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 640f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(80f, -200f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
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
            }
        }.build()
        
        return _Mobile_lock_landscape!!
    }

private var _Mobile_lock_landscape: ImageVector? = null

