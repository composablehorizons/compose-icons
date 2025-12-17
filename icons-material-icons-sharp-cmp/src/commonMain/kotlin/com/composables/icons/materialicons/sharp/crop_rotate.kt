package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Crop_rotate: ImageVector
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
                moveTo(7.47f, 21.49f)
                curveTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13f)
                horizontalLineTo(0f)
                curveToRelative(0.51f, 6.16f, 5.66f, 11f, 11.95f, 11f)
                curveToRelative(0.23f, 0f, 0.44f, -0.02f, 0.66f, -0.03f)
                lineTo(8.8f, 20.15f)
                lineToRelative(-1.33f, 1.34f)
                close()
                moveTo(12.05f, 0f)
                curveToRelative(-0.23f, 0f, -0.44f, 0.02f, -0.66f, 0.04f)
                lineToRelative(3.81f, 3.81f)
                lineToRelative(1.33f, -1.33f)
                curveTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11f)
                horizontalLineTo(24f)
                curveToRelative(-0.51f, -6.16f, -5.66f, -11f, -11.95f, -11f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(-8f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8f)
                close()
            }
        }.build()
        
        return _Crop_rotate!!
    }

private var _Crop_rotate: ImageVector? = null

