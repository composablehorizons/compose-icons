package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Play_for_work: ImageVector
    get() {
        if (_Play_for_work != null) return _Play_for_work!!
        
        _Play_for_work = ImageVector.Builder(
            name = "play_for_work",
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
                moveTo(11f, 6f)
                verticalLineToRelative(4.59f)
                horizontalLineTo(8.71f)
                curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveToRelative(-3.9f, 8f)
                curveToRelative(-0.61f, 0f, -1.11f, 0.55f, -0.99f, 1.15f)
                curveTo(6.65f, 17.91f, 9.08f, 20f, 12f, 20f)
                reflectiveCurveToRelative(5.35f, -2.09f, 5.89f, -4.85f)
                curveToRelative(0.12f, -0.6f, -0.38f, -1.15f, -0.99f, -1.15f)
                curveToRelative(-0.49f, 0f, -0.88f, 0.35f, -0.98f, 0.83f)
                curveTo(15.53f, 16.64f, 13.93f, 18f, 12f, 18f)
                reflectiveCurveToRelative(-3.53f, -1.36f, -3.91f, -3.17f)
                curveToRelative(-0.1f, -0.48f, -0.5f, -0.83f, -0.99f, -0.83f)
                close()
            }
        }.build()
        
        return _Play_for_work!!
    }

private var _Play_for_work: ImageVector? = null

