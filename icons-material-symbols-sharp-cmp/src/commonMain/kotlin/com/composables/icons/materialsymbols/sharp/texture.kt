package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Texture: ImageVector
    get() {
        if (_Texture != null) return _Texture!!
        
        _Texture = ImageVector.Builder(
            name = "texture",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(123f, 837f)
                verticalLineToRelative(-56f)
                lineToRelative(658f, -658f)
                horizontalLineToRelative(57f)
                verticalLineToRelative(56f)
                lineTo(179f, 837f)
                horizontalLineToRelative(-56f)
                close()
                moveToRelative(-3f, -249f)
                verticalLineToRelative(-112f)
                lineToRelative(356f, -356f)
                horizontalLineToRelative(112f)
                lineTo(120f, 588f)
                close()
                moveToRelative(0f, -308f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                lineTo(120f, 280f)
                close()
                moveToRelative(560f, 560f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(160f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-308f, 0f)
                lineToRelative(468f, -468f)
                verticalLineToRelative(112f)
                lineTo(484f, 840f)
                horizontalLineTo(372f)
                close()
            }
        }.build()
        
        return _Texture!!
    }

private var _Texture: ImageVector? = null

