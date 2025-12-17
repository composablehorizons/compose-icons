package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Tree: ImageVector
    get() {
        if (_Tree != null) return _Tree!!
        
        _Tree = ImageVector.Builder(
            name = "tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.416f, 0.223f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.832f, 0f)
                lineToRelative(-3f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 5f, 5.5f)
                horizontalLineToRelative(0.098f)
                lineTo(3.076f, 8.735f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3.5f, 9.5f)
                horizontalLineToRelative(0.191f)
                lineToRelative(-1.638f, 3.276f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.447f, 0.724f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.447f, -0.724f)
                lineTo(12.31f, 9.5f)
                horizontalLineToRelative(0.191f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.424f, -0.765f)
                lineTo(10.902f, 5.5f)
                horizontalLineTo(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.416f, -0.777f)
                close()
                moveTo(6.437f, 4.758f)
                arcTo(0.5f, 0.5f, 0f, false, false, 6f, 4.5f)
                horizontalLineToRelative(-0.066f)
                lineTo(8f, 1.401f)
                lineTo(10.066f, 4.5f)
                horizontalLineTo(10f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.424f, 0.765f)
                lineTo(11.598f, 8.5f)
                horizontalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.447f, 0.724f)
                lineTo(12.69f, 12.5f)
                horizontalLineTo(3.309f)
                lineToRelative(1.638f, -3.276f)
                arcTo(0.5f, 0.5f, 0f, false, false, 4.5f, 8.5f)
                horizontalLineToRelative(-0.098f)
                lineToRelative(2.022f, -3.235f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.013f, -0.507f)
            }
        }.build()
        
        return _Tree!!
    }

private var _Tree: ImageVector? = null

