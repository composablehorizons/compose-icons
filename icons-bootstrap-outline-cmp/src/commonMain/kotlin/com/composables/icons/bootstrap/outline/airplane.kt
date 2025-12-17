package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Airplane: ImageVector
    get() {
        if (_Airplane != null) return _Airplane!!
        
        _Airplane = ImageVector.Builder(
            name = "airplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.428f, 1.151f)
                curveTo(6.708f, 0.591f, 7.213f, 0f, 8f, 0f)
                reflectiveCurveToRelative(1.292f, 0.592f, 1.572f, 1.151f)
                curveTo(9.861f, 1.73f, 10f, 2.431f, 10f, 3f)
                verticalLineToRelative(3.691f)
                lineToRelative(5.17f, 2.585f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.83f, 1.342f)
                verticalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.582f, 0.493f)
                lineToRelative(-5.507f, -0.918f)
                lineToRelative(-0.375f, 2.253f)
                lineToRelative(1.318f, 1.318f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 16f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.354f, -0.854f)
                lineToRelative(1.319f, -1.318f)
                lineToRelative(-0.376f, -2.253f)
                lineToRelative(-5.507f, 0.918f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 12f)
                verticalLineToRelative(-1.382f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.83f, -1.342f)
                lineTo(6f, 6.691f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.568f, 0.14f, -1.271f, 0.428f, -1.849f)
                moveToRelative(0.894f, 0.448f)
                curveTo(7.111f, 2.02f, 7f, 2.569f, 7f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.276f, 0.447f)
                lineToRelative(-5.448f, 2.724f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.276f, 0.447f)
                verticalLineToRelative(0.792f)
                lineToRelative(5.418f, -0.903f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.575f, 0.41f)
                lineToRelative(0.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.14f, 0.437f)
                lineTo(6.708f, 15f)
                horizontalLineToRelative(2.586f)
                lineToRelative(-0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.14f, -0.436f)
                lineToRelative(0.5f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.576f, -0.411f)
                lineTo(15f, 11.41f)
                verticalLineToRelative(-0.792f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.276f, -0.447f)
                lineTo(9.276f, 7.447f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 7f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.432f, -0.11f, -0.979f, -0.322f, -1.401f)
                curveTo(8.458f, 1.159f, 8.213f, 1f, 8f, 1f)
                reflectiveCurveToRelative(-0.458f, 0.158f, -0.678f, 0.599f)
            }
        }.build()
        
        return _Airplane!!
    }

private var _Airplane: ImageVector? = null

