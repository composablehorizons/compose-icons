package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Location_off: ImageVector
    get() {
        if (_Location_off != null) return _Location_off!!
        
        _Location_off = ImageVector.Builder(
            name = "location_off",
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
                moveToRelative(11.75f, 11.47f)
                lineToRelative(-0.11f, -0.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.74f, -0.33f, 1.39f, -0.83f, 1.85f)
                lineToRelative(3.63f, 3.63f)
                curveToRelative(0.98f, -1.86f, 1.7f, -3.8f, 1.7f, -5.48f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                curveToRelative(-1.98f, 0f, -3.76f, 0.83f, -5.04f, 2.15f)
                lineToRelative(3.19f, 3.19f)
                curveToRelative(0.46f, -0.52f, 1.11f, -0.84f, 1.85f, -0.84f)
                close()
                moveToRelative(4.37f, 9.6f)
                lineToRelative(-4.63f, -4.63f)
                lineToRelative(-0.11f, -0.11f)
                lineTo(3.27f, 3f)
                lineTo(2f, 4.27f)
                lineToRelative(3.18f, 3.18f)
                curveTo(5.07f, 7.95f, 5f, 8.47f, 5f, 9f)
                curveToRelative(0f, 5.25f, 7f, 13f, 7f, 13f)
                reflectiveCurveToRelative(1.67f, -1.85f, 3.38f, -4.35f)
                lineTo(18.73f, 21f)
                lineTo(20f, 19.73f)
                lineToRelative(-3.63f, -3.63f)
                close()
            }
        }.build()
        
        return _Location_off!!
    }

private var _Location_off: ImageVector? = null

