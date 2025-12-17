package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Camping: ImageVector
    get() {
        if (_Camping != null) return _Camping!!
        
        _Camping = ImageVector.Builder(
            name = "camping",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-186f)
                lineToRelative(350f, -472f)
                lineToRelative(-70f, -94f)
                lineToRelative(64f, -48f)
                lineToRelative(56f, 75f)
                lineToRelative(56f, -75f)
                lineToRelative(64f, 48f)
                lineToRelative(-70f, 94f)
                lineToRelative(350f, 472f)
                verticalLineToRelative(186f)
                horizontalLineTo(80f)
                close()
                moveToRelative(249f, -80f)
                horizontalLineToRelative(302f)
                lineTo(480f, 589f)
                lineTo(329f, 800f)
                close()
            }
        }.build()
        
        return _Camping!!
    }

private var _Camping: ImageVector? = null

