package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Brush: ImageVector
    get() {
        if (_Brush != null) return _Brush!!
        
        _Brush = ImageVector.Builder(
            name = "brush",
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
                moveTo(8f, 17f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.74f, -0.19f, 1.4f, -0.5f, 1.95f)
                curveToRelative(0.17f, 0.03f, 0.33f, 0.05f, 0.5f, 0.05f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.75f, 15f)
                lineToRelative(8.96f, -8.96f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.34f, -1.34f)
                curveToRelative(-0.2f, -0.2f, -0.45f, -0.29f, -0.7f, -0.29f)
                reflectiveCurveToRelative(-0.51f, 0.1f, -0.71f, 0.29f)
                lineTo(9f, 12.25f)
                lineTo(11.75f, 15f)
                close()
                moveTo(6f, 21f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                curveToRelative(0f, 1.31f, -1.16f, 2f, -2f, 2f)
                curveToRelative(0.92f, 1.22f, 2.49f, 2f, 4f, 2f)
                close()
                moveToRelative(0f, -4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                curveToRelative(-0.17f, 0f, -0.33f, -0.02f, -0.5f, -0.05f)
                curveToRelative(0.31f, -0.55f, 0.5f, -1.21f, 0.5f, -1.95f)
                close()
            }
        }.build()
        
        return _Brush!!
    }

private var _Brush: ImageVector? = null

