package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Api: ImageVector
    get() {
        if (_Api != null) return _Api!!
        
        _Api = ImageVector.Builder(
            name = "api",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 560f)
                lineToRelative(-80f, -80f)
                lineToRelative(80f, -80f)
                lineToRelative(80f, 80f)
                lineToRelative(-80f, 80f)
                close()
                moveToRelative(-85f, -235f)
                lineTo(295f, 225f)
                lineToRelative(185f, -185f)
                lineToRelative(185f, 185f)
                lineToRelative(-100f, 100f)
                lineToRelative(-85f, -85f)
                lineToRelative(-85f, 85f)
                close()
                moveTo(225f, 665f)
                lineTo(40f, 480f)
                lineToRelative(185f, -185f)
                lineToRelative(100f, 100f)
                lineToRelative(-85f, 85f)
                lineToRelative(85f, 85f)
                lineToRelative(-100f, 100f)
                close()
                moveToRelative(510f, 0f)
                lineTo(635f, 565f)
                lineToRelative(85f, -85f)
                lineToRelative(-85f, -85f)
                lineToRelative(100f, -100f)
                lineToRelative(185f, 185f)
                lineToRelative(-185f, 185f)
                close()
                moveTo(480f, 920f)
                lineTo(295f, 735f)
                lineToRelative(100f, -100f)
                lineToRelative(85f, 85f)
                lineToRelative(85f, -85f)
                lineToRelative(100f, 100f)
                lineTo(480f, 920f)
                close()
            }
        }.build()
        
        return _Api!!
    }

private var _Api: ImageVector? = null

