package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Water_drop: ImageVector
    get() {
        if (_Water_drop != null) return _Water_drop!!
        
        _Water_drop = ImageVector.Builder(
            name = "water_drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(-5.33f, 4.55f, -8f, 8.48f, -8f, 11.8f)
                curveToRelative(0f, 4.98f, 3.8f, 8.2f, 8f, 8.2f)
                reflectiveCurveToRelative(8f, -3.22f, 8f, -8.2f)
                curveTo(20f, 10.48f, 17.33f, 6.55f, 12f, 2f)
                close()
                moveTo(13f, 18.91f)
                curveTo(12.68f, 18.97f, 12.35f, 19f, 12f, 19f)
                curveToRelative(-2.69f, 0f, -4.88f, -1.94f, -5f, -5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.08f, 2.07f, 1.5f, 3.5f, 3.5f, 3.5f)
                curveToRelative(0.35f, 0f, 0.69f, -0.04f, 1f, -0.13f)
                verticalLineTo(18.91f)
                close()
            }
        }.build()
        
        return _Water_drop!!
    }

private var _Water_drop: ImageVector? = null

