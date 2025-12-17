package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Roofing: ImageVector
    get() {
        if (_Roofing != null) return _Roofing!!
        
        _Roofing = ImageVector.Builder(
            name = "roofing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(360f)
                close()
                moveTo(88f, 520f)
                lineToRelative(-48f, -64f)
                lineToRelative(440f, -336f)
                lineToRelative(160f, 122f)
                verticalLineToRelative(-82f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(174f)
                lineToRelative(160f, 122f)
                lineToRelative(-48f, 64f)
                lineToRelative(-392f, -299f)
                lineTo(88f, 520f)
                close()
            }
        }.build()
        
        return _Roofing!!
    }

private var _Roofing: ImageVector? = null

