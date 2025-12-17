package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Square2Stack: ImageVector
    get() {
        if (_Square2Stack != null) return _Square2Stack!!
        
        _Square2Stack = ImageVector.Builder(
            name = "square-2-stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.25f, 2f)
                horizontalLineToRelative(6.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 13f, 4.25f)
                verticalLineTo(5.5f)
                horizontalLineTo(9.25f)
                arcTo(3.75f, 3.75f, 0f, false, false, 5.5f, 9.25f)
                verticalLineTo(13f)
                horizontalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 10.75f)
                verticalLineToRelative(-6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.25f, 7f)
                arcTo(2.25f, 2.25f, 0f, false, false, 7f, 9.25f)
                verticalLineToRelative(6.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9.25f, 18f)
                horizontalLineToRelative(6.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 15.75f)
                verticalLineToRelative(-6.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15.75f, 7f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }.build()
        
        return _Square2Stack!!
    }

private var _Square2Stack: ImageVector? = null

