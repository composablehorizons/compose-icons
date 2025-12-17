package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ProjectDiagram: ImageVector
    get() {
        if (_ProjectDiagram != null) return _ProjectDiagram!!
        
        _ProjectDiagram = ImageVector.Builder(
            name = "project-diagram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 320f)
                horizontalLineTo(256f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(128f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(352f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(192f, 32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 0f, 0f, 14.33f, 0f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(95.72f)
                lineToRelative(73.16f, 128.04f)
                curveTo(211.98f, 300.98f, 232.4f, 288f, 256f, 288f)
                horizontalLineToRelative(0.28f)
                lineTo(192f, 175.51f)
                verticalLineTo(128f)
                horizontalLineToRelative(224f)
                verticalLineTo(64f)
                horizontalLineTo(192f)
                verticalLineTo(32f)
                close()
                moveTo(608f, 0f)
                horizontalLineTo(480f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(128f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(128f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _ProjectDiagram!!
    }

private var _ProjectDiagram: ImageVector? = null

