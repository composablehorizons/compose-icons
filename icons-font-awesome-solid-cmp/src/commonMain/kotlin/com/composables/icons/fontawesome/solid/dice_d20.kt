package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.DiceD20: ImageVector
    get() {
        if (_DiceD20 != null) return _DiceD20!!
        
        _DiceD20 = ImageVector.Builder(
            name = "dice-d20",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(106.75f, 215.06f)
                lineTo(1.2f, 370.95f)
                curveToRelative(-3.08f, 5f, 0.1f, 11.5f, 5.93f, 12.14f)
                lineToRelative(208.26f, 22.07f)
                lineToRelative(-108.64f, -190.1f)
                close()
                moveTo(7.41f, 315.43f)
                lineTo(82.7f, 193.08f)
                lineTo(6.06f, 147.1f)
                curveToRelative(-2.67f, -1.6f, -6.06f, 0.32f, -6.06f, 3.43f)
                verticalLineToRelative(162.81f)
                curveToRelative(0f, 4.03f, 5.29f, 5.53f, 7.41f, 2.09f)
                close()
                moveTo(18.25f, 423.6f)
                lineToRelative(194.4f, 87.66f)
                curveToRelative(5.3f, 2.45f, 11.35f, -1.43f, 11.35f, -7.26f)
                verticalLineToRelative(-65.67f)
                lineToRelative(-203.55f, -22.3f)
                curveToRelative(-4.45f, -0.5f, -6.23f, 5.59f, -2.2f, 7.57f)
                close()
                moveToRelative(81.22f, -257.78f)
                lineTo(179.4f, 22.88f)
                curveToRelative(4.34f, -7.06f, -3.59f, -15.25f, -10.78f, -11.14f)
                lineTo(17.81f, 110.35f)
                curveToRelative(-2.47f, 1.62f, -2.39f, 5.26f, 0.13f, 6.78f)
                lineToRelative(81.53f, 48.69f)
                close()
                moveTo(240f, 176f)
                horizontalLineToRelative(109.21f)
                lineTo(253.63f, 7.62f)
                curveTo(250.5f, 2.54f, 245.25f, 0f, 240f, 0f)
                reflectiveCurveToRelative(-10.5f, 2.54f, -13.63f, 7.62f)
                lineTo(130.79f, 176f)
                horizontalLineTo(240f)
                close()
                moveToRelative(233.94f, -28.9f)
                lineToRelative(-76.64f, 45.99f)
                lineToRelative(75.29f, 122.35f)
                curveToRelative(2.11f, 3.44f, 7.41f, 1.94f, 7.41f, -2.1f)
                verticalLineTo(150.53f)
                curveToRelative(0f, -3.11f, -3.39f, -5.03f, -6.06f, -3.43f)
                close()
                moveToRelative(-93.41f, 18.72f)
                lineToRelative(81.53f, -48.7f)
                curveToRelative(2.53f, -1.52f, 2.6f, -5.16f, 0.13f, -6.78f)
                lineToRelative(-150.81f, -98.6f)
                curveToRelative(-7.19f, -4.11f, -15.12f, 4.08f, -10.78f, 11.14f)
                lineToRelative(79.93f, 142.94f)
                close()
                moveToRelative(79.02f, 250.21f)
                lineTo(256f, 438.32f)
                verticalLineToRelative(65.67f)
                curveToRelative(0f, 5.84f, 6.05f, 9.71f, 11.35f, 7.26f)
                lineToRelative(194.4f, -87.66f)
                curveToRelative(4.03f, -1.97f, 2.25f, -8.06f, -2.2f, -7.56f)
                close()
                moveToRelative(-86.3f, -200.97f)
                lineToRelative(-108.63f, 190.1f)
                lineToRelative(208.26f, -22.07f)
                curveToRelative(5.83f, -0.65f, 9.01f, -7.14f, 5.93f, -12.14f)
                lineTo(373.25f, 215.06f)
                close()
                moveTo(240f, 208f)
                horizontalLineTo(139.57f)
                lineTo(240f, 383.75f)
                lineTo(340.43f, 208f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _DiceD20!!
    }

private var _DiceD20: ImageVector? = null

