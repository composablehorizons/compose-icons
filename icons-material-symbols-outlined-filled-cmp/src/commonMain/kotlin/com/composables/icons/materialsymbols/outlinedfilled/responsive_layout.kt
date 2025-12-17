package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Responsive_layout: ImageVector
    get() {
        if (_Responsive_layout != null) return _Responsive_layout!!
        
        _Responsive_layout = ImageVector.Builder(
            name = "responsive_layout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 840f)
                verticalLineToRelative(-520f)
                horizontalLineTo(380f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(460f)
                verticalLineToRelative(720f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-260f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(440f)
                horizontalLineTo(380f)
                close()
                moveToRelative(-260f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Responsive_layout!!
    }

private var _Responsive_layout: ImageVector? = null

