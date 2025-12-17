package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MoneyBillWaveAlt: ImageVector
    get() {
        if (_MoneyBillWaveAlt != null) return _MoneyBillWaveAlt!!
        
        _MoneyBillWaveAlt = ImageVector.Builder(
            name = "money-bill-wave-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(621.16f, 54.46f)
                curveTo(582.37f, 38.19f, 543.55f, 32f, 504.75f, 32f)
                curveToRelative(-123.17f, -0.01f, -246.33f, 62.34f, -369.5f, 62.34f)
                curveToRelative(-30.89f, 0f, -61.76f, -3.92f, -92.65f, -13.72f)
                curveToRelative(-3.47f, -1.1f, -6.95f, -1.62f, -10.35f, -1.62f)
                curveTo(15.04f, 79f, 0f, 92.32f, 0f, 110.81f)
                verticalLineToRelative(317.26f)
                curveToRelative(0f, 12.63f, 7.23f, 24.6f, 18.84f, 29.46f)
                curveTo(57.63f, 473.81f, 96.45f, 480f, 135.25f, 480f)
                curveToRelative(123.17f, 0f, 246.34f, -62.35f, 369.51f, -62.35f)
                curveToRelative(30.89f, 0f, 61.76f, 3.92f, 92.65f, 13.72f)
                curveToRelative(3.47f, 1.1f, 6.95f, 1.62f, 10.35f, 1.62f)
                curveToRelative(17.21f, 0f, 32.25f, -13.32f, 32.25f, -31.81f)
                verticalLineTo(83.93f)
                curveToRelative(-0.01f, -12.64f, -7.24f, -24.6f, -18.85f, -29.47f)
                close()
                moveTo(320f, 352f)
                curveToRelative(-44.19f, 0f, -80f, -42.99f, -80f, -96f)
                curveToRelative(0f, -53.02f, 35.82f, -96f, 80f, -96f)
                reflectiveCurveToRelative(80f, 42.98f, 80f, 96f)
                curveToRelative(0f, 53.03f, -35.83f, 96f, -80f, 96f)
                close()
            }
        }.build()
        
        return _MoneyBillWaveAlt!!
    }

private var _MoneyBillWaveAlt: ImageVector? = null

