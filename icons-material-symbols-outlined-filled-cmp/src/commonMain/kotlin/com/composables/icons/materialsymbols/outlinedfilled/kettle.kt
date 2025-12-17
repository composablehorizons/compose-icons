package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Kettle: ImageVector
    get() {
        if (_Kettle != null) return _Kettle!!
        
        _Kettle = ImageVector.Builder(
            name = "kettle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                verticalLineToRelative(-520f)
                lineTo(120f, 80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 560f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(240f)
                close()
                moveToRelative(480f, -280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                close()
                moveTo(480f, 640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-440f)
                horizontalLineTo(480f)
                verticalLineToRelative(440f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Kettle!!
    }

private var _Kettle: ImageVector? = null

