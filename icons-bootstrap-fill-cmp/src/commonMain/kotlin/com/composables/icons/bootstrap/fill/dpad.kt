package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Dpad: ImageVector
    get() {
        if (_Dpad != null) return _Dpad!!
        
        _Dpad = ImageVector.Builder(
            name = "dpad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5f, 1.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 6.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 11f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6.5f, 16f)
                horizontalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16f, 9.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.5f, 0f)
                close()
                moveToRelative(1.288f, 2.34f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.424f, 0f)
                lineToRelative(0.799f, 1.278f)
                arcTo(0.25f, 0.25f, 0f, false, true, 8.799f, 4f)
                horizontalLineTo(7.201f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.212f, -0.382f)
                close()
                moveToRelative(0f, 11.32f)
                lineToRelative(-0.799f, -1.277f)
                arcTo(0.25f, 0.25f, 0f, false, true, 7.201f, 12f)
                horizontalLineTo(8.8f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.212f, 0.383f)
                lineToRelative(-0.799f, 1.278f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.424f, 0f)
                close()
                moveToRelative(-4.17f, -4.65f)
                lineToRelative(-1.279f, -0.798f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0f, -0.424f)
                lineToRelative(1.279f, -0.799f)
                arcTo(0.25f, 0.25f, 0f, false, true, 4f, 7.201f)
                verticalLineTo(8.8f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.382f, 0.212f)
                close()
                moveToRelative(10.043f, -0.798f)
                lineToRelative(-1.278f, 0.799f)
                arcTo(0.25f, 0.25f, 0f, false, true, 12f, 8.799f)
                verticalLineTo(7.2f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.383f, -0.212f)
                lineToRelative(1.278f, 0.799f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0f, 0.424f)
                close()
            }
        }.build()
        
        return _Dpad!!
    }

private var _Dpad: ImageVector? = null

