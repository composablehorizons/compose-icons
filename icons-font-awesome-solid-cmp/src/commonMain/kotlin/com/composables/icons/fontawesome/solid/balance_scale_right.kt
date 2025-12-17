package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BalanceScaleRight: ImageVector
    get() {
        if (_BalanceScaleRight != null) return _BalanceScaleRight!!
        
        _BalanceScaleRight = ImageVector.Builder(
            name = "balance-scale-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 464f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(224f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(153.25f)
                curveToRelative(4.56f, -2f, 8.92f, -4.35f, 12.99f, -7.12f)
                lineToRelative(142.05f, 47.63f)
                curveToRelative(8.38f, 2.81f, 17.45f, -1.71f, 20.26f, -10.08f)
                lineToRelative(10.17f, -30.34f)
                curveToRelative(2.81f, -8.38f, -1.71f, -17.45f, -10.08f, -20.26f)
                lineToRelative(-128.4f, -43.05f)
                curveToRelative(0.42f, -3.32f, 1.01f, -6.6f, 1.01f, -10.03f)
                curveToRelative(0f, -44.18f, -35.82f, -80f, -80f, -80f)
                curveToRelative(-29.69f, 0f, -55.3f, 16.36f, -69.11f, 40.37f)
                lineTo(132.96f, 0.83f)
                curveToRelative(-8.38f, -2.81f, -17.45f, 1.71f, -20.26f, 10.08f)
                lineToRelative(-10.17f, 30.34f)
                curveToRelative(-2.81f, 8.38f, 1.71f, 17.45f, 10.08f, 20.26f)
                lineToRelative(132f, 44.26f)
                curveToRelative(7.28f, 21.25f, 22.96f, 38.54f, 43.38f, 47.47f)
                verticalLineTo(448f)
                horizontalLineTo(112f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                close()
                moveTo(0f, 304f)
                curveToRelative(0f, 44.18f, 57.31f, 80f, 128f, 80f)
                reflectiveCurveToRelative(128f, -35.82f, 128f, -80f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0f, -15.67f, 2.08f, -7.25f, -85.05f, -181.51f)
                curveToRelative(-17.68f, -35.36f, -68.22f, -35.29f, -85.87f, 0f)
                curveTo(-1.32f, 295.27f, 0.02f, 287.82f, 0.02f, 304f)
                horizontalLineTo(0f)
                close()
                moveToRelative(56f, -16f)
                lineToRelative(72f, -144f)
                lineToRelative(72f, 144f)
                horizontalLineTo(56f)
                close()
                moveToRelative(328.02f, 144f)
                horizontalLineTo(384f)
                curveToRelative(0f, 44.18f, 57.31f, 80f, 128f, 80f)
                reflectiveCurveToRelative(128f, -35.82f, 128f, -80f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0f, -15.67f, 2.08f, -7.25f, -85.05f, -181.51f)
                curveToRelative(-17.68f, -35.36f, -68.22f, -35.29f, -85.87f, 0f)
                curveToRelative(-86.38f, 172.78f, -85.04f, 165.33f, -85.04f, 181.51f)
                close()
                moveTo(440f, 416f)
                lineToRelative(72f, -144f)
                lineToRelative(72f, 144f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _BalanceScaleRight!!
    }

private var _BalanceScaleRight: ImageVector? = null

