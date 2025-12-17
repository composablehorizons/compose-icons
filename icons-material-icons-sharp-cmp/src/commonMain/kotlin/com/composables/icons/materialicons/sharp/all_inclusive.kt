package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.All_inclusive: ImageVector
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
                moveTo(18.6f, 6.62f)
                curveToRelative(-1.44f, 0f, -2.8f, 0.56f, -3.77f, 1.53f)
                lineTo(7.8f, 14.39f)
                curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f)
                curveToRelative(-1.87f, 0f, -3.39f, -1.51f, -3.39f, -3.38f)
                reflectiveCurveTo(3.53f, 8.62f, 5.4f, 8.62f)
                curveToRelative(0.91f, 0f, 1.76f, 0.35f, 2.44f, 1.03f)
                lineToRelative(1.13f, 1f)
                lineToRelative(1.51f, -1.34f)
                lineTo(9.22f, 8.2f)
                curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f)
                curveTo(2.42f, 6.62f, 0f, 9.04f, 0f, 12f)
                reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f)
                curveToRelative(1.44f, 0f, 2.8f, -0.56f, 3.77f, -1.53f)
                lineTo(13.51f, 12f)
                lineToRelative(2.69f, -2.39f)
                curveToRelative(0.64f, -0.64f, 1.49f, -0.99f, 2.4f, -0.99f)
                curveToRelative(1.87f, 0f, 3.39f, 1.51f, 3.39f, 3.38f)
                reflectiveCurveToRelative(-1.52f, 3.38f, -3.39f, 3.38f)
                curveToRelative(-0.9f, 0f, -1.76f, -0.35f, -2.44f, -1.03f)
                lineToRelative(-1.14f, -1.01f)
                lineToRelative(-1.51f, 1.34f)
                lineToRelative(1.27f, 1.12f)
                curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f)
                curveToRelative(2.98f, 0f, 5.4f, -2.41f, 5.4f, -5.38f)
                reflectiveCurveToRelative(-2.42f, -5.37f, -5.4f, -5.37f)
                close()
            }
        }.build()
        
        return _All_inclusive!!
    }

private var _All_inclusive: ImageVector? = null

