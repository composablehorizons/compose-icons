package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Gps_off: ImageVector
    get() {
        if (_Gps_off != null) return _Gps_off!!
        
        _Gps_off = ImageVector.Builder(
            name = "gps_off",
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
                moveTo(20.94f, 11f)
                curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.06f)
                curveToRelative(-0.98f, 0.11f, -1.91f, 0.38f, -2.77f, 0.78f)
                lineToRelative(1.53f, 1.53f)
                curveTo(10.46f, 5.13f, 11.22f, 5f, 12f, 5f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                curveToRelative(0f, 0.79f, -0.13f, 1.54f, -0.37f, 2.24f)
                lineToRelative(1.53f, 1.53f)
                curveToRelative(0.4f, -0.86f, 0.67f, -1.79f, 0.78f, -2.77f)
                horizontalLineTo(23f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.06f)
                close()
                moveTo(3f, 4.27f)
                lineToRelative(2.04f, 2.04f)
                curveTo(3.97f, 7.62f, 3.26f, 9.23f, 3.06f, 11f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.06f)
                curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f)
                lineTo(19.73f, 21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 2.86f)
                lineTo(3f, 4.27f)
                close()
                moveToRelative(13.27f, 13.27f)
                curveTo(15.09f, 18.45f, 13.61f, 19f, 12f, 19f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                curveToRelative(0f, -1.61f, 0.55f, -3.09f, 1.46f, -4.27f)
                lineToRelative(9.81f, 9.81f)
                close()
            }
        }.build()
        
        return _Gps_off!!
    }

private var _Gps_off: ImageVector? = null

