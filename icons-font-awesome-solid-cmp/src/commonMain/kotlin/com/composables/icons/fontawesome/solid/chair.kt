package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Chair: ImageVector
    get() {
        if (_Chair != null) return _Chair!!
        
        _Chair = ImageVector.Builder(
            name = "chair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(112f, 128f)
                curveToRelative(0f, -29.5f, 16.2f, -55f, 40f, -68.9f)
                verticalLineTo(256f)
                horizontalLineToRelative(48f)
                verticalLineTo(48f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(208f)
                horizontalLineToRelative(48f)
                verticalLineTo(59.1f)
                curveToRelative(23.8f, 13.9f, 40f, 39.4f, 40f, 68.9f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(48f)
                verticalLineTo(128f)
                curveTo(384f, 57.3f, 326.7f, 0f, 256f, 0f)
                horizontalLineToRelative(-64f)
                curveTo(121.3f, 0f, 64f, 57.3f, 64f, 128f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(48f)
                close()
                moveToRelative(334.3f, 213.9f)
                lineToRelative(-10.7f, -32f)
                curveToRelative(-4.4f, -13.1f, -16.6f, -21.9f, -30.4f, -21.9f)
                horizontalLineTo(42.7f)
                curveToRelative(-13.8f, 0f, -26f, 8.8f, -30.4f, 21.9f)
                lineToRelative(-10.7f, 32f)
                curveTo(-5.2f, 362.6f, 10.2f, 384f, 32f, 384f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(384f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(384f)
                curveToRelative(21.8f, 0f, 37.2f, -21.4f, 30.3f, -42.1f)
                close()
            }
        }.build()
        
        return _Chair!!
    }

private var _Chair: ImageVector? = null

