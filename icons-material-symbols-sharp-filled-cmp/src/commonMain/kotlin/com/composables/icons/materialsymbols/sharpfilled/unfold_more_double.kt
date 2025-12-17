package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Unfold_more_double: ImageVector
    get() {
        if (_Unfold_more_double != null) return _Unfold_more_double!!
        
        _Unfold_more_double = ImageVector.Builder(
            name = "unfold_more_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(481f, 959f)
                lineTo(298f, 776f)
                lineToRelative(56f, -56f)
                lineToRelative(127f, 126f)
                lineToRelative(127f, -127f)
                lineToRelative(56f, 57f)
                lineTo(481f, 959f)
                close()
                moveToRelative(0f, -200f)
                lineTo(298f, 576f)
                lineToRelative(56f, -56f)
                lineToRelative(127f, 126f)
                lineToRelative(127f, -127f)
                lineToRelative(56f, 57f)
                lineToRelative(-183f, 183f)
                close()
                moveTo(354f, 440f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -184f)
                lineToRelative(183f, 184f)
                lineToRelative(-57f, 57f)
                lineToRelative(-126f, -127f)
                lineToRelative(-127f, 127f)
                close()
                moveToRelative(0f, -200f)
                lineToRelative(-57f, -57f)
                lineToRelative(184f, -184f)
                lineToRelative(183f, 184f)
                lineToRelative(-57f, 57f)
                lineToRelative(-126f, -127f)
                lineToRelative(-127f, 127f)
                close()
            }
        }.build()
        
        return _Unfold_more_double!!
    }

private var _Unfold_more_double: ImageVector? = null

