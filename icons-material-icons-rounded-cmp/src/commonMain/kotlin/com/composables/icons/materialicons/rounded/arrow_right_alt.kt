package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Arrow_right_alt: ImageVector
    get() {
        if (_Arrow_right_alt != null) return _Arrow_right_alt!!
        
        _Arrow_right_alt = ImageVector.Builder(
            name = "arrow_right_alt",
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
                moveTo(16.01f, 11f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.01f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.78f, -2.79f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, 0f, -0.71f)
                lineToRelative(-2.78f, -2.79f)
                curveToRelative(-0.31f, -0.32f, -0.85f, -0.09f, -0.85f, 0.35f)
                verticalLineTo(11f)
                close()
            }
        }.build()
        
        return _Arrow_right_alt!!
    }

private var _Arrow_right_alt: ImageVector? = null

