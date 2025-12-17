package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Adb: ImageVector
    get() {
        if (_Adb != null) return _Adb!!
        
        _Adb = ImageVector.Builder(
            name = "adb",
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
                moveTo(5f, 16f)
                curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.13f, 7f, -7f)
                verticalLineToRelative(-4f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                close()
                moveTo(16.12f, 4.37f)
                lineToRelative(2.1f, -2.1f)
                lineToRelative(-0.82f, -0.83f)
                lineToRelative(-2.3f, 2.31f)
                curveTo(14.16f, 3.28f, 13.12f, 3f, 12f, 3f)
                reflectiveCurveToRelative(-2.16f, 0.28f, -3.09f, 0.75f)
                lineTo(6.6f, 1.44f)
                lineToRelative(-0.82f, 0.83f)
                lineToRelative(2.1f, 2.1f)
                curveTo(6.14f, 5.64f, 5f, 7.68f, 5f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.32f, -1.14f, -4.36f, -2.88f, -5.63f)
                close()
                moveTo(9f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(6f, 0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Adb!!
    }

private var _Adb: ImageVector? = null

