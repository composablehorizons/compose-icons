package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Audio_video_receiver: ImageVector
    get() {
        if (_Audio_video_receiver != null) return _Audio_video_receiver!!
        
        _Audio_video_receiver = ImageVector.Builder(
            name = "audio_video_receiver",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 600f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-320f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(500f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(740f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(660f, 360f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(660f, 520f)
                close()
                moveToRelative(-420f, 0f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Audio_video_receiver!!
    }

private var _Audio_video_receiver: ImageVector? = null

