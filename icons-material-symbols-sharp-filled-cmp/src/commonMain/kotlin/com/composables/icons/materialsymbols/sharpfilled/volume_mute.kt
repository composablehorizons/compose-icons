package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Volume_mute: ImageVector
    get() {
        if (_Volume_mute != null) return _Volume_mute!!
        
        _Volume_mute = ImageVector.Builder(
            name = "volume_mute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
                lineToRelative(200f, -200f)
                verticalLineToRelative(640f)
                lineTo(440f, 600f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Volume_mute!!
    }

private var _Volume_mute: ImageVector? = null

