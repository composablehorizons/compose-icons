package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BarsArrowUp: ImageVector
    get() {
        if (_BarsArrowUp != null) return _BarsArrowUp!!
        
        _BarsArrowUp = ImageVector.Builder(
            name = "bars-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 3f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 3.75f)
                close()
                moveTo(2f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(6.365f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 7.5f)
                close()
                moveTo(14f, 7f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.55f, 0.24f)
                lineToRelative(3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.1f, 1.02f)
                lineToRelative(-1.95f, -2.1f)
                verticalLineToRelative(6.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(9.66f)
                lineToRelative(-1.95f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.1f, -1.02f)
                lineToRelative(3.25f, -3.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 14f, 7f)
                close()
                moveTo(2f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(7f)
                arcTo(0.75f, 0.75f, 0f, false, true, 7f, 12f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _BarsArrowUp!!
    }

private var _BarsArrowUp: ImageVector? = null

