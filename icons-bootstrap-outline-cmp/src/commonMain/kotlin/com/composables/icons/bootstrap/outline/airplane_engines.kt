package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.AirplaneEngines: ImageVector
    get() {
        if (_AirplaneEngines != null) return _AirplaneEngines!!
        
        _AirplaneEngines = ImageVector.Builder(
            name = "airplane-engines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                curveToRelative(-0.787f, 0f, -1.292f, 0.592f, -1.572f, 1.151f)
                arcTo(4.35f, 4.35f, 0f, false, false, 6f, 3f)
                verticalLineToRelative(3.691f)
                lineToRelative(-2f, 1f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.191f)
                lineToRelative(-1.17f, 0.585f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 10.618f)
                verticalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.582f, 0.493f)
                lineToRelative(1.631f, -0.272f)
                lineToRelative(0.313f, 0.937f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.948f, 0f)
                lineToRelative(0.405f, -1.214f)
                lineToRelative(2.21f, -0.369f)
                lineToRelative(0.375f, 2.253f)
                lineToRelative(-1.318f, 1.318f)
                arcTo(0.5f, 0.5f, 0f, false, false, 5.5f, 16f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.354f, -0.854f)
                lineToRelative(-1.318f, -1.318f)
                lineToRelative(0.375f, -2.253f)
                lineToRelative(2.21f, 0.369f)
                lineToRelative(0.405f, 1.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.948f, 0f)
                lineToRelative(0.313f, -0.937f)
                lineToRelative(1.63f, 0.272f)
                arcTo(0.5f, 0.5f, 0f, false, false, 16f, 12f)
                verticalLineToRelative(-1.382f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.83f, -1.342f)
                lineTo(14f, 8.691f)
                verticalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.191f)
                lineToRelative(-2f, -1f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.568f, -0.14f, -1.271f, -0.428f, -1.849f)
                curveTo(9.292f, 0.591f, 8.787f, 0f, 8f, 0f)
                moveTo(7f, 3f)
                curveToRelative(0f, -0.432f, 0.11f, -0.979f, 0.322f, -1.401f)
                curveTo(7.542f, 1.159f, 7.787f, 1f, 8f, 1f)
                reflectiveCurveToRelative(0.458f, 0.158f, 0.678f, 0.599f)
                curveTo(8.889f, 2.02f, 9f, 2.569f, 9f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.276f, 0.447f)
                lineToRelative(5.448f, 2.724f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.276f, 0.447f)
                verticalLineToRelative(0.792f)
                lineToRelative(-5.418f, -0.903f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.575f, 0.41f)
                lineToRelative(-0.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.14f, 0.437f)
                lineToRelative(0.646f, 0.646f)
                horizontalLineTo(6.707f)
                lineToRelative(0.647f, -0.646f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.14f, -0.436f)
                lineToRelative(-0.5f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.576f, -0.411f)
                lineTo(1f, 11.41f)
                verticalLineToRelative(-0.792f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.276f, -0.447f)
                lineToRelative(5.448f, -2.724f)
                arcTo(0.5f, 0.5f, 0f, false, false, 7f, 7f)
                close()
            }
        }.build()
        
        return _AirplaneEngines!!
    }

private var _AirplaneEngines: ImageVector? = null

