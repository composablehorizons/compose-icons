package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Equalizer: ImageVector
    get() {
        if (_Equalizer != null) return _Equalizer!!
        
        _Equalizer = ImageVector.Builder(
            name = "equalizer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(320f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(640f)
                horizontalLineTo(400f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Equalizer!!
    }

private var _Equalizer: ImageVector? = null

