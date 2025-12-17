package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Clouds: ImageVector
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
                moveTo(11.473f, 9f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -8.72f, -0.99f)
                arcTo(3f, 3f, 0f, false, false, 3f, 14f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -0.027f, -5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.544f, 9.772f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -2.225f, -1.676f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, -6.337f, -4.002f)
                arcToRelative(4.002f, 4.002f, 0f, false, true, 7.392f, 0.91f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 1.17f, 4.769f)
                close()
            }
        }.build()
        
        return _Clouds!!
    }

private var _Clouds: ImageVector? = null

