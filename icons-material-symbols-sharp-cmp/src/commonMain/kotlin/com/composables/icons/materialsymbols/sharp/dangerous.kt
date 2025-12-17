package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Dangerous: ImageVector
    get() {
        if (_Dangerous != null) return _Dangerous!!
        
        _Dangerous = ImageVector.Builder(
            name = "dangerous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(330f, 840f)
                lineTo(120f, 630f)
                verticalLineToRelative(-300f)
                lineToRelative(210f, -210f)
                horizontalLineToRelative(300f)
                lineToRelative(210f, 210f)
                verticalLineToRelative(300f)
                lineTo(630f, 840f)
                horizontalLineTo(330f)
                close()
                moveToRelative(36f, -190f)
                lineToRelative(114f, -114f)
                lineToRelative(114f, 114f)
                lineToRelative(56f, -56f)
                lineToRelative(-114f, -114f)
                lineToRelative(114f, -114f)
                lineToRelative(-56f, -56f)
                lineToRelative(-114f, 114f)
                lineToRelative(-114f, -114f)
                lineToRelative(-56f, 56f)
                lineToRelative(114f, 114f)
                lineToRelative(-114f, 114f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(-2f, 110f)
                horizontalLineToRelative(232f)
                lineToRelative(164f, -164f)
                verticalLineToRelative(-232f)
                lineTo(596f, 200f)
                horizontalLineTo(364f)
                lineTo(200f, 364f)
                verticalLineToRelative(232f)
                lineToRelative(164f, 164f)
                close()
                moveToRelative(116f, -280f)
                close()
            }
        }.build()
        
        return _Dangerous!!
    }

private var _Dangerous: ImageVector? = null

