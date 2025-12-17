package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bicycle: ImageVector
    get() {
        if (_Bicycle != null) return _Bicycle!!
        
        _Bicycle = ImageVector.Builder(
            name = "bicycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(4.14f)
                lineToRelative(0.386f, -1.158f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 4f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-0.64f)
                lineToRelative(-0.311f, 0.935f)
                lineToRelative(0.807f, 1.29f)
                arcToRelative(3f, 3f, 0f, true, true, -0.848f, 0.53f)
                lineToRelative(-0.508f, -0.812f)
                lineToRelative(-2.076f, 3.322f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 10.5f)
                horizontalLineTo(5.959f)
                arcToRelative(3f, 3f, 0f, true, true, -1.815f, -3.274f)
                lineTo(5f, 5.856f)
                verticalLineTo(5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(1.5f, 2.443f)
                lineToRelative(-0.508f, 0.814f)
                curveToRelative(0.5f, 0.444f, 0.85f, 1.054f, 0.967f, 1.743f)
                horizontalLineToRelative(1.139f)
                close()
                moveTo(8f, 9.057f)
                lineTo(9.598f, 6.5f)
                horizontalLineTo(6.402f)
                close()
                moveTo(4.937f, 9.5f)
                arcToRelative(2f, 2f, 0f, false, false, -0.487f, -0.877f)
                lineToRelative(-0.548f, 0.877f)
                close()
                moveTo(3.603f, 8.092f)
                arcTo(2f, 2f, 0f, true, false, 4.937f, 10.5f)
                horizontalLineTo(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.424f, -0.765f)
                close()
                moveToRelative(7.947f, 0.53f)
                arcToRelative(2f, 2f, 0f, true, false, 0.848f, -0.53f)
                lineToRelative(1.026f, 1.643f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.848f, 0.53f)
                close()
            }
        }.build()
        
        return _Bicycle!!
    }

private var _Bicycle: ImageVector? = null

