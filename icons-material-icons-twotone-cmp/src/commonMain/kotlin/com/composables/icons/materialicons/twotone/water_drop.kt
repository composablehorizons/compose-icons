package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Water_drop: ImageVector
    get() {
        if (_Water_drop != null) return _Water_drop!!
        
        _Water_drop = ImageVector.Builder(
            name = "water_drop",
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
                moveTo(12f, 4.67f)
                curveToRelative(-4.05f, 3.7f, -6f, 6.79f, -6f, 9.14f)
                curveToRelative(0f, 3.63f, 2.65f, 6.2f, 6f, 6.2f)
                reflectiveCurveToRelative(6f, -2.57f, 6f, -6.2f)
                curveTo(18f, 11.46f, 16.05f, 8.36f, 12f, 4.67f)
                close()
                moveTo(12.28f, 18.99f)
                curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f)
                curveTo(7.01f, 14.42f, 7.37f, 14f, 7.83f, 14f)
                curveToRelative(0.37f, 0f, 0.67f, 0.26f, 0.74f, 0.62f)
                curveToRelative(0.41f, 2.23f, 2.28f, 2.98f, 3.64f, 2.87f)
                curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f)
                curveTo(13f, 18.64f, 12.68f, 18.97f, 12.28f, 18.99f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(-5.33f, 4.55f, -8f, 8.48f, -8f, 11.8f)
                curveToRelative(0f, 4.98f, 3.8f, 8.2f, 8f, 8.2f)
                reflectiveCurveToRelative(8f, -3.22f, 8f, -8.2f)
                curveTo(20f, 10.48f, 17.33f, 6.55f, 12f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.35f, 0f, -6f, -2.57f, -6f, -6.2f)
                curveToRelative(0f, -2.34f, 1.95f, -5.44f, 6f, -9.14f)
                curveToRelative(4.05f, 3.7f, 6f, 6.79f, 6f, 9.14f)
                curveTo(18f, 17.43f, 15.35f, 20f, 12f, 20f)
                close()
                moveTo(7.83f, 14f)
                curveToRelative(0.37f, 0f, 0.67f, 0.26f, 0.74f, 0.62f)
                curveToRelative(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f)
                curveToRelative(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f)
                curveToRelative(0f, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f)
                curveToRelative(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f)
                curveTo(7.01f, 14.42f, 7.37f, 14f, 7.83f, 14f)
                close()
            }
        }.build()
        
        return _Water_drop!!
    }

private var _Water_drop: ImageVector? = null

