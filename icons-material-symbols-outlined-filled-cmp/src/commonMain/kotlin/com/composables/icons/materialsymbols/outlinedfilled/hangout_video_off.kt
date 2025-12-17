package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hangout_video_off: ImageVector
    get() {
        if (_Hangout_video_off != null) return _Hangout_video_off!!
        
        _Hangout_video_off = ImageVector.Builder(
            name = "hangout_video_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 932f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(24f, 24f)
                verticalLineToRelative(112f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(50f, -176f)
                lineTo(720f, 606f)
                verticalLineToRelative(-286f)
                lineTo(560f, 446f)
                verticalLineToRelative(-124f)
                horizontalLineTo(436f)
                lineTo(274f, 160f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 9f, -2.5f, 18f)
                reflectiveQuadToRelative(-7.5f, 18f)
                close()
                moveTo(240f, 640f)
                horizontalLineToRelative(286f)
                lineTo(240f, 354f)
                verticalLineToRelative(286f)
                close()
            }
        }.build()
        
        return _Hangout_video_off!!
    }

private var _Hangout_video_off: ImageVector? = null

