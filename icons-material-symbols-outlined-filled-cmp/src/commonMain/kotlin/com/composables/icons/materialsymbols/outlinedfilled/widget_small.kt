package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Widget_small: ImageVector
    get() {
        if (_Widget_small != null) return _Widget_small!!
        
        _Widget_small = ImageVector.Builder(
            name = "widget_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(360f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(640f)
                close()
                moveTo(80f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(360f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(640f)
                close()
                moveTo(80f, 320f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(360f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Widget_small!!
    }

private var _Widget_small: ImageVector? = null

