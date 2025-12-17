package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sick: ImageVector
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
                moveTo(23f, 7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.78f, 0.99f, -2.44f, 1.58f, -3.36f)
                curveToRelative(0.2f, -0.31f, 0.64f, -0.31f, 0.84f, 0f)
                curveTo(22.01f, 4.56f, 23f, 6.22f, 23f, 7f)
                close()
                moveTo(21.86f, 10.38f)
                curveTo(21.94f, 10.91f, 22f, 11.45f, 22f, 12f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10.01f, 10f)
                curveTo(6.47f, 22f, 2f, 17.52f, 2f, 12f)
                curveTo(2f, 6.48f, 6.47f, 2f, 11.99f, 2f)
                curveToRelative(2.45f, 0f, 4.69f, 0.88f, 6.43f, 2.34f)
                curveTo(17.91f, 5.29f, 17.5f, 6.27f, 17.5f, 7f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                curveTo(21.3f, 10.5f, 21.58f, 10.45f, 21.86f, 10.38f)
                close()
                moveTo(14.03f, 10.03f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                lineTo(15.62f, 9.5f)
                lineToRelative(0.53f, -0.53f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                reflectiveCurveToRelative(-0.77f, -0.29f, -1.06f, 0f)
                lineToRelative(-1.06f, 1.06f)
                curveTo(13.74f, 9.26f, 13.74f, 9.74f, 14.03f, 10.03f)
                close()
                moveTo(8.38f, 9.5f)
                lineToRelative(-0.53f, 0.53f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                lineTo(8.91f, 7.91f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                reflectiveCurveToRelative(-0.29f, 0.77f, 0f, 1.06f)
                lineTo(8.38f, 9.5f)
                close()
                moveTo(16.47f, 15.8f)
                curveToRelative(-1f, -1.39f, -2.62f, -2.3f, -4.47f, -2.3f)
                curveToRelative(-0.87f, 0f, -1.69f, 0.2f, -2.43f, 0.56f)
                lineTo(5.99f, 12f)
                curveToRelative(0f, -0.52f, -0.26f, -1.02f, -0.74f, -1.29f)
                curveToRelative(-0.8f, -0.46f, -1.84f, -0.11f, -2.17f, 0.8f)
                curveToRelative(-0.21f, 0.57f, -0.03f, 1.25f, 0.44f, 1.64f)
                curveToRelative(0.52f, 0.44f, 1.2f, 0.45f, 1.72f, 0.16f)
                lineToRelative(2.97f, 1.72f)
                curveToRelative(-0.25f, 0.24f, -0.48f, 0.5f, -0.68f, 0.78f)
                curveTo(7.17f, 16.3f, 7.53f, 17f, 8.15f, 17f)
                curveToRelative(0.23f, 0f, 0.46f, -0.1f, 0.6f, -0.3f)
                curveTo(9.47f, 15.68f, 10.65f, 15f, 12f, 15f)
                reflectiveCurveToRelative(2.53f, 0.68f, 3.25f, 1.7f)
                curveToRelative(0.14f, 0.19f, 0.36f, 0.3f, 0.6f, 0.3f)
                horizontalLineToRelative(0f)
                curveTo(16.47f, 17f, 16.83f, 16.3f, 16.47f, 15.8f)
                close()
            }
        }.build()
        
        return _Sick!!
    }

private var _Sick: ImageVector? = null

