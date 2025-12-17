package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Timelapse: ImageVector
    get() {
        if (_Timelapse != null) return _Timelapse!!
        
        _Timelapse = ImageVector.Builder(
            name = "timelapse",
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
                moveTo(16.24f, 7.75f)
                curveToRelative(-1.17f, -1.17f, -2.7f, -1.76f, -4.24f, -1.76f)
                verticalLineToRelative(6f)
                lineToRelative(-4.24f, 4.24f)
                curveToRelative(2.34f, 2.34f, 6.14f, 2.34f, 8.49f, 0f)
                curveToRelative(2.34f, -2.34f, 2.34f, -6.14f, -0.01f, -8.48f)
                close()
                moveTo(12f, 1.99f)
                curveToRelative(-5.52f, 0f, -10f, 4.48f, -10f, 10f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveToRelative(-4.48f, -10f, -10f, -10f)
                close()
                moveToRelative(0f, 18f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                reflectiveCurveToRelative(-3.58f, 8f, -8f, 8f)
                close()
            }
        }.build()
        
        return _Timelapse!!
    }

private var _Timelapse: ImageVector? = null

