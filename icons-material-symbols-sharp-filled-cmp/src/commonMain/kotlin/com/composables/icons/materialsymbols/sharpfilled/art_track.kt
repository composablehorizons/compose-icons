package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Art_track: ImageVector
    get() {
        if (_Art_track != null) return _Art_track!!
        
        _Art_track = ImageVector.Builder(
            name = "art_track",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 760f)
                horizontalLineTo(40f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(160f, 600f)
                horizontalLineToRelative(320f)
                lineTo(376f, 460f)
                lineToRelative(-76f, 100f)
                lineToRelative(-56f, -74f)
                lineToRelative(-84f, 114f)
                close()
            }
        }.build()
        
        return _Art_track!!
    }

private var _Art_track: ImageVector? = null

