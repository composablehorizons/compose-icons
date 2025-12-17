package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Translate: ImageVector
    get() {
        if (_Translate != null) return _Translate!!
        
        _Translate = ImageVector.Builder(
            name = "translate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.545f, 6.714f)
                lineTo(4.11f, 8f)
                horizontalLineTo(3f)
                lineToRelative(1.862f, -5f)
                horizontalLineToRelative(1.284f)
                lineTo(8f, 8f)
                horizontalLineTo(6.833f)
                lineToRelative(-0.435f, -1.286f)
                close()
                moveToRelative(1.634f, -0.736f)
                lineTo(5.5f, 3.956f)
                horizontalLineToRelative(-0.049f)
                lineToRelative(-0.679f, 2.022f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(7f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(7.138f, 9.995f)
                quadToRelative(0.289f, 0.451f, 0.63f, 0.846f)
                curveToRelative(-0.748f, 0.575f, -1.673f, 1.001f, -2.768f, 1.292f)
                curveToRelative(0.178f, 0.217f, 0.451f, 0.635f, 0.555f, 0.867f)
                curveToRelative(1.125f, -0.359f, 2.08f, -0.844f, 2.886f, -1.494f)
                curveToRelative(0.777f, 0.665f, 1.739f, 1.165f, 2.93f, 1.472f)
                curveToRelative(0.133f, -0.254f, 0.414f, -0.673f, 0.629f, -0.89f)
                curveToRelative(-1.125f, -0.253f, -2.057f, -0.694f, -2.82f, -1.284f)
                curveToRelative(0.681f, -0.747f, 1.222f, -1.651f, 1.621f, -2.757f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.047f)
                horizontalLineToRelative(0.765f)
                curveToRelative(-0.318f, 0.844f, -0.74f, 1.546f, -1.272f, 2.13f)
                arcToRelative(6f, 6f, 0f, false, true, -0.415f, -0.492f)
                arcToRelative(2f, 2f, 0f, false, true, -0.94f, 0.31f)
            }
        }.build()
        
        return _Translate!!
    }

private var _Translate: ImageVector? = null

