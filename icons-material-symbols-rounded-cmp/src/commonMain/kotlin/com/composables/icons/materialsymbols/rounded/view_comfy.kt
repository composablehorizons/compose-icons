package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.View_comfy: ImageVector
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
                moveTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                close()
                moveToRelative(720f, -280f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(640f)
                close()
                moveTo(400f, 720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-200f)
                horizontalLineTo(400f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-240f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _View_comfy!!
    }

private var _View_comfy: ImageVector? = null

