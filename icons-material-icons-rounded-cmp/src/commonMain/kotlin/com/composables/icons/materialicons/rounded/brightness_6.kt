package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Brightness_6: ImageVector
    get() {
        if (_Brightness_6 != null) return _Brightness_6!!
        
        _Brightness_6 = ImageVector.Builder(
            name = "brightness_6",
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
                moveTo(20f, 15.31f)
                lineToRelative(2.6f, -2.6f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(20f, 8.69f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.69f)
                lineToRelative(-2.6f, -2.6f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(8.69f, 4f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.69f)
                lineToRelative(-2.6f, 2.6f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineTo(4f, 15.3f)
                verticalLineTo(19f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3.69f)
                lineToRelative(2.6f, 2.6f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(2.6f, -2.6f)
                horizontalLineTo(19f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.69f)
                close()
                moveToRelative(-8f, 1.59f)
                verticalLineTo(7.1f)
                curveToRelative(0f, -0.61f, 0.55f, -1.11f, 1.15f, -0.99f)
                curveTo(15.91f, 6.65f, 18f, 9.08f, 18f, 12f)
                reflectiveCurveToRelative(-2.09f, 5.35f, -4.85f, 5.89f)
                curveToRelative(-0.6f, 0.12f, -1.15f, -0.38f, -1.15f, -0.99f)
                close()
            }
        }.build()
        
        return _Brightness_6!!
    }

private var _Brightness_6: ImageVector? = null

