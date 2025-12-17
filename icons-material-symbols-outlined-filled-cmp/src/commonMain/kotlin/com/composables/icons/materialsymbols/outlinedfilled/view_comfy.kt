package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.View_comfy: ImageVector
    get() {
        if (_View_comfy != null) return _View_comfy!!
        
        _View_comfy = ImageVector.Builder(
            name = "view_comfy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 440f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, 360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(280f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-320f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(280f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _View_comfy!!
    }

private var _View_comfy: ImageVector? = null

