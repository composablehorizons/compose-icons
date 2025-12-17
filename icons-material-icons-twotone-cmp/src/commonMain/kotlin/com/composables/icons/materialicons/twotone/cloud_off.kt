package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Cloud_off: ImageVector
    get() {
        if (_Cloud_off != null) return _Cloud_off!!
        
        _Cloud_off = ImageVector.Builder(
            name = "cloud_off",
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
                moveTo(22f, 15f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                curveTo(17.5f, 8.46f, 15.04f, 6f, 12f, 6f)
                curveToRelative(-0.77f, 0f, -1.49f, 0.17f, -2.16f, 0.46f)
                lineTo(20.79f, 17.4f)
                curveToRelative(0.73f, -0.55f, 1.21f, -1.41f, 1.21f, -2.4f)
                close()
                moveTo(2f, 14f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(9.73f)
                lineToRelative(-8f, -8f)
                horizontalLineTo(6f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.35f, 10.04f)
                curveTo(18.67f, 6.59f, 15.64f, 4f, 12f, 4f)
                curveToRelative(-1.33f, 0f, -2.57f, 0.36f, -3.65f, 0.97f)
                lineToRelative(1.49f, 1.49f)
                curveTo(10.51f, 6.17f, 11.23f, 6f, 12f, 6f)
                curveToRelative(3.04f, 0f, 5.5f, 2.46f, 5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(19f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 0.99f, -0.48f, 1.85f, -1.21f, 2.4f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.09f, -0.92f, 1.8f, -2.27f, 1.8f, -3.81f)
                curveToRelative(0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f)
                close()
                moveTo(3f, 5.27f)
                lineToRelative(2.77f, 2.77f)
                horizontalLineToRelative(-0.42f)
                curveTo(2.34f, 8.36f, 0f, 10.91f, 0f, 14f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(11.73f)
                lineToRelative(2f, 2f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 3.86f)
                lineTo(3f, 5.27f)
                close()
                moveTo(7.73f, 10f)
                lineToRelative(8f, 8f)
                horizontalLineTo(6f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(1.73f)
                close()
            }
        }.build()
        
        return _Cloud_off!!
    }

private var _Cloud_off: ImageVector? = null

