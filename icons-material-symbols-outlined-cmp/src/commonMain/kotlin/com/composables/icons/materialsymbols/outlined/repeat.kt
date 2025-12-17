package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Repeat: ImageVector
    get() {
        if (_Repeat != null) return _Repeat!!
        
        _Repeat = ImageVector.Builder(
            name = "repeat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                lineTo(120f, 720f)
                lineToRelative(160f, -160f)
                lineToRelative(56f, 58f)
                lineToRelative(-62f, 62f)
                horizontalLineToRelative(406f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(274f)
                lineToRelative(62f, 62f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(-80f, -440f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(486f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -58f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -58f)
                lineToRelative(62f, -62f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Repeat!!
    }

private var _Repeat: ImageVector? = null

