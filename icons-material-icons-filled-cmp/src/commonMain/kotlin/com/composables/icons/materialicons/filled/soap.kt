package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Soap: ImageVector
    get() {
        if (_Soap != null) return _Soap!!
        
        _Soap = ImageVector.Builder(
            name = "soap",
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
                    moveTo(14f, 6.25f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    reflectiveCurveTo(14.41f, 7.75f, 14f, 7.75f)
                    reflectiveCurveTo(13.25f, 7.41f, 13.25f, 7f)
                    reflectiveCurveTo(13.59f, 6.25f, 14f, 6.25f)
                    moveTo(14f, 4.75f)
                    curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                    reflectiveCurveTo(12.76f, 9.25f, 14f, 9.25f)
                    reflectiveCurveTo(16.25f, 8.24f, 16.25f, 7f)
                    reflectiveCurveTo(15.24f, 4.75f, 14f, 4.75f)
                    lineTo(14f, 4.75f)
                    close()
                    moveTo(19.75f, 5.5f)
                    curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                    reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                    reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                    reflectiveCurveTo(19.47f, 5.5f, 19.75f, 5.5f)
                    moveTo(19.75f, 4f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(20.85f, 4f, 19.75f, 4f)
                    lineTo(19.75f, 4f)
                    close()
                    moveTo(16.5f, 1f)
                    curveTo(15.67f, 1f, 15f, 1.67f, 15f, 2.5f)
                    reflectiveCurveTo(15.67f, 4f, 16.5f, 4f)
                    curveTo(17.33f, 4f, 18f, 3.33f, 18f, 2.5f)
                    reflectiveCurveTo(17.33f, 1f, 16.5f, 1f)
                    close()
                }
            }
        }.build()
        
        return _Soap!!
    }

private var _Soap: ImageVector? = null

