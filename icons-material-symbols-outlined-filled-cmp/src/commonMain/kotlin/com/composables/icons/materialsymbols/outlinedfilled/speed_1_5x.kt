package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Speed_1_5x: ImageVector
    get() {
        if (_Speed_1_5x != null) return _Speed_1_5x!!
        
        _Speed_1_5x = ImageVector.Builder(
            name = "speed_1_5x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-120f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(500f, 0f)
                lineToRelative(120f, -200f)
                lineToRelative(-120f, -200f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 133f)
                lineToRelative(80f, -133f)
                horizontalLineToRelative(80f)
                lineTo(820f, 480f)
                lineToRelative(120f, 200f)
                horizontalLineToRelative(-80f)
                lineToRelative(-80f, -133f)
                lineToRelative(-80f, 133f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-260f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(580f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(500f, 680f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Speed_1_5x!!
    }

private var _Speed_1_5x: ImageVector? = null

