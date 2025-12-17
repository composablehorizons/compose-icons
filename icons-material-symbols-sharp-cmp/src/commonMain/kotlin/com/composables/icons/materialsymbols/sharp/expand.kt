package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Expand: ImageVector
    get() {
        if (_Expand != null) return _Expand!!
        
        _Expand = ImageVector.Builder(
            name = "expand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -120f)
                lineTo(320f, 600f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 62f)
                verticalLineToRelative(-252f)
                lineToRelative(-64f, 62f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -62f)
                verticalLineToRelative(252f)
                lineToRelative(64f, -62f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
                moveTo(160f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Expand!!
    }

private var _Expand: ImageVector? = null

