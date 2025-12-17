package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Keep_off: ImageVector
    get() {
        if (_Keep_off != null) return _Keep_off!!
        
        _Keep_off = ImageVector.Builder(
            name = "keep_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 120f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(327f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-247f)
                horizontalLineTo(400f)
                verticalLineToRelative(87f)
                lineToRelative(-87f, -87f)
                lineToRelative(-33f, -33f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(400f)
                close()
                moveTo(480f, 920f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-46f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-58f, 56f)
                lineToRelative(-264f, -264f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(240f)
                lineToRelative(-40f, 40f)
                close()
                moveTo(354f, 560f)
                horizontalLineToRelative(92f)
                lineToRelative(-44f, -44f)
                lineToRelative(-2f, -2f)
                lineToRelative(-46f, 46f)
                close()
                moveToRelative(126f, -193f)
                close()
                moveToRelative(-78f, 149f)
                close()
            }
        }.build()
        
        return _Keep_off!!
    }

private var _Keep_off: ImageVector? = null

