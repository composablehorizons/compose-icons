package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Lab_panel: ImageVector
    get() {
        if (_Lab_panel != null) return _Lab_panel!!
        
        _Lab_panel = ImageVector.Builder(
            name = "lab_panel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 840f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-171f)
                horizontalLineTo(80f)
                verticalLineToRelative(-189f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(189f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(171f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-171f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-189f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(189f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(171f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineTo(40f)
                close()
                moveToRelative(600f, -360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineTo(640f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-440f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Lab_panel!!
    }

private var _Lab_panel: ImageVector? = null

