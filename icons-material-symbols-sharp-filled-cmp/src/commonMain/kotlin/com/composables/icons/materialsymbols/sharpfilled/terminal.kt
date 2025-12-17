package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Terminal: ImageVector
    get() {
        if (_Terminal != null) return _Terminal!!
        
        _Terminal = ImageVector.Builder(
            name = "terminal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(140f, -40f)
                lineToRelative(-56f, -56f)
                lineToRelative(103f, -104f)
                lineToRelative(-104f, -104f)
                lineToRelative(57f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveToRelative(180f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Terminal!!
    }

private var _Terminal: ImageVector? = null

