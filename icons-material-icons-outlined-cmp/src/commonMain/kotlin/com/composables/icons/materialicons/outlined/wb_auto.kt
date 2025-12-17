package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wb_auto: ImageVector
    get() {
        if (_Wb_auto != null) return _Wb_auto!!
        
        _Wb_auto = ImageVector.Builder(
            name = "wb_auto",
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
                moveTo(7f, 7f)
                lineToRelative(-3.2f, 9f)
                horizontalLineToRelative(1.9f)
                lineToRelative(0.7f, -2f)
                horizontalLineToRelative(3.2f)
                lineToRelative(0.7f, 2f)
                horizontalLineToRelative(1.9f)
                lineTo(9f, 7f)
                horizontalLineTo(7f)
                close()
                moveToRelative(-0.15f, 5.65f)
                lineTo(8f, 9f)
                lineToRelative(1.15f, 3.65f)
                horizontalLineToRelative(-2.3f)
                close()
                moveTo(22f, 7f)
                lineToRelative(-1.2f, 6.29f)
                lineTo(19.3f, 7f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.49f, 6.29f)
                lineTo(15f, 7f)
                horizontalLineToRelative(-0.76f)
                lineToRelative(-0.01f, 0.01f)
                curveTo(12.76f, 5.18f, 10.53f, 4f, 8f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                reflectiveCurveToRelative(3.58f, 8f, 8f, 8f)
                curveToRelative(2.96f, 0f, 5.55f, -1.61f, 6.93f, -4f)
                curveToRelative(0.03f, -0.06f, 0.05f, -0.12f, 0.08f, -0.18f)
                curveToRelative(0.05f, -0.08f, 0.09f, -0.17f, 0.14f, -0.25f)
                lineToRelative(0.1f, 0.43f)
                horizontalLineTo(17f)
                lineToRelative(1.5f, -6.1f)
                lineTo(20f, 16f)
                horizontalLineToRelative(1.75f)
                lineToRelative(2.05f, -9f)
                horizontalLineTo(22f)
                close()
                moveToRelative(-8.63f, 7.67f)
                curveTo(12.38f, 16.64f, 10.35f, 18f, 8f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 0.96f, -0.23f, 1.86f, -0.63f, 2.67f)
                close()
            }
        }.build()
        
        return _Wb_auto!!
    }

private var _Wb_auto: ImageVector? = null

