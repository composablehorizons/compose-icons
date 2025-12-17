package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Speed_0_2x: ImageVector
    get() {
        if (_Speed_0_2x != null) return _Speed_0_2x!!
        
        _Speed_0_2x = ImageVector.Builder(
            name = "speed_0_2x",
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
                moveToRelative(120f, 0f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(480f, 360f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(400f, 520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, 0f)
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
            }
        }.build()
        
        return _Speed_0_2x!!
    }

private var _Speed_0_2x: ImageVector? = null

