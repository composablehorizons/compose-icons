package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Seedling: ImageVector
    get() {
        if (_Seedling != null) return _Seedling!!
        
        _Seedling = ImageVector.Builder(
            name = "seedling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(64f, 96f)
                horizontalLineTo(0f)
                curveToRelative(0f, 123.7f, 100.3f, 224f, 224f, 224f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                curveTo(288f, 196.3f, 187.7f, 96f, 64f, 96f)
                close()
                moveToRelative(384f, -64f)
                curveToRelative(-84.2f, 0f, -157.4f, 46.5f, -195.7f, 115.2f)
                curveToRelative(27.7f, 30.2f, 48.2f, 66.9f, 59f, 107.6f)
                curveTo(424f, 243.1f, 512f, 147.9f, 512f, 32f)
                horizontalLineToRelative(-64f)
                close()
            }
        }.build()
        
        return _Seedling!!
    }

private var _Seedling: ImageVector? = null

