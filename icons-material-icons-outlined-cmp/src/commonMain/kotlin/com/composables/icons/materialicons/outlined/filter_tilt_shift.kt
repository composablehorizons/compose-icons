package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Filter_tilt_shift: ImageVector
    get() {
        if (_Filter_tilt_shift != null) return _Filter_tilt_shift!!
        
        _Filter_tilt_shift = ImageVector.Builder(
            name = "filter_tilt_shift",
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
                moveTo(11f, 4.07f)
                verticalLineTo(2.05f)
                curveToRelative(-2.01f, 0.2f, -3.84f, 1f, -5.32f, 2.21f)
                lineTo(7.1f, 5.69f)
                curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f)
                close()
                moveToRelative(7.32f, 0.19f)
                curveTo(16.84f, 3.05f, 15.01f, 2.25f, 13f, 2.05f)
                verticalLineToRelative(2.02f)
                curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f)
                lineToRelative(1.42f, -1.43f)
                close()
                moveTo(19.93f, 11f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.2f, -2.01f, -1f, -3.84f, -2.21f, -5.32f)
                lineTo(18.31f, 7.1f)
                curveToRelative(0.86f, 1.11f, 1.44f, 2.44f, 1.62f, 3.9f)
                close()
                moveTo(5.69f, 7.1f)
                lineTo(4.26f, 5.68f)
                curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f)
                close()
                moveTo(4.07f, 13f)
                horizontalLineTo(2.05f)
                curveToRelative(0.2f, 2.01f, 1f, 3.84f, 2.21f, 5.32f)
                lineToRelative(1.43f, -1.43f)
                curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                close()
                moveToRelative(3.31f, 4.9f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(1.21f, -1.48f, 2.01f, -3.32f, 2.21f, -5.32f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.18f, 1.45f, -0.76f, 2.78f, -1.62f, 3.89f)
                close()
                moveTo(13f, 19.93f)
                verticalLineToRelative(2.02f)
                curveToRelative(2.01f, -0.2f, 3.84f, -1f, 5.32f, -2.21f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-1.1f, 0.86f, -2.43f, 1.44f, -3.89f, 1.62f)
                close()
                moveToRelative(-7.32f, -0.19f)
                curveTo(7.16f, 20.95f, 9f, 21.75f, 11f, 21.95f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f)
                lineToRelative(-1.42f, 1.43f)
                close()
            }
        }.build()
        
        return _Filter_tilt_shift!!
    }

private var _Filter_tilt_shift: ImageVector? = null

