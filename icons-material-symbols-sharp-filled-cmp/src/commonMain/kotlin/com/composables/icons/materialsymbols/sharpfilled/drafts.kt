package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Drafts: ImageVector
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
            }
        }.build()
        
        return _Drafts!!
    }

private var _Drafts: ImageVector? = null

