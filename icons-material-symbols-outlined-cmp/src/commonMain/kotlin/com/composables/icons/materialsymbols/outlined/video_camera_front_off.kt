package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Video_camera_front_off: ImageVector
    get() {
        if (_Video_camera_front_off != null) return _Video_camera_front_off!!
        
        _Video_camera_front_off = ImageVector.Builder(
            name = "video_camera_front_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(880f, 700f)
                lineTo(720f, 540f)
                verticalLineToRelative(67f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-287f)
                horizontalLineTo(353f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(367f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                close()
                moveTo(822f, 934f)
                lineTo(26f, 138f)
                lineToRelative(56f, -56f)
                lineTo(878f, 878f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(497f, 383f)
                close()
                moveTo(384f, 496f)
                close()
                moveTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, 80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                close()
                moveToRelative(80f, 480f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -44f, 44f, -71f)
                reflectiveQuadToRelative(116f, -27f)
                quadToRelative(72f, 0f, 116f, 27f)
                reflectiveQuadToRelative(44f, 71f)
                verticalLineToRelative(22f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Video_camera_front_off!!
    }

private var _Video_camera_front_off: ImageVector? = null

