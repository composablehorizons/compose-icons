package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Video_camera_back: ImageVector
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
                moveTo(241f, 640f)
                horizontalLineToRelative(318f)
                quadToRelative(13f, 0f, 18.5f, -11f)
                reflectiveQuadToRelative(-2.5f, -21f)
                lineToRelative(-97f, -127f)
                quadToRelative(-3f, -4f, -7f, -6f)
                reflectiveQuadToRelative(-9f, -2f)
                quadToRelative(-5f, 0f, -9f, 2f)
                reflectiveQuadToRelative(-7f, 6f)
                lineToRelative(-60f, 78f)
                quadToRelative(-3f, 4f, -7f, 6f)
                reflectiveQuadToRelative(-9f, 2f)
                quadToRelative(-5f, 0f, -9f, -2f)
                reflectiveQuadToRelative(-7f, -6f)
                lineToRelative(-30f, -39f)
                quadToRelative(-3f, -4f, -7f, -5.5f)
                reflectiveQuadToRelative(-9f, -1.5f)
                quadToRelative(-5f, 0f, -9f, 1.5f)
                reflectiveQuadToRelative(-7f, 5.5f)
                lineToRelative(-67f, 88f)
                quadToRelative(-8f, 10f, -2.5f, 21f)
                reflectiveQuadToRelative(18.5f, 11f)
                close()
                moveToRelative(-81f, 160f)
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
        
        return _Video_camera_back!!
    }

private var _Video_camera_back: ImageVector? = null

