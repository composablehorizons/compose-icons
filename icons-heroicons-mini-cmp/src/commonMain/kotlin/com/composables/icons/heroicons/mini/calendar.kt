package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Calendar: ImageVector
    get() {
        if (_Calendar != null) return _Calendar!!
        
        _Calendar = ImageVector.Builder(
            name = "calendar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.75f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(4f)
                horizontalLineToRelative(7f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(4f)
                horizontalLineToRelative(0.25f)
                arcTo(2.75f, 2.75f, 0f, false, true, 18f, 6.75f)
                verticalLineToRelative(8.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 15.25f, 18f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0f, false, true, 2f, 15.25f)
                verticalLineToRelative(-8.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 4.75f, 4f)
                horizontalLineTo(5f)
                verticalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5.75f, 2f)
                close()
                moveToRelative(-1f, 5.5f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(4.75f)
                close()
            }
        }.build()
        
        return _Calendar!!
    }

private var _Calendar: ImageVector? = null

