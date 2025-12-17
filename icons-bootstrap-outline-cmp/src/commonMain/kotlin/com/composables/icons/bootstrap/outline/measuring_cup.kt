package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MeasuringCup: ImageVector
    get() {
        if (_MeasuringCup != null) return _MeasuringCup!!
        
        _MeasuringCup = ImageVector.Builder(
            name = "measuring-cup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.038f, 0.309f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 0f)
                horizontalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5.959f)
                arcToRelative(1.041f, 1.041f, 0f, false, true, -2.069f, 0.17f)
                lineToRelative(-0.849f, -5.094f)
                arcTo(0.041f, 0.041f, 0f, false, false, 13f, 3.04f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3.743f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.732f, -1.768f)
                lineTo(0.146f, 0.854f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.038f, 0.309f)
                moveTo(1.708f, 1f)
                lineToRelative(0.267f, 0.268f)
                arcTo(3.5f, 3.5f, 0f, false, true, 3f, 3.743f)
                verticalLineTo(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3.041f)
                arcToRelative(1.041f, 1.041f, 0f, false, true, 2.069f, -0.17f)
                lineToRelative(0.849f, 5.094f)
                arcTo(0.041f, 0.041f, 0f, false, false, 15f, 7.96f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveTo(4f, 3f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(4f)
                close()
                moveToRelative(0f, 2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _MeasuringCup!!
    }

private var _MeasuringCup: ImageVector? = null

