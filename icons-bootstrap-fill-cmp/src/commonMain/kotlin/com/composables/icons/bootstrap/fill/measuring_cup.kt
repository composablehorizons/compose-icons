package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.MeasuringCup: ImageVector
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
                moveTo(14f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5.959f)
                arcToRelative(1.041f, 1.041f, 0f, false, true, -2.049f, 0.264f)
                lineToRelative(-0.02f, -0.093f)
                lineToRelative(-0.849f, -5.096f)
                arcToRelative(0.041f, 0.041f, 0f, false, false, -0.082f, 0.007f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(3.742f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -0.732f, -1.767f)
                lineTo(0.146f, 0.854f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 0f)
                close()
                moveTo(4f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, -2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, -2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, -2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, -2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(0f, -2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
        }.build()
        
        return _MeasuringCup!!
    }

private var _MeasuringCup: ImageVector? = null

