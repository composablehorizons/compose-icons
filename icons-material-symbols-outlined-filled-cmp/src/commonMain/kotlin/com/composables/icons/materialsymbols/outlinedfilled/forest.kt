package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Forest: ImageVector
    get() {
        if (_Forest != null) return _Forest!!
        
        _Forest = ImageVector.Builder(
            name = "forest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineTo(0f)
                lineToRelative(154f, -240f)
                horizontalLineTo(80f)
                lineToRelative(280f, -400f)
                lineToRelative(280f, 400f)
                horizontalLineToRelative(-74f)
                lineToRelative(155f, 240f)
                horizontalLineTo(440f)
                verticalLineToRelative(160f)
                horizontalLineTo(280f)
                close()
                moveToRelative(490f, -160f)
                lineTo(640f, 520f)
                horizontalLineToRelative(77f)
                lineTo(505f, 217f)
                lineToRelative(95f, -137f)
                lineToRelative(280f, 400f)
                horizontalLineToRelative(-74f)
                lineToRelative(154f, 240f)
                horizontalLineTo(770f)
                close()
            }
        }.build()
        
        return _Forest!!
    }

private var _Forest: ImageVector? = null

