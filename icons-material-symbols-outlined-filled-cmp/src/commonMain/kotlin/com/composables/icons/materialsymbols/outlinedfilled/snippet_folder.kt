package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Snippet_folder: ImageVector
    get() {
        if (_Snippet_folder != null) return _Snippet_folder!!
        
        _Snippet_folder = ImageVector.Builder(
            name = "snippet_folder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(420f, -180f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(55f)
                lineToRelative(65f, 65f)
                verticalLineToRelative(135f)
                horizontalLineTo(580f)
                close()
                moveToRelative(-60f, 60f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-220f)
                lineTo(660f, 360f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Snippet_folder!!
    }

private var _Snippet_folder: ImageVector? = null

