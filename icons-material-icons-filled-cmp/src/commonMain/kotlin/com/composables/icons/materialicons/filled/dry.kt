package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Dry: ImageVector
    get() {
        if (_Dry != null) return _Dry!!
        
        _Dry = ImageVector.Builder(
            name = "dry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15.65f, 4.86f)
                    lineToRelative(-0.07f, -0.07f)
                    curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                    lineTo(15f, 2f)
                    horizontalLineToRelative(-1.89f)
                    lineToRelative(-0.06f, 0.43f)
                    curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                    lineToRelative(0.07f, 0.06f)
                    curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                    lineTo(14.98f, 9f)
                    horizontalLineToRelative(1.91f)
                    lineToRelative(0.06f, -0.43f)
                    curveTo(17.16f, 7.21f, 16.68f, 5.86f, 15.65f, 4.86f)
                    close()
                    moveTo(19.65f, 4.86f)
                    lineToRelative(-0.07f, -0.07f)
                    curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f)
                    lineTo(19f, 2f)
                    horizontalLineToRelative(-1.89f)
                    lineToRelative(-0.06f, 0.43f)
                    curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f)
                    lineToRelative(0.07f, 0.06f)
                    curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f)
                    lineTo(18.98f, 9f)
                    horizontalLineToRelative(1.91f)
                    lineToRelative(0.06f, -0.43f)
                    curveTo(21.16f, 7.21f, 20.68f, 5.86f, 19.65f, 4.86f)
                    close()
                    moveTo(9.12f, 5f)
                    lineToRelative(-7.18f, 6.79f)
                    curveTo(1.34f, 12.35f, 1f, 13.14f, 1f, 13.97f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    horizontalLineToRelative(6.25f)
                    horizontalLineTo(12f)
                    horizontalLineToRelative(5.75f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(7.75f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveTo(20.44f, 17f, 19.75f, 17f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(8.75f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(6.75f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveTo(19.44f, 10f, 18.75f, 10f)
                    horizontalLineTo(8.86f)
                    curveToRelative(0.64f, -1.11f, 1.48f, -2.58f, 1.49f, -2.61f)
                    curveToRelative(0.09f, -0.16f, 0.14f, -0.33f, 0.14f, -0.53f)
                    curveToRelative(0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f)
                    curveTo(10.22f, 6.12f, 9.12f, 5f, 9.12f, 5f)
                    lineTo(9.12f, 5f)
                    close()
                }
            }
        }.build()
        
        return _Dry!!
    }

private var _Dry: ImageVector? = null

