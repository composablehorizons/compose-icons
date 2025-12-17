package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Speed_1_2x: ImageVector
    get() {
        if (_Speed_1_2x != null) return _Speed_1_2x!!
        
        _Speed_1_2x = ImageVector.Builder(
            name = "speed_1_2x",
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
                moveToRelative(120f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(220f)
                verticalLineToRelative(240f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(-240f, 0f)
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
            }
        }.build()
        
        return _Speed_1_2x!!
    }

private var _Speed_1_2x: ImageVector? = null

