package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Masks: ImageVector
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
                moveTo(20.5f, 9f)
                curveToRelative(0f, 3.65f, -1.49f, 5.27f, -3.01f, 5.98f)
                curveToRelative(0.64f, -1.01f, 1.01f, -2.2f, 1.01f, -3.48f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(9f)
                close()
                moveTo(10.69f, 10.48f)
                curveToRelative(-0.44f, 0.26f, -0.96f, 0.56f, -1.69f, 0.76f)
                verticalLineTo(10.2f)
                curveToRelative(0.48f, -0.17f, 0.84f, -0.38f, 1.18f, -0.58f)
                curveTo(10.72f, 9.3f, 11.23f, 9f, 12f, 9f)
                reflectiveCurveToRelative(1.27f, 0.3f, 1.8f, 0.62f)
                curveToRelative(0.34f, 0.2f, 0.71f, 0.42f, 1.2f, 0.59f)
                verticalLineToRelative(1.04f)
                curveToRelative(-0.75f, -0.21f, -1.26f, -0.51f, -1.71f, -0.78f)
                curveTo(12.83f, 10.2f, 12.49f, 10f, 12f, 10f)
                curveTo(11.51f, 10f, 11.16f, 10.2f, 10.69f, 10.48f)
                close()
            }
        }.build()
        
        return _Masks!!
    }

private var _Masks: ImageVector? = null

