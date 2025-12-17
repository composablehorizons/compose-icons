package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Alarm_off: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.04f, 6.29f)
                curveTo(10.66f, 6.11f, 11.32f, 6f, 12f, 6f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 0.68f, -0.11f, 1.34f, -0.29f, 1.96f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.47f, -1.08f, 0.73f, -2.27f, 0.73f, -3.52f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                curveToRelative(-1.25f, 0f, -2.44f, 0.26f, -3.53f, 0.72f)
                lineToRelative(1.57f, 1.57f)
                close()
                moveToRelative(7.297f, -4.48f)
                lineToRelative(4.607f, 3.845f)
                lineToRelative(-1.28f, 1.535f)
                lineToRelative(-4.61f, -3.843f)
                close()
                moveTo(3.02f, 2.1f)
                lineTo(1.61f, 3.51f)
                lineToRelative(1.37f, 1.37f)
                lineToRelative(-0.92f, 0.77f)
                lineToRelative(1.28f, 1.54f)
                lineToRelative(1.06f, -0.88f)
                lineToRelative(0.8f, 0.8f)
                curveTo(3.83f, 8.69f, 3f, 10.75f, 3f, 13f)
                curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                curveToRelative(2.25f, 0f, 4.31f, -0.83f, 5.89f, -2.2f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.02f, 2.1f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f)
                lineToRelative(9.85f, 9.85f)
                curveTo(15.26f, 19.39f, 13.7f, 20f, 12f, 20f)
                close()
                moveTo(7.48f, 3.73f)
                lineToRelative(0.46f, -0.38f)
                lineToRelative(-1.28f, -1.54f)
                lineToRelative(-0.6f, 0.5f)
                close()
            }
        }.build()
        
        return _Alarm_off!!
    }

private var _Alarm_off: ImageVector? = null

