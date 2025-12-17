package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Filter_tilt_shift: ImageVector
    get() {
        if (_Filter_tilt_shift != null) return _Filter_tilt_shift!!
        
        _Filter_tilt_shift = ImageVector.Builder(
            name = "filter_tilt_shift",
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
                moveTo(11f, 3.23f)
                curveToRelative(0f, -0.64f, -0.59f, -1.13f, -1.21f, -0.99f)
                curveToRelative(-1.12f, 0.26f, -2.18f, 0.7f, -3.12f, 1.3f)
                curveToRelative(-0.53f, 0.34f, -0.61f, 1.1f, -0.16f, 1.55f)
                curveToRelative(0.32f, 0.32f, 0.83f, 0.4f, 1.21f, 0.16f)
                curveToRelative(0.77f, -0.49f, 1.62f, -0.85f, 2.54f, -1.05f)
                curveToRelative(0.44f, -0.1f, 0.74f, -0.51f, 0.74f, -0.97f)
                close()
                moveToRelative(6.33f, 0.32f)
                curveToRelative(-0.94f, -0.6f, -2f, -1.04f, -3.12f, -1.3f)
                curveToRelative(-0.62f, -0.14f, -1.21f, 0.34f, -1.21f, 0.98f)
                curveToRelative(0f, 0.45f, 0.3f, 0.87f, 0.74f, 0.96f)
                curveToRelative(0.91f, 0.2f, 1.77f, 0.57f, 2.53f, 1.05f)
                curveToRelative(0.39f, 0.24f, 0.89f, 0.17f, 1.21f, -0.16f)
                curveToRelative(0.46f, -0.44f, 0.39f, -1.19f, -0.15f, -1.53f)
                close()
                moveTo(20.77f, 11f)
                curveToRelative(0.64f, 0f, 1.13f, -0.59f, 0.99f, -1.21f)
                curveToRelative(-0.26f, -1.12f, -0.7f, -2.18f, -1.3f, -3.12f)
                curveToRelative(-0.34f, -0.53f, -1.1f, -0.61f, -1.55f, -0.16f)
                curveToRelative(-0.32f, 0.32f, -0.4f, 0.83f, -0.16f, 1.21f)
                curveToRelative(0.49f, 0.77f, 0.85f, 1.62f, 1.05f, 2.53f)
                curveToRelative(0.1f, 0.45f, 0.51f, 0.75f, 0.97f, 0.75f)
                close()
                moveTo(5.1f, 6.51f)
                curveToRelative(-0.46f, -0.45f, -1.21f, -0.38f, -1.55f, 0.16f)
                curveToRelative(-0.6f, 0.94f, -1.04f, 2f, -1.3f, 3.12f)
                curveToRelative(-0.14f, 0.62f, 0.34f, 1.21f, 0.98f, 1.21f)
                curveToRelative(0.45f, 0f, 0.87f, -0.3f, 0.96f, -0.74f)
                curveToRelative(0.2f, -0.91f, 0.57f, -1.77f, 1.05f, -2.53f)
                curveToRelative(0.26f, -0.39f, 0.18f, -0.9f, -0.14f, -1.22f)
                close()
                moveTo(3.23f, 13f)
                curveToRelative(-0.64f, 0f, -1.13f, 0.59f, -0.99f, 1.21f)
                curveToRelative(0.26f, 1.12f, 0.7f, 2.17f, 1.3f, 3.12f)
                curveToRelative(0.34f, 0.54f, 1.1f, 0.61f, 1.55f, 0.16f)
                curveToRelative(0.32f, -0.32f, 0.4f, -0.83f, 0.15f, -1.21f)
                curveToRelative(-0.49f, -0.76f, -0.85f, -1.61f, -1.05f, -2.53f)
                curveToRelative(-0.09f, -0.45f, -0.5f, -0.75f, -0.96f, -0.75f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                close()
                moveToRelative(3.9f, 5.49f)
                curveToRelative(0.45f, 0.45f, 1.21f, 0.38f, 1.55f, -0.15f)
                curveToRelative(0.6f, -0.94f, 1.04f, -2f, 1.3f, -3.11f)
                curveToRelative(0.14f, -0.62f, -0.35f, -1.21f, -0.98f, -1.21f)
                curveToRelative(-0.45f, 0f, -0.87f, 0.3f, -0.96f, 0.74f)
                curveToRelative(-0.2f, 0.91f, -0.57f, 1.76f, -1.05f, 2.53f)
                curveToRelative(-0.26f, 0.37f, -0.18f, 0.88f, 0.14f, 1.2f)
                close()
                moveTo(13f, 20.77f)
                curveToRelative(0f, 0.64f, 0.59f, 1.13f, 1.21f, 0.99f)
                curveToRelative(1.12f, -0.26f, 2.17f, -0.7f, 3.12f, -1.3f)
                curveToRelative(0.54f, -0.34f, 0.61f, -1.1f, 0.16f, -1.55f)
                curveToRelative(-0.32f, -0.32f, -0.83f, -0.4f, -1.21f, -0.15f)
                curveToRelative(-0.76f, 0.49f, -1.61f, 0.85f, -2.53f, 1.05f)
                curveToRelative(-0.45f, 0.09f, -0.75f, 0.5f, -0.75f, 0.96f)
                close()
                moveToRelative(-6.33f, -0.32f)
                curveToRelative(0.95f, 0.6f, 2f, 1.04f, 3.12f, 1.3f)
                curveToRelative(0.62f, 0.14f, 1.21f, -0.35f, 1.21f, -0.98f)
                curveToRelative(0f, -0.45f, -0.3f, -0.87f, -0.74f, -0.96f)
                curveToRelative(-0.91f, -0.2f, -1.77f, -0.57f, -2.53f, -1.05f)
                curveToRelative(-0.39f, -0.24f, -0.89f, -0.17f, -1.21f, 0.16f)
                curveToRelative(-0.46f, 0.44f, -0.39f, 1.19f, 0.15f, 1.53f)
                close()
            }
        }.build()
        
        return _Filter_tilt_shift!!
    }

private var _Filter_tilt_shift: ImageVector? = null

