package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Yakitori: ImageVector
    get() {
        if (_Yakitori != null) return _Yakitori!!
        
        _Yakitori = ImageVector.Builder(
            name = "yakitori",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(843f, 900f)
                lineTo(670f, 726f)
                lineTo(528f, 868f)
                lineTo(359f, 698f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -57f)
                lineToRelative(-57f, 57f)
                lineToRelative(-169f, -170f)
                lineToRelative(56f, -56f)
                lineTo(76f, 303f)
                lineToRelative(85f, -85f)
                lineTo(60f, 116f)
                lineToRelative(56f, -56f)
                lineToRelative(102f, 102f)
                lineToRelative(85f, -85f)
                lineToRelative(113f, 113f)
                lineToRelative(57f, -57f)
                lineToRelative(169f, 170f)
                lineToRelative(-56f, 57f)
                lineToRelative(56f, 56f)
                lineToRelative(57f, -57f)
                lineToRelative(169f, 170f)
                lineToRelative(-141f, 141f)
                lineToRelative(172f, 173f)
                lineToRelative(-56f, 57f)
                close()
            }
        }.build()
        
        return _Yakitori!!
    }

private var _Yakitori: ImageVector? = null

