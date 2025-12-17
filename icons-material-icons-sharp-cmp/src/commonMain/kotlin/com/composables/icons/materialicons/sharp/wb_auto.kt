package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wb_auto: ImageVector
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
                moveTo(6.85f, 12.65f)
                horizontalLineToRelative(2.3f)
                lineTo(8f, 9f)
                lineToRelative(-1.15f, 3.65f)
                close()
                moveTo(22f, 7f)
                lineToRelative(-1.2f, 6.29f)
                lineTo(19.3f, 7f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.49f, 6.29f)
                lineTo(15f, 7f)
                horizontalLineToRelative(-0.76f)
                curveTo(12.77f, 5.17f, 10.53f, 4f, 8f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                reflectiveCurveToRelative(3.58f, 8f, 8f, 8f)
                curveToRelative(3.13f, 0f, 5.84f, -1.81f, 7.15f, -4.43f)
                lineToRelative(0.1f, 0.43f)
                horizontalLineTo(17f)
                lineToRelative(1.5f, -6.1f)
                lineTo(20f, 16f)
                horizontalLineToRelative(1.75f)
                lineToRelative(2.05f, -9f)
                horizontalLineTo(22f)
                close()
                moveToRelative(-11.7f, 9f)
                lineToRelative(-0.7f, -2f)
                horizontalLineTo(6.4f)
                lineToRelative(-0.7f, 2f)
                horizontalLineTo(3.8f)
                lineTo(7f, 7f)
                horizontalLineToRelative(2f)
                lineToRelative(3.2f, 9f)
                horizontalLineToRelative(-1.9f)
                close()
            }
        }.build()
        
        return _Wb_auto!!
    }

private var _Wb_auto: ImageVector? = null

