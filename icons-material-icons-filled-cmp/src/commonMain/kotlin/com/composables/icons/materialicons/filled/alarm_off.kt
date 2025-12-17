package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Alarm_off: ImageVector
    get() {
        if (_Alarm_off != null) return _Alarm_off!!
        
        _Alarm_off = ImageVector.Builder(
            name = "alarm_off",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                curveToRelative(3.87f, 0f, 7f, 3.13f, 7f, 7f)
                curveToRelative(0f, 0.84f, -0.16f, 1.65f, -0.43f, 2.4f)
                lineToRelative(1.52f, 1.52f)
                curveToRelative(0.58f, -1.19f, 0.91f, -2.51f, 0.91f, -3.92f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                curveToRelative(-1.41f, 0f, -2.73f, 0.33f, -3.92f, 0.91f)
                lineTo(9.6f, 6.43f)
                curveTo(10.35f, 6.16f, 11.16f, 6f, 12f, 6f)
                close()
                moveToRelative(10f, -0.28f)
                lineToRelative(-4.6f, -3.86f)
                lineToRelative(-1.29f, 1.53f)
                lineToRelative(4.6f, 3.86f)
                lineTo(22f, 5.72f)
                close()
                moveTo(2.92f, 2.29f)
                lineTo(1.65f, 3.57f)
                lineTo(2.98f, 4.9f)
                lineToRelative(-1.11f, 0.93f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(1.11f, -0.94f)
                lineToRelative(0.8f, 0.8f)
                curveTo(3.83f, 8.69f, 3f, 10.75f, 3f, 13f)
                curveToRelative(0f, 4.97f, 4.02f, 9f, 9f, 9f)
                curveToRelative(2.25f, 0f, 4.31f, -0.83f, 5.89f, -2.2f)
                lineToRelative(2.2f, 2.2f)
                lineToRelative(1.27f, -1.27f)
                lineTo(3.89f, 3.27f)
                lineToRelative(-0.97f, -0.98f)
                close()
                moveToRelative(13.55f, 16.1f)
                curveTo(15.26f, 19.39f, 13.7f, 20f, 12f, 20f)
                curveToRelative(-3.87f, 0f, -7f, -3.13f, -7f, -7f)
                curveToRelative(0f, -1.7f, 0.61f, -3.26f, 1.61f, -4.47f)
                lineToRelative(9.86f, 9.86f)
                close()
                moveTo(8.02f, 3.28f)
                lineTo(6.6f, 1.86f)
                lineToRelative(-0.86f, 0.71f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(0.86f, -0.71f)
                close()
            }
        }.build()
        
        return _Alarm_off!!
    }

private var _Alarm_off: ImageVector? = null

