package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Dry: ImageVector
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
                    moveTo(20.75f, 16f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(6.75f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    curveToRelative(0f, -0.67f, -0.53f, -1.2f, -1.18f, -1.24f)
                    lineTo(8.87f, 10f)
                    lineToRelative(1.48f, -2.6f)
                    curveToRelative(0.09f, -0.17f, 0.14f, -0.34f, 0.14f, -0.54f)
                    curveToRelative(0f, -0.26f, -0.09f, -0.5f, -0.26f, -0.7f)
                    lineTo(9.12f, 5f)
                    lineToRelative(-7.18f, 6.8f)
                    curveTo(1.34f, 12.36f, 1f, 13.15f, 1f, 13.97f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    horizontalLineToRelative(13.75f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(7.75f)
                    curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                    reflectiveCurveTo(20.44f, 17f, 19.75f, 17f)
                    horizontalLineTo(12f)
                    verticalLineToRelative(-1f)
                    horizontalLineTo(20.75f)
                    close()
                    moveTo(10f, 21f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-6f)
                    curveToRelative(0f, -0.39f, 0.23f, -0.64f, 0.36f, -0.75f)
                    lineTo(7f, 9.87f)
                    verticalLineTo(12f)
                    lineToRelative(3f, 0f)
                    verticalLineTo(21f)
                    close()
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
                }
            }
        }.build()
        
        return _Dry!!
    }

private var _Dry: ImageVector? = null

