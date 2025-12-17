package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MoneyBillWave: ImageVector
    get() {
        if (_MoneyBillWave != null) return _MoneyBillWave!!
        
        _MoneyBillWave = ImageVector.Builder(
            name = "money-bill-wave",
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
                moveTo(48f, 132.22f)
                curveToRelative(20.12f, 5.04f, 41.12f, 7.57f, 62.72f, 8.93f)
                curveTo(104.84f, 170.54f, 79f, 192.69f, 48f, 192.69f)
                verticalLineToRelative(-60.47f)
                close()
                moveToRelative(0f, 285f)
                verticalLineToRelative(-47.78f)
                curveToRelative(34.37f, 0f, 62.18f, 27.27f, 63.71f, 61.4f)
                curveToRelative(-22.53f, -1.81f, -43.59f, -6.31f, -63.71f, -13.62f)
                close()
                moveTo(320f, 352f)
                curveToRelative(-44.19f, 0f, -80f, -42.99f, -80f, -96f)
                curveToRelative(0f, -53.02f, 35.82f, -96f, 80f, -96f)
                reflectiveCurveToRelative(80f, 42.98f, 80f, 96f)
                curveToRelative(0f, 53.03f, -35.83f, 96f, -80f, 96f)
                close()
                moveToRelative(272f, 27.78f)
                curveToRelative(-17.52f, -4.39f, -35.71f, -6.85f, -54.32f, -8.44f)
                curveToRelative(5.87f, -26.08f, 27.5f, -45.88f, 54.32f, -49.28f)
                verticalLineToRelative(57.72f)
                close()
                moveToRelative(0f, -236.11f)
                curveToRelative(-30.89f, -3.91f, -54.86f, -29.7f, -55.81f, -61.55f)
                curveToRelative(19.54f, 2.17f, 38.09f, 6.23f, 55.81f, 12.66f)
                verticalLineToRelative(48.89f)
                close()
            }
        }.build()
        
        return _MoneyBillWave!!
    }

private var _MoneyBillWave: ImageVector? = null

