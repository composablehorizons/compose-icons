package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Alarm_off: ImageVector
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
                moveToRelative(-6.33f, -3.5f)
                curveToRelative(-0.38f, -0.38f, -1f, -0.38f, -1.39f, 0f)
                lineToRelative(-0.02f, 0.03f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0f, 1.39f)
                lineToRelative(0.68f, 0.68f)
                lineToRelative(-0.17f, 0.14f)
                curveToRelative(-0.42f, 0.34f, -0.47f, 0.96f, -0.13f, 1.38f)
                lineToRelative(0.03f, 0.03f)
                curveToRelative(0.35f, 0.42f, 0.96f, 0.47f, 1.38f, 0.12f)
                lineToRelative(0.31f, -0.25f)
                lineToRelative(0.8f, 0.8f)
                curveTo(3.83f, 8.69f, 3f, 10.75f, 3f, 13f)
                curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                curveToRelative(2.25f, 0f, 4.31f, -0.83f, 5.89f, -2.2f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.38f, 0.38f, 1f, 0.38f, 1.39f, 0f)
                lineToRelative(0.03f, -0.03f)
                curveToRelative(0.38f, -0.38f, 0.38f, -1f, 0f, -1.39f)
                lineToRelative(-17.01f, -17f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f)
                lineToRelative(9.85f, 9.85f)
                curveTo(15.26f, 19.39f, 13.7f, 20f, 12f, 20f)
                close()
                moveToRelative(7.91f, -13.44f)
                curveToRelative(0.42f, 0.35f, 1.03f, 0.29f, 1.38f, -0.12f)
                lineToRelative(0.03f, -0.03f)
                curveToRelative(0.35f, -0.42f, 0.29f, -1.03f, -0.12f, -1.38f)
                lineToRelative(-3.1f, -2.59f)
                curveToRelative(-0.42f, -0.35f, -1.03f, -0.29f, -1.38f, 0.12f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(-0.35f, 0.42f, -0.29f, 1.03f, 0.12f, 1.38f)
                lineToRelative(3.1f, 2.59f)
                close()
                moveTo(7.43f, 3.68f)
                curveToRelative(0.18f, -0.34f, 0.15f, -0.77f, -0.11f, -1.09f)
                lineToRelative(-0.03f, -0.03f)
                curveToRelative(-0.3f, -0.36f, -0.8f, -0.43f, -1.2f, -0.22f)
                lineToRelative(1.34f, 1.34f)
                close()
            }
        }.build()
        
        return _Alarm_off!!
    }

private var _Alarm_off: ImageVector? = null

