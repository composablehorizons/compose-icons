package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Share_windows: ImageVector
    get() {
        if (_Share_windows != null) return _Share_windows!!
        
        _Share_windows = ImageVector.Builder(
            name = "share_windows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineToRelative(326f)
                lineTo(583f, 177f)
                lineToRelative(57f, -57f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                lineToRelative(-57f, -56f)
                lineToRelative(103f, -104f)
                horizontalLineTo(360f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Share_windows!!
    }

private var _Share_windows: ImageVector? = null

