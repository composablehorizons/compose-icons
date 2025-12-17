package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.QuestionOctagon: ImageVector
    get() {
        if (_QuestionOctagon != null) return _QuestionOctagon!!
        
        _QuestionOctagon = ImageVector.Builder(
            name = "question-octagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.54f, 0.146f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.893f, 0f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.353f, 0.146f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, 0.353f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.146f, 0.353f)
                lineToRelative(-4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.353f, 0.146f)
                horizontalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.353f, -0.146f)
                lineTo(0.146f, 11.46f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 11.107f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.146f, -0.353f)
                close()
                moveTo(5.1f, 1f)
                lineTo(1f, 5.1f)
                verticalLineToRelative(5.8f)
                lineTo(5.1f, 15f)
                horizontalLineToRelative(5.8f)
                lineToRelative(4.1f, -4.1f)
                verticalLineTo(5.1f)
                lineTo(10.9f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.255f, 5.786f)
                arcToRelative(0.237f, 0.237f, 0f, false, false, 0.241f, 0.247f)
                horizontalLineToRelative(0.825f)
                curveToRelative(0.138f, 0f, 0.248f, -0.113f, 0.266f, -0.25f)
                curveToRelative(0.09f, -0.656f, 0.54f, -1.134f, 1.342f, -1.134f)
                curveToRelative(0.686f, 0f, 1.314f, 0.343f, 1.314f, 1.168f)
                curveToRelative(0f, 0.635f, -0.374f, 0.927f, -0.965f, 1.371f)
                curveToRelative(-0.673f, 0.489f, -1.206f, 1.06f, -1.168f, 1.987f)
                lineToRelative(0.003f, 0.217f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, 0.246f)
                horizontalLineToRelative(0.811f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-0.105f)
                curveToRelative(0f, -0.718f, 0.273f, -0.927f, 1.01f, -1.486f)
                curveToRelative(0.609f, -0.463f, 1.244f, -0.977f, 1.244f, -2.056f)
                curveToRelative(0f, -1.511f, -1.276f, -2.241f, -2.673f, -2.241f)
                curveToRelative(-1.267f, 0f, -2.655f, 0.59f, -2.75f, 2.286f)
                moveToRelative(1.557f, 5.763f)
                curveToRelative(0f, 0.533f, 0.425f, 0.927f, 1.01f, 0.927f)
                curveToRelative(0.609f, 0f, 1.028f, -0.394f, 1.028f, -0.927f)
                curveToRelative(0f, -0.552f, -0.42f, -0.94f, -1.029f, -0.94f)
                curveToRelative(-0.584f, 0f, -1.009f, 0.388f, -1.009f, 0.94f)
            }
        }.build()
        
        return _QuestionOctagon!!
    }

private var _QuestionOctagon: ImageVector? = null

