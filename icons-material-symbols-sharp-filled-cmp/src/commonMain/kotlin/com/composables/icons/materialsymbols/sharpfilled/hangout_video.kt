package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hangout_video: ImageVector
    get() {
        if (_Hangout_video != null) return _Hangout_video!!
        
        _Hangout_video = ImageVector.Builder(
            name = "hangout_video",
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
                verticalLineToRelative(-128f)
                lineToRelative(160f, 128f)
                verticalLineToRelative(-320f)
                lineTo(560f, 448f)
                verticalLineToRelative(-128f)
                horizontalLineTo(240f)
                verticalLineToRelative(320f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Hangout_video!!
    }

private var _Hangout_video: ImageVector? = null

