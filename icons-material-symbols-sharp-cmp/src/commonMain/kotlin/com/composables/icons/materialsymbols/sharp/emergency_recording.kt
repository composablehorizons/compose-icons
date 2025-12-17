package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Emergency_recording: ImageVector
    get() {
        if (_Emergency_recording != null) return _Emergency_recording!!
        
        _Emergency_recording = ImageVector.Builder(
            name = "emergency_recording",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-131f)
                lineToRelative(120f, 69f)
                lineToRelative(40f, -69f)
                lineToRelative(-120f, -69f)
                lineToRelative(120f, -69f)
                lineToRelative(-40f, -69f)
                lineToRelative(-120f, 69f)
                verticalLineToRelative(-131f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(131f)
                lineToRelative(-120f, -69f)
                lineToRelative(-40f, 69f)
                lineToRelative(120f, 69f)
                lineToRelative(-120f, 69f)
                lineToRelative(40f, 69f)
                lineToRelative(120f, -69f)
                verticalLineToRelative(131f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(260f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(440f)
                lineTo(720f, 540f)
                verticalLineToRelative(260f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Emergency_recording!!
    }

private var _Emergency_recording: ImageVector? = null

