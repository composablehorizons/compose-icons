package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nest_cam_indoor: ImageVector
    get() {
        if (_Nest_cam_indoor != null) return _Nest_cam_indoor!!
        
        _Nest_cam_indoor = ImageVector.Builder(
            name = "nest_cam_indoor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveTo(280f, 880f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -63f, -30.5f, -117f)
                reflectiveQuadTo(326f, 594f)
                quadToRelative(-60f, -39f, -93f, -101f)
                reflectiveQuadToRelative(-33f, -133f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, 72f, -34f, 134f)
                reflectiveQuadToRelative(-94f, 101f)
                quadToRelative(-53f, 34f, -82.5f, 88f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(200f, -320f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 360f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Nest_cam_indoor!!
    }

private var _Nest_cam_indoor: ImageVector? = null

