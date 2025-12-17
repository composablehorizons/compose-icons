package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Compass_calibration: ImageVector
    get() {
        if (_Compass_calibration != null) return _Compass_calibration!!
        
        _Compass_calibration = ImageVector.Builder(
            name = "compass_calibration",
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
                moveTo(16f, 17f)
                arcTo(4f, 4f, 0f, false, true, 12f, 21f)
                arcTo(4f, 4f, 0f, false, true, 8f, 17f)
                arcTo(4f, 4f, 0f, false, true, 16f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveTo(8.49f, 3f, 5.28f, 4.29f, 2.8f, 6.41f)
                curveToRelative(-0.44f, 0.38f, -0.48f, 1.06f, -0.06f, 1.48f)
                lineToRelative(3.6f, 3.6f)
                curveToRelative(0.36f, 0.36f, 0.92f, 0.39f, 1.32f, 0.08f)
                curveToRelative(1.2f, -0.94f, 2.71f, -1.5f, 4.34f, -1.5f)
                curveToRelative(1.64f, 0f, 3.14f, 0.56f, 4.34f, 1.49f)
                curveToRelative(0.4f, 0.31f, 0.96f, 0.28f, 1.31f, -0.08f)
                lineToRelative(3.6f, -3.6f)
                curveToRelative(0.42f, -0.42f, 0.38f, -1.1f, -0.07f, -1.48f)
                curveTo(18.72f, 4.28f, 15.51f, 3f, 12f, 3f)
                close()
            }
        }.build()
        
        return _Compass_calibration!!
    }

private var _Compass_calibration: ImageVector? = null

