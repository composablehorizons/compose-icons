package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Language_gb_english: ImageVector
    get() {
        if (_Language_gb_english != null) return _Language_gb_english!!
        
        _Language_gb_english = ImageVector.Builder(
            name = "language_gb_english",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(280f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(120f)
                lineToRelative(-40f, 40f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(120f)
                lineToRelative(-40f, 40f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Language_gb_english!!
    }

private var _Language_gb_english: ImageVector? = null

