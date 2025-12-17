package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.QuestionLg: ImageVector
    get() {
        if (_QuestionLg != null) return _QuestionLg!!
        
        _QuestionLg = ImageVector.Builder(
            name = "question-lg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.475f, 5.458f)
                curveToRelative(-0.284f, 0f, -0.514f, -0.237f, -0.47f, -0.517f)
                curveTo(4.28f, 3.24f, 5.576f, 2f, 7.825f, 2f)
                curveToRelative(2.25f, 0f, 3.767f, 1.36f, 3.767f, 3.215f)
                curveToRelative(0f, 1.344f, -0.665f, 2.288f, -1.79f, 2.973f)
                curveToRelative(-1.1f, 0.659f, -1.414f, 1.118f, -1.414f, 2.01f)
                verticalLineToRelative(0.03f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-0.77f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.495f)
                lineToRelative(-0.003f, -0.2f)
                curveToRelative(-0.043f, -1.221f, 0.477f, -2.001f, 1.645f, -2.712f)
                curveToRelative(1.03f, -0.632f, 1.397f, -1.135f, 1.397f, -2.028f)
                curveToRelative(0f, -0.979f, -0.758f, -1.698f, -1.926f, -1.698f)
                curveToRelative(-1.009f, 0f, -1.71f, 0.529f, -1.938f, 1.402f)
                curveToRelative(-0.066f, 0.254f, -0.278f, 0.461f, -0.54f, 0.461f)
                horizontalLineToRelative(-0.777f)
                close()
                moveTo(7.496f, 14f)
                curveToRelative(0.622f, 0f, 1.095f, -0.474f, 1.095f, -1.09f)
                curveToRelative(0f, -0.618f, -0.473f, -1.092f, -1.095f, -1.092f)
                curveToRelative(-0.606f, 0f, -1.087f, 0.474f, -1.087f, 1.091f)
                reflectiveCurveTo(6.89f, 14f, 7.496f, 14f)
            }
        }.build()
        
        return _QuestionLg!!
    }

private var _QuestionLg: ImageVector? = null

