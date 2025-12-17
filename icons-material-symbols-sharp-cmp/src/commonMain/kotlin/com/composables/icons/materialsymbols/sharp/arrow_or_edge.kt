package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Arrow_or_edge: ImageVector
    get() {
        if (_Arrow_or_edge != null) return _Arrow_or_edge!!
        
        _Arrow_or_edge = ImageVector.Builder(
            name = "arrow_or_edge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 840f)
                lineTo(140f, 680f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 63f)
                verticalLineToRelative(-247f)
                horizontalLineTo(40f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(327f)
                lineToRelative(63f, -63f)
                lineToRelative(57f, 56f)
                lineToRelative(-160f, 160f)
                close()
                moveToRelative(360f, 0f)
                lineTo(500f, 680f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 63f)
                verticalLineToRelative(-327f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineTo(700f)
                verticalLineToRelative(248f)
                lineToRelative(63f, -64f)
                lineToRelative(57f, 56f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _Arrow_or_edge!!
    }

private var _Arrow_or_edge: ImageVector? = null

