package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sick: ImageVector
    get() {
        if (_Sick != null) return _Sick!!
        
        _Sick = ImageVector.Builder(
            name = "sick",
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
                moveTo(7.32f, 10.56f)
                lineTo(8.38f, 9.5f)
                lineTo(7.32f, 8.44f)
                lineToRelative(1.06f, -1.06f)
                lineTo(10.5f, 9.5f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(7.32f, 10.56f)
                close()
                moveTo(4.5f, 9f)
                curveToRelative(0.03f, 0f, 0.05f, 0.01f, 0.08f, 0.01f)
                curveTo(5.77f, 6.07f, 8.64f, 4f, 12f, 4f)
                curveToRelative(2.19f, 0f, 4.16f, 0.88f, 5.61f, 2.3f)
                curveToRelative(0.15f, -0.6f, 0.45f, -1.29f, 0.81f, -1.96f)
                curveTo(16.68f, 2.88f, 14.44f, 2f, 11.99f, 2f)
                curveToRelative(-4.88f, 0f, -8.94f, 3.51f, -9.81f, 8.14f)
                curveTo(2.74f, 9.44f, 3.59f, 9f, 4.5f, 9f)
                close()
                moveTo(21f, 10.5f)
                curveToRelative(-0.42f, 0f, -0.82f, -0.09f, -1.19f, -0.22f)
                curveTo(19.93f, 10.83f, 20f, 11.41f, 20f, 12f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                curveToRelative(-3.36f, 0f, -6.23f, -2.07f, -7.42f, -5.01f)
                curveTo(4.55f, 14.99f, 4.53f, 15f, 4.5f, 15f)
                curveToRelative(-0.52f, 0f, -1.04f, -0.14f, -1.5f, -0.4f)
                curveToRelative(-0.32f, -0.18f, -0.59f, -0.42f, -0.82f, -0.7f)
                curveToRelative(0.89f, 4.61f, 4.93f, 8.1f, 9.8f, 8.1f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveToRelative(0f, -0.55f, -0.06f, -1.09f, -0.14f, -1.62f)
                curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21f, 10.5f)
                close()
                moveTo(21f, 3f)
                curveToRelative(0f, 0f, -2f, 2.9f, -2f, 4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveTo(23f, 5.9f, 21f, 3f, 21f, 3f)
                close()
                moveTo(15.62f, 7.38f)
                lineTo(13.5f, 9.5f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.06f, -1.06f)
                lineTo(15.62f, 9.5f)
                lineToRelative(1.06f, -1.06f)
                lineTo(15.62f, 7.38f)
                close()
                moveTo(8.56f, 17f)
                curveToRelative(0.69f, -1.19f, 1.97f, -2f, 3.44f, -2f)
                reflectiveCurveToRelative(2.75f, 0.81f, 3.44f, 2f)
                horizontalLineToRelative(1.68f)
                curveToRelative(-0.8f, -2.05f, -2.79f, -3.5f, -5.12f, -3.5f)
                curveToRelative(-0.87f, 0f, -1.7f, 0.2f, -2.43f, 0.57f)
                lineToRelative(0f, 0f)
                lineTo(5.99f, 12f)
                curveToRelative(0f, -0.52f, -0.26f, -1.02f, -0.74f, -1.29f)
                curveToRelative(-0.72f, -0.41f, -1.63f, -0.17f, -2.05f, 0.55f)
                curveToRelative(-0.41f, 0.72f, -0.17f, 1.63f, 0.55f, 2.05f)
                curveToRelative(0.48f, 0.28f, 1.05f, 0.25f, 1.49f, 0f)
                lineToRelative(2.97f, 1.72f)
                lineToRelative(0f, 0f)
                curveTo(7.64f, 15.56f, 7.18f, 16.24f, 6.88f, 17f)
                horizontalLineTo(8.56f)
                close()
            }
        }.build()
        
        return _Sick!!
    }

private var _Sick: ImageVector? = null

