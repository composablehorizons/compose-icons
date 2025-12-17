package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Camera_video: ImageVector
    get() {
        if (_Camera_video != null) return _Camera_video!!
        
        _Camera_video = ImageVector.Builder(
            name = "camera_video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(371f, 760f)
                horizontalLineToRelative(218f)
                lineToRelative(-20f, -80f)
                horizontalLineTo(391f)
                lineToRelative(-20f, 80f)
                close()
                moveToRelative(-11f, -160f)
                horizontalLineToRelative(240f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(600f, 200f)
                horizontalLineTo(360f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(160f, 400f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(360f, 600f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 480f)
                close()
                moveTo(260f, 360f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(300f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(260f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(220f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(260f, 360f)
                close()
                moveToRelative(-60f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 760f)
                horizontalLineToRelative(89f)
                lineToRelative(21f, -84f)
                quadToRelative(-99f, -17f, -164.5f, -94.5f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(0f, 104f, -65.5f, 181.5f)
                reflectiveQuadTo(650f, 676f)
                lineToRelative(21f, 84f)
                horizontalLineToRelative(89f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -280f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -160f)
                close()
                moveTo(371f, 760f)
                horizontalLineToRelative(218f)
                horizontalLineToRelative(-218f)
                close()
            }
        }.build()
        
        return _Camera_video!!
    }

private var _Camera_video: ImageVector? = null

