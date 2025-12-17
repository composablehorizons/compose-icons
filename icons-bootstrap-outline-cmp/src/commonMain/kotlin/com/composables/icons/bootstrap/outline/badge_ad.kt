package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeAd: ImageVector
    get() {
        if (_BadgeAd != null) return _BadgeAd!!
        
        _BadgeAd = ImageVector.Builder(
            name = "badge-ad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.7f, 11f)
                lineToRelative(0.47f, -1.542f)
                horizontalLineToRelative(2.004f)
                lineTo(6.644f, 11f)
                horizontalLineToRelative(1.261f)
                lineTo(5.901f, 5.001f)
                horizontalLineTo(4.513f)
                lineTo(2.5f, 11f)
                close()
                moveToRelative(1.503f, -4.852f)
                lineToRelative(0.734f, 2.426f)
                horizontalLineTo(4.416f)
                lineToRelative(0.734f, -2.426f)
                close()
                moveToRelative(4.759f, 0.128f)
                curveToRelative(-1.059f, 0f, -1.753f, 0.765f, -1.753f, 2.043f)
                verticalLineToRelative(0.695f)
                curveToRelative(0f, 1.279f, 0.685f, 2.043f, 1.74f, 2.043f)
                curveToRelative(0.677f, 0f, 1.222f, -0.33f, 1.367f, -0.804f)
                horizontalLineToRelative(0.057f)
                verticalLineTo(11f)
                horizontalLineToRelative(1.138f)
                verticalLineTo(4.685f)
                horizontalLineToRelative(-1.16f)
                verticalLineToRelative(2.36f)
                horizontalLineToRelative(-0.053f)
                curveToRelative(-0.18f, -0.475f, -0.68f, -0.77f, -1.336f, -0.77f)
                close()
                moveToRelative(0.387f, 0.923f)
                curveToRelative(0.58f, 0f, 1.002f, 0.44f, 1.002f, 1.138f)
                verticalLineToRelative(0.602f)
                curveToRelative(0f, 0.76f, -0.396f, 1.2f, -0.984f, 1.2f)
                curveToRelative(-0.598f, 0f, -0.972f, -0.449f, -0.972f, -1.248f)
                verticalLineToRelative(-0.453f)
                curveToRelative(0f, -0.795f, 0.37f, -1.24f, 0.954f, -1.24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
            }
        }.build()
        
        return _BadgeAd!!
    }

private var _BadgeAd: ImageVector? = null

