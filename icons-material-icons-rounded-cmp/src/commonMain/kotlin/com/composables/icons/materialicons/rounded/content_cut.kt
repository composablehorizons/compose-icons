package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Content_cut: ImageVector
    get() {
        if (_Content_cut != null) return _Content_cut!!
        
        _Content_cut = ImageVector.Builder(
            name = "content_cut",
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
                moveTo(9.64f, 7.64f)
                curveToRelative(0.29f, -0.62f, 0.42f, -1.33f, 0.34f, -2.09f)
                curveToRelative(-0.19f, -1.73f, -1.54f, -3.2f, -3.26f, -3.49f)
                curveToRelative(-2.77f, -0.48f, -5.14f, 1.89f, -4.66f, 4.65f)
                curveToRelative(0.3f, 1.72f, 1.76f, 3.07f, 3.49f, 3.26f)
                curveToRelative(0.76f, 0.08f, 1.46f, -0.05f, 2.09f, -0.34f)
                lineTo(10f, 12f)
                lineToRelative(-2.36f, 2.36f)
                curveToRelative(-0.62f, -0.29f, -1.33f, -0.42f, -2.09f, -0.34f)
                curveToRelative(-1.73f, 0.19f, -3.2f, 1.54f, -3.49f, 3.26f)
                curveToRelative(-0.48f, 2.77f, 1.89f, 5.13f, 4.65f, 4.65f)
                curveToRelative(1.72f, -0.3f, 3.07f, -1.76f, 3.26f, -3.49f)
                curveToRelative(0.08f, -0.76f, -0.05f, -1.46f, -0.34f, -2.09f)
                lineTo(12f, 14f)
                lineToRelative(7.59f, 7.59f)
                curveToRelative(0.89f, 0.89f, 2.41f, 0.26f, 2.41f, -1f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.37f, -0.15f, -0.73f, -0.41f, -1f)
                lineTo(9.64f, 7.64f)
                close()
                moveTo(6f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.89f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(0f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.89f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(6f, -7.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveToRelative(7.59f, -10.09f)
                lineTo(13f, 9f)
                lineToRelative(2f, 2f)
                lineToRelative(6.59f, -6.59f)
                curveToRelative(0.26f, -0.26f, 0.41f, -0.62f, 0.41f, -1f)
                verticalLineTo(3.4f)
                curveToRelative(0f, -1.25f, -1.52f, -1.88f, -2.41f, -0.99f)
                close()
            }
        }.build()
        
        return _Content_cut!!
    }

private var _Content_cut: ImageVector? = null

