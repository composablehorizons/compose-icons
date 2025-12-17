package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Clouds: ImageVector
    get() {
        if (_Clouds != null) return _Clouds!!
        
        _Clouds = ImageVector.Builder(
            name = "clouds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 7.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -1.456f, 2.272f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.65f, -0.824f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.789f, -2.896f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.627f, -0.421f)
                arcToRelative(3f, 3f, 0f, false, false, -5.22f, -1.625f)
                arcToRelative(5.6f, 5.6f, 0f, false, false, -1.276f, 0.088f)
                arcToRelative(4.002f, 4.002f, 0f, false, true, 7.392f, 0.91f)
                arcTo(2.5f, 2.5f, 0f, false, true, 16f, 7.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 5f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 4.473f, 4f)
                horizontalLineToRelative(0.027f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 5f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, false, true, -0.247f, -5.99f)
                arcTo(4.5f, 4.5f, 0f, false, true, 7f, 5f)
                moveToRelative(3.5f, 4.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -6.89f, -0.873f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.51f, 0.375f)
                arcTo(2f, 2f, 0f, true, false, 3f, 13f)
                horizontalLineToRelative(8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -0.376f, -2.953f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.624f, -0.492f)
                close()
            }
        }.build()
        
        return _Clouds!!
    }

private var _Clouds: ImageVector? = null

