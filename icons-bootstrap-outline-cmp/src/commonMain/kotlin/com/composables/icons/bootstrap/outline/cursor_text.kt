package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CursorText: ImageVector
    get() {
        if (_CursorText != null) return _CursorText!!
        
        _CursorText = ImageVector.Builder(
            name = "cursor-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                curveToRelative(0.862f, 0f, 1.573f, 0.287f, 2.06f, 0.566f)
                curveToRelative(0.174f, 0.099f, 0.321f, 0.198f, 0.44f, 0.286f)
                curveToRelative(0.119f, -0.088f, 0.266f, -0.187f, 0.44f, -0.286f)
                arcTo(4.17f, 4.17f, 0f, false, true, 10.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                curveToRelative(-0.638f, 0f, -1.177f, 0.213f, -1.564f, 0.434f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.436f, 0.294f)
                verticalLineTo(7.5f)
                horizontalLineTo(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.272f)
                curveToRelative(0.1f, 0.08f, 0.248f, 0.187f, 0.436f, 0.294f)
                curveToRelative(0.387f, 0.221f, 0.926f, 0.434f, 1.564f, 0.434f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                arcToRelative(4.17f, 4.17f, 0f, false, true, -2.06f, -0.566f)
                arcTo(5f, 5f, 0f, false, true, 8f, 13.65f)
                arcToRelative(5f, 5f, 0f, false, true, -0.44f, 0.285f)
                arcToRelative(4.17f, 4.17f, 0f, false, true, -2.06f, 0.566f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                curveToRelative(0.638f, 0f, 1.177f, -0.213f, 1.564f, -0.434f)
                curveToRelative(0.188f, -0.107f, 0.335f, -0.214f, 0.436f, -0.294f)
                verticalLineTo(8.5f)
                horizontalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(3.228f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.436f, -0.294f)
                arcTo(3.17f, 3.17f, 0f, false, false, 5.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 2f)
                moveToRelative(2.648f, 10.645f)
            }
        }.build()
        
        return _CursorText!!
    }

private var _CursorText: ImageVector? = null

