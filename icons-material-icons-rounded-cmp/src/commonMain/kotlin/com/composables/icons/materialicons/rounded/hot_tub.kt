package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hot_tub: ImageVector
    get() {
        if (_Hot_tub != null) return _Hot_tub!!
        
        _Hot_tub = ImageVector.Builder(
            name = "hot_tub",
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
                moveTo(9f, 6f)
                arcTo(2f, 2f, 0f, false, true, 7f, 8f)
                arcTo(2f, 2f, 0f, false, true, 5f, 6f)
                arcTo(2f, 2f, 0f, false, true, 9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 12f)
                horizontalLineToRelative(-9.85f)
                curveToRelative(-0.31f, -0.22f, -0.59f, -0.46f, -0.82f, -0.72f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f)
                horizontalLineToRelative(-0.03f)
                curveTo(6.01f, 9f, 5f, 10.01f, 5f, 11.25f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(7f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(4f, 0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(4f, 0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(4f, 0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(-3.94f, -9f)
                curveToRelative(0.5f, 0f, 0.93f, -0.39f, 0.94f, -0.89f)
                curveToRelative(0.04f, -1.4f, -0.58f, -2.48f, -1.35f, -3.25f)
                curveToRelative(-0.65f, -0.72f, -0.8f, -1.27f, -0.77f, -1.91f)
                curveToRelative(0.02f, -0.52f, -0.41f, -0.95f, -0.94f, -0.95f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.4f, -0.94f, 0.9f)
                curveToRelative(-0.03f, 1.29f, 0.5f, 2.43f, 1.35f, 3.25f)
                curveToRelative(0.61f, 0.59f, 0.78f, 1.27f, 0.78f, 1.89f)
                curveToRelative(-0.01f, 0.52f, 0.4f, 0.96f, 0.93f, 0.96f)
                close()
                moveToRelative(4f, 0f)
                curveToRelative(0.5f, 0f, 0.93f, -0.39f, 0.94f, -0.89f)
                curveToRelative(0.04f, -1.4f, -0.58f, -2.48f, -1.35f, -3.25f)
                curveToRelative(-0.65f, -0.72f, -0.8f, -1.27f, -0.77f, -1.91f)
                curveToRelative(0.02f, -0.52f, -0.41f, -0.95f, -0.94f, -0.95f)
                curveToRelative(-0.5f, 0f, -0.93f, 0.4f, -0.94f, 0.9f)
                curveToRelative(-0.03f, 1.29f, 0.5f, 2.43f, 1.35f, 3.25f)
                curveToRelative(0.61f, 0.59f, 0.78f, 1.27f, 0.78f, 1.89f)
                curveToRelative(-0.01f, 0.52f, 0.4f, 0.96f, 0.93f, 0.96f)
                close()
            }
        }.build()
        
        return _Hot_tub!!
    }

private var _Hot_tub: ImageVector? = null

