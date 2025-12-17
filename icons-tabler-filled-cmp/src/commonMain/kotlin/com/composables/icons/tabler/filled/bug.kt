package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Bug: ImageVector
    get() {
        if (_Bug != null) return _Bug!!
        
        _Bug = ImageVector.Builder(
            name = "bug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, 3.8f)
                lineToRelative(0.005f, 0.2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.428f, 0.096f)
                lineToRelative(3.033f, -1.938f)
                arcToRelative(1f, 1f, 0f, true, true, 1.078f, 1.684f)
                lineToRelative(-3.015f, 1.931f)
                arcToRelative(7.17f, 7.17f, 0f, false, true, 0.476f, 2.227f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                arcToRelative(6.01f, 6.01f, 0f, false, true, -0.195f, 1.525f)
                lineToRelative(2.708f, 1.616f)
                arcToRelative(1f, 1f, 0f, true, true, -1.026f, 1.718f)
                lineToRelative(-2.514f, -1.501f)
                arcToRelative(6.002f, 6.002f, 0f, false, true, -3.973f, 2.56f)
                verticalLineToRelative(-5.918f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
                verticalLineToRelative(5.917f)
                arcToRelative(6.002f, 6.002f, 0f, false, true, -3.973f, -2.56f)
                lineToRelative(-2.514f, 1.503f)
                arcToRelative(1f, 1f, 0f, true, true, -1.026f, -1.718f)
                lineToRelative(2.708f, -1.616f)
                arcToRelative(6.01f, 6.01f, 0f, false, true, -0.195f, -1.526f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(3.001f)
                verticalLineToRelative(-0.055f)
                arcToRelative(7f, 7f, 0f, false, true, 0.474f, -2.173f)
                lineToRelative(-3.014f, -1.93f)
                arcToRelative(1f, 1f, 0f, true, true, 1.078f, -1.684f)
                lineToRelative(3.032f, 1.939f)
                lineToRelative(0.024f, -0.012f)
                lineToRelative(0.068f, -0.027f)
                lineToRelative(0.019f, -0.005f)
                lineToRelative(0.016f, -0.006f)
                lineToRelative(0.032f, -0.008f)
                lineToRelative(0.04f, -0.013f)
                lineToRelative(0.034f, -0.007f)
                lineToRelative(0.034f, -0.004f)
                lineToRelative(0.045f, -0.008f)
                lineToRelative(0.015f, -0.001f)
                lineToRelative(0.015f, -0.002f)
                lineToRelative(0.087f, -0.004f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                close()
                moveToRelative(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _Bug!!
    }

private var _Bug: ImageVector? = null

