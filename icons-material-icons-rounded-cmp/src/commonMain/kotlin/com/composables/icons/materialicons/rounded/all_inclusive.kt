package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.All_inclusive: ImageVector
    get() {
        if (_All_inclusive != null) return _All_inclusive!!
        
        _All_inclusive = ImageVector.Builder(
            name = "all_inclusive",
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
                moveTo(20.22f, 6.86f)
                curveToRelative(-2f, -0.6f, -4.06f, -0.04f, -5.39f, 1.29f)
                lineTo(12f, 10.66f)
                lineTo(10.48f, 12f)
                horizontalLineToRelative(0.01f)
                lineTo(7.8f, 14.39f)
                curveToRelative(-0.81f, 0.81f, -1.95f, 1.15f, -3.12f, 0.92f)
                curveToRelative(-1.25f, -0.25f, -2.28f, -1.25f, -2.57f, -2.49f)
                curveToRelative(-0.52f, -2.23f, 1.16f, -4.2f, 3.29f, -4.2f)
                curveToRelative(0.91f, 0f, 1.76f, 0.35f, 2.44f, 1.03f)
                lineToRelative(0.47f, 0.41f)
                curveToRelative(0.38f, 0.34f, 0.95f, 0.34f, 1.33f, 0f)
                curveToRelative(0.45f, -0.4f, 0.45f, -1.1f, 0f, -1.5f)
                lineToRelative(-0.42f, -0.36f)
                curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f)
                curveTo(2.42f, 6.62f, 0f, 9.04f, 0f, 12f)
                reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f)
                curveToRelative(1.44f, 0f, 2.8f, -0.56f, 3.77f, -1.53f)
                lineToRelative(2.83f, -2.5f)
                lineToRelative(0.01f, 0.01f)
                lineTo(13.52f, 12f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(2.69f, -2.39f)
                curveToRelative(0.81f, -0.81f, 1.95f, -1.15f, 3.12f, -0.92f)
                curveToRelative(1.25f, 0.25f, 2.28f, 1.25f, 2.57f, 2.49f)
                curveToRelative(0.52f, 2.23f, -1.16f, 4.2f, -3.29f, 4.2f)
                curveToRelative(-0.9f, 0f, -1.76f, -0.35f, -2.44f, -1.03f)
                lineToRelative(-0.48f, -0.42f)
                curveToRelative(-0.38f, -0.34f, -0.95f, -0.34f, -1.33f, 0f)
                curveToRelative(-0.45f, 0.4f, -0.45f, 1.1f, 0f, 1.5f)
                lineToRelative(0.42f, 0.37f)
                curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f)
                curveToRelative(3.27f, 0f, 5.86f, -2.9f, 5.33f, -6.25f)
                curveToRelative(-0.3f, -1.99f, -1.77f, -3.69f, -3.7f, -4.26f)
                close()
            }
        }.build()
        
        return _All_inclusive!!
    }

private var _All_inclusive: ImageVector? = null

