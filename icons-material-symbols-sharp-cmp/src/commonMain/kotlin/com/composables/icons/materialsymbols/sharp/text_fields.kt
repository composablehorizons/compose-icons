package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Text_fields: ImageVector
    get() {
        if (_Text_fields != null) return _Text_fields!!
        
        _Text_fields = ImageVector.Builder(
            name = "text_fields",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                verticalLineToRelative(-520f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(120f)
                horizontalLineTo(400f)
                verticalLineToRelative(520f)
                horizontalLineTo(280f)
                close()
                moveToRelative(360f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineTo(520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(120f)
                horizontalLineTo(760f)
                verticalLineToRelative(320f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Text_fields!!
    }

private var _Text_fields: ImageVector? = null

