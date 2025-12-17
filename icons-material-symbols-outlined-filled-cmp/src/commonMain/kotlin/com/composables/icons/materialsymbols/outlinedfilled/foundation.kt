package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Foundation: ImageVector
    get() {
        if (_Foundation != null) return _Foundation!!
        
        _Foundation = ImageVector.Builder(
            name = "foundation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-166f)
                lineTo(88f, 520f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -336f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 64f)
                lineToRelative(-112f, -86f)
                verticalLineToRelative(166f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(520f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, -240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-349f)
                lineTo(280f, 373f)
                verticalLineToRelative(227f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-227f)
                lineTo(520f, 251f)
                verticalLineToRelative(349f)
                close()
            }
        }.build()
        
        return _Foundation!!
    }

private var _Foundation: ImageVector? = null

