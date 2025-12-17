package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Snooze: ImageVector
    get() {
        if (_Snooze != null) return _Snooze!!
        
        _Snooze = ImageVector.Builder(
            name = "snooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 11f)
                horizontalLineToRelative(2.63f)
                lineToRelative(-3.72f, 4.35f)
                curveTo(8.36f, 16f, 8.82f, 17f, 9.67f, 17f)
                horizontalLineTo(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.63f)
                lineToRelative(3.72f, -4.35f)
                curveToRelative(0.55f, -0.65f, 0.09f, -1.65f, -0.76f, -1.65f)
                horizontalLineTo(10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(11.3f, -4.58f)
                curveToRelative(-0.35f, 0.42f, -0.98f, 0.48f, -1.41f, 0.13f)
                lineToRelative(-3.07f, -2.56f)
                curveToRelative(-0.42f, -0.36f, -0.48f, -0.99f, -0.12f, -1.41f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
                lineToRelative(3.07f, 2.56f)
                curveToRelative(0.42f, 0.36f, 0.48f, 0.99f, 0.12f, 1.41f)
                close()
                moveToRelative(-18.6f, 0f)
                curveToRelative(0.35f, 0.43f, 0.98f, 0.48f, 1.4f, 0.13f)
                lineToRelative(3.07f, -2.56f)
                curveToRelative(0.43f, -0.36f, 0.49f, -0.99f, 0.13f, -1.41f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.48f, -1.4f, -0.13f)
                lineTo(2.82f, 5.01f)
                curveToRelative(-0.42f, 0.36f, -0.48f, 0.99f, -0.12f, 1.41f)
                close()
                moveTo(12f, 6f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                moveToRelative(0f, -2f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                reflectiveCurveToRelative(4.03f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.03f, 9f, -9f)
                reflectiveCurveToRelative(-4.03f, -9f, -9f, -9f)
                close()
            }
        }.build()
        
        return _Snooze!!
    }

private var _Snooze: ImageVector? = null

