package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Wb_auto: ImageVector
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
                moveTo(8f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(2.35f, 0f, 4.38f, -1.36f, 5.36f, -3.32f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.4f, -0.81f, 0.63f, -1.71f, 0.63f, -2.67f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveToRelative(2.3f, 10f)
                lineToRelative(-0.7f, -2f)
                horizontalLineTo(6.4f)
                lineToRelative(-0.7f, 2f)
                horizontalLineTo(3.8f)
                lineTo(7f, 7f)
                horizontalLineToRelative(2f)
                lineToRelative(3.2f, 9f)
                horizontalLineToRelative(-1.9f)
                close()
                moveToRelative(-3.45f, -3.35f)
                horizontalLineToRelative(2.3f)
                lineTo(8f, 9f)
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
                moveToRelative(13.95f, 0.64f)
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
                lineToRelative(-1.2f, 6.29f)
                close()
                moveToRelative(-7.43f, 1.38f)
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

