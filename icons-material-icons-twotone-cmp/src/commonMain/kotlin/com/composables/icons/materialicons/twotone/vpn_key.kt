package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Vpn_key: ImageVector
    get() {
        if (_Vpn_key != null) return _Vpn_key!!
        
        _Vpn_key = ImageVector.Builder(
            name = "vpn_key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.71f, 10.33f)
                curveTo(11.01f, 8.34f, 9.11f, 7f, 7f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(2.11f, 0f, 4.01f, -1.34f, 4.71f, -3.33f)
                lineToRelative(0.23f, -0.67f)
                horizontalLineTo(18f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11.94f)
                lineToRelative(-0.23f, -0.67f)
                close()
                moveTo(7f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 5f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                curveToRelative(2.72f, 0f, 5.17f, -1.58f, 6.32f, -4f)
                horizontalLineTo(16f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(13.32f)
                curveTo(12.17f, 6.58f, 9.72f, 5f, 7f, 5f)
                close()
                moveToRelative(15f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6.06f)
                lineToRelative(-0.23f, 0.67f)
                curveTo(11.01f, 15.66f, 9.11f, 17f, 7f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                curveToRelative(2.11f, 0f, 4.01f, 1.34f, 4.71f, 3.33f)
                lineToRelative(0.23f, 0.67f)
                horizontalLineTo(22f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 9f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveToRelative(0f, 4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Vpn_key!!
    }

private var _Vpn_key: ImageVector? = null

