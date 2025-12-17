package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Wash: ImageVector
    get() {
        if (_Wash != null) return _Wash!!
        
        _Wash = ImageVector.Builder(
            name = "wash",
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
                    moveTo(18.5f, 8f)
                    curveTo(19.88f, 8f, 21f, 6.88f, 21f, 5.5f)
                    curveTo(21f, 3.83f, 18.5f, 1f, 18.5f, 1f)
                    reflectiveCurveTo(16f, 3.83f, 16f, 5.5f)
                    curveTo(16f, 6.88f, 17.12f, 8f, 18.5f, 8f)
                    close()
                    moveTo(13.5f, 9f)
                    curveTo(14.33f, 9f, 15f, 8.33f, 15f, 7.5f)
                    curveTo(15f, 6.66f, 13.5f, 5f, 13.5f, 5f)
                    reflectiveCurveTo(12f, 6.66f, 12f, 7.5f)
                    curveTo(12f, 8.33f, 12.67f, 9f, 13.5f, 9f)
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
        
        return _Wash!!
    }

private var _Wash: ImageVector? = null

