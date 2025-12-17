package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Find_in_page: ImageVector
    get() {
        if (_Find_in_page != null) return _Find_in_page!!
        
        _Find_in_page = ImageVector.Builder(
            name = "find_in_page",
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
                moveTo(20f, 19.59f)
                verticalLineTo(8.83f)
                curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                lineToRelative(-4.83f, -4.83f)
                curveToRelative(-0.37f, -0.38f, -0.88f, -0.59f, -1.41f, -0.59f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(4f, 20f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                horizontalLineTo(18f)
                curveToRelative(0.45f, 0f, 0.85f, -0.15f, 1.19f, -0.4f)
                lineToRelative(-4.43f, -4.43f)
                curveToRelative(-0.86f, 0.56f, -1.89f, 0.88f, -3f, 0.82f)
                curveToRelative(-2.37f, -0.11f, -4.4f, -1.96f, -4.72f, -4.31f)
                curveToRelative(-0.44f, -3.35f, 2.45f, -6.18f, 5.83f, -5.61f)
                curveToRelative(1.95f, 0.33f, 3.57f, 1.85f, 4f, 3.78f)
                curveToRelative(0.33f, 1.46f, 0.01f, 2.82f, -0.7f, 3.9f)
                lineTo(20f, 19.59f)
                close()
                moveTo(9f, 13f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
            }
        }.build()
        
        return _Find_in_page!!
    }

private var _Find_in_page: ImageVector? = null

