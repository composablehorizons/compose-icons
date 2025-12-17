package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Local_florist: ImageVector
    get() {
        if (_Local_florist != null) return _Local_florist!!
        
        _Local_florist = ImageVector.Builder(
            name = "local_florist",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 22f)
                curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
                curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                close()
                moveTo(5.6f, 10.25f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.53f, 0f, 1.01f, -0.16f, 1.42f, -0.44f)
                lineToRelative(-0.02f, 0.19f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                lineToRelative(-0.02f, -0.19f)
                curveToRelative(0.4f, 0.28f, 0.89f, 0.44f, 1.42f, 0.44f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1f, -0.59f, -1.85f, -1.43f, -2.25f)
                curveToRelative(0.84f, -0.4f, 1.43f, -1.25f, 1.43f, -2.25f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.53f, 0f, -1.01f, 0.16f, -1.42f, 0.44f)
                lineToRelative(0.02f, -0.19f)
                curveTo(14.5f, 2.12f, 13.38f, 1f, 12f, 1f)
                reflectiveCurveTo(9.5f, 2.12f, 9.5f, 3.5f)
                lineToRelative(0.02f, 0.19f)
                curveToRelative(-0.4f, -0.28f, -0.89f, -0.44f, -1.42f, -0.44f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1f, 0.59f, 1.85f, 1.43f, 2.25f)
                curveToRelative(-0.84f, 0.4f, -1.43f, 1.25f, -1.43f, 2.25f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(9.5f, 9.38f, 9.5f, 8f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(3f, 13f)
                curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                curveToRelative(0f, -4.97f, -4.03f, -9f, -9f, -9f)
                close()
            }
        }.build()
        
        return _Local_florist!!
    }

private var _Local_florist: ImageVector? = null

