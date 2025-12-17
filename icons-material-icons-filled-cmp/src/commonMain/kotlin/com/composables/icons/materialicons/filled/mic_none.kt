package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Mic_none: ImageVector
    get() {
        if (_Mic_none != null) return _Mic_none!!
        
        _Mic_none = ImageVector.Builder(
            name = "mic_none",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 14f)
                curveToRelative(1.66f, 0f, 2.99f, -1.34f, 2.99f, -3f)
                lineTo(15f, 5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 3.34f, 9f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveToRelative(-1.2f, -9.1f)
                curveToRelative(0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                curveToRelative(0.66f, 0f, 1.2f, 0.54f, 1.2f, 1.2f)
                lineToRelative(-0.01f, 6.2f)
                curveToRelative(0f, 0.66f, -0.53f, 1.2f, -1.19f, 1.2f)
                curveToRelative(-0.66f, 0f, -1.2f, -0.54f, -1.2f, -1.2f)
                verticalLineTo(4.9f)
                close()
                moveToRelative(6.5f, 6.1f)
                curveToRelative(0f, 3f, -2.54f, 5.1f, -5.3f, 5.1f)
                reflectiveCurveTo(6.7f, 14f, 6.7f, 11f)
                horizontalLineTo(5f)
                curveToRelative(0f, 3.41f, 2.72f, 6.23f, 6f, 6.72f)
                verticalLineTo(21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.28f)
                curveToRelative(3.28f, -0.48f, 6f, -3.3f, 6f, -6.72f)
                horizontalLineToRelative(-1.7f)
                close()
            }
        }.build()
        
        return _Mic_none!!
    }

private var _Mic_none: ImageVector? = null

