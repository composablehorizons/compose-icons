package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Service_toolbox: ImageVector
    get() {
        if (_Service_toolbox != null) return _Service_toolbox!!
        
        _Service_toolbox = ImageVector.Builder(
            name = "service_toolbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 240f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(79f)
                lineToRelative(121f, 278f)
                verticalLineToRelative(282f)
                horizontalLineTo(80f)
                verticalLineToRelative(-282f)
                lineToRelative(121f, -278f)
                horizontalLineToRelative(79f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 240f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(96f)
                lineToRelative(-68f, -160f)
                horizontalLineTo(252f)
                lineToRelative(-68f, 160f)
                horizontalLineToRelative(96f)
                close()
                moveToRelative(0f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(360f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                close()
                moveToRelative(200f, -40f)
                close()
                moveToRelative(0f, -40f)
                close()
                moveToRelative(0f, 80f)
                close()
            }
        }.build()
        
        return _Service_toolbox!!
    }

private var _Service_toolbox: ImageVector? = null

