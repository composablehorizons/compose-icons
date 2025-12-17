package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Camping: ImageVector
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
                moveToRelative(400f, -591f)
                lineTo(160f, 720f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                lineToRelative(200f, -280f)
                lineToRelative(200f, 280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                lineTo(480f, 289f)
                close()
                moveTo(378f, 800f)
                horizontalLineToRelative(204f)
                lineTo(480f, 658f)
                lineTo(378f, 800f)
                close()
                moveToRelative(102f, -280f)
                lineToRelative(200f, 280f)
                lineToRelative(-200f, -280f)
                lineToRelative(-200f, 280f)
                lineToRelative(200f, -280f)
                close()
            }
        }.build()
        
        return _Camping!!
    }

private var _Camping: ImageVector? = null

