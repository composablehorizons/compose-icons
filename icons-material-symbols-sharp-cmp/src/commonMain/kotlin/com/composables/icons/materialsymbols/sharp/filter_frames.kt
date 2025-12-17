package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Filter_frames: ImageVector
    get() {
        if (_Filter_frames != null) return _Filter_frames!!
        
        _Filter_frames = ImageVector.Builder(
            name = "filter_frames",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(240f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(720f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-560f)
                horizontalLineTo(160f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(400f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-240f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(160f, -120f)
                close()
            }
        }.build()
        
        return _Filter_frames!!
    }

private var _Filter_frames: ImageVector? = null

