package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mic_none: ImageVector
    get() {
        if (_Mic_none != null) return _Mic_none!!
        
        _Mic_none = ImageVector.Builder(
            name = "mic_none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 14f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 3.34f, 9f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveToRelative(-1f, -9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(5f)
                close()
                moveToRelative(6.91f, 6f)
                curveToRelative(-0.49f, 0f, -0.9f, 0.36f, -0.98f, 0.85f)
                curveTo(16.52f, 14.2f, 14.47f, 16f, 12f, 16f)
                reflectiveCurveToRelative(-4.52f, -1.8f, -4.93f, -4.15f)
                curveToRelative(-0.08f, -0.49f, -0.49f, -0.85f, -0.98f, -0.85f)
                curveToRelative(-0.61f, 0f, -1.09f, 0.54f, -1f, 1.14f)
                curveToRelative(0.49f, 3f, 2.89f, 5.35f, 5.91f, 5.78f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.08f)
                curveToRelative(3.02f, -0.43f, 5.42f, -2.78f, 5.91f, -5.78f)
                curveToRelative(0.1f, -0.6f, -0.39f, -1.14f, -1f, -1.14f)
                close()
            }
        }.build()
        
        return _Mic_none!!
    }

private var _Mic_none: ImageVector? = null

