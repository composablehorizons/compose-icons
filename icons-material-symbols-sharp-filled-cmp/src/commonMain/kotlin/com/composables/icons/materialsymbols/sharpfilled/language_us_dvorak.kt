package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Language_us_dvorak: ImageVector
    get() {
        if (_Language_us_dvorak != null) return _Language_us_dvorak!!
        
        _Language_us_dvorak = ImageVector.Builder(
            name = "language_us_dvorak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 600f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(250f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(320f)
                lineToRelative(-40f, 40f)
                horizontalLineTo(160f)
                close()
                moveToRelative(465f, 0f)
                lineTo(490f, 280f)
                horizontalLineToRelative(80f)
                lineToRelative(95f, 278f)
                lineToRelative(95f, -278f)
                horizontalLineToRelative(80f)
                lineTo(705f, 680f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Language_us_dvorak!!
    }

private var _Language_us_dvorak: ImageVector? = null

