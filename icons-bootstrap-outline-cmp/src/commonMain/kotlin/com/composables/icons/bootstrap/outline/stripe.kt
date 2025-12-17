package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Stripe: ImageVector
    get() {
        if (_Stripe != null) return _Stripe!!
        
        _Stripe = ImageVector.Builder(
            name = "stripe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(6.226f, 5.385f)
                curveToRelative(-0.584f, 0f, -0.937f, 0.164f, -0.937f, 0.593f)
                curveToRelative(0f, 0.468f, 0.607f, 0.674f, 1.36f, 0.93f)
                curveToRelative(1.228f, 0.415f, 2.844f, 0.963f, 2.851f, 2.993f)
                curveTo(11.5f, 11.868f, 9.924f, 13f, 7.63f, 13f)
                arcToRelative(7.7f, 7.7f, 0f, false, true, -3.009f, -0.626f)
                verticalLineTo(9.758f)
                curveToRelative(0.926f, 0.506f, 2.095f, 0.88f, 3.01f, 0.88f)
                curveToRelative(0.617f, 0f, 1.058f, -0.165f, 1.058f, -0.671f)
                curveToRelative(0f, -0.518f, -0.658f, -0.755f, -1.453f, -1.041f)
                curveTo(6.026f, 8.49f, 4.5f, 7.94f, 4.5f, 6.11f)
                curveTo(4.5f, 4.165f, 5.988f, 3f, 8.226f, 3f)
                arcToRelative(7.3f, 7.3f, 0f, false, true, 2.734f, 0.505f)
                verticalLineToRelative(2.583f)
                curveToRelative(-0.838f, -0.45f, -1.896f, -0.703f, -2.734f, -0.703f)
            }
        }.build()
        
        return _Stripe!!
    }

private var _Stripe: ImageVector? = null

