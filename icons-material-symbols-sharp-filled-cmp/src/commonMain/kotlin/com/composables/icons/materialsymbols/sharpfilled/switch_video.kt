package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Switch_video: ImageVector
    get() {
        if (_Switch_video != null) return _Switch_video!!
        
        _Switch_video = ImageVector.Builder(
            name = "switch_video",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(300f, 620f)
                lineToRelative(56f, -56f)
                lineToRelative(-44f, -44f)
                horizontalLineToRelative(176f)
                lineToRelative(-44f, 44f)
                lineToRelative(56f, 56f)
                lineToRelative(140f, -140f)
                lineToRelative(-140f, -140f)
                lineToRelative(-56f, 56f)
                lineToRelative(44f, 44f)
                horizontalLineTo(312f)
                lineToRelative(44f, -44f)
                lineToRelative(-56f, -56f)
                lineToRelative(-140f, 140f)
                lineToRelative(140f, 140f)
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
            }
        }.build()
        
        return _Switch_video!!
    }

private var _Switch_video: ImageVector? = null

