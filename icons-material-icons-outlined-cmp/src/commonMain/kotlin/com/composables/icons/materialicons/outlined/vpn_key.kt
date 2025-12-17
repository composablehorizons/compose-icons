package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Vpn_key: ImageVector
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
                moveTo(22f, 19f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.68f)
                curveToRelative(-1.14f, 2.42f, -3.6f, 4f, -6.32f, 4f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                curveToRelative(2.72f, 0f, 5.17f, 1.58f, 6.32f, 4f)
                horizontalLineTo(24f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(-4f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(11.94f)
                lineToRelative(-0.23f, -0.67f)
                curveTo(11.01f, 8.34f, 9.11f, 7f, 7f, 7f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(2.11f, 0f, 4.01f, -1.34f, 4.71f, -3.33f)
                lineToRelative(0.23f, -0.67f)
                horizontalLineTo(18f)
                verticalLineToRelative(4f)
                close()
                moveTo(7f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveToRelative(0f, -4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Vpn_key!!
    }

private var _Vpn_key: ImageVector? = null

