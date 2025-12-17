package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Camera_rear: ImageVector
    get() {
        if (_Camera_rear != null) return _Camera_rear!!
        
        _Camera_rear = ImageVector.Builder(
            name = "camera_rear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(394f, 900f)
                lineToRelative(-56f, -56f)
                lineToRelative(44f, -44f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(182f)
                lineToRelative(-44f, -44f)
                lineToRelative(56f, -56f)
                lineToRelative(140f, 140f)
                lineTo(394f, 900f)
                close()
                moveToRelative(166f, -100f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveTo(200f, 680f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(600f)
                horizontalLineTo(511f)
                lineTo(394f, 563f)
                lineTo(277f, 680f)
                horizontalLineToRelative(-77f)
                close()
                moveToRelative(280f, -280f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 400f)
                close()
            }
        }.build()
        
        return _Camera_rear!!
    }

private var _Camera_rear: ImageVector? = null

