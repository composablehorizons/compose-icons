package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Play_shapes: ImageVector
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
                moveTo(148f, 440f)
                quadToRelative(-23f, 0f, -34.5f, -19.5f)
                reflectiveQuadTo(113f, 381f)
                lineToRelative(132f, -238f)
                quadToRelative(11f, -20f, 35f, -20f)
                reflectiveQuadToRelative(35f, 20f)
                lineToRelative(132f, 238f)
                quadToRelative(11f, 20f, -0.5f, 39.5f)
                reflectiveQuadTo(412f, 440f)
                horizontalLineTo(148f)
                close()
                moveToRelative(132f, 400f)
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
                moveToRelative(344f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 800f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 520f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 560f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(560f)
                close()
                moveToRelative(40f, -80f)
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
                moveToRelative(-56f, -420f)
                lineToRelative(-76f, -76f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(76f, 76f)
                lineToRelative(76f, -76f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-76f, 76f)
                lineToRelative(76f, 76f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-76f, -76f)
                lineToRelative(-76f, 76f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(76f, -76f)
                close()
            }
        }.build()
        
        return _Play_shapes!!
    }

private var _Play_shapes: ImageVector? = null

