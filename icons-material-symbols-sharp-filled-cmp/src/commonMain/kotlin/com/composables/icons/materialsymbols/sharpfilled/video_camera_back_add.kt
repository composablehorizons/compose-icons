package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Video_camera_back_add: ImageVector
    get() {
        if (_Video_camera_back_add != null) return _Video_camera_back_add!!
        
        _Video_camera_back_add = ImageVector.Builder(
            name = "video_camera_back_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-360f)
                quadToRelative(26f, 20f, 57f, 30f)
                reflectiveQuadToRelative(63f, 10f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(0f, -32f, -10f, -63f)
                reflectiveQuadToRelative(-30f, -57f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(260f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                lineTo(720f, 540f)
                verticalLineToRelative(260f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 240f)
                horizontalLineToRelative(400f)
                lineTo(465f, 460f)
                lineTo(360f, 600f)
                lineToRelative(-65f, -87f)
                lineToRelative(-95f, 127f)
                close()
            }
        }.build()
        
        return _Video_camera_back_add!!
    }

private var _Video_camera_back_add: ImageVector? = null

