package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Pills: ImageVector
    get() {
        if (_Pills != null) return _Pills!!
        
        _Pills = ImageVector.Builder(
            name = "pills",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(112f, 32f)
                curveTo(50.1f, 32f, 0f, 82.1f, 0f, 144f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 61.9f, 50.1f, 112f, 112f, 112f)
                reflectiveCurveToRelative(112f, -50.1f, 112f, -112f)
                verticalLineTo(144f)
                curveToRelative(0f, -61.9f, -50.1f, -112f, -112f, -112f)
                close()
                moveToRelative(48f, 224f)
                horizontalLineTo(64f)
                verticalLineTo(144f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                reflectiveCurveToRelative(48f, 21.5f, 48f, 48f)
                verticalLineToRelative(112f)
                close()
                moveToRelative(139.7f, -29.7f)
                curveToRelative(-3.5f, -3.5f, -9.4f, -3.1f, -12.3f, 0.8f)
                curveToRelative(-45.3f, 62.5f, -40.4f, 150.1f, 15.9f, 206.4f)
                curveToRelative(56.3f, 56.3f, 143.9f, 61.2f, 206.4f, 15.9f)
                curveToRelative(4f, -2.9f, 4.3f, -8.8f, 0.8f, -12.3f)
                lineTo(299.7f, 226.3f)
                close()
                moveToRelative(229.8f, -19f)
                curveToRelative(-56.3f, -56.3f, -143.9f, -61.2f, -206.4f, -15.9f)
                curveToRelative(-4f, 2.9f, -4.3f, 8.8f, -0.8f, 12.3f)
                lineToRelative(210.8f, 210.8f)
                curveToRelative(3.5f, 3.5f, 9.4f, 3.1f, 12.3f, -0.8f)
                curveToRelative(45.3f, -62.6f, 40.5f, -150.1f, -15.9f, -206.4f)
                close()
            }
        }.build()
        
        return _Pills!!
    }

private var _Pills: ImageVector? = null

