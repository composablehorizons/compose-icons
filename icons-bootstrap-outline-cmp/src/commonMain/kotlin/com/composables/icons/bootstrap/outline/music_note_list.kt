package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MusicNoteList: ImageVector
    get() {
        if (_MusicNoteList != null) return _MusicNoteList!!
        
        _MusicNoteList = ImageVector.Builder(
            name = "music-note-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 13f)
                curveToRelative(0f, 1.105f, -1.12f, 2f, -2.5f, 2f)
                reflectiveCurveTo(7f, 14.105f, 7f, 13f)
                reflectiveCurveToRelative(1.12f, -2f, 2.5f, -2f)
                reflectiveCurveToRelative(2.5f, 0.895f, 2.5f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 2.82f)
                arcToRelative(1f, 1f, 0f, false, true, 0.804f, -0.98f)
                lineToRelative(3f, -0.6f)
                arcTo(1f, 1f, 0f, false, true, 16f, 2.22f)
                verticalLineTo(4f)
                lineToRelative(-5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 7f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0f, -4f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 3f)
                horizontalLineTo(8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
            }
        }.build()
        
        return _MusicNoteList!!
    }

private var _MusicNoteList: ImageVector? = null

