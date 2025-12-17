package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.View_comfy_alt: ImageVector
    get() {
        if (_View_comfy_alt != null) return _View_comfy_alt!!
        
        _View_comfy_alt = ImageVector.Builder(
            name = "view_comfy_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(400f, -400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(560f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(160f)
                close()
                moveTo(560f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                horizontalLineTo(560f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(160f)
                close()
                moveTo(320f, 320f)
                close()
                moveToRelative(0f, 320f)
                close()
                moveToRelative(320f, -320f)
                close()
                moveToRelative(0f, 320f)
                close()
            }
        }.build()
        
        return _View_comfy_alt!!
    }

private var _View_comfy_alt: ImageVector? = null

