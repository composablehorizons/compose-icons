package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Local_florist: ImageVector
    get() {
        if (_Local_florist != null) return _Local_florist!!
        
        _Local_florist = ImageVector.Builder(
            name = "local_florist",
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
                moveTo(8.66f, 13.07f)
                curveToRelative(0.15f, 0f, 0.29f, -0.01f, 0.43f, -0.03f)
                curveTo(9.56f, 14.19f, 10.69f, 15f, 12f, 15f)
                reflectiveCurveToRelative(2.44f, -0.81f, 2.91f, -1.96f)
                curveToRelative(0.14f, 0.02f, 0.29f, 0.03f, 0.43f, 0.03f)
                curveToRelative(1.73f, 0f, 3.14f, -1.41f, 3.14f, -3.14f)
                curveToRelative(0f, -0.71f, -0.25f, -1.39f, -0.67f, -1.93f)
                curveToRelative(0.43f, -0.54f, 0.67f, -1.22f, 0.67f, -1.93f)
                curveToRelative(0f, -1.73f, -1.41f, -3.14f, -3.14f, -3.14f)
                curveToRelative(-0.15f, 0f, -0.29f, 0.01f, -0.43f, 0.03f)
                curveTo(14.44f, 1.81f, 13.31f, 1f, 12f, 1f)
                reflectiveCurveToRelative(-2.44f, 0.81f, -2.91f, 1.96f)
                curveToRelative(-0.14f, -0.02f, -0.29f, -0.03f, -0.43f, -0.03f)
                curveToRelative(-1.73f, 0f, -3.14f, 1.41f, -3.14f, 3.14f)
                curveToRelative(0f, 0.71f, 0.25f, 1.39f, 0.67f, 1.93f)
                curveToRelative(-0.43f, 0.54f, -0.68f, 1.22f, -0.68f, 1.93f)
                curveToRelative(0f, 1.73f, 1.41f, 3.14f, 3.15f, 3.14f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.62f, 0f, -1.12f, -0.49f, -1.14f, -1.1f)
                lineToRelative(0.12f, -1.09f)
                curveToRelative(0.32f, 0.12f, 0.66f, 0.19f, 1.02f, 0.19f)
                reflectiveCurveToRelative(0.71f, -0.07f, 1.03f, -0.19f)
                lineToRelative(0.11f, 1.09f)
                curveToRelative(-0.02f, 0.61f, -0.52f, 1.1f, -1.14f, 1.1f)
                close()
                moveToRelative(3.34f, -1.93f)
                curveToRelative(-0.24f, 0f, -0.46f, -0.07f, -0.64f, -0.2f)
                lineToRelative(-0.81f, -0.57f)
                curveToRelative(0.55f, -0.45f, 0.94f, -1.09f, 1.06f, -1.83f)
                lineToRelative(0.88f, 0.42f)
                curveToRelative(0.4f, 0.19f, 0.66f, 0.59f, 0.66f, 1.03f)
                curveToRelative(0f, 0.64f, -0.52f, 1.15f, -1.15f, 1.15f)
                close()
                moveToRelative(-0.65f, -5.94f)
                curveToRelative(0.2f, -0.13f, 0.42f, -0.2f, 0.65f, -0.2f)
                curveToRelative(0.63f, 0f, 1.14f, 0.51f, 1.14f, 1.14f)
                curveToRelative(0f, 0.44f, -0.25f, 0.83f, -0.66f, 1.03f)
                lineToRelative(-0.88f, 0.42f)
                curveToRelative(-0.12f, -0.74f, -0.51f, -1.38f, -1.07f, -1.83f)
                lineToRelative(0.82f, -0.56f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0.62f, 0f, 1.12f, 0.49f, 1.14f, 1.1f)
                lineToRelative(-0.11f, 1.09f)
                curveTo(12.71f, 5.07f, 12.36f, 5f, 12f, 5f)
                reflectiveCurveToRelative(-0.7f, 0.07f, -1.02f, 0.19f)
                lineToRelative(-0.12f, -1.09f)
                curveToRelative(0.02f, -0.61f, 0.52f, -1.1f, 1.14f, -1.1f)
                close()
                moveTo(8.66f, 4.93f)
                curveToRelative(0.24f, 0f, 0.46f, 0.07f, 0.64f, 0.2f)
                lineToRelative(0.81f, 0.56f)
                curveToRelative(-0.55f, 0.45f, -0.94f, 1.09f, -1.06f, 1.83f)
                lineToRelative(-0.88f, -0.42f)
                curveToRelative(-0.4f, -0.2f, -0.66f, -0.59f, -0.66f, -1.03f)
                curveToRelative(0f, -0.63f, 0.52f, -1.14f, 1.15f, -1.14f)
                close()
                moveTo(8.17f, 8.9f)
                lineToRelative(0.88f, -0.42f)
                curveToRelative(0.12f, 0.74f, 0.51f, 1.38f, 1.07f, 1.83f)
                lineToRelative(-0.81f, 0.55f)
                curveToRelative(-0.2f, 0.13f, -0.42f, 0.2f, -0.65f, 0.2f)
                curveToRelative(-0.63f, 0f, -1.14f, -0.51f, -1.14f, -1.14f)
                curveToRelative(-0.01f, -0.43f, 0.25f, -0.82f, 0.65f, -1.02f)
                close()
                moveTo(12f, 22f)
                curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                close()
                moveToRelative(2.44f, -2.44f)
                curveToRelative(0.71f, -1.9f, 2.22f, -3.42f, 4.12f, -4.12f)
                curveToRelative(-0.71f, 1.9f, -2.22f, 3.41f, -4.12f, 4.12f)
                close()
                moveTo(3f, 13f)
                curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                close()
                moveToRelative(2.44f, 2.44f)
                curveToRelative(1.9f, 0.71f, 3.42f, 2.22f, 4.12f, 4.12f)
                curveToRelative(-1.9f, -0.71f, -3.41f, -2.22f, -4.12f, -4.12f)
                close()
            }
        }.build()
        
        return _Local_florist!!
    }

private var _Local_florist: ImageVector? = null

