package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Emergency: ImageVector
    get() {
        if (_Emergency != null) return _Emergency!!
        
        _Emergency = ImageVector.Builder(
            name = "emergency",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.29f, 8.37f)
                lineToRelative(-1f, -1.73f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f)
                lineTo(14f, 8.54f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.54f)
                lineTo(6.07f, 6.27f)
                curveTo(5.59f, 5.99f, 4.98f, 6.16f, 4.71f, 6.63f)
                lineToRelative(-1f, 1.73f)
                curveTo(3.43f, 8.84f, 3.59f, 9.46f, 4.07f, 9.73f)
                lineTo(8f, 12f)
                lineToRelative(-3.93f, 2.27f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f)
                lineToRelative(1f, 1.73f)
                curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f)
                lineTo(10f, 15.46f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.54f)
                lineToRelative(3.93f, 2.27f)
                curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f)
                lineToRelative(1f, -1.73f)
                curveToRelative(0.28f, -0.48f, 0.11f, -1.09f, -0.37f, -1.37f)
                lineTo(16f, 12f)
                lineToRelative(3.93f, -2.27f)
                curveTo(20.41f, 9.46f, 20.57f, 8.84f, 20.29f, 8.37f)
                close()
            }
        }.build()
        
        return _Emergency!!
    }

private var _Emergency: ImageVector? = null

