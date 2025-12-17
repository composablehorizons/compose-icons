package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.LayerForward: ImageVector
    get() {
        if (_LayerForward != null) return _LayerForward!!
        
        _LayerForward = ImageVector.Builder(
            name = "layer-forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.354f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(1f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineTo(7f, 4.207f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(9f)
                verticalLineTo(4.207f)
                lineToRelative(0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineToRelative(1f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(9.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _LayerForward!!
    }

private var _LayerForward: ImageVector? = null

