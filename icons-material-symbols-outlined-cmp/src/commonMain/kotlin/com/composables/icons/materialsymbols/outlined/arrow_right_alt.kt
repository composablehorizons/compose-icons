package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_right_alt: ImageVector
    get() {
        if (_Arrow_right_alt != null) return _Arrow_right_alt!!
        
        _Arrow_right_alt = ImageVector.Builder(
            name = "arrow_right_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 720f)
                lineToRelative(-56f, -58f)
                lineToRelative(142f, -142f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(486f)
                lineTo(504f, 298f)
                lineToRelative(56f, -58f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Arrow_right_alt!!
    }

private var _Arrow_right_alt: ImageVector? = null

