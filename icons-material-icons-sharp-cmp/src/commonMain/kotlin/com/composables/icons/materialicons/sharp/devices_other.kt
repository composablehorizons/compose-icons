package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Devices_other: ImageVector
    get() {
        if (_Devices_other != null) return _Devices_other!!
        
        _Devices_other = ImageVector.Builder(
            name = "devices_other",
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
                moveTo(3f, 6f)
                horizontalLineToRelative(18f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                close()
                moveToRelative(10f, 6f)
                horizontalLineTo(9f)
                verticalLineToRelative(1.78f)
                curveToRelative(-0.61f, 0.55f, -1f, 1.33f, -1f, 2.22f)
                curveToRelative(0f, 0.89f, 0.39f, 1.67f, 1f, 2.22f)
                verticalLineTo(20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.61f, -0.55f, 1f, -1.34f, 1f, -2.22f)
                reflectiveCurveToRelative(-0.39f, -1.67f, -1f, -2.22f)
                verticalLineTo(12f)
                close()
                moveToRelative(-2f, 5.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23f, 8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(8f)
                verticalLineTo(8f)
                close()
                moveToRelative(-2f, 10f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Devices_other!!
    }

private var _Devices_other: ImageVector? = null

