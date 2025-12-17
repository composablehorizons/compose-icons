package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Mouse3: ImageVector
    get() {
        if (_Mouse3 != null) return _Mouse3!!
        
        _Mouse3 = ImageVector.Builder(
            name = "mouse3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 0.069f)
                arcTo(15f, 15f, 0f, false, false, 7f, 0f)
                quadToRelative(-0.891f, 0.002f, -1.527f, 0.463f)
                curveToRelative(-0.418f, 0.302f, -0.717f, 0.726f, -0.93f, 1.208f)
                curveToRelative(-0.386f, 0.873f, -0.522f, 2.01f, -0.54f, 3.206f)
                lineToRelative(4.497f, 1f)
                close()
                moveTo(3.71f, 5.836f)
                lineTo(3.381f, 6f)
                arcTo(2.5f, 2.5f, 0f, false, false, 2f, 8.236f)
                verticalLineToRelative(2.576f)
                curveTo(2f, 13.659f, 4.22f, 16f, 7f, 16f)
                horizontalLineToRelative(2f)
                curveToRelative(2.78f, 0f, 5f, -2.342f, 5f, -5.188f)
                verticalLineTo(8.123f)
                lineToRelative(-9f, -2f)
                verticalLineToRelative(0.003f)
                lineToRelative(0.008f, 0.353f)
                curveToRelative(0.007f, 0.3f, 0.023f, 0.715f, 0.053f, 1.175f)
                curveToRelative(0.063f, 0.937f, 0.186f, 2.005f, 0.413f, 2.688f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.948f, 0.316f)
                curveToRelative(-0.273f, -0.817f, -0.4f, -2f, -0.462f, -2.937f)
                arcTo(30f, 30f, 0f, false, true, 4f, 6.003f)
                quadToRelative(0f, -0.05f, 0.01f, -0.1f)
                close()
                moveTo(14f, 7.1f)
                verticalLineTo(5.187f)
                curveToRelative(0f, -1.13f, -0.272f, -2.044f, -0.748f, -2.772f)
                curveToRelative(-0.474f, -0.726f, -1.13f, -1.235f, -1.849f, -1.59f)
                arcTo(7.5f, 7.5f, 0f, false, false, 9.5f, 0.212f)
                verticalLineToRelative(5.887f)
                lineToRelative(4.5f, 1f)
                close()
            }
        }.build()
        
        return _Mouse3!!
    }

private var _Mouse3: ImageVector? = null

