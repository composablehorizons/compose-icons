package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Rotate_90_degrees_ccw: ImageVector
    get() {
        if (_Rotate_90_degrees_ccw != null) return _Rotate_90_degrees_ccw!!
        
        _Rotate_90_degrees_ccw = ImageVector.Builder(
            name = "rotate_90_degrees_ccw",
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
                moveTo(7.35f, 9.24f)
                lineTo(3.69f, 12.9f)
                lineToRelative(3.65f, 3.66f)
                lineTo(11f, 12.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.34f, 6.41f)
                lineTo(0.86f, 12.9f)
                lineToRelative(6.49f, 6.48f)
                lineToRelative(6.49f, -6.48f)
                lineToRelative(-6.5f, -6.49f)
                close()
                moveToRelative(0f, 10.15f)
                lineTo(3.69f, 12.9f)
                lineToRelative(3.66f, -3.66f)
                lineTo(11f, 12.9f)
                lineToRelative(-3.66f, 3.66f)
                close()
                moveToRelative(12.02f, -9.92f)
                curveTo(17.61f, 4.88f, 15.3f, 4f, 13f, 4f)
                verticalLineTo(0.76f)
                lineTo(8.76f, 5f)
                lineTo(13f, 9.24f)
                verticalLineTo(6f)
                curveToRelative(1.79f, 0f, 3.58f, 0.68f, 4.95f, 2.05f)
                curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0f, 9.9f)
                curveTo(16.58f, 19.32f, 14.79f, 20f, 13f, 20f)
                curveToRelative(-0.97f, 0f, -1.94f, -0.21f, -2.84f, -0.61f)
                lineToRelative(-1.49f, 1.49f)
                curveTo(10.02f, 21.62f, 11.51f, 22f, 13f, 22f)
                curveToRelative(2.3f, 0f, 4.61f, -0.88f, 6.36f, -2.64f)
                curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0f, -12.72f)
                close()
            }
        }.build()
        
        return _Rotate_90_degrees_ccw!!
    }

private var _Rotate_90_degrees_ccw: ImageVector? = null

