package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wounds_injuries: ImageVector
    get() {
        if (_Wounds_injuries != null) return _Wounds_injuries!!
        
        _Wounds_injuries = ImageVector.Builder(
            name = "wounds_injuries",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(88f, -88f)
                lineToRelative(-88f, -24f)
                lineToRelative(21f, -77f)
                lineToRelative(87f, 24f)
                lineToRelative(-23f, -88f)
                lineToRelative(77f, -21f)
                lineToRelative(24f, 88f)
                lineToRelative(137f, -137f)
                lineToRelative(-88f, -24f)
                lineToRelative(21f, -77f)
                lineToRelative(87f, 23f)
                lineToRelative(-23f, -87f)
                lineToRelative(77f, -21f)
                lineToRelative(24f, 88f)
                lineToRelative(137f, -137f)
                lineToRelative(-88f, -24f)
                lineToRelative(21f, -77f)
                lineToRelative(88f, 23f)
                lineToRelative(-24f, -87f)
                lineToRelative(77f, -21f)
                lineToRelative(24f, 88f)
                lineToRelative(88f, -88f)
                lineToRelative(56f, 56f)
                lineToRelative(-88f, 88f)
                lineToRelative(88f, 24f)
                lineToRelative(-21f, 77f)
                lineToRelative(-87f, -24f)
                lineToRelative(23f, 88f)
                lineToRelative(-77f, 21f)
                lineToRelative(-24f, -88f)
                lineToRelative(-137f, 137f)
                lineToRelative(88f, 24f)
                lineToRelative(-21f, 77f)
                lineToRelative(-87f, -23f)
                lineToRelative(23f, 87f)
                lineToRelative(-77f, 21f)
                lineToRelative(-24f, -88f)
                lineToRelative(-137f, 137f)
                lineToRelative(88f, 24f)
                lineToRelative(-21f, 77f)
                lineToRelative(-88f, -23f)
                lineToRelative(24f, 87f)
                lineToRelative(-77f, 21f)
                lineToRelative(-24f, -88f)
                lineToRelative(-88f, 88f)
                close()
            }
        }.build()
        
        return _Wounds_injuries!!
    }

private var _Wounds_injuries: ImageVector? = null

