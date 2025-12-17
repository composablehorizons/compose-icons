package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cast: ImageVector
    get() {
        if (_Cast != null) return _Cast!!
        
        _Cast = ImageVector.Builder(
            name = "cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(2.14f, 14.09f)
                curveToRelative(-0.6f, -0.1f, -1.14f, 0.39f, -1.14f, 1f)
                curveToRelative(0f, 0.49f, 0.36f, 0.9f, 0.85f, 0.98f)
                curveToRelative(2.08f, 0.36f, 3.72f, 2f, 4.08f, 4.08f)
                curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f)
                curveToRelative(0.61f, 0f, 1.09f, -0.54f, 1f, -1.14f)
                curveToRelative(-0.48f, -2.96f, -2.82f, -5.29f, -5.77f, -5.77f)
                close()
                moveTo(1f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(1.1f, -7.95f)
                curveToRelative(-0.59f, -0.05f, -1.1f, 0.41f, -1.1f, 1f)
                curveToRelative(0f, 0.51f, 0.38f, 0.94f, 0.88f, 0.99f)
                curveToRelative(4.27f, 0.41f, 7.67f, 3.81f, 8.08f, 8.08f)
                curveToRelative(0.05f, 0.5f, 0.48f, 0.87f, 0.99f, 0.87f)
                curveToRelative(0.6f, 0f, 1.06f, -0.52f, 1f, -1.11f)
                curveToRelative(-0.53f, -5.19f, -4.66f, -9.31f, -9.85f, -9.83f)
                close()
            }
        }.build()
        
        return _Cast!!
    }

private var _Cast: ImageVector? = null

