package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Unfold_less_double: ImageVector
    get() {
        if (_Unfold_less_double != null) return _Unfold_less_double!!
        
        _Unfold_less_double = ImageVector.Builder(
            name = "unfold_less_double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(354f, 958f)
                lineToRelative(-56f, -56f)
                lineToRelative(183f, -183f)
                lineTo(664f, 902f)
                lineTo(608f, 959f)
                lineTo(481f, 832f)
                lineTo(354f, 958f)
                close()
                moveToRelative(0f, -200f)
                lineToRelative(-56f, -56f)
                lineToRelative(183f, -183f)
                lineToRelative(183f, 183f)
                lineToRelative(-56f, 57f)
                lineToRelative(-127f, -127f)
                lineToRelative(-127f, 126f)
                close()
                moveToRelative(127f, -318f)
                lineTo(297f, 256f)
                lineToRelative(57f, -57f)
                lineToRelative(127f, 127f)
                lineToRelative(126f, -127f)
                lineToRelative(57f, 57f)
                lineToRelative(-183f, 184f)
                close()
                moveToRelative(0f, -200f)
                lineTo(297f, 56f)
                lineToRelative(57f, -57f)
                lineToRelative(127f, 127f)
                lineToRelative(126f, -127f)
                lineToRelative(57f, 57f)
                lineToRelative(-183f, 184f)
                close()
            }
        }.build()
        
        return _Unfold_less_double!!
    }

private var _Unfold_less_double: ImageVector? = null

