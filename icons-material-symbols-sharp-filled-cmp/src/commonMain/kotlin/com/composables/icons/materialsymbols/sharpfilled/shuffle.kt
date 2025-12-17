package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shuffle: ImageVector
    get() {
        if (_Shuffle != null) return _Shuffle!!
        
        _Shuffle = ImageVector.Builder(
            name = "shuffle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(104f)
                lineTo(537f, 593f)
                lineToRelative(57f, -57f)
                lineToRelative(126f, 126f)
                verticalLineToRelative(-102f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-344f, 0f)
                lineToRelative(-56f, -56f)
                lineToRelative(504f, -504f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(216f, 800f)
                close()
                moveToRelative(151f, -377f)
                lineTo(160f, 216f)
                lineToRelative(56f, -56f)
                lineToRelative(207f, 207f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Shuffle!!
    }

private var _Shuffle: ImageVector? = null

