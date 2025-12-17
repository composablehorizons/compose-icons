package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`360`: ImageVector
    get() {
        if (_360 != null) return _360!!
        
        _360 = ImageVector.Builder(
            name = "360",
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
                moveTo(12f, 7f)
                curveTo(6.48f, 7f, 2f, 9.24f, 2f, 12f)
                curveToRelative(0f, 2.24f, 2.94f, 4.13f, 7f, 4.77f)
                verticalLineToRelative(2.02f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f)
                verticalLineToRelative(1.52f)
                curveToRelative(-3.15f, -0.56f, -5f, -1.9f, -5f, -2.73f)
                curveToRelative(0f, -1.06f, 3.04f, -3f, 8f, -3f)
                reflectiveCurveToRelative(8f, 1.94f, 8f, 3f)
                curveToRelative(0f, 0.66f, -1.2f, 1.68f, -3.32f, 2.34f)
                curveToRelative(-0.41f, 0.13f, -0.68f, 0.51f, -0.68f, 0.94f)
                curveToRelative(0f, 0.67f, 0.65f, 1.16f, 1.28f, 0.96f)
                curveTo(20.11f, 15.36f, 22f, 13.79f, 22f, 12f)
                curveToRelative(0f, -2.76f, -4.48f, -5f, -10f, -5f)
                close()
            }
        }.build()
        
        return _360!!
    }

private var _360: ImageVector? = null

