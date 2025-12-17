package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Compost: ImageVector
    get() {
        if (_Compost != null) return _Compost!!
        
        _Compost = ImageVector.Builder(
            name = "compost",
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
                moveTo(12.87f, 11.81f)
                curveToRelative(-0.23f, -0.38f, -0.37f, -0.83f, -0.37f, -1.31f)
                curveTo(12.5f, 9.12f, 13.62f, 8f, 15f, 8f)
                lineToRelative(1f, 0f)
                curveToRelative(1.51f, 0f, 2f, -1f, 2f, -1f)
                reflectiveCurveToRelative(0.55f, 6f, -3f, 6f)
                curveToRelative(-0.49f, 0f, -0.94f, -0.14f, -1.32f, -0.38f)
                curveToRelative(-0.24f, 0.64f, -0.59f, 1.76f, -0.76f, 2.96f)
                curveToRelative(1.26f, 0.22f, 2.28f, 0.89f, 2.77f, 1.77f)
                curveToRelative(1.69f, -1.17f, 2.81f, -3.13f, 2.81f, -5.35f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 5.24f, -4.26f, 9.5f, -9.5f, 9.5f)
                reflectiveCurveTo(2.5f, 17.24f, 2.5f, 12f)
                reflectiveCurveTo(6.76f, 2.5f, 12f, 2.5f)
                verticalLineTo(0f)
                lineToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                verticalLineTo(5.5f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 2.21f, 1.11f, 4.17f, 2.81f, 5.35f)
                curveToRelative(0.51f, -0.92f, 1.63f, -1.62f, 2.98f, -1.8f)
                curveToRelative(-0.09f, -0.69f, -0.26f, -1.42f, -0.49f, -2.03f)
                curveTo(10.45f, 13.82f, 10f, 14f, 9.5f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-0.99f)
                curveToRelative(0f, -0.56f, -0.19f, -1.09f, -0.5f, -1.51f)
                curveToRelative(0f, 0f, 4.45f, -0.23f, 4.5f, 2.5f)
                curveToRelative(0f, 0.29f, -0.06f, 0.56f, -0.17f, 0.8f)
                curveTo(10.91f, 12.48f, 10.47f, 12.2f, 10f, 12f)
                curveToRelative(0.58f, 0.43f, 1.37f, 1.37f, 2f, 2.6f)
                curveToRelative(0.67f, -1.62f, 1.68f, -3.27f, 3f, -4.6f)
                curveTo(14.24f, 10.52f, 13.53f, 11.12f, 12.87f, 11.81f)
                close()
            }
        }.build()
        
        return _Compost!!
    }

private var _Compost: ImageVector? = null

