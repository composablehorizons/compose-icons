package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Wallet: ImageVector
    get() {
        if (_Wallet != null) return _Wallet!!
        
        _Wallet = ImageVector.Builder(
            name = "wallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 3.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                curveToRelative(0f, 0.253f, 0.08f, 0.644f, 0.306f, 0.958f)
                curveToRelative(0.207f, 0.288f, 0.557f, 0.542f, 1.194f, 0.542f)
                reflectiveCurveToRelative(0.987f, -0.254f, 1.194f, -0.542f)
                curveTo(9.42f, 6.644f, 9.5f, 6.253f, 9.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 6.5f)
                horizontalLineToRelative(-5.551f)
                arcToRelative(2.7f, 2.7f, 0f, false, true, -0.443f, 1.042f)
                curveTo(9.613f, 8.088f, 8.963f, 8.5f, 8f, 8.5f)
                reflectiveCurveToRelative(-1.613f, -0.412f, -2.006f, -0.958f)
                arcTo(2.7f, 2.7f, 0f, false, true, 5.551f, 6.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 14f)
                horizontalLineToRelative(13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                close()
            }
        }.build()
        
        return _Wallet!!
    }

private var _Wallet: ImageVector? = null

