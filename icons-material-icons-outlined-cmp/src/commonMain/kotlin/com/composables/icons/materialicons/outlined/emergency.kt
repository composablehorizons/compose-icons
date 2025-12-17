package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Emergency: ImageVector
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
                moveTo(21.29f, 13.9f)
                lineTo(18f, 12f)
                lineToRelative(3.29f, -1.9f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f)
                lineToRelative(-2f, -3.46f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.37f)
                lineTo(15f, 6.8f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveTo(9.45f, 2f, 9f, 2.45f, 9f, 3f)
                verticalLineToRelative(3.8f)
                lineTo(5.71f, 4.9f)
                curveTo(5.23f, 4.63f, 4.62f, 4.79f, 4.34f, 5.27f)
                lineToRelative(-2f, 3.46f)
                curveTo(2.06f, 9.21f, 2.23f, 9.82f, 2.71f, 10.1f)
                lineTo(6f, 12f)
                lineToRelative(-3.29f, 1.9f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.37f, 1.37f)
                lineToRelative(2f, 3.46f)
                curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f)
                lineTo(9f, 17.2f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.8f)
                lineToRelative(3.29f, 1.9f)
                curveToRelative(0.48f, 0.28f, 1.09f, 0.11f, 1.37f, -0.37f)
                lineToRelative(2f, -3.46f)
                curveTo(21.94f, 14.79f, 21.77f, 14.18f, 21.29f, 13.9f)
                close()
                moveTo(18.43f, 16.87f)
                lineToRelative(-4.68f, -2.7f)
                curveTo(13.42f, 13.97f, 13f, 14.21f, 13f, 14.6f)
                verticalLineTo(20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.4f)
                curveToRelative(0f, -0.38f, -0.42f, -0.63f, -0.75f, -0.43f)
                lineToRelative(-4.68f, 2.7f)
                lineToRelative(-1f, -1.73f)
                lineToRelative(4.68f, -2.7f)
                curveToRelative(0.33f, -0.19f, 0.33f, -0.67f, 0f, -0.87f)
                lineToRelative(-4.68f, -2.7f)
                lineToRelative(1f, -1.73f)
                lineToRelative(4.68f, 2.7f)
                curveTo(10.58f, 10.03f, 11f, 9.79f, 11f, 9.4f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.4f)
                curveToRelative(0f, 0.38f, 0.42f, 0.63f, 0.75f, 0.43f)
                lineToRelative(4.68f, -2.7f)
                lineToRelative(1f, 1.73f)
                lineToRelative(-4.68f, 2.7f)
                curveToRelative(-0.33f, 0.19f, -0.33f, 0.67f, 0f, 0.87f)
                lineToRelative(4.68f, 2.7f)
                lineTo(18.43f, 16.87f)
                close()
            }
        }.build()
        
        return _Emergency!!
    }

private var _Emergency: ImageVector? = null

