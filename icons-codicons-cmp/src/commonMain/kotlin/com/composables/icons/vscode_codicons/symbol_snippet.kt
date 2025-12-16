package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolSnippet: ImageVector
    get() {
        if (_SymbolSnippet != null) return _SymbolSnippet!!
        
        _SymbolSnippet = ImageVector.Builder(
            name = "symbol-snippet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 12f)
                curveTo(12.3674f, 12f, 12.2402f, 11.9473f, 12.1464f, 11.8536f)
                curveTo(12.0527f, 11.7598f, 12f, 11.6326f, 12f, 11.5f)
                verticalLineTo(4f)
                curveTo(12f, 3.73478f, 11.8946f, 3.48043f, 11.7071f, 3.29289f)
                curveTo(11.5196f, 3.10536f, 11.2652f, 3f, 11f, 3f)
                horizontalLineTo(5f)
                curveTo(4.73478f, 3f, 4.48043f, 3.10536f, 4.29289f, 3.29289f)
                curveTo(4.10536f, 3.48043f, 4f, 3.73478f, 4f, 4f)
                verticalLineTo(11.5f)
                curveTo(4f, 11.6326f, 3.94732f, 11.7598f, 3.85355f, 11.8536f)
                curveTo(3.75979f, 11.9473f, 3.63261f, 12f, 3.5f, 12f)
                curveTo(3.36739f, 12f, 3.24021f, 11.9473f, 3.14645f, 11.8536f)
                curveTo(3.05268f, 11.7598f, 3f, 11.6326f, 3f, 11.5f)
                verticalLineTo(4f)
                curveTo(3f, 3.46957f, 3.21071f, 2.96086f, 3.58579f, 2.58579f)
                curveTo(3.96086f, 2.21071f, 4.46957f, 2f, 5f, 2f)
                horizontalLineTo(11f)
                curveTo(11.5304f, 2f, 12.0391f, 2.21071f, 12.4142f, 2.58579f)
                curveTo(12.7893f, 2.96086f, 13f, 3.46957f, 13f, 4f)
                verticalLineTo(11.5f)
                curveTo(13f, 11.6326f, 12.9473f, 11.7598f, 12.8536f, 11.8536f)
                curveTo(12.7598f, 11.9473f, 12.6326f, 12f, 12.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 13.5f)
                curveTo(5.5f, 13.6326f, 5.44732f, 13.7598f, 5.35355f, 13.8536f)
                curveTo(5.25979f, 13.9473f, 5.13261f, 14f, 5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(3.36739f, 14f, 3.24021f, 13.9473f, 3.14645f, 13.8536f)
                curveTo(3.05268f, 13.7598f, 3f, 13.6326f, 3f, 13.5f)
                curveTo(3f, 13.3674f, 3.05268f, 13.2402f, 3.14645f, 13.1464f)
                curveTo(3.24021f, 13.0527f, 3.36739f, 13f, 3.5f, 13f)
                horizontalLineTo(5f)
                curveTo(5.13261f, 13f, 5.25979f, 13.0527f, 5.35355f, 13.1464f)
                curveTo(5.44732f, 13.2402f, 5.5f, 13.3674f, 5.5f, 13.5f)
                close()
                moveTo(9f, 13f)
                horizontalLineTo(7f)
                curveTo(6.86739f, 13f, 6.74021f, 13.0527f, 6.64645f, 13.1464f)
                curveTo(6.55268f, 13.2402f, 6.5f, 13.3674f, 6.5f, 13.5f)
                curveTo(6.5f, 13.6326f, 6.55268f, 13.7598f, 6.64645f, 13.8536f)
                curveTo(6.74021f, 13.9473f, 6.86739f, 14f, 7f, 14f)
                horizontalLineTo(9f)
                curveTo(9.13261f, 14f, 9.25979f, 13.9473f, 9.35355f, 13.8536f)
                curveTo(9.44732f, 13.7598f, 9.5f, 13.6326f, 9.5f, 13.5f)
                curveTo(9.5f, 13.3674f, 9.44732f, 13.2402f, 9.35355f, 13.1464f)
                curveTo(9.25979f, 13.0527f, 9.13261f, 13f, 9f, 13f)
                close()
                moveTo(12.5f, 13f)
                horizontalLineTo(11f)
                curveTo(10.8674f, 13f, 10.7402f, 13.0527f, 10.6464f, 13.1464f)
                curveTo(10.5527f, 13.2402f, 10.5f, 13.3674f, 10.5f, 13.5f)
                curveTo(10.5f, 13.6326f, 10.5527f, 13.7598f, 10.6464f, 13.8536f)
                curveTo(10.7402f, 13.9473f, 10.8674f, 14f, 11f, 14f)
                horizontalLineTo(12.5f)
                curveTo(12.6326f, 14f, 12.7598f, 13.9473f, 12.8536f, 13.8536f)
                curveTo(12.9473f, 13.7598f, 13f, 13.6326f, 13f, 13.5f)
                curveTo(13f, 13.3674f, 12.9473f, 13.2402f, 12.8536f, 13.1464f)
                curveTo(12.7598f, 13.0527f, 12.6326f, 13f, 12.5f, 13f)
                close()
            }
        }.build()
        
        return _SymbolSnippet!!
    }

private var _SymbolSnippet: ImageVector? = null

