package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Language_us_colemak: ImageVector
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
                moveToRelative(-340f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 280f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(340f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(500f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(580f, 280f)
                horizontalLineToRelative(140f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 680f)
                horizontalLineTo(580f)
                close()
            }
        }.build()
        
        return _Language_us_colemak!!
    }

private var _Language_us_colemak: ImageVector? = null

