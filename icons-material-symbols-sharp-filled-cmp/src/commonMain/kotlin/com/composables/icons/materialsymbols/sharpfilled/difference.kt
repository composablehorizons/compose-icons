package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Difference: ImageVector
    get() {
        if (_Difference != null) return _Difference!!
        
        _Difference = ImageVector.Builder(
            name = "difference",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, 160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(420f)
                verticalLineToRelative(80f)
                close()
                moveTo(240f, 760f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(360f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 920f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Difference!!
    }

private var _Difference: ImageVector? = null

