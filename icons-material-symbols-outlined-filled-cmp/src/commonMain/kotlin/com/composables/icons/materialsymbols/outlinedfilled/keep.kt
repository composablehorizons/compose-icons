package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Keep: ImageVector
    get() {
        if (_Keep != null) return _Keep!!
        
        _Keep = ImageVector.Builder(
            name = "keep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 480f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                lineToRelative(-40f, 40f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Keep!!
    }

private var _Keep: ImageVector? = null

