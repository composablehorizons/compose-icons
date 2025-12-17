package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Developer_mode_tv: ImageVector
    get() {
        if (_Developer_mode_tv != null) return _Developer_mode_tv!!
        
        _Developer_mode_tv = ImageVector.Builder(
            name = "developer_mode_tv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveTo(192f, 440f)
                lineToRelative(104f, -104f)
                lineToRelative(-56f, -56f)
                lineTo(80f, 440f)
                lineToRelative(160f, 160f)
                lineToRelative(56f, -56f)
                lineToRelative(-104f, -104f)
                close()
                moveToRelative(576f, 0f)
                lineTo(664f, 544f)
                lineToRelative(56f, 56f)
                lineToRelative(160f, -160f)
                lineToRelative(-160f, -160f)
                lineToRelative(-56f, 56f)
                lineToRelative(104f, 104f)
                close()
            }
        }.build()
        
        return _Developer_mode_tv!!
    }

private var _Developer_mode_tv: ImageVector? = null

