package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tools_flat_head: ImageVector
    get() {
        if (_Tools_flat_head != null) return _Tools_flat_head!!
        
        _Tools_flat_head = ImageVector.Builder(
            name = "tools_flat_head",
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
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -120f)
                lineToRelative(-40f, -280f)
                lineToRelative(80f, -320f)
                horizontalLineToRelative(240f)
                lineToRelative(80f, 320f)
                lineToRelative(-40f, 280f)
                horizontalLineTo(320f)
                close()
                moveToRelative(69f, -80f)
                horizontalLineToRelative(182f)
                lineToRelative(22f, -160f)
                horizontalLineTo(366f)
                lineToRelative(23f, 160f)
                close()
                moveToRelative(-17f, -240f)
                horizontalLineToRelative(216f)
                lineToRelative(-50f, -200f)
                horizontalLineTo(422f)
                lineToRelative(-50f, 200f)
                close()
                moveToRelative(199f, 240f)
                horizontalLineTo(389f)
                horizontalLineToRelative(182f)
                close()
            }
        }.build()
        
        return _Tools_flat_head!!
    }

private var _Tools_flat_head: ImageVector? = null

