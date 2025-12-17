package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Alarm_on: ImageVector
    get() {
        if (_Alarm_on != null) return _Alarm_on!!
        
        _Alarm_on = ImageVector.Builder(
            name = "alarm_on",
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
                moveTo(14.94f, 10.11f)
                lineToRelative(-4.4f, 4.42f)
                lineToRelative(-1.6f, -1.6f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                lineTo(10f, 16.11f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                lineTo(16f, 11.17f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                close()
                moveToRelative(6.24f, -5.1f)
                lineTo(18.1f, 2.45f)
                curveToRelative(-0.42f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f)
                curveToRelative(-0.35f, 0.42f, -0.29f, 1.05f, 0.13f, 1.41f)
                lineToRelative(3.07f, 2.56f)
                curveToRelative(0.42f, 0.35f, 1.05f, 0.3f, 1.41f, -0.13f)
                curveToRelative(0.36f, -0.42f, 0.3f, -1.05f, -0.12f, -1.41f)
                close()
                moveTo(4.1f, 6.55f)
                lineToRelative(3.07f, -2.56f)
                curveToRelative(0.43f, -0.36f, 0.49f, -0.99f, 0.13f, -1.41f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.48f, -1.4f, -0.13f)
                lineTo(2.82f, 5.01f)
                curveToRelative(-0.42f, 0.36f, -0.48f, 0.99f, -0.12f, 1.41f)
                curveToRelative(0.35f, 0.43f, 0.98f, 0.48f, 1.4f, 0.13f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
                close()
                moveToRelative(0f, 16f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.build()
        
        return _Alarm_on!!
    }

private var _Alarm_on: ImageVector? = null

