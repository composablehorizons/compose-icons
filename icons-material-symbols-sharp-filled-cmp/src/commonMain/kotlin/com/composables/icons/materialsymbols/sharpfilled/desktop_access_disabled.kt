package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Desktop_access_disabled: ImageVector
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
                moveTo(820f, 932f)
                lineTo(608f, 720f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-593f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(112f)
                lineToRelative(-99f, -99f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(8f, -218f)
                lineTo(234f, 120f)
                horizontalLineToRelative(646f)
                verticalLineToRelative(594f)
                horizontalLineToRelative(-52f)
                close()
            }
        }.build()
        
        return _Desktop_access_disabled!!
    }

private var _Desktop_access_disabled: ImageVector? = null

