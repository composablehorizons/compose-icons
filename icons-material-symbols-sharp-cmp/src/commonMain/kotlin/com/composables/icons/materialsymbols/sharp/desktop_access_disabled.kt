package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Desktop_access_disabled: ImageVector
    get() {
        if (_Desktop_access_disabled != null) return _Desktop_access_disabled!!
        
        _Desktop_access_disabled = ImageVector.Builder(
            name = "desktop_access_disabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 720f)
                verticalLineToRelative(-593f)
                horizontalLineToRelative(47f)
                lineToRelative(73f, 73f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(368f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                lineToRelative(-212f, -212f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(748f, -6f)
                lineToRelative(-74f, -74f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(-440f)
                horizontalLineTo(314f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(646f)
                verticalLineToRelative(594f)
                horizontalLineToRelative(-52f)
                close()
                moveTo(308f, 420f)
                close()
                moveToRelative(226f, 0f)
                close()
            }
        }.build()
        
        return _Desktop_access_disabled!!
    }

private var _Desktop_access_disabled: ImageVector? = null

