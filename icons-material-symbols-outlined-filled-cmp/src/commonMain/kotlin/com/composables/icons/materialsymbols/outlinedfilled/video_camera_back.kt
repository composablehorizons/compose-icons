package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Video_camera_back: ImageVector
    get() {
        if (_Video_camera_back != null) return _Video_camera_back!!
        
        _Video_camera_back = ImageVector.Builder(
            name = "video_camera_back",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 640f)
                horizontalLineToRelative(400f)
                lineTo(462f, 460f)
                lineToRelative(-92f, 120f)
                lineToRelative(-62f, -80f)
                lineToRelative(-108f, 140f)
                close()
                moveToRelative(-40f, 160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                lineTo(720f, 540f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Video_camera_back!!
    }

private var _Video_camera_back: ImageVector? = null

