package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Text_up: ImageVector
    get() {
        if (_Text_up != null) return _Text_up!!
        
        _Text_up = ImageVector.Builder(
            name = "text_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-248f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(248f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-480f, 0f)
                lineToRelative(136f, -360f)
                horizontalLineToRelative(64f)
                lineToRelative(136f, 360f)
                horizontalLineToRelative(-62f)
                lineToRelative(-32f, -92f)
                horizontalLineTo(216f)
                lineToRelative(-32f, 92f)
                horizontalLineToRelative(-64f)
                close()
                moveToRelative(114f, -144f)
                horizontalLineToRelative(108f)
                lineToRelative(-52f, -150f)
                horizontalLineToRelative(-4f)
                lineToRelative(-52f, 150f)
                close()
            }
        }.build()
        
        return _Text_up!!
    }

private var _Text_up: ImageVector? = null

