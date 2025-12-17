package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Switch_camera: ImageVector
    get() {
        if (_Switch_camera != null) return _Switch_camera!!
        
        _Switch_camera = ImageVector.Builder(
            name = "switch_camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(206f)
                lineToRelative(74f, -80f)
                horizontalLineToRelative(240f)
                lineToRelative(74f, 80f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(638f)
                lineToRelative(-73f, -80f)
                horizontalLineTo(395f)
                lineToRelative(-73f, 80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(320f, -240f)
                close()
                moveTo(360f, 680f)
                lineToRelative(56f, -56f)
                lineToRelative(-62f, -62f)
                horizontalLineToRelative(252f)
                lineToRelative(-62f, 62f)
                lineToRelative(56f, 56f)
                lineToRelative(160f, -160f)
                lineToRelative(-160f, -160f)
                lineToRelative(-56f, 56f)
                lineToRelative(64f, 66f)
                horizontalLineTo(352f)
                lineToRelative(64f, -66f)
                lineToRelative(-56f, -56f)
                lineToRelative(-160f, 160f)
                lineToRelative(160f, 160f)
                close()
            }
        }.build()
        
        return _Switch_camera!!
    }

private var _Switch_camera: ImageVector? = null

