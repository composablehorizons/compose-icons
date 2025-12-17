package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Filter_vintage: ImageVector
    get() {
        if (_Filter_vintage != null) return _Filter_vintage!!
        
        _Filter_vintage = ImageVector.Builder(
            name = "filter_vintage",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.7f, 12.4f)
                curveToRelative(-0.28f, -0.16f, -0.57f, -0.29f, -0.86f, -0.4f)
                curveToRelative(0.29f, -0.11f, 0.58f, -0.24f, 0.86f, -0.4f)
                curveToRelative(1.92f, -1.11f, 2.99f, -3.12f, 3f, -5.19f)
                curveToRelative(-1.79f, -1.03f, -4.07f, -1.11f, -6f, 0f)
                curveToRelative(-0.28f, 0.16f, -0.54f, 0.35f, -0.78f, 0.54f)
                curveToRelative(0.05f, -0.31f, 0.08f, -0.63f, 0.08f, -0.95f)
                curveToRelative(0f, -2.22f, -1.21f, -4.15f, -3f, -5.19f)
                curveTo(10.21f, 1.85f, 9f, 3.78f, 9f, 6f)
                curveToRelative(0f, 0.32f, 0.03f, 0.64f, 0.08f, 0.95f)
                curveToRelative(-0.24f, -0.2f, -0.5f, -0.39f, -0.78f, -0.55f)
                curveToRelative(-1.92f, -1.11f, -4.2f, -1.03f, -6f, 0f)
                curveToRelative(0f, 2.07f, 1.07f, 4.08f, 3f, 5.19f)
                curveToRelative(0.28f, 0.16f, 0.57f, 0.29f, 0.86f, 0.4f)
                curveToRelative(-0.29f, 0.11f, -0.58f, 0.24f, -0.86f, 0.4f)
                curveToRelative(-1.92f, 1.11f, -2.99f, 3.12f, -3f, 5.19f)
                curveToRelative(1.79f, 1.03f, 4.07f, 1.11f, 6f, 0f)
                curveToRelative(0.28f, -0.16f, 0.54f, -0.35f, 0.78f, -0.54f)
                curveToRelative(-0.05f, 0.32f, -0.08f, 0.64f, -0.08f, 0.96f)
                curveToRelative(0f, 2.22f, 1.21f, 4.15f, 3f, 5.19f)
                curveToRelative(1.79f, -1.04f, 3f, -2.97f, 3f, -5.19f)
                curveToRelative(0f, -0.32f, -0.03f, -0.64f, -0.08f, -0.95f)
                curveToRelative(0.24f, 0.2f, 0.5f, 0.38f, 0.78f, 0.54f)
                curveToRelative(1.92f, 1.11f, 4.2f, 1.03f, 6f, 0f)
                curveToRelative(-0.01f, -2.07f, -1.08f, -4.08f, -3f, -5.19f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
            }
        }.build()
        
        return _Filter_vintage!!
    }

private var _Filter_vintage: ImageVector? = null

