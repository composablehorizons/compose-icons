package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Faucet: ImageVector
    get() {
        if (_Faucet != null) return _Faucet!!
        
        _Faucet = ImageVector.Builder(
            name = "faucet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(352f, 256f)
                horizontalLineTo(313.39f)
                curveToRelative(-15.71f, -13.44f, -35.46f, -23.07f, -57.39f, -28f)
                verticalLineTo(180.44f)
                lineToRelative(-32f, -3.38f)
                lineToRelative(-32f, 3.38f)
                verticalLineTo(228f)
                curveToRelative(-21.93f, 5f, -41.68f, 14.6f, -57.39f, 28f)
                horizontalLineTo(16f)
                arcTo(16f, 16f, 0f, false, false, 0f, 272f)
                verticalLineToRelative(96f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(92.79f)
                curveTo(129.38f, 421.73f, 173f, 448f, 224f, 448f)
                reflectiveCurveToRelative(94.62f, -26.27f, 115.21f, -64f)
                horizontalLineTo(352f)
                arcToRelative(32f, 32f, 0f, false, true, 32f, 32f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(64f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                arcTo(160f, 160f, 0f, false, false, 352f, 256f)
                close()
                moveTo(81.59f, 159.91f)
                lineToRelative(142.41f, -15f)
                lineToRelative(142.41f, 15f)
                curveToRelative(9.42f, 1f, 17.59f, -6.81f, 17.59f, -16.8f)
                verticalLineTo(112.89f)
                curveToRelative(0f, -10f, -8.17f, -17.8f, -17.59f, -16.81f)
                lineTo(256f, 107.74f)
                verticalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(27.74f)
                lineTo(81.59f, 96.08f)
                curveTo(72.17f, 95.09f, 64f, 102.9f, 64f, 112.89f)
                verticalLineToRelative(30.22f)
                curveTo(64f, 153.1f, 72.17f, 160.91f, 81.59f, 159.91f)
                close()
            }
        }.build()
        
        return _Faucet!!
    }

private var _Faucet: ImageVector? = null

