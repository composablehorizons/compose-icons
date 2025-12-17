package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stack_star: ImageVector
    get() {
        if (_Stack_star != null) return _Stack_star!!
        
        _Stack_star = ImageVector.Builder(
            name = "stack_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(509f, 740f)
                lineToRelative(91f, -55f)
                lineToRelative(91f, 55f)
                lineToRelative(-24f, -104f)
                lineToRelative(80f, -69f)
                lineToRelative(-105f, -9f)
                lineToRelative(-42f, -98f)
                lineToRelative(-42f, 98f)
                lineToRelative(-105f, 9f)
                lineToRelative(80f, 69f)
                lineToRelative(-24f, 104f)
                close()
                moveTo(240f, 560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(80f, 320f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Stack_star!!
    }

private var _Stack_star: ImageVector? = null

