package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Play_shapes: ImageVector
    get() {
        if (_Play_shapes != null) return _Play_shapes!!
        
        _Play_shapes = ImageVector.Builder(
            name = "play_shapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 420f)
                lineToRelative(-56f, -56f)
                lineToRelative(104f, -104f)
                lineToRelative(-104f, -104f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                lineToRelative(104f, -104f)
                lineToRelative(56f, 56f)
                lineToRelative(-104f, 104f)
                lineToRelative(104f, 104f)
                lineToRelative(-56f, 56f)
                lineToRelative(-104f, -104f)
                lineToRelative(-104f, 104f)
                close()
                moveTo(80f, 440f)
                lineToRelative(200f, -360f)
                lineToRelative(200f, 360f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, 400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -67f, 47f, -113.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 760f)
                close()
                moveToRelative(-64f, -400f)
                horizontalLineToRelative(128f)
                lineToRelative(-64f, -115f)
                lineToRelative(-64f, 115f)
                close()
                moveToRelative(304f, 480f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(160f)
                close()
                moveTo(280f, 302f)
                close()
                moveToRelative(0f, 378f)
                close()
                moveToRelative(400f, 0f)
                close()
            }
        }.build()
        
        return _Play_shapes!!
    }

private var _Play_shapes: ImageVector? = null

