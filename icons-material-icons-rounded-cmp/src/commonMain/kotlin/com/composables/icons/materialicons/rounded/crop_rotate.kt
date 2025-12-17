package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Crop_rotate: ImageVector
    get() {
        if (_Crop_rotate != null) return _Crop_rotate!!
        
        _Crop_rotate = ImageVector.Builder(
            name = "crop_rotate",
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
                moveTo(16f, 9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveToRelative(3f, 7f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(17.66f, 1.4f)
                curveTo(15.99f, 0.51f, 13.83f, -0.11f, 11.39f, 0.04f)
                lineToRelative(3.81f, 3.81f)
                lineToRelative(1.33f, -1.33f)
                curveToRelative(3.09f, 1.46f, 5.34f, 4.37f, 5.89f, 7.86f)
                curveToRelative(0.06f, 0.41f, 0.44f, 0.69f, 0.86f, 0.62f)
                curveToRelative(0.41f, -0.06f, 0.69f, -0.45f, 0.62f, -0.86f)
                curveToRelative(-0.6f, -3.8f, -2.96f, -7f, -6.24f, -8.74f)
                close()
                moveTo(7.47f, 21.49f)
                curveToRelative(-3.09f, -1.46f, -5.34f, -4.37f, -5.89f, -7.86f)
                curveToRelative(-0.06f, -0.41f, -0.44f, -0.69f, -0.86f, -0.62f)
                curveToRelative(-0.41f, 0.06f, -0.69f, 0.45f, -0.62f, 0.86f)
                curveToRelative(0.6f, 3.81f, 2.96f, 7.01f, 6.24f, 8.75f)
                curveToRelative(1.67f, 0.89f, 3.83f, 1.51f, 6.27f, 1.36f)
                lineTo(8.8f, 20.16f)
                lineToRelative(-1.33f, 1.33f)
                close()
            }
        }.build()
        
        return _Crop_rotate!!
    }

private var _Crop_rotate: ImageVector? = null

