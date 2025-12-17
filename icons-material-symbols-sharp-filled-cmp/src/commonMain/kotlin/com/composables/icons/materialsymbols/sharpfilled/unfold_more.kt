package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Unfold_more: ImageVector
    get() {
        if (_Unfold_more != null) return _Unfold_more!!
        
        _Unfold_more = ImageVector.Builder(
            name = "unfold_more",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(300f, 660f)
                lineToRelative(58f, -58f)
                lineToRelative(122f, 122f)
                lineToRelative(122f, -122f)
                lineToRelative(58f, 58f)
                lineToRelative(-180f, 180f)
                close()
                moveTo(358f, 362f)
                lineToRelative(-58f, -58f)
                lineToRelative(180f, -180f)
                lineToRelative(180f, 180f)
                lineToRelative(-58f, 58f)
                lineToRelative(-122f, -122f)
                lineToRelative(-122f, 122f)
                close()
            }
        }.build()
        
        return _Unfold_more!!
    }

private var _Unfold_more: ImageVector? = null

