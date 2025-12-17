package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MusicNote: ImageVector
    get() {
        if (_MusicNote != null) return _MusicNote!!
        
        _MusicNote = ImageVector.Builder(
            name = "music-note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 13f)
                curveToRelative(0f, 1.105f, -1.12f, 2f, -2.5f, 2f)
                reflectiveCurveTo(4f, 14.105f, 4f, 13f)
                reflectiveCurveToRelative(1.12f, -2f, 2.5f, -2f)
                reflectiveCurveToRelative(2.5f, 0.895f, 2.5f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 3f)
                verticalLineToRelative(10f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2.82f)
                arcToRelative(1f, 1f, 0f, false, true, 0.804f, -0.98f)
                lineToRelative(3f, -0.6f)
                arcTo(1f, 1f, 0f, false, true, 13f, 2.22f)
                verticalLineTo(4f)
                lineTo(8f, 5f)
                close()
            }
        }.build()
        
        return _MusicNote!!
    }

private var _MusicNote: ImageVector? = null

