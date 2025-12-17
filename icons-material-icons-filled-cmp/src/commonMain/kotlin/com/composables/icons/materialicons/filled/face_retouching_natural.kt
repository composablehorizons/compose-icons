package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Face_retouching_natural: ImageVector
    get() {
        if (_Face_retouching_natural != null) return _Face_retouching_natural!!
        
        _Face_retouching_natural = ImageVector.Builder(
            name = "face_retouching_natural",
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
                moveTo(10.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 9f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, false, true, 7.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 10.25f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.77f, 8.58f)
                lineToRelative(-0.92f, 2.01f)
                curveToRelative(0.09f, 0.46f, 0.15f, 0.93f, 0.15f, 1.41f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -0.05f, 0.01f, -0.1f, 0f, -0.14f)
                curveToRelative(2.6f, -0.98f, 4.69f, -2.99f, 5.74f, -5.55f)
                curveTo(11.58f, 8.56f, 14.37f, 10f, 17.5f, 10f)
                curveToRelative(0.45f, 0f, 0.89f, -0.04f, 1.33f, -0.1f)
                lineToRelative(-0.6f, -1.32f)
                lineToRelative(-0.88f, -1.93f)
                lineToRelative(-1.93f, -0.88f)
                lineToRelative(-2.79f, -1.27f)
                lineToRelative(2.79f, -1.27f)
                lineToRelative(0.71f, -0.32f)
                curveTo(14.87f, 2.33f, 13.47f, 2f, 12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveToRelative(0f, -1.47f, -0.33f, -2.87f, -0.9f, -4.13f)
                lineToRelative(-0.33f, 0.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 15f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, false, true, 13.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, false, true, 16.25f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.6f, 5.6f)
                lineTo(19.5f, 8f)
                lineToRelative(-1.1f, -2.4f)
                lineTo(16f, 4.5f)
                lineToRelative(2.4f, -1.1f)
                lineTo(19.5f, 1f)
                lineToRelative(1.1f, 2.4f)
                lineTo(23f, 4.5f)
                close()
            }
        }.build()
        
        return _Face_retouching_natural!!
    }

private var _Face_retouching_natural: ImageVector? = null

