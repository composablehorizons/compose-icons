package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Assistant_direction: ImageVector
    get() {
        if (_Assistant_direction != null) return _Assistant_direction!!
        
        _Assistant_direction = ImageVector.Builder(
            name = "assistant_direction",
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
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 10f)
                horizontalLineTo(9f)
                curveToRelative(-0.6f, 0f, -1f, 0.4f, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.5f, -3.5f)
                lineTo(14f, 7.5f)
                verticalLineTo(10f)
                close()
                moveToRelative(-2f, -9f)
                curveTo(5.9f, 1f, 1f, 5.9f, 1f, 12f)
                reflectiveCurveToRelative(4.9f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.9f, 11f, -11f)
                reflectiveCurveTo(18.1f, 1f, 12f, 1f)
                close()
                moveToRelative(7.73f, 11.58f)
                lineToRelative(-7.19f, 7.22f)
                curveToRelative(-0.35f, 0.27f, -0.79f, 0.27f, -1.15f, 0f)
                lineTo(4.2f, 12.58f)
                curveToRelative(-0.27f, -0.36f, -0.27f, -0.8f, 0f, -1.16f)
                lineToRelative(7.19f, -7.22f)
                curveToRelative(0.35f, -0.27f, 0.79f, -0.27f, 1.15f, 0f)
                lineToRelative(7.19f, 7.22f)
                curveToRelative(0.36f, 0.27f, 0.36f, 0.8f, 0f, 1.16f)
                close()
            }
        }.build()
        
        return _Assistant_direction!!
    }

private var _Assistant_direction: ImageVector? = null

