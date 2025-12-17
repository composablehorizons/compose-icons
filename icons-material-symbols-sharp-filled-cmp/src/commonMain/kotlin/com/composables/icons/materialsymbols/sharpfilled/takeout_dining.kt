package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Takeout_dining: ImageVector
    get() {
        if (_Takeout_dining != null) return _Takeout_dining!!
        
        _Takeout_dining = ImageVector.Builder(
            name = "takeout_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(185f, 400f)
                lineTo(80f, 298f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                lineToRelative(-2f, -24f)
                lineToRelative(162f, -162f)
                horizontalLineToRelative(240f)
                lineToRelative(162f, 162f)
                lineToRelative(-2f, 24f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 56f)
                lineToRelative(-105f, 102f)
                horizontalLineTo(185f)
                close()
                moveToRelative(53f, 400f)
                lineToRelative(-26f, -338f)
                horizontalLineToRelative(536f)
                lineToRelative(-26f, 338f)
                horizontalLineTo(238f)
                close()
            }
        }.build()
        
        return _Takeout_dining!!
    }

private var _Takeout_dining: ImageVector? = null

