package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Speed_0_5x: ImageVector
    get() {
        if (_Speed_0_5x != null) return _Speed_0_5x!!
        
        _Speed_0_5x = ImageVector.Builder(
            name = "speed_0_5x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(400f, 0f)
                lineToRelative(120f, -200f)
                lineToRelative(-120f, -200f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 133f)
                lineToRelative(80f, -133f)
                horizontalLineToRelative(80f)
                lineTo(720f, 480f)
                lineToRelative(120f, 200f)
                horizontalLineToRelative(-80f)
                lineToRelative(-80f, -133f)
                lineToRelative(-80f, 133f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-280f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 520f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 680f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Speed_0_5x!!
    }

private var _Speed_0_5x: ImageVector? = null

