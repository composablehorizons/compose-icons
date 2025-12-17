package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hangout_video_off: ImageVector
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
                moveTo(436f, 322f)
                horizontalLineToRelative(124f)
                verticalLineToRelative(124f)
                lineTo(436f, 322f)
                close()
                moveToRelative(124f, 124f)
                lineToRelative(160f, -126f)
                verticalLineToRelative(286f)
                lineTo(560f, 446f)
                close()
                moveToRelative(240f, 240f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(-606f)
                horizontalLineTo(274f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(446f)
                verticalLineToRelative(446f)
                close()
                moveTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-286f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                lineToRelative(-134f, -132f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(418f, 304f)
                close()
                moveToRelative(-194f, 34f)
                close()
            }
        }.build()
        
        return _Hangout_video_off!!
    }

private var _Hangout_video_off: ImageVector? = null

