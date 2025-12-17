package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.View_week: ImageVector
    get() {
        if (_View_week != null) return _View_week!!
        
        _View_week = ImageVector.Builder(
            name = "view_week",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                horizontalLineTo(400f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-480f)
                horizontalLineTo(640f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(240f, 80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _View_week!!
    }

private var _View_week: ImageVector? = null

