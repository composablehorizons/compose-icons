package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Arrows_input: ImageVector
    get() {
        if (_Arrows_input != null) return _Arrows_input!!
        
        _Arrows_input = ImageVector.Builder(
            name = "arrows_input",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(156f, 860f)
                lineToRelative(-56f, -56f)
                lineToRelative(124f, -124f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(156f, 860f)
                close()
                moveToRelative(648f, 0f)
                lineTo(680f, 736f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(736f)
                lineToRelative(124f, 124f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(120f, 360f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(104f)
                lineTo(100f, 156f)
                lineToRelative(56f, -56f)
                lineToRelative(124f, 124f)
                verticalLineToRelative(-104f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(104f)
                lineToRelative(124f, -124f)
                lineToRelative(56f, 56f)
                lineToRelative(-124f, 124f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveTo(480f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Arrows_input!!
    }

private var _Arrows_input: ImageVector? = null

