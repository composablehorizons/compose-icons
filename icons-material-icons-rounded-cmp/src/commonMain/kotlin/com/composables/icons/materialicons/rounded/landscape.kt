package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Landscape: ImageVector
    get() {
        if (_Landscape != null) return _Landscape!!
        
        _Landscape = ImageVector.Builder(
            name = "landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.2f, 7.07f)
                lineTo(10.25f, 11f)
                lineToRelative(2.25f, 3f)
                curveToRelative(0.33f, 0.44f, 0.24f, 1.07f, -0.2f, 1.4f)
                curveToRelative(-0.44f, 0.33f, -1.07f, 0.25f, -1.4f, -0.2f)
                curveToRelative(-1.05f, -1.4f, -2.31f, -3.07f, -3.1f, -4.14f)
                curveToRelative(-0.4f, -0.53f, -1.2f, -0.53f, -1.6f, 0f)
                lineToRelative(-4f, 5.33f)
                curveToRelative(-0.49f, 0.67f, -0.02f, 1.61f, 0.8f, 1.61f)
                horizontalLineToRelative(18f)
                curveToRelative(0.82f, 0f, 1.29f, -0.94f, 0.8f, -1.6f)
                lineToRelative(-7f, -9.33f)
                curveToRelative(-0.4f, -0.54f, -1.2f, -0.54f, -1.6f, 0f)
                close()
            }
        }.build()
        
        return _Landscape!!
    }

private var _Landscape: ImageVector? = null

