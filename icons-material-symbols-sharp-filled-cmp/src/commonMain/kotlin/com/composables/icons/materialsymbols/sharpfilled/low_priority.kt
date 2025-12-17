package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Low_priority: ImageVector
    get() {
        if (_Low_priority != null) return _Low_priority!!
        
        _Low_priority = ImageVector.Builder(
            name = "low_priority",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 459f)
                quadToRelative(0f, 71f, 47.5f, 122f)
                reflectiveQuadTo(326f, 638f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -56f)
                lineToRelative(64f, -64f)
                quadToRelative(-105f, -6f, -176.5f, -81f)
                reflectiveQuadTo(80f, 460f)
                quadToRelative(0f, -109f, 75.5f, -184.5f)
                reflectiveQuadTo(340f, 200f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(80f)
                horizontalLineTo(340f)
                quadToRelative(-75f, 0f, -127.5f, 52f)
                reflectiveQuadTo(160f, 459f)
                close()
                moveToRelative(400f, 261f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(0f, -220f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
                moveToRelative(0f, -220f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                close()
            }
        }.build()
        
        return _Low_priority!!
    }

private var _Low_priority: ImageVector? = null

