package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Video_camera_front: ImageVector
    get() {
        if (_Video_camera_front != null) return _Video_camera_front!!
        
        _Video_camera_front = ImageVector.Builder(
            name = "video_camera_front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 640f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -44f, -44f, -71f)
                reflectiveQuadToRelative(-116f, -27f)
                quadToRelative(-72f, 0f, -116f, 27f)
                reflectiveQuadToRelative(-44f, 71f)
                verticalLineToRelative(22f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 480f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(126f, -126f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(720f, 540f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Video_camera_front!!
    }

private var _Video_camera_front: ImageVector? = null

