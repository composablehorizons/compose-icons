package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 840f)
                lineToRelative(-240f, -84f)
                lineToRelative(-240f, 93f)
                verticalLineToRelative(-647f)
                lineToRelative(240f, -82f)
                lineToRelative(240f, 84f)
                lineToRelative(240f, -93f)
                verticalLineToRelative(647f)
                lineToRelative(-240f, 82f)
                close()
                moveToRelative(-40f, -98f)
                verticalLineToRelative(-468f)
                lineToRelative(-160f, -56f)
                verticalLineToRelative(468f)
                lineToRelative(160f, 56f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

