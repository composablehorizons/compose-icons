package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_cellular_no_sim: ImageVector
    get() {
        if (_Signal_cellular_no_sim != null) return _Signal_cellular_no_sim!!
        
        _Signal_cellular_no_sim = ImageVector.Builder(
            name = "signal_cellular_no_sim",
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
                moveTo(19f, 5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6.17f)
                curveToRelative(-0.53f, 0f, -1.04f, 0.21f, -1.42f, 0.59f)
                lineTo(7.95f, 5.06f)
                lineTo(19f, 16.11f)
                verticalLineTo(5f)
                close()
                moveTo(3.09f, 4.44f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(5f, 7.78f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.11f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(11.23f)
                lineToRelative(0.91f, 0.91f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(4.5f, 4.44f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                close()
            }
        }.build()
        
        return _Signal_cellular_no_sim!!
    }

private var _Signal_cellular_no_sim: ImageVector? = null

