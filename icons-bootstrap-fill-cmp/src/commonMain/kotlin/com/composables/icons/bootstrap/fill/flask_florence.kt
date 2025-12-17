package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.FlaskFlorence: ImageVector
    get() {
        if (_FlaskFlorence != null) return _FlaskFlorence!!
        
        _FlaskFlorence = ImageVector.Builder(
            name = "flask-florence",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 0f)
                lineToRelative(0.1f, 0.01f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.1f, 0.99f)
                horizontalLineTo(10f)
                verticalLineToRelative(5.417f)
                curveToRelative(0.517f, 0.226f, 0.986f, 0.538f, 1.394f, 0.916f)
                lineToRelative(0.043f, 0.038f)
                lineToRelative(0.14f, 0.14f)
                arcToRelative(6f, 6f, 0f, false, true, 0.303f, 0.34f)
                lineToRelative(0.101f, 0.128f)
                quadToRelative(0.045f, 0.06f, 0.088f, 0.122f)
                arcToRelative(5f, 5f, 0f, false, true, 0.26f, 0.4f)
                lineToRelative(0.066f, 0.12f)
                arcToRelative(5f, 5f, 0f, false, true, 0.16f, 0.32f)
                quadToRelative(0.029f, 0.062f, 0.053f, 0.124f)
                quadToRelative(0.035f, 0.08f, 0.067f, 0.163f)
                quadToRelative(0.115f, 0.3f, 0.19f, 0.62f)
                lineToRelative(0.024f, 0.111f)
                arcToRelative(5f, 5f, 0f, false, true, 0.096f, 0.68f)
                quadTo(13f, 10.82f, 13f, 11f)
                lineToRelative(-0.007f, 0.257f)
                arcTo(5f, 5f, 0f, false, true, 8f, 16f)
                lineToRelative(-0.257f, -0.007f)
                arcTo(5f, 5f, 0f, false, true, 6f, 6.417f)
                verticalLineTo(1f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                close()
                moveTo(8f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.065f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 6.756f)
                verticalLineTo(6f)
                close()
                moveToRelative(0f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                close()
                moveToRelative(0f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _FlaskFlorence!!
    }

private var _FlaskFlorence: ImageVector? = null

