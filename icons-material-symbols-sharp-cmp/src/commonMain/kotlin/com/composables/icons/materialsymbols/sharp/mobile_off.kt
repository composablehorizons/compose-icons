package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_off: ImageVector
    get() {
        if (_Mobile_off != null) return _Mobile_off!!
        
        _Mobile_off = ImageVector.Builder(
            name = "mobile_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 932f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(200f, 257f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(383f)
                horizontalLineToRelative(384f)
                lineToRelative(96f, 96f)
                verticalLineToRelative(104f)
                horizontalLineTo(200f)
                verticalLineToRelative(-663f)
                close()
                moveToRelative(80f, 543f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(73f, -560f)
                lineToRelative(-79f, -80f)
                horizontalLineToRelative(406f)
                verticalLineToRelative(-40f)
                horizontalLineTo(234f)
                lineToRelative(-28f, -28f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(554f)
                verticalLineToRelative(606f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-326f)
                horizontalLineTo(353f)
                close()
                moveToRelative(127f, 560f)
                close()
                moveToRelative(-23f, -640f)
                close()
            }
        }.build()
        
        return _Mobile_off!!
    }

private var _Mobile_off: ImageVector? = null

