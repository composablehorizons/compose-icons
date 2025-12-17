package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Language_us_colemak: ImageVector
    get() {
        if (_Language_us_colemak != null) return _Language_us_colemak!!
        
        _Language_us_colemak = ImageVector.Builder(
            name = "language_us_colemak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 600f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-240f)
                horizontalLineTo(580f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-420f, 80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(260f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(340f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(300f)
                verticalLineToRelative(400f)
                horizontalLineTo(500f)
                close()
            }
        }.build()
        
        return _Language_us_colemak!!
    }

private var _Language_us_colemak: ImageVector? = null

