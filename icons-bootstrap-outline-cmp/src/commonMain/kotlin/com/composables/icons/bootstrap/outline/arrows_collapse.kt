package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowsCollapse: ImageVector
    get() {
        if (_ArrowsCollapse != null) return _ArrowsCollapse!!
        
        _ArrowsCollapse = ImageVector.Builder(
            name = "arrows-collapse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-13f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 8f)
                moveToRelative(7f, -8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.793f)
                lineToRelative(1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineToRelative(-2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(7.5f, 4.293f)
                verticalLineTo(0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 0f)
                moveToRelative(-0.5f, 11.707f)
                lineToRelative(-1.146f, 1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(2f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 11.707f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                close()
            }
        }.build()
        
        return _ArrowsCollapse!!
    }

private var _ArrowsCollapse: ImageVector? = null

