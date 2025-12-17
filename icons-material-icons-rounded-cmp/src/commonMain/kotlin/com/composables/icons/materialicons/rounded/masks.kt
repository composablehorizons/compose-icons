package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Masks: ImageVector
    get() {
        if (_Masks != null) return _Masks!!
        
        _Masks = ImageVector.Builder(
            name = "masks",
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
                moveTo(19.5f, 6f)
                curveToRelative(-1.31f, 0f, -2.37f, 1.01f, -2.48f, 2.3f)
                curveTo(15.14f, 7.8f, 14.18f, 6.5f, 12f, 6.5f)
                curveToRelative(-2.19f, 0f, -3.14f, 1.3f, -5.02f, 1.8f)
                curveTo(6.87f, 7.02f, 5.81f, 6f, 4.5f, 6f)
                curveTo(3.12f, 6f, 2f, 7.12f, 2f, 8.5f)
                verticalLineTo(9f)
                curveToRelative(0f, 6f, 3.6f, 7.81f, 6.52f, 7.98f)
                curveTo(9.53f, 17.62f, 10.72f, 18f, 12f, 18f)
                reflectiveCurveToRelative(2.47f, -0.38f, 3.48f, -1.02f)
                curveTo(18.4f, 16.81f, 22f, 15f, 22f, 9f)
                verticalLineTo(8.5f)
                curveTo(22f, 7.12f, 20.88f, 6f, 19.5f, 6f)
                close()
                moveTo(3.5f, 9f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.28f, 0.38f, 2.47f, 1.01f, 3.48f)
                curveTo(4.99f, 14.27f, 3.5f, 12.65f, 3.5f, 9f)
                close()
                moveTo(14.3f, 11.01f)
                curveToRelative(-0.4f, -0.17f, -0.72f, -0.36f, -1.01f, -0.53f)
                curveTo(12.83f, 10.2f, 12.49f, 10f, 12f, 10f)
                curveToRelative(-0.49f, 0f, -0.84f, 0.2f, -1.31f, 0.48f)
                curveToRelative(-0.28f, 0.17f, -0.6f, 0.35f, -0.98f, 0.51f)
                curveTo(9.37f, 11.14f, 9f, 10.91f, 9f, 10.54f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.2f, 0.11f, -0.38f, 0.29f, -0.45f)
                curveToRelative(0.34f, -0.14f, 0.62f, -0.31f, 0.88f, -0.46f)
                curveTo(10.72f, 9.3f, 11.23f, 9f, 12f, 9f)
                reflectiveCurveToRelative(1.27f, 0.3f, 1.8f, 0.62f)
                curveToRelative(0.27f, 0.16f, 0.55f, 0.33f, 0.9f, 0.48f)
                curveToRelative(0.18f, 0.08f, 0.29f, 0.26f, 0.29f, 0.45f)
                curveTo(15f, 10.91f, 14.63f, 11.15f, 14.3f, 11.01f)
                close()
                moveTo(20.5f, 9f)
                curveToRelative(0f, 3.65f, -1.49f, 5.27f, -3.01f, 5.98f)
                curveToRelative(0.64f, -1.01f, 1.01f, -2.2f, 1.01f, -3.48f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Masks!!
    }

private var _Masks: ImageVector? = null

