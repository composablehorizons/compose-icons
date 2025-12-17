package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Drafts: ImageVector
    get() {
        if (_Drafts != null) return _Drafts!!
        
        _Drafts = ImageVector.Builder(
            name = "drafts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 40f)
                lineToRelative(400f, 239f)
                verticalLineToRelative(561f)
                horizontalLineTo(80f)
                verticalLineToRelative(-561f)
                lineToRelative(400f, -239f)
                close()
                moveToRelative(0f, 466f)
                lineToRelative(312f, -186f)
                lineToRelative(-312f, -186f)
                lineToRelative(-312f, 186f)
                lineToRelative(312f, 186f)
                close()
                moveToRelative(0f, 94f)
                lineTo(160f, 408f)
                verticalLineToRelative(352f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-352f)
                lineTo(480f, 600f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Drafts!!
    }

private var _Drafts: ImageVector? = null

