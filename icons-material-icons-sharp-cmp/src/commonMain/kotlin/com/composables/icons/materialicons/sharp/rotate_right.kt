package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Rotate_right: ImageVector
    get() {
        if (_Rotate_right != null) return _Rotate_right!!
        
        _Rotate_right = ImageVector.Builder(
            name = "rotate_right",
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
                moveTo(15.55f, 5.55f)
                lineTo(11f, 1f)
                verticalLineToRelative(3.07f)
                curveTo(7.06f, 4.56f, 4f, 7.92f, 4f, 12f)
                reflectiveCurveToRelative(3.05f, 7.44f, 7f, 7.93f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-2.84f, -0.48f, -5f, -2.94f, -5f, -5.91f)
                reflectiveCurveToRelative(2.16f, -5.43f, 5f, -5.91f)
                verticalLineTo(10f)
                lineToRelative(4.55f, -4.45f)
                close()
                moveTo(19.93f, 11f)
                curveToRelative(-0.17f, -1.39f, -0.72f, -2.73f, -1.62f, -3.89f)
                lineToRelative(-1.42f, 1.42f)
                curveToRelative(0.54f, 0.75f, 0.88f, 1.6f, 1.02f, 2.47f)
                horizontalLineToRelative(2.02f)
                close()
                moveTo(13f, 17.9f)
                verticalLineToRelative(2.02f)
                curveToRelative(1.39f, -0.17f, 2.74f, -0.71f, 3.9f, -1.61f)
                lineToRelative(-1.44f, -1.44f)
                curveToRelative(-0.75f, 0.54f, -1.59f, 0.89f, -2.46f, 1.03f)
                close()
                moveToRelative(3.89f, -2.42f)
                lineToRelative(1.42f, 1.41f)
                curveToRelative(0.9f, -1.16f, 1.45f, -2.5f, 1.62f, -3.89f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.14f, 0.87f, -0.48f, 1.72f, -1.02f, 2.48f)
                close()
            }
        }.build()
        
        return _Rotate_right!!
    }

private var _Rotate_right: ImageVector? = null

