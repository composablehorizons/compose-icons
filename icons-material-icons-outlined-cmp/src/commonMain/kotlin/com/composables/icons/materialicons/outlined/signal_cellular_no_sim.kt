package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Signal_cellular_no_sim: ImageVector
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
                moveTo(10.83f, 5f)
                horizontalLineTo(17f)
                verticalLineToRelative(9.11f)
                lineToRelative(2f, 2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-7f)
                lineTo(7.94f, 5.06f)
                lineToRelative(1.42f, 1.42f)
                lineTo(10.83f, 5f)
                close()
                moveToRelative(10.43f, 16.21f)
                lineTo(3.79f, 3.74f)
                lineTo(2.38f, 5.15f)
                lineTo(5f, 7.77f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.11f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(11.23f)
                lineToRelative(1.62f, 1.62f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(7f, 19f)
                verticalLineTo(9.79f)
                lineTo(16.23f, 19f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Signal_cellular_no_sim!!
    }

private var _Signal_cellular_no_sim: ImageVector? = null

