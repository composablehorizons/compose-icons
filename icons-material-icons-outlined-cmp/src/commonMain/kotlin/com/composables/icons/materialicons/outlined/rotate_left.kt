package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Rotate_left: ImageVector
    get() {
        if (_Rotate_left != null) return _Rotate_left!!
        
        _Rotate_left = ImageVector.Builder(
            name = "rotate_left",
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
                moveTo(7.11f, 8.53f)
                lineTo(5.7f, 7.11f)
                curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.14f, -0.87f, 0.49f, -1.72f, 1.02f, -2.47f)
                close()
                moveTo(6.09f, 13f)
                horizontalLineTo(4.07f)
                curveToRelative(0.17f, 1.39f, 0.72f, 2.73f, 1.62f, 3.89f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(-0.52f, -0.75f, -0.87f, -1.59f, -1.01f, -2.47f)
                close()
                moveToRelative(1.01f, 5.32f)
                curveToRelative(1.16f, 0.9f, 2.51f, 1.44f, 3.9f, 1.61f)
                verticalLineTo(17.9f)
                curveToRelative(-0.87f, -0.15f, -1.71f, -0.49f, -2.46f, -1.03f)
                lineTo(7.1f, 18.32f)
                close()
                moveTo(13f, 4.07f)
                verticalLineTo(1f)
                lineTo(8.45f, 5.55f)
                lineTo(13f, 10f)
                verticalLineTo(6.09f)
                curveToRelative(2.84f, 0.48f, 5f, 2.94f, 5f, 5.91f)
                reflectiveCurveToRelative(-2.16f, 5.43f, -5f, 5.91f)
                verticalLineToRelative(2.02f)
                curveToRelative(3.95f, -0.49f, 7f, -3.85f, 7f, -7.93f)
                reflectiveCurveToRelative(-3.05f, -7.44f, -7f, -7.93f)
                close()
            }
        }.build()
        
        return _Rotate_left!!
    }

private var _Rotate_left: ImageVector? = null

