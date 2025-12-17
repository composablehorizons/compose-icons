package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bottom_right_click: ImageVector
    get() {
        if (_Bottom_right_click != null) return _Bottom_right_click!!
        
        _Bottom_right_click = ImageVector.Builder(
            name = "bottom_right_click",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 600f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 680f)
                close()
                moveTo(200f, 480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(144f)
                lineTo(120f, 176f)
                lineToRelative(56f, -56f)
                lineToRelative(224f, 224f)
                verticalLineToRelative(-144f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Bottom_right_click!!
    }

private var _Bottom_right_click: ImageVector? = null

