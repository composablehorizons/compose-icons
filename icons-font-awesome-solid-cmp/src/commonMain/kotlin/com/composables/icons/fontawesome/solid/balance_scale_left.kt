package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BalanceScaleLeft: ImageVector
    get() {
        if (_BalanceScaleLeft != null) return _BalanceScaleLeft!!
        
        _BalanceScaleLeft = ImageVector.Builder(
            name = "balance-scale-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 448f)
                horizontalLineTo(352f)
                verticalLineTo(153.25f)
                curveToRelative(20.42f, -8.94f, 36.1f, -26.22f, 43.38f, -47.47f)
                lineToRelative(132f, -44.26f)
                curveToRelative(8.38f, -2.81f, 12.89f, -11.88f, 10.08f, -20.26f)
                lineToRelative(-10.17f, -30.34f)
                curveTo(524.48f, 2.54f, 515.41f, -1.97f, 507.03f, 0.84f)
                lineTo(389.11f, 40.37f)
                curveTo(375.3f, 16.36f, 349.69f, 0f, 320f, 0f)
                curveToRelative(-44.18f, 0f, -80f, 35.82f, -80f, 80f)
                curveToRelative(0f, 3.43f, 0.59f, 6.71f, 1.01f, 10.03f)
                lineToRelative(-128.39f, 43.05f)
                curveToRelative(-8.38f, 2.81f, -12.89f, 11.88f, -10.08f, 20.26f)
                lineToRelative(10.17f, 30.34f)
                curveToRelative(2.81f, 8.38f, 11.88f, 12.89f, 20.26f, 10.08f)
                lineToRelative(142.05f, -47.63f)
                curveToRelative(4.07f, 2.77f, 8.43f, 5.12f, 12.99f, 7.12f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(224f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(-0.01f, -8.84f, -7.17f, -16f, -16.01f, -16f)
                close()
                moveToRelative(111.98f, -144f)
                curveToRelative(0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0f)
                curveToRelative(-87.12f, 174.26f, -85.04f, 165.84f, -85.04f, 181.51f)
                horizontalLineTo(384f)
                curveToRelative(0f, 44.18f, 57.31f, 80f, 128f, 80f)
                reflectiveCurveToRelative(128f, -35.82f, 128f, -80f)
                horizontalLineToRelative(-0.02f)
                close()
                moveTo(440f, 288f)
                lineToRelative(72f, -144f)
                lineToRelative(72f, 144f)
                horizontalLineTo(440f)
                close()
                moveToRelative(-269.07f, -37.51f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0f)
                curveTo(-2.06f, 424.75f, 0.02f, 416.33f, 0.02f, 432f)
                horizontalLineTo(0f)
                curveToRelative(0f, 44.18f, 57.31f, 80f, 128f, 80f)
                reflectiveCurveToRelative(128f, -35.82f, 128f, -80f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                close()
                moveTo(56f, 416f)
                lineToRelative(72f, -144f)
                lineToRelative(72f, 144f)
                horizontalLineTo(56f)
                close()
            }
        }.build()
        
        return _BalanceScaleLeft!!
    }

private var _BalanceScaleLeft: ImageVector? = null

