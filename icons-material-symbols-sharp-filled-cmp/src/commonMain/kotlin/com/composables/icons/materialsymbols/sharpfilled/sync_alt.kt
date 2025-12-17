package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sync_alt: ImageVector
    get() {
        if (_Sync_alt != null) return _Sync_alt!!
        
        _Sync_alt = ImageVector.Builder(
            name = "sync_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                lineTo(80f, 640f)
                lineToRelative(200f, -200f)
                lineToRelative(57f, 56f)
                lineToRelative(-104f, 104f)
                horizontalLineToRelative(607f)
                verticalLineToRelative(80f)
                horizontalLineTo(233f)
                lineToRelative(104f, 104f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(400f, -320f)
                lineToRelative(-57f, -56f)
                lineToRelative(104f, -104f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(607f)
                lineTo(623f, 176f)
                lineToRelative(57f, -56f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Sync_alt!!
    }

private var _Sync_alt: ImageVector? = null

