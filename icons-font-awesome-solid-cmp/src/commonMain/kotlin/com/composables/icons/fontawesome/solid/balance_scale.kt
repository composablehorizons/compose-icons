package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BalanceScale: ImageVector
    get() {
        if (_BalanceScale != null) return _BalanceScale!!
        
        _BalanceScale = ImageVector.Builder(
            name = "balance-scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 336f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0f)
                curveTo(-2.06f, 328.75f, 0.02f, 320.33f, 0.02f, 336f)
                horizontalLineTo(0f)
                curveToRelative(0f, 44.18f, 57.31f, 80f, 128f, 80f)
                reflectiveCurveToRelative(128f, -35.82f, 128f, -80f)
                close()
                moveTo(128f, 176f)
                lineToRelative(72f, 144f)
                horizontalLineTo(56f)
                lineToRelative(72f, -144f)
                close()
                moveToRelative(511.98f, 160f)
                curveToRelative(0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0f)
                curveToRelative(-87.12f, 174.26f, -85.04f, 165.84f, -85.04f, 181.51f)
                horizontalLineTo(384f)
                curveToRelative(0f, 44.18f, 57.31f, 80f, 128f, 80f)
                reflectiveCurveToRelative(128f, -35.82f, 128f, -80f)
                horizontalLineToRelative(-0.02f)
                close()
                moveTo(440f, 320f)
                lineToRelative(72f, -144f)
                lineToRelative(72f, 144f)
                horizontalLineTo(440f)
                close()
                moveToRelative(88f, 128f)
                horizontalLineTo(352f)
                verticalLineTo(153.25f)
                curveToRelative(23.51f, -10.29f, 41.16f, -31.48f, 46.39f, -57.25f)
                horizontalLineTo(528f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(383.64f)
                curveTo(369.04f, 12.68f, 346.09f, 0f, 320f, 0f)
                reflectiveCurveToRelative(-49.04f, 12.68f, -63.64f, 32f)
                horizontalLineTo(112f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(129.61f)
                curveToRelative(5.23f, 25.76f, 22.87f, 46.96f, 46.39f, 57.25f)
                verticalLineTo(448f)
                horizontalLineTo(112f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(416f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _BalanceScale!!
    }

private var _BalanceScale: ImageVector? = null

