package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MusicNoteBeamed: ImageVector
    get() {
        if (_MusicNoteBeamed != null) return _MusicNoteBeamed!!
        
        _MusicNoteBeamed = ImageVector.Builder(
            name = "music-note-beamed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 13f)
                curveToRelative(0f, 1.105f, -1.12f, 2f, -2.5f, 2f)
                reflectiveCurveTo(1f, 14.105f, 1f, 13f)
                reflectiveCurveToRelative(1.12f, -2f, 2.5f, -2f)
                reflectiveCurveToRelative(2.5f, 0.896f, 2.5f, 2f)
                moveToRelative(9f, -2f)
                curveToRelative(0f, 1.105f, -1.12f, 2f, -2.5f, 2f)
                reflectiveCurveToRelative(-2.5f, -0.895f, -2.5f, -2f)
                reflectiveCurveToRelative(1.12f, -2f, 2.5f, -2f)
                reflectiveCurveToRelative(2.5f, 0.895f, 2.5f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 11f)
                verticalLineTo(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                close()
                moveTo(6f, 3f)
                verticalLineToRelative(10f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 2.905f)
                arcToRelative(1f, 1f, 0f, false, true, 0.9f, -0.995f)
                lineToRelative(8f, -0.8f)
                arcToRelative(1f, 1f, 0f, false, true, 1.1f, 0.995f)
                verticalLineTo(3f)
                lineTo(5f, 4f)
                close()
            }
        }.build()
        
        return _MusicNoteBeamed!!
    }

private var _MusicNoteBeamed: ImageVector? = null

